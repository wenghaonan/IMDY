package com.example.upc.dataobject;

import java.util.Date;

public class SpecialEquipmentTypeOne {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column special_equipment_type_one.id
     *
     * @mbg.generated Mon Oct 21 19:01:40 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column special_equipment_type_one.name
     *
     * @mbg.generated Mon Oct 21 19:01:40 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column special_equipment_type_one.operator
     *
     * @mbg.generated Mon Oct 21 19:01:40 CST 2019
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column special_equipment_type_one.operator_ip
     *
     * @mbg.generated Mon Oct 21 19:01:40 CST 2019
     */
    private String operatorIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column special_equipment_type_one.operator_time
     *
     * @mbg.generated Mon Oct 21 19:01:40 CST 2019
     */
    private Date operatorTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column special_equipment_type_one.id
     *
     * @return the value of special_equipment_type_one.id
     *
     * @mbg.generated Mon Oct 21 19:01:40 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column special_equipment_type_one.id
     *
     * @param id the value for special_equipment_type_one.id
     *
     * @mbg.generated Mon Oct 21 19:01:40 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column special_equipment_type_one.name
     *
     * @return the value of special_equipment_type_one.name
     *
     * @mbg.generated Mon Oct 21 19:01:40 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column special_equipment_type_one.name
     *
     * @param name the value for special_equipment_type_one.name
     *
     * @mbg.generated Mon Oct 21 19:01:40 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column special_equipment_type_one.operator
     *
     * @return the value of special_equipment_type_one.operator
     *
     * @mbg.generated Mon Oct 21 19:01:40 CST 2019
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column special_equipment_type_one.operator
     *
     * @param operator the value for special_equipment_type_one.operator
     *
     * @mbg.generated Mon Oct 21 19:01:40 CST 2019
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column special_equipment_type_one.operator_ip
     *
     * @return the value of special_equipment_type_one.operator_ip
     *
     * @mbg.generated Mon Oct 21 19:01:40 CST 2019
     */
    public String getOperatorIp() {
        return operatorIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column special_equipment_type_one.operator_ip
     *
     * @param operatorIp the value for special_equipment_type_one.operator_ip
     *
     * @mbg.generated Mon Oct 21 19:01:40 CST 2019
     */
    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp == null ? null : operatorIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column special_equipment_type_one.operator_time
     *
     * @return the value of special_equipment_type_one.operator_time
     *
     * @mbg.generated Mon Oct 21 19:01:40 CST 2019
     */
    public Date getOperatorTime() {
        return operatorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column special_equipment_type_one.operator_time
     *
     * @param operatorTime the value for special_equipment_type_one.operator_time
     *
     * @mbg.generated Mon Oct 21 19:01:40 CST 2019
     */
    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }
}