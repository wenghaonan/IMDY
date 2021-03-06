package com.example.upc.dataobject;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SupervisionCaTransfer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supervision_ca_transfer.id
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supervision_ca_transfer.ca_id
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    private Integer caId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supervision_ca_transfer.seq
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    private Integer seq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supervision_ca_transfer.transfer_time
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date transferTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supervision_ca_transfer.transfer_reason
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    private String transferReason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supervision_ca_transfer.primary_post
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    private String primaryPost;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supervision_ca_transfer.present_post
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    private String presentPost;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supervision_ca_transfer.boarding_time
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date boardingTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supervision_ca_transfer.operator
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supervision_ca_transfer.operate_time
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    private Date operateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supervision_ca_transfer.operate_ip
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    private String operateIp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_ca_transfer.id
     *
     * @return the value of supervision_ca_transfer.id
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_ca_transfer.id
     *
     * @param id the value for supervision_ca_transfer.id
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_ca_transfer.ca_id
     *
     * @return the value of supervision_ca_transfer.ca_id
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    public Integer getCaId() {
        return caId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_ca_transfer.ca_id
     *
     * @param caId the value for supervision_ca_transfer.ca_id
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    public void setCaId(Integer caId) {
        this.caId = caId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_ca_transfer.seq
     *
     * @return the value of supervision_ca_transfer.seq
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_ca_transfer.seq
     *
     * @param seq the value for supervision_ca_transfer.seq
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_ca_transfer.transfer_time
     *
     * @return the value of supervision_ca_transfer.transfer_time
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    public Date getTransferTime() {
        return transferTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_ca_transfer.transfer_time
     *
     * @param transferTime the value for supervision_ca_transfer.transfer_time
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    public void setTransferTime(Date transferTime) {
        this.transferTime = transferTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_ca_transfer.transfer_reason
     *
     * @return the value of supervision_ca_transfer.transfer_reason
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    public String getTransferReason() {
        return transferReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_ca_transfer.transfer_reason
     *
     * @param transferReason the value for supervision_ca_transfer.transfer_reason
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    public void setTransferReason(String transferReason) {
        this.transferReason = transferReason == null ? null : transferReason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_ca_transfer.primary_post
     *
     * @return the value of supervision_ca_transfer.primary_post
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    public String getPrimaryPost() {
        return primaryPost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_ca_transfer.primary_post
     *
     * @param primaryPost the value for supervision_ca_transfer.primary_post
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    public void setPrimaryPost(String primaryPost) {
        this.primaryPost = primaryPost == null ? null : primaryPost.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_ca_transfer.present_post
     *
     * @return the value of supervision_ca_transfer.present_post
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    public String getPresentPost() {
        return presentPost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_ca_transfer.present_post
     *
     * @param presentPost the value for supervision_ca_transfer.present_post
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    public void setPresentPost(String presentPost) {
        this.presentPost = presentPost == null ? null : presentPost.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_ca_transfer.boarding_time
     *
     * @return the value of supervision_ca_transfer.boarding_time
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    public Date getBoardingTime() {
        return boardingTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_ca_transfer.boarding_time
     *
     * @param boardingTime the value for supervision_ca_transfer.boarding_time
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    public void setBoardingTime(Date boardingTime) {
        this.boardingTime = boardingTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_ca_transfer.operator
     *
     * @return the value of supervision_ca_transfer.operator
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_ca_transfer.operator
     *
     * @param operator the value for supervision_ca_transfer.operator
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_ca_transfer.operate_time
     *
     * @return the value of supervision_ca_transfer.operate_time
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_ca_transfer.operate_time
     *
     * @param operateTime the value for supervision_ca_transfer.operate_time
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_ca_transfer.operate_ip
     *
     * @return the value of supervision_ca_transfer.operate_ip
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    public String getOperateIp() {
        return operateIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_ca_transfer.operate_ip
     *
     * @param operateIp the value for supervision_ca_transfer.operate_ip
     *
     * @mbg.generated Wed Jun 26 16:51:08 CST 2019
     */
    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp == null ? null : operateIp.trim();
    }
}