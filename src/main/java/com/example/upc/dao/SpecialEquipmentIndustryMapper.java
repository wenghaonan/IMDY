package com.example.upc.dao;

import com.example.upc.controller.param.PageQuery;
import com.example.upc.controller.searchParam.MeasurementSearchParam;
import com.example.upc.dataobject.SpecialEquipmentIndustry;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecialEquipmentIndustryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_equipment_industry
     *
     * @mbg.generated Wed Oct 23 15:22:16 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_equipment_industry
     *
     * @mbg.generated Wed Oct 23 15:22:16 CST 2019
     */
    int insert(SpecialEquipmentIndustry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_equipment_industry
     *
     * @mbg.generated Wed Oct 23 15:22:16 CST 2019
     */
    int insertSelective(SpecialEquipmentIndustry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_equipment_industry
     *
     * @mbg.generated Wed Oct 23 15:22:16 CST 2019
     */
    SpecialEquipmentIndustry selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_equipment_industry
     *
     * @mbg.generated Wed Oct 23 15:22:16 CST 2019
     */
    int updateByPrimaryKeySelective(SpecialEquipmentIndustry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_equipment_industry
     *
     * @mbg.generated Wed Oct 23 15:22:16 CST 2019
     */
    int updateByPrimaryKey(SpecialEquipmentIndustry record);

    int countList(@Param("search") MeasurementSearchParam search);
    List<SpecialEquipmentIndustry> getPage(@Param("page") PageQuery page, @Param("search") MeasurementSearchParam search);
    int countByName(@Param("Name") String Name,@Param("Id") Integer Id);
}