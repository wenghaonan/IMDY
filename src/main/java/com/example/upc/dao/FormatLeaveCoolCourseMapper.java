package com.example.upc.dao;

import com.example.upc.dataobject.FormatLeaveCoolCourse;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FormatLeaveCoolCourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_cool_course
     *
     * @mbg.generated Fri Sep 11 19:08:08 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_cool_course
     *
     * @mbg.generated Fri Sep 11 19:08:08 CST 2020
     */
    int insert(FormatLeaveCoolCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_cool_course
     *
     * @mbg.generated Fri Sep 11 19:08:08 CST 2020
     */
    int insertSelective(FormatLeaveCoolCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_cool_course
     *
     * @mbg.generated Fri Sep 11 19:08:08 CST 2020
     */
    FormatLeaveCoolCourse selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_cool_course
     *
     * @mbg.generated Fri Sep 11 19:08:08 CST 2020
     */
    int updateByPrimaryKeySelective(FormatLeaveCoolCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_cool_course
     *
     * @mbg.generated Fri Sep 11 19:08:08 CST 2020
     */
    int updateByPrimaryKey(FormatLeaveCoolCourse record);
    List<FormatLeaveCoolCourse> selectByParentId(@Param("id") int id);
    void deleteByParentId(@Param("parentId") int parentId);
    void batchInsert(@Param("formatLeaveCoolCourseList") List<FormatLeaveCoolCourse> formatLeaveCoolCourseList);
}