package com.example.upc.controller.param;

import java.util.Date;

public class SmilePoints {

    private Integer id;

    private Integer enterpriseId;

    private String point;

    private Integer area;
    private Integer grid;
    private String registered_address;
    private String dynamic_grade;
    private Integer foodBusiness;
    private String businessType;
    private Integer foodCommon;
    private Integer foodCirculate;
    private Integer foodProduce;
    private Integer drugsBusiness;
    private Integer medicalUse;
    private Integer cosmeticsUse;
    private Date endTime;

    public Integer getFoodBusiness() {
        return foodBusiness;
    }

    public void setFoodBusiness(Integer foodBusiness) {
        this.foodBusiness = foodBusiness;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getGrid() {
        return grid;
    }

    public void setGrid(Integer grid) {
        this.grid = grid;
    }

    public String getRegistered_address() {
        return registered_address;
    }

    public void setRegistered_address(String registered_address) {
        this.registered_address = registered_address;
    }
    public String getDynamic_grade() {
        return dynamic_grade;
    }

    public void setDynamic_grade(String dynamic_grade) {
        this.dynamic_grade = dynamic_grade;
    }


    public Integer getFoodCommon() {
        return foodCommon;
    }

    public void setFoodCommon(Integer foodCommon) {
        this.foodCommon = foodCommon;
    }

    public Integer getFoodCirculate() {
        return foodCirculate;
    }

    public void setFoodCirculate(Integer foodCirculate) {
        this.foodCirculate = foodCirculate;
    }

    public Integer getFoodProduce() {
        return foodProduce;
    }

    public void setFoodProduce(Integer foodProduce) {
        this.foodProduce = foodProduce;
    }

    public Integer getDrugsBusiness() {
        return drugsBusiness;
    }

    public void setDrugsBusiness(Integer drugsBusiness) {
        this.drugsBusiness = drugsBusiness;
    }

    public Integer getMedicalUse() {
        return medicalUse;
    }

    public void setMedicalUse(Integer medicalUse) {
        this.medicalUse = medicalUse;
    }

    public Integer getCosmeticsUse() {
        return cosmeticsUse;
    }

    public void setCosmeticsUse(Integer cosmeticsUse) {
        this.cosmeticsUse = cosmeticsUse;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
