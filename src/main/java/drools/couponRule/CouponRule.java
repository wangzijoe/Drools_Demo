package drools.couponRule;

import java.math.BigDecimal;
import java.util.Date;

public class CouponRule {

    /**
     * <pre>
     * 
     * 表字段 : t_coupon_rule.id
     * </pre>
     */
    private Integer id;

    /**
     * <pre>
     * 
     * 表字段 : t_coupon_rule.name
     * </pre>
     */
    private String name;
    
    /**
     * <pre>
     * 人数梯度
     * 表字段 : t_coupon_rule.num
     * </pre>
     */
    private Integer num;

    /**
     * <pre>
     * 卡券类型：1优惠券，2兑换券
     * 表字段 : t_coupon_rule.type
     * </pre>
     */
    private Integer type;

    /**
     * <pre>
     * 卡券id
     * 表字段 : t_coupon_rule.coupon_id
     * </pre>
     */
    private Integer couponId;

    /**
     * <pre>
     * 创建时间
     * 表字段 : t_coupon_rule.create_time
     * </pre>
     */
    private Date createTime;

    /**
     * <pre>
     * 使用时间
     * 表字段 : t_coupon_rule.use_time
     * </pre>
     */
    private Date useTime;

    /**
     * <pre>
     * appId
     * 表字段 : t_coupon_rule.app_id
     * </pre>
     */
    private Integer appId;

    /**
     * <pre>
     * app名称
     * 表字段 : t_coupon_rule.app_name
     * </pre>
     */
    private String appName;

    /**
     * <pre>
     * 商铺Id
     * 表字段 : t_coupon_rule.subject_id
     * </pre>
     */
    private Integer subjectId;

    /**
     * <pre>
     * 店铺名称
     * 表字段 : t_coupon_rule.subject_name
     * </pre>
     */
    private String subjectName;
    /**
     * <pre>
     * 卡券名称
     * 表字段 : t_coupon_rule.couponName
     * </pre>
     */
    private String couponName;
    
    /**
     * <pre>
     * 行为类型
     * 表字段 : t_coupon_rule.action_type
     * </pre>
     */
    private Integer actionType;

    /**
     * <pre>
     * 描述
     * 表字段 : t_coupon_rule.des
     * </pre>
     */
    private String des;

    /**
     * <pre>
     * 1启用，2禁用
     * 表字段 : t_coupon_rule.status
     * </pre>
     */
    private Integer status;

    /**
     * <pre>
     * 
     * 表字段 : t_coupon_rule.begin_time
     * </pre>
     */
    private Date beginTime;

    /**
     * <pre>
     * 
     * 表字段 : t_coupon_rule.end_time
     * </pre>
     */
    private Date endTime;

    
    /**
     * <pre>
     * 
     * 表字段 : t_coupon_rule.indate
     * </pre>
     */
    private Integer indate;
    
    /**
     * <pre>
     * 最小金额
     * 表字段 : t_coupon_rule.minimum
     * </pre>
     */
    private BigDecimal minimum;

    /**
     * <pre>
     * 分享次数
     * 表字段 : t_coupon_rule.share_times
     * </pre>
     */
    private Integer shareTimes;

    /**
     * <pre>
     * 优惠金额
     * 表字段 : t_coupon_rule.discount
     * </pre>
     */
    private BigDecimal discount;


    /**
     * <pre>
     * 1固定时间 2当前时间起算
     * 表字段 : t_coupon_rule.time_type
     * </pre>
     */
    private Integer timeType;

    /**
     * <pre>
     * 1订单金额，2实付金额
     * 表字段 : t_coupon_rule.amount_type
     * </pre>
     */
    private Integer amountType;

    /**
     * <pre>
     * 备注
     * 表字段 : t_coupon_rule.remark
     * </pre>
     */
    private String remark;

    /**
     * <pre>
     * 
     * 表字段 : t_coupon_rule.ext
     * </pre>
     */
    private String ext;

    /**
     * <pre>
     * 获取：
     * 表字段：t_coupon_rule.id
     * </pre>
     *
     * @return t_coupon_rule.id：
     */
    public Integer getId() {
        return id;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_coupon_rule.id
     * </pre>
     *
     * @param id
     *            t_coupon_rule.id：
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_coupon_rule.num
     * </pre>
     *
     * @return t_coupon_rule.num：
     */
    public Integer getNum() {
        return num;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_coupon_rule.num
     * </pre>
     *
     * @param num
     *            t_coupon_rule.num：
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_coupon_rule.type
     * </pre>
     *
     * @return t_coupon_rule.type：
     */
    public Integer getType() {
        return type;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_coupon_rule.type
     * </pre>
     *
     * @param type
     *            t_coupon_rule.type：
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_coupon_rule.coupon_id
     * </pre>
     *
     * @return t_coupon_rule.coupon_id：
     */
    public Integer getCouponId() {
        return couponId;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_coupon_rule.coupon_id
     * </pre>
     *
     * @param couponId
     *            t_coupon_rule.coupon_id：
     */
    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_coupon_rule.create_time
     * </pre>
     *
     * @return t_coupon_rule.create_time：
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_coupon_rule.create_time
     * </pre>
     *
     * @param createTime
     *            t_coupon_rule.create_time：
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_coupon_rule.use_time
     * </pre>
     *
     * @return t_coupon_rule.use_time：
     */
    public Date getUseTime() {
        return useTime;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_coupon_rule.use_time
     * </pre>
     *
     * @param useTime
     *            t_coupon_rule.use_time：
     */
    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_coupon_rule.app_id
     * </pre>
     *
     * @return t_coupon_rule.app_id：
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_coupon_rule.app_id
     * </pre>
     *
     * @param appId
     *            t_coupon_rule.app_id：
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * <pre>
     * 获取：app名称
     * 表字段：t_coupon_rule.app_name
     * </pre>
     *
     * @return t_coupon_rule.app_name：app名称
     */
    public String getAppName() {
        return appName;
    }

    /**
     * <pre>
     * 设置：app名称
     * 表字段：t_coupon_rule.app_name
     * </pre>
     *
     * @param appName
     *            t_coupon_rule.app_name：app名称
     */
    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_coupon_rule.subject_id
     * </pre>
     *
     * @return t_coupon_rule.subject_id：
     */
    public Integer getSubjectId() {
        return subjectId;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_coupon_rule.subject_id
     * </pre>
     *
     * @param subjectId
     *            t_coupon_rule.subject_id：
     */
    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * <pre>
     * 获取：店铺名称
     * 表字段：t_coupon_rule.subject_name
     * </pre>
     *
     * @return t_coupon_rule.subject_name：店铺名称
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * <pre>
     * 设置：店铺名称
     * 表字段：t_coupon_rule.subject_name
     * </pre>
     *
     * @param subjectName
     *            t_coupon_rule.subject_name：店铺名称
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }
    
    /**
     * <pre>
     * 获取：行为类型
     * 表字段：t_coupon_rule.action_type
     * </pre>
     *
     * @return t_coupon_rule.action_type：行为类型
     */
    public Integer getActionType() {
        return actionType;
    }

    /**
     * <pre>
     * 设置：行为类型
     * 表字段：t_coupon_rule.action_type
     * </pre>
     *
     * @param actionType
     *            t_coupon_rule.action_type：行为类型
     */
    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    /**
     * <pre>
     * 获取：描述
     * 表字段：t_coupon_rule.des
     * </pre>
     *
     * @return t_coupon_rule.des：描述
     */
    public String getDes() {
        return des;
    }

    /**
     * <pre>
     * 设置：描述
     * 表字段：t_coupon_rule.des
     * </pre>
     *
     * @param des
     *            t_coupon_rule.des：描述
     */
    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    /**
     * <pre>
     * 获取：1启用，2禁用
     * 表字段：t_coupon_rule.status
     * </pre>
     *
     * @return t_coupon_rule.status：1启用，2禁用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * <pre>
     * 设置：1启用，2禁用
     * 表字段：t_coupon_rule.status
     * </pre>
     *
     * @param status
     *            t_coupon_rule.status：1启用，2禁用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_coupon_rule.begin_time
     * </pre>
     *
     * @return t_coupon_rule.begin_time：
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_coupon_rule.begin_time
     * </pre>
     *
     * @param beginTime
     *            t_coupon_rule.begin_time：
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_coupon_rule.end_time
     * </pre>
     *
     * @return t_coupon_rule.end_time：
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_coupon_rule.end_time
     * </pre>
     *
     * @param endTime
     *            t_coupon_rule.end_time：
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getIndate() {
        return indate;
    }

    public void setIndate(Integer indate) {
        this.indate = indate;
    }

    

    public BigDecimal getMinimum() {
        return minimum;
    }

    public void setMinimum(BigDecimal minimum) {
        this.minimum = minimum;
    }

    /**
     * <pre>
     * 获取：分享次数
     * 表字段：t_coupon_rule.share_times
     * </pre>
     *
     * @return t_coupon_rule.share_times：分享次数
     */
    public Integer getShareTimes() {
        return shareTimes;
    }

    /**
     * <pre>
     * 设置：分享次数
     * 表字段：t_coupon_rule.share_times
     * </pre>
     *
     * @param shareTimes
     *            t_coupon_rule.share_times：分享次数
     */
    public void setShareTimes(Integer shareTimes) {
        this.shareTimes = shareTimes;
    }

    /**
     * <pre>
     * 获取：优惠金额
     * 表字段：t_coupon_rule.discount
     * </pre>
     *
     * @return t_coupon_rule.discount：优惠金额
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * <pre>
     * 设置：优惠金额
     * 表字段：t_coupon_rule.discount
     * </pre>
     *
     * @param discount
     *            t_coupon_rule.discount：优惠金额
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }


    /**
     * <pre>
     * 获取：1固定时间 2当前时间起算
     * 表字段：t_coupon_rule.time_type
     * </pre>
     *
     * @return t_coupon_rule.time_type：1固定时间 2当前时间起算
     */
    public Integer getTimeType() {
        return timeType;
    }

    /**
     * <pre>
     * 设置：1固定时间 2当前时间起算
     * 表字段：t_coupon_rule.time_type
     * </pre>
     *
     * @param timeType
     *            t_coupon_rule.time_type：1固定时间 2当前时间起算
     */
    public void setTimeType(Integer timeType) {
        this.timeType = timeType;
    }

    /**
     * <pre>
     * 获取：1订单金额，2实付金额
     * 表字段：t_coupon_rule.amount_type
     * </pre>
     *
     * @return t_coupon_rule.amount_type：1订单金额，2实付金额
     */
    public Integer getAmountType() {
        return amountType;
    }

    /**
     * <pre>
     * 设置：1订单金额，2实付金额
     * 表字段：t_coupon_rule.amount_type
     * </pre>
     *
     * @param amountType
     *            t_coupon_rule.amount_type：1订单金额，2实付金额
     */
    public void setAmountType(Integer amountType) {
        this.amountType = amountType;
    }

    /**
     * <pre>
     * 获取：备注
     * 表字段：t_coupon_rule.remark
     * </pre>
     *
     * @return t_coupon_rule.remark：备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * <pre>
     * 设置：备注
     * 表字段：t_coupon_rule.remark
     * </pre>
     *
     * @param remark
     *            t_coupon_rule.remark：备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * <pre>
     * 获取：
     * 表字段：t_coupon_rule.ext
     * </pre>
     *
     * @return t_coupon_rule.ext：
     */
    public String getExt() {
        return ext;
    }

    /**
     * <pre>
     * 设置：
     * 表字段：t_coupon_rule.ext
     * </pre>
     *
     * @param ext
     *            t_coupon_rule.ext：
     */
    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }
    
}
