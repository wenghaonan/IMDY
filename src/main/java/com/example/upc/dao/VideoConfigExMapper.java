package com.example.upc.dao;

import com.example.upc.dataobject.VideoConfigEx;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VideoConfigExMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_config_ex
     *
     * @mbg.generated Thu Oct 10 15:14:23 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_config_ex
     *
     * @mbg.generated Thu Oct 10 15:14:23 CST 2019
     */
    int insert(VideoConfigEx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_config_ex
     *
     * @mbg.generated Thu Oct 10 15:14:23 CST 2019
     */
    int insertSelective(VideoConfigEx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_config_ex
     *
     * @mbg.generated Thu Oct 10 15:14:23 CST 2019
     */
    VideoConfigEx selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_config_ex
     *
     * @mbg.generated Thu Oct 10 15:14:23 CST 2019
     */
    int updateByPrimaryKeySelective(VideoConfigEx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_config_ex
     *
     * @mbg.generated Thu Oct 10 15:14:23 CST 2019
     */
    int updateByPrimaryKey(VideoConfigEx record);

    List<VideoConfigEx> selectByParentId(@Param("id") int id);
    void deleteByParentId(@Param("parentId") int parentId);
    void batchInsert(@Param("videoConfigExList") List<VideoConfigEx> videoConfigExList);
}