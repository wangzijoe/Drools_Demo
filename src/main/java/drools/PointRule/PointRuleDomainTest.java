package drools.PointRule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//过生日，则加10分，并且将当月交易比数翻倍后再计算积分

//2011-01-08 - 2011-08-08每月信用卡还款3次以上，每满3笔赠送30分

//当月购物总金额100以上，每100元赠送10分

//当月购物次数5次以上，每五次赠送50分

//特别的，如果全部满足了要求，则额外奖励100分

//发生退货，扣减10分

//退货金额大于100，扣减100分
public class PointRuleDomainTest {
    public static void main(String[] args) throws IOException {
        PointRuleEngine pointRuleEngine = new PointRuleEngineImpl();
        while (true) {
            InputStream is = System.in;
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String input = br.readLine();

            if (null != input && "s".equals(input)) {
                System.out.println("初始化规则引擎...");
                pointRuleEngine.initEngine();
                System.out.println("初始化规则引擎结束.");
            } else if ("e".equals(input)) {
                final PointDomain pointDomain = new PointDomain();
                pointDomain.setUserName("hello kity");
                pointDomain.setBackMondy(100d);
                pointDomain.setBuyMoney(500d);
                pointDomain.setBackNums(1);
                pointDomain.setBuyNums(5);
                pointDomain.setBillThisMonth(5);
                pointDomain.setBirthDay(true);
                pointDomain.setPoint(0l);

                pointRuleEngine.executeRuleEngine(pointDomain);

                System.out.println("执行完毕BillThisMonth：" + pointDomain.getBillThisMonth());
                System.out.println("执行完毕BuyMoney：" + pointDomain.getBuyMoney());
                System.out.println("执行完毕BuyNums：" + pointDomain.getBuyNums());

                System.out.println("执行完毕规则引擎决定发送积分：" + pointDomain.getPoint());
            } else if ("r".equals(input)) {
                System.out.println("刷新规则文件...");
                pointRuleEngine.refreshEnginRule();
                System.out.println("刷新规则文件结束.");
            }
        }
    }
}
