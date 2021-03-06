package com.example.upc.dao;

import com.example.upc.controller.param.PageQuery;
import com.example.upc.controller.searchParam.VideoSearchParam;
import com.example.upc.dataobject.VideoParentIcs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VideoParentIcsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_parent_ics
     *
     * @mbg.generated Mon Nov 04 22:39:51 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_parent_ics
     *
     * @mbg.generated Mon Nov 04 22:39:51 CST 2019
     */
    int insert(VideoParentIcs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_parent_ics
     *
     * @mbg.generated Mon Nov 04 22:39:51 CST 2019
     */
    int insertSelective(VideoParentIcs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_parent_ics
     *
     * @mbg.generated Mon Nov 04 22:39:51 CST 2019
     */
    VideoParentIcs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_parent_ics
     *
     * @mbg.generated Mon Nov 04 22:39:51 CST 2019
     */
    int updateByPrimaryKeySelective(VideoParentIcs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_parent_ics
     *
     * @mbg.generated Mon Nov 04 22:39:51 CST 2019
     */
    int updateByPrimaryKey(VideoParentIcs record);

    int countListSup(@Param("search") VideoSearchParam search);
    List<VideoParentIcs> getPageSup(@Param("page") PageQuery page, @Param("search") VideoSearchParam search);
    int countListAdmin(@Param("search") VideoSearchParam search);
    List<VideoParentIcs> getPageAdmin(@Param("page") PageQuery page, @Param("search") VideoSearchParam search);
    int countById(@Param("eid") Integer eid, @Param("Id") Integer Id);
    Integer selectByEnterpriseId(@Param("eid") Integer eid);
}