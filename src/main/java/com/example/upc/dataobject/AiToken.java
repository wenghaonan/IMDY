package com.example.upc.dataobject;

import java.util.Date;

public class AiToken {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ai_token.id
     *
     * @mbg.generated Fri Sep 18 19:40:55 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ai_token.api_key
     *
     * @mbg.generated Fri Sep 18 19:40:55 CST 2020
     */
    private String apiKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ai_token.secret_key
     *
     * @mbg.generated Fri Sep 18 19:40:55 CST 2020
     */
    private String secretKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ai_token.access_token
     *
     * @mbg.generated Fri Sep 18 19:40:55 CST 2020
     */
    private String accessToken;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ai_token.get_time
     *
     * @mbg.generated Fri Sep 18 19:40:55 CST 2020
     */
    private Date getTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ai_token.id
     *
     * @return the value of ai_token.id
     *
     * @mbg.generated Fri Sep 18 19:40:55 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ai_token.id
     *
     * @param id the value for ai_token.id
     *
     * @mbg.generated Fri Sep 18 19:40:55 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ai_token.api_key
     *
     * @return the value of ai_token.api_key
     *
     * @mbg.generated Fri Sep 18 19:40:55 CST 2020
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ai_token.api_key
     *
     * @param apiKey the value for ai_token.api_key
     *
     * @mbg.generated Fri Sep 18 19:40:55 CST 2020
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey == null ? null : apiKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ai_token.secret_key
     *
     * @return the value of ai_token.secret_key
     *
     * @mbg.generated Fri Sep 18 19:40:55 CST 2020
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ai_token.secret_key
     *
     * @param secretKey the value for ai_token.secret_key
     *
     * @mbg.generated Fri Sep 18 19:40:55 CST 2020
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey == null ? null : secretKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ai_token.access_token
     *
     * @return the value of ai_token.access_token
     *
     * @mbg.generated Fri Sep 18 19:40:55 CST 2020
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ai_token.access_token
     *
     * @param accessToken the value for ai_token.access_token
     *
     * @mbg.generated Fri Sep 18 19:40:55 CST 2020
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken == null ? null : accessToken.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ai_token.get_time
     *
     * @return the value of ai_token.get_time
     *
     * @mbg.generated Fri Sep 18 19:40:55 CST 2020
     */
    public Date getGetTime() {
        return getTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ai_token.get_time
     *
     * @param getTime the value for ai_token.get_time
     *
     * @mbg.generated Fri Sep 18 19:40:55 CST 2020
     */
    public void setGetTime(Date getTime) {
        this.getTime = getTime;
    }
}