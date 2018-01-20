package drools.couponRule;

import java.util.Collection;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderErrors;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.definition.KnowledgePackage;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;

public class CouponRuleDroolTest {

    /* 读取规则 放入规则库 */
    public static KnowledgeBase readKnowledgeBase() {

        /* 通过规则收集工厂 派出一个规则收集者来 */
        KnowledgeBuilder knowledgeBuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();

        /* 通过规则收集者 收集规则 */
        knowledgeBuilder.add(ResourceFactory.newClassPathResource("CouponRule.drl"), ResourceType.DRL);

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

    public static void main(String[] args) {

        // 通过readKnowledgeBase方法得到带规则的知识库
        KnowledgeBase knowledgeBase = readKnowledgeBase();

        /* 通过知识库创建一个会话 */
        StatefulKnowledgeSession ksession = knowledgeBase.newStatefulKnowledgeSession();

        try {

            CouponRule cr = new CouponRule();
            cr.setAmountType(1);

            /* 将数据 专业名词叫 fact事实 加入到会话 */
            ksession.insert(cr);

            /* 执行所有的规则 与事实进行匹配 */
            ksession.fireAllRules();
        } finally {
            /* 关闭会话 */
            ksession.dispose();
        }
    }
}
