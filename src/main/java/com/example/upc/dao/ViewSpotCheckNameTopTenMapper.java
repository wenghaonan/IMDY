package com.example.upc.dao;

import com.example.upc.dataobject.ViewSpotCheckNameTopTen;

import java.util.List;

public interface ViewSpotCheckNameTopTenMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_spot_check_name_top_ten
     *
     * @mbg.generated Mon Aug 12 09:46:57 CST 2019
     */
    int insert(ViewSpotCheckNameTopTen record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_spot_check_name_top_ten
     *
     * @mbg.generated Mon Aug 12 09:46:57 CST 2019
     */
    int insertSelective(ViewSpotCheckNameTopTen record);
    List<ViewSpotCheckNameTopTen> getListAll();
}