package com.example.upc.dataobject;

import java.util.Date;

public class ActionJournal {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column action_journal.id
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column action_journal.person
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    private String person;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column action_journal.time
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    private Date time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column action_journal.module
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    private String module;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column action_journal.action
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    private String action;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column action_journal.operator
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column action_journal.operator_ip
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    private String operatorIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column action_journal.operator_time
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    private Date operatorTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column action_journal.id
     *
     * @return the value of action_journal.id
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column action_journal.id
     *
     * @param id the value for action_journal.id
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column action_journal.person
     *
     * @return the value of action_journal.person
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    public String getPerson() {
        return person;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column action_journal.person
     *
     * @param person the value for action_journal.person
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column action_journal.time
     *
     * @return the value of action_journal.time
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column action_journal.time
     *
     * @param time the value for action_journal.time
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column action_journal.module
     *
     * @return the value of action_journal.module
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    public String getModule() {
        return module;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column action_journal.module
     *
     * @param module the value for action_journal.module
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column action_journal.action
     *
     * @return the value of action_journal.action
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    public String getAction() {
        return action;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column action_journal.action
     *
     * @param action the value for action_journal.action
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column action_journal.operator
     *
     * @return the value of action_journal.operator
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column action_journal.operator
     *
     * @param operator the value for action_journal.operator
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column action_journal.operator_ip
     *
     * @return the value of action_journal.operator_ip
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    public String getOperatorIp() {
        return operatorIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column action_journal.operator_ip
     *
     * @param operatorIp the value for action_journal.operator_ip
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp == null ? null : operatorIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column action_journal.operator_time
     *
     * @return the value of action_journal.operator_time
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    public Date getOperatorTime() {
        return operatorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column action_journal.operator_time
     *
     * @param operatorTime the value for action_journal.operator_time
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }
}