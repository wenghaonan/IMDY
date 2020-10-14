package com.example.upc.dataobject;

import com.example.upc.common.InsertGroup;
import com.example.upc.common.SearchGroup;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class FoodAdditive {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food_additive.id
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food_additive.enterprise_id
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    private Integer enterpriseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food_additive.use_date
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    @NotNull(groups={InsertGroup.class},message = "插入日期不能为空")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date useDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food_additive.safe_manager
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    @NotNull(groups={InsertGroup.class},message = "食品安全管理员不能为空")
    private String safeManager;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food_additive.additive_name
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    @NotNull(groups={InsertGroup.class},message = "食品添加剂名称不能为空")
    private String additiveName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food_additive.use_amount
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    @NotNull(groups={InsertGroup.class},message = "使用数量不能为空")
    private Integer useAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food_additive.use_range
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    @NotNull(groups={InsertGroup.class},message = "用途不能为空")
    private String useRange;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food_additive.additive_ratio
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    @NotNull(groups={InsertGroup.class},message = "添加比例不能为空")
    private String additiveRatio;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food_additive.got_person
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    @NotNull(groups={InsertGroup.class},message = "领用人不能为空")
    private String gotPerson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food_additive.produce_company
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    @NotNull(groups={InsertGroup.class},message = "生产厂家不能为空")
    private String produceCompany;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food_additive.produce_date
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date produceDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food_additive.remark
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food_additive.operator
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food_additive.operator_ip
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    private String operatorIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column food_additive.operator_time
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date operatorTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food_additive.id
     *
     * @return the value of food_additive.id
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food_additive.id
     *
     * @param id the value for food_additive.id
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food_additive.enterprise_id
     *
     * @return the value of food_additive.enterprise_id
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food_additive.enterprise_id
     *
     * @param enterpriseId the value for food_additive.enterprise_id
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food_additive.use_date
     *
     * @return the value of food_additive.use_date
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public Date getUseDate() {
        return useDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food_additive.use_date
     *
     * @param useDate the value for food_additive.use_date
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public void setUseDate(Date useDate) {
        this.useDate = useDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food_additive.safe_manager
     *
     * @return the value of food_additive.safe_manager
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public String getSafeManager() {
        return safeManager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food_additive.safe_manager
     *
     * @param safeManager the value for food_additive.safe_manager
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public void setSafeManager(String safeManager) {
        this.safeManager = safeManager == null ? null : safeManager.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food_additive.additive_name
     *
     * @return the value of food_additive.additive_name
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public String getAdditiveName() {
        return additiveName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food_additive.additive_name
     *
     * @param additiveName the value for food_additive.additive_name
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public void setAdditiveName(String additiveName) {
        this.additiveName = additiveName == null ? null : additiveName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food_additive.use_amount
     *
     * @return the value of food_additive.use_amount
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public Integer getUseAmount() {
        return useAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food_additive.use_amount
     *
     * @param useAmount the value for food_additive.use_amount
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public void setUseAmount(Integer useAmount) {
        this.useAmount = useAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food_additive.use_range
     *
     * @return the value of food_additive.use_range
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public String getUseRange() {
        return useRange;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food_additive.use_range
     *
     * @param useRange the value for food_additive.use_range
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public void setUseRange(String useRange) {
        this.useRange = useRange == null ? null : useRange.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food_additive.additive_ratio
     *
     * @return the value of food_additive.additive_ratio
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public String getAdditiveRatio() {
        return additiveRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food_additive.additive_ratio
     *
     * @param additiveRatio the value for food_additive.additive_ratio
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public void setAdditiveRatio(String additiveRatio) {
        this.additiveRatio = additiveRatio == null ? null : additiveRatio.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food_additive.got_person
     *
     * @return the value of food_additive.got_person
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public String getGotPerson() {
        return gotPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food_additive.got_person
     *
     * @param gotPerson the value for food_additive.got_person
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public void setGotPerson(String gotPerson) {
        this.gotPerson = gotPerson == null ? null : gotPerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food_additive.produce_company
     *
     * @return the value of food_additive.produce_company
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public String getProduceCompany() {
        return produceCompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food_additive.produce_company
     *
     * @param produceCompany the value for food_additive.produce_company
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public void setProduceCompany(String produceCompany) {
        this.produceCompany = produceCompany == null ? null : produceCompany.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food_additive.produce_date
     *
     * @return the value of food_additive.produce_date
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public Date getProduceDate() {
        return produceDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food_additive.produce_date
     *
     * @param produceDate the value for food_additive.produce_date
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public void setProduceDate(Date produceDate) {
        this.produceDate = produceDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food_additive.remark
     *
     * @return the value of food_additive.remark
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food_additive.remark
     *
     * @param remark the value for food_additive.remark
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food_additive.operator
     *
     * @return the value of food_additive.operator
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food_additive.operator
     *
     * @param operator the value for food_additive.operator
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food_additive.operator_ip
     *
     * @return the value of food_additive.operator_ip
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public String getOperatorIp() {
        return operatorIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food_additive.operator_ip
     *
     * @param operatorIp the value for food_additive.operator_ip
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp == null ? null : operatorIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column food_additive.operator_time
     *
     * @return the value of food_additive.operator_time
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public Date getOperatorTime() {
        return operatorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column food_additive.operator_time
     *
     * @param operatorTime the value for food_additive.operator_time
     *
     * @mbg.generated Mon Sep 28 20:24:28 CST 2020
     */
    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }
}