package com.example.upc.dao;

import com.example.upc.controller.param.FormatLeaveSupParam;
import com.example.upc.controller.param.PageQuery;
import com.example.upc.controller.searchParam.LeaveSearchParam;
import com.example.upc.dataobject.FormatLeaveSample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FormatLeaveSampleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_sample
     *
     * @mbg.generated Fri Sep 20 15:40:27 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_sample
     *
     * @mbg.generated Fri Sep 20 15:40:27 CST 2019
     */
    int insert(FormatLeaveSample record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_sample
     *
     * @mbg.generated Fri Sep 20 15:40:27 CST 2019
     */
    int insertSelective(FormatLeaveSample record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_sample
     *
     * @mbg.generated Fri Sep 20 15:40:27 CST 2019
     */
    FormatLeaveSample selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_sample
     *
     * @mbg.generated Fri Sep 20 15:40:27 CST 2019
     */
    int updateByPrimaryKeySelective(FormatLeaveSample record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_leave_sample
     *
     * @mbg.generated Fri Sep 20 15:40:27 CST 2019
     */
    int updateByPrimaryKey(FormatLeaveSample record);

    int countList();
    int countListSup(@Param("search") LeaveSearchParam leaveSearchParam);
    List<FormatLeaveSupParam> getPage(@Param("page") PageQuery page, @Param("search") LeaveSearchParam leaveSearchParam);
    int countListEnterprise(@Param("unit") Integer unit, @Param("search") LeaveSearchParam leaveSearchParam);
    List<FormatLeaveSample> getPageEnterprise(@Param("page") PageQuery page, @Param("unit") Integer unit, @Param("search") LeaveSearchParam leaveSearchParam);
    int countListAdmin(@Param("search") LeaveSearchParam leaveSearchParam);
    List<FormatLeaveSupParam> getPageAdmin(@Param("page") PageQuery page, @Param("search") LeaveSearchParam leaveSearchParam);
}