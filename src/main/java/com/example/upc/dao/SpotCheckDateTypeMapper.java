package com.example.upc.dao;

import com.example.upc.controller.param.PageQuery;
import com.example.upc.dataobject.SpotCheckDateType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpotCheckDateTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_check_date_type
     *
     * @mbg.generated Tue Jul 30 09:31:36 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_check_date_type
     *
     * @mbg.generated Tue Jul 30 09:31:36 CST 2019
     */
    int insert(SpotCheckDateType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_check_date_type
     *
     * @mbg.generated Tue Jul 30 09:31:36 CST 2019
     */
    int insertSelective(SpotCheckDateType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_check_date_type
     *
     * @mbg.generated Tue Jul 30 09:31:36 CST 2019
     */
    SpotCheckDateType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_check_date_type
     *
     * @mbg.generated Tue Jul 30 09:31:36 CST 2019
     */
    int updateByPrimaryKeySelective(SpotCheckDateType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_check_date_type
     *
     * @mbg.generated Tue Jul 30 09:31:36 CST 2019
     */
    int updateByPrimaryKey(SpotCheckDateType record);
    int countList();
    List<SpotCheckDateType> getPage(@Param("page") PageQuery page);
    int countByType(@Param("Type") String Type, @Param("Id") Integer Id);
}