package com.example.upc.dataobject;

import java.math.BigDecimal;

public class ViewQuickCheckSampleTopTen {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_quick_check_sample_top_ten.check_name
     *
     * @mbg.generated Mon Aug 12 19:57:20 CST 2019
     */
    private String checkName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_quick_check_sample_top_ten.no
     *
     * @mbg.generated Mon Aug 12 19:57:20 CST 2019
     */
    private BigDecimal no;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_quick_check_sample_top_ten.check_name
     *
     * @return the value of view_quick_check_sample_top_ten.check_name
     *
     * @mbg.generated Mon Aug 12 19:57:20 CST 2019
     */
    public String getCheckName() {
        return checkName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_quick_check_sample_top_ten.check_name
     *
     * @param checkName the value for view_quick_check_sample_top_ten.check_name
     *
     * @mbg.generated Mon Aug 12 19:57:20 CST 2019
     */
    public void setCheckName(String checkName) {
        this.checkName = checkName == null ? null : checkName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_quick_check_sample_top_ten.no
     *
     * @return the value of view_quick_check_sample_top_ten.no
     *
     * @mbg.generated Mon Aug 12 19:57:20 CST 2019
     */
    public BigDecimal getNo() {
        return no;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_quick_check_sample_top_ten.no
     *
     * @param no the value for view_quick_check_sample_top_ten.no
     *
     * @mbg.generated Mon Aug 12 19:57:20 CST 2019
     */
    public void setNo(BigDecimal no) {
        this.no = no;
    }
}