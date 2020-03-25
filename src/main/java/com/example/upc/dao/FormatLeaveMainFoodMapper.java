package com.example.upc.dao;

import com.example.upc.dataobject.FormatLeaveMainFood;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FormatLeaveMainFoodMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_main_food
     *
     * @mbg.generated Fri Jul 12 11:03:17 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_main_food
     *
     * @mbg.generated Fri Jul 12 11:03:17 CST 2019
     */
    int insert(FormatLeaveMainFood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_main_food
     *
     * @mbg.generated Fri Jul 12 11:03:17 CST 2019
     */
    int insertSelective(FormatLeaveMainFood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_main_food
     *
     * @mbg.generated Fri Jul 12 11:03:17 CST 2019
     */
    FormatLeaveMainFood selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_main_food
     *
     * @mbg.generated Fri Jul 12 11:03:17 CST 2019
     */
    int updateByPrimaryKeySelective(FormatLeaveMainFood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_main_food
     *
     * @mbg.generated Fri Jul 12 11:03:17 CST 2019
     */
    int updateByPrimaryKey(FormatLeaveMainFood record);
    List<FormatLeaveMainFood> selectByParentId(@Param("id") int id);
    void deleteByParentId(@Param("parentId") int parentId);
    void batchInsert(@Param("formatLeaveMainFoodList") List<FormatLeaveMainFood> formatLeaveMainFoodList);



}