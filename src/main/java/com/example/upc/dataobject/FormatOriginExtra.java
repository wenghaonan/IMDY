package com.example.upc.dataobject;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class FormatOriginExtra {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_origin_extra.id
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_origin_extra.enterprise_id
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    private Integer enterpriseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_origin_extra.enterprise_name
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    private String enterpriseName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_origin_extra.area_id
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    private Integer areaId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_origin_extra.materialcategory
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    @NotBlank(message = "原料类型不能为空")
    private String materialcategory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_origin_extra.materialname
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    @NotBlank(message = "原料名称不能为空")
    private String materialname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_origin_extra.specifications
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    private String specifications;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_origin_extra.manufacturer
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    private String manufacturer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_origin_extra.brand
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    private String brand;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_origin_extra.state
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_origin_extra.extra
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    private String extra;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_origin_extra.operator
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_origin_extra.operator_ip
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    private String operatorIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_origin_extra.operator_time
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    private Date operatorTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_origin_extra.id
     *
     * @return the value of format_origin_extra.id
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_origin_extra.id
     *
     * @param id the value for format_origin_extra.id
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_origin_extra.enterprise_id
     *
     * @return the value of format_origin_extra.enterprise_id
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_origin_extra.enterprise_id
     *
     * @param enterpriseId the value for format_origin_extra.enterprise_id
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_origin_extra.enterprise_name
     *
     * @return the value of format_origin_extra.enterprise_name
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public String getEnterpriseName() {
        return enterpriseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_origin_extra.enterprise_name
     *
     * @param enterpriseName the value for format_origin_extra.enterprise_name
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_origin_extra.area_id
     *
     * @return the value of format_origin_extra.area_id
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public Integer getAreaId() {
        return areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_origin_extra.area_id
     *
     * @param areaId the value for format_origin_extra.area_id
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_origin_extra.materialcategory
     *
     * @return the value of format_origin_extra.materialcategory
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public String getMaterialcategory() {
        return materialcategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_origin_extra.materialcategory
     *
     * @param materialcategory the value for format_origin_extra.materialcategory
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public void setMaterialcategory(String materialcategory) {
        this.materialcategory = materialcategory == null ? null : materialcategory.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_origin_extra.materialname
     *
     * @return the value of format_origin_extra.materialname
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public String getMaterialname() {
        return materialname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_origin_extra.materialname
     *
     * @param materialname the value for format_origin_extra.materialname
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public void setMaterialname(String materialname) {
        this.materialname = materialname == null ? null : materialname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_origin_extra.specifications
     *
     * @return the value of format_origin_extra.specifications
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public String getSpecifications() {
        return specifications;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_origin_extra.specifications
     *
     * @param specifications the value for format_origin_extra.specifications
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_origin_extra.manufacturer
     *
     * @return the value of format_origin_extra.manufacturer
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_origin_extra.manufacturer
     *
     * @param manufacturer the value for format_origin_extra.manufacturer
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_origin_extra.brand
     *
     * @return the value of format_origin_extra.brand
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public String getBrand() {
        return brand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_origin_extra.brand
     *
     * @param brand the value for format_origin_extra.brand
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_origin_extra.state
     *
     * @return the value of format_origin_extra.state
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_origin_extra.state
     *
     * @param state the value for format_origin_extra.state
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_origin_extra.extra
     *
     * @return the value of format_origin_extra.extra
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public String getExtra() {
        return extra;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_origin_extra.extra
     *
     * @param extra the value for format_origin_extra.extra
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public void setExtra(String extra) {
        this.extra = extra == null ? null : extra.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_origin_extra.operator
     *
     * @return the value of format_origin_extra.operator
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_origin_extra.operator
     *
     * @param operator the value for format_origin_extra.operator
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_origin_extra.operator_ip
     *
     * @return the value of format_origin_extra.operator_ip
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public String getOperatorIp() {
        return operatorIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_origin_extra.operator_ip
     *
     * @param operatorIp the value for format_origin_extra.operator_ip
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp == null ? null : operatorIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_origin_extra.operator_time
     *
     * @return the value of format_origin_extra.operator_time
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public Date getOperatorTime() {
        return operatorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_origin_extra.operator_time
     *
     * @param operatorTime the value for format_origin_extra.operator_time
     *
     * @mbg.generated Fri Oct 18 20:12:39 CST 2019
     */
    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }
}