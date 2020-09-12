package com.example.upc.dao;

import com.example.upc.dataobject.FormatLeaveFruit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FormatLeaveFruitMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_fruit
     *
     * @mbg.generated Fri Sep 11 19:08:08 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_fruit
     *
     * @mbg.generated Fri Sep 11 19:08:08 CST 2020
     */
    int insert(FormatLeaveFruit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_fruit
     *
     * @mbg.generated Fri Sep 11 19:08:08 CST 2020
     */
    int insertSelective(FormatLeaveFruit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_fruit
     *
     * @mbg.generated Fri Sep 11 19:08:08 CST 2020
     */
    FormatLeaveFruit selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_fruit
     *
     * @mbg.generated Fri Sep 11 19:08:08 CST 2020
     */
    int updateByPrimaryKeySelective(FormatLeaveFruit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_fruit
     *
     * @mbg.generated Fri Sep 11 19:08:08 CST 2020
     */
    int updateByPrimaryKey(FormatLeaveFruit record);
    List<FormatLeaveFruit> selectByParentId(@Param("id") int id);
    void deleteByParentId(@Param("parentId") int parentId);
    void batchInsert(@Param("formatLeaveFruitList") List<FormatLeaveFruit> formatLeaveFruitList);
}