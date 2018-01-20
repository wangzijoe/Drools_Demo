package drools.couponRule;

public class Judge {

    private Order order;
    
    private CouponRule couponRule;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public CouponRule getCouponRule() {
        return couponRule;
    }

    public void setCouponRule(CouponRule couponRule) {
        this.couponRule = couponRule;
    }

    public Judge() {
        super();
    }

    public Judge(Order order, CouponRule couponRule) {
        super();
        this.order = order;
        this.couponRule = couponRule;
    }
    
    
}
