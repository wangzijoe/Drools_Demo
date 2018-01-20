package drools.couponRule;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Order {
    /**
     * <pre>
     * 
     * 表字段 : t_order.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 商铺id
     * 表字段 : t_order.subject_id
     * </pre>
     */
    private Integer subjectId;

    /**
     * <pre>
     * 商铺名称
     * 表字段 : t_order.subject_name
     * </pre>
     */
    private String subjectName;

    /**
     * <pre>
     * appId
     * 表字段 : t_order.app_id
     * </pre>
     */
    private Integer appId;

    /**
     * <pre>
     * app名称
     * 表字段 : t_order.app_name
     * </pre>
     */
    private String appName;

    /**
     * <pre>
     * 微信id
     * 表字段 : t_order.open_id
     * </pre>
     */
    private String openId;

    /**
     * <pre>
     * 微信名称
     * 表字段 : t_order.open_name
     * </pre>
     */
    private String openName;

    /**
     * <pre>
     * 创建时间
     * 表字段 : t_order.create_time
     * </pre>
     */
    private Date createTime;

    /**
     * <pre>
     * 总价格
     * 表字段 : t_order.total_payment
     * </pre>
     */
    private BigDecimal totalPayment;

    /**
     * <pre>
     * 应付金额
     * 表字段 : t_order.account_payable
     * </pre>
     */
    private BigDecimal accountPayable;

    /**
     * <pre>
     * 实际支付价格
     * 表字段 : t_order.actual_ayment
     * </pre>
     */
    private BigDecimal actualPayment;

    /**
     * <pre>
     * 地址  json格式存储
     * 表字段 : t_order.addr  
     * </pre>
     */
    private String addr;
    
    /**
     * <pre>
     * 单号
     * 表字段 : t_order.code
     * </pre>
     */
    private String code;
    
    /**
     * <pre>
     * 单号
     * 表字段 : t_order.code
     * </pre>
     */
    private Date checkTime;
   
    /**
     *<pre>
     *表字段： t_order.send_time 
     */
    private Date sendTime;
    
    /**
     * <pre>
     * 表字段：t_refundable_time
     */
    
    private Date refundableTime;
    /**
     * <pre>
     * 表字段：t_order.finish_time
     */
    
    private Date finishTime;
    
    /**
     * <pre>
     * 分享者ID
     * 表字段 : t_order.share_id
     * </pre>
     */
    
    private String shareId;
    
    /**
     * <pre>
     * 订单类型
     * 表字段 : t_order.type
     * </pre>
     */
    private Integer type;
    
    /**
     * <pre>
     * 订单类型 type的扩展
     * 表字段 : t_order.type1
     * </pre>
     */
    
    private Integer type1;  //type的扩展
    
    /**
     * <pre>
     * 订单状态
     * 表字段 : t_order.status
     * </pre>
     */
    
    private Integer status;
    
    /**
     * <pre>
     * 订单状态  status的扩展。。。
     * 表字段 : t_order.status
     * </pre>
     */
    private Integer status1; //状态 status的扩展。。。
    
    /**
     * <pre>
     * 优惠券Id。
     * 表字段 : t_order.coupon_id
     * </pre>
     */
    private Integer couponId;
    
    /**
     * <pre>
     * 订单描述
     * 表字段 : t_order.des
     * </pre>
     */
    private String des;
    
    /**
     * <pre>
     * PID 订单有父子关系
     * 表字段 : t_order.pid
     * </pre>
     */
    private Integer pid;
    
    /**
     * <pre>
     * 骑手ID
     * 表字段 : t_order.courierId
     * </pre>
     */
    private String courierId;
    
    /**
     * <pre>
     * 扩展字段
     * 表字段 : t_order.ext
     * </pre>
     */
    private String ext;
    
    /**
     * <pre>
     * 运输方式：1为物流，2为自提
     * 表字段 : t_order.transportation
     * </pre>
     */
    private Integer transportation;
    
    private String prepayId;
    
    /**
     * <pre>
     * 扩展字段
     * 表字段 : t_order.express_code
     * </pre>
     */
    private String expressCode;
    
    /**
     * <pre>
     * 扩展字段
     * 表字段 : t_order.express_name
     * </pre>
     */
    private String expressName;
    
    
    ///////////////////////非数据库字段////////////////////////////////// 
    private List<String> goods; 
    private String beginCreateTime;
    private String endCreateTime;
   
    
    public static enum orderType{
        defl(1),
        yuding(2),
        huiyuan(3),
        zengsong(4),
        zhifu(5);
        private orderType(int value){
            this.value = value;
        }
        private int value;
        
        public int getValue(){
            return this.value;
        }
        
    }
    
    public static enum orderStatus{
        weizhifu(1,"未支付"),
        yizhifu(10,"已支付"),
        yihexiao(11,"已核销"),
        yifahuo(20,"已发货"),
        yishouhuo(21,"已收货"),
        yiwancheng(30,"已完成"),
        weipingjia(39,"未评价"),
        yipingjia(40,"已评价"),
        tuikuan(50,"退款中"),
        tuikuanchenggong(55,"退款成功"),
        quxiao(60,"订单取消"),
        wancheng(100,"订单已完成");
        private orderStatus(int value,String des){
            this.value = value;
            this.des = des;
        }
        private int value;
        
        private String des;
        
        public int getValue(){
            return this.value;
        }
        public String getdes(){
            return this.des;
        }
    }
    
    

    /**
     * <pre>
     * 获取：
     * 表字段：t_order.id
     * </pre>
     *
     * @return t_order.id：
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_order.id
     * </pre>
     *
     * @param id
     *            t_order.id：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <pre>
     * 获取：商铺id
     * 表字段：t_order.subject_id
     * </pre>
     *
     * @return t_order.subject_id：商铺id
     */
    public Integer getSubjectId() {
        return subjectId;
    }

    /**
     * <pre>
     * 设置：商铺id
     * 表字段：t_order.subject_id
     * </pre>
     *
     * @param subjectId
     *            t_order.subject_id：商铺id
     */
    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_order.subject_name
     * </pre>
     *
     * @return t_order.subject_name：
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_order.subject_name
     * </pre>
     *
     * @param subjectName
     *            t_order.subject_name：
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_order.app_id
     * </pre>
     *
     * @return t_order.app_id：
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_order.app_id
     * </pre>
     *
     * @param appId
     *            t_order.app_id：
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_order.app_name
     * </pre>
     *
     * @return t_order.app_name：
     */
    public String getAppName() {
        return appName;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_order.app_name
     * </pre>
     *
     * @param appName
     *            t_order.app_name：
     */
    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    /**
     * <pre>
     * 获取：微信id
     * 表字段：t_order.open_id
     * </pre>
     *
     * @return t_order.open_id：微信id
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * <pre>
     * 设置：微信id
     * 表字段：t_order.open_id
     * </pre>
     *
     * @param openId
     *            t_order.open_id：微信id
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * <pre>
     * 获取：微信名称
     * 表字段：t_order.open_name
     * </pre>
     *
     * @return t_order.open_name：微信名称
     */
    public String getOpenName() {
        return openName;
    }

    /**
     * <pre>
     * 设置：微信名称
     * 表字段：t_order.open_name
     * </pre>
     *
     * @param openName
     *            t_order.open_name：微信名称
     */
    public void setOpenName(String openName) {
        this.openName = openName == null ? null : openName.trim();
    }

    /**
     * <pre>
     * 获取：创建时间
     * 表字段：t_order.create_time
     * </pre>
     *
     * @return t_order.create_time：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * <pre>
     * 设置：创建时间
     * 表字段：t_order.create_time
     * </pre>
     *
     * @param createTime
     *            t_order.create_time：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <pre>
     * 获取：价格
     * 表字段：t_order.total_payment
     * </pre>
     *
     * @return t_order.total_payment：价格
     */
    public BigDecimal getTotalPayment() {
        return totalPayment;
    }

    /**
     * <pre>
     * 设置：价格
     * 表字段：t_order.total_payment
     * </pre>
     *
     * @param totalPayment
     *            t_order.total_payment：价格
     */
    public void setTotalPayment(BigDecimal totalPayment) {
        this.totalPayment = totalPayment;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_order.account_payable
     * </pre>
     *
     * @return t_order.account_payable：
     */
    public BigDecimal getAccountPayable() {
        return accountPayable;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_order.account_payable
     * </pre>
     *
     * @param accountPayable
     *            t_order.account_payable：
     */
    public void setAccountPayable(BigDecimal accountPayable) {
        this.accountPayable = accountPayable;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_order.actual_ayment
     * </pre>
     *
     * @return t_order.actual_ayment：
     */
    public BigDecimal getActualPayment() {
        return actualPayment;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_order.actual_ayment
     * </pre>
     *
     * @param actualAyment
     *            t_order.actual_ayment：
     */
    public void setActualPayment(BigDecimal actualPayment) {
        this.actualPayment = actualPayment;
    }

    /**
     * <pre>
     * 获取：地址
     * 表字段：t_order.addr
     * </pre>
     *
     * @return t_order.addr：地址
     */
    public String getAddr() {
        return addr;
    }

    /**
     * <pre>
     * 设置：地址
     * 表字段：t_order.addr
     * </pre>
     *
     * @param addr
     *            t_order.addr：地址
     */
    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }
    public Date getRefundableTime() {
        return refundableTime;
    }

    public void setRefundableTime(Date refundableTime) {
        this.refundableTime = refundableTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public String getShareId() {
        return shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public List<String> getGoods() {
        return goods;
    }

    public void setGoods(List<String> goods) {
        this.goods = goods;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getBeginCreateTime() {
        return beginCreateTime;
    }

    public void setBeginCreateTime(String beginCreateTime) {
        this.beginCreateTime = beginCreateTime;
    }

    public String getEndCreateTime() {
        return endCreateTime;
    }

    public void setEndCreateTime(String endCreateTime) {
        this.endCreateTime = endCreateTime;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getType1() {
        return type1;
    }

    public void setType1(Integer type1) {
        this.type1 = type1;
    }

    public Integer getStatus1() {
        return status1;
    }

    public void setStatus1(Integer status1) {
        this.status1 = status1;
    }

    public String getCourierId() {
        return courierId;
    }

    public void setCourierId(String courierId) {
        this.courierId = courierId;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public Integer getTransportation() {
        return transportation;
    }

    public void setTransportation(Integer transportation) {
        this.transportation = transportation;
    }

    public String getPrepayId() {
        return prepayId;
    }

    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    public String getExpressCode() {
        return expressCode;
    }

    public void setExpressCode(String expressCode) {
        this.expressCode = expressCode;
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }
}
