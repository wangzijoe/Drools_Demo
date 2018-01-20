package drools.couponRule;

import java.math.BigDecimal;
import java.util.Collection;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.definition.KnowledgePackage;
import org.drools.io.Resource;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;

public class JudgeTest {
    /* 读取规则 放入规则库 */
    public static void main(String[] args) {
     // 通过readKnowledgeBase方法得到带规则的知识库
        KnowledgeBase knowledgeBase = readKnowledgeBase();

        /* 通过知识库创建一个会话 */
        StatefulKnowledgeSession ksession = knowledgeBase.newStatefulKnowledgeSession();

        try {

            Order ord = new Order();
            //实际支付（50）
            ord.setTotalPayment(new BigDecimal(50));
            CouponRule cr = new CouponRule();
            //满（30）
            cr.setMinimum(new BigDecimal(30));
            //减（20）
            cr.setDiscount(new BigDecimal(20));

            Judge judge = new Judge(ord, cr);
            
            /* 将数据 专业名词叫 fact事实 加入到会话 */
            ksession.insert(judge);

            /* 执行所有的规则 与事实进行匹配 */
            ksession.fireAllRules();
            System.out.println("实付金额为:"+judge.getOrder().getActualPayment());
        } finally {
            /* 关闭会话 */
            ksession.dispose();
        }
    }
    
    public static KnowledgeBase readKnowledgeBase() {

        /* 通过规则收集工厂 派出一个规则收集者来 */
        KnowledgeBuilder knowledgeBuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();

        /* 通过规则收集者 收集规则 */
        knowledgeBuilder.add(ResourceFactory.newClassPathResource("JudgeTest.drl"), ResourceType.DRL);

        /* 获得规则收集者 收集规则过程中的错误 */
        KnowledgeBuilderErrors errors = knowledgeBuilder.getErrors();

        /* 如果error集大于0 说明有错误 */
        if (errors.size() > 0) {

            /* 遍历error集合 */
            for (KnowledgeBuilderError error : errors) {
                /* 打印输出错误 */
                System.out.println("我是规则收集者，收集过程中遇到" + error + "错误");
            }
            throw new IllegalArgumentException("Could not parse knowledge");
        }

        /* 规则收集者将 规则打包 */
        Collection<KnowledgePackage> knowledgePackages = knowledgeBuilder.getKnowledgePackages();

        /* 通过知识库工厂 new一个知识库来加载规则 */
        KnowledgeBase knowledgeBase = KnowledgeBaseFactory.newKnowledgeBase();

        /* 用知识库加载规则 */
        knowledgeBase.addKnowledgePackages(knowledgePackages);

        /* 返回知识库 */
        return knowledgeBase;
    }
    
}
