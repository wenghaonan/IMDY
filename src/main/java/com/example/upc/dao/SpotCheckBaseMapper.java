package com.example.upc.dao;

import com.example.upc.controller.param.PageQuery;
import com.example.upc.controller.searchParam.SpotCheckBaseSearchParam;
import com.example.upc.dataobject.SpotCheckBase;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpotCheckBaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_check_base
     *
     * @mbg.generated Mon Aug 05 17:26:38 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_check_base
     *
     * @mbg.generated Mon Aug 05 17:26:38 CST 2019
     */
    int insert(SpotCheckBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_check_base
     *
     * @mbg.generated Mon Aug 05 17:26:38 CST 2019
     */
    int insertSelective(SpotCheckBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_check_base
     *
     * @mbg.generated Mon Aug 05 17:26:38 CST 2019
     */
    SpotCheckBase selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_check_base
     *
     * @mbg.generated Mon Aug 05 17:26:38 CST 2019
     */
    int updateByPrimaryKeySelective(SpotCheckBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_check_base
     *
     * @mbg.generated Mon Aug 05 17:26:38 CST 2019
     */
    int updateByPrimaryKey(SpotCheckBase record);
    int countListSup(@Param("team") String team, @Param("search") SpotCheckBaseSearchParam spotCheckBaseSearchParam);
    List<SpotCheckBase> getPageSup(@Param("page") PageQuery page, @Param("team") String team, @Param("search") SpotCheckBaseSearchParam spotCheckBaseSearchParam);
    int countListEnterprise(@Param("org") String org, @Param("search") SpotCheckBaseSearchParam spotCheckBaseSearchParam);
    List<SpotCheckBase> getPageEnterprise(@Param("page") PageQuery page, @Param("org") String org, @Param("search") SpotCheckBaseSearchParam spotCheckBaseSearchParam);
    int countListAdmin(@Param("search") SpotCheckBaseSearchParam spotCheckBaseSearchParam);
    List<SpotCheckBase> getPageAdmin(@Param("page") PageQuery page, @Param("search") SpotCheckBaseSearchParam spotCheckBaseSearchParam);
    int countListFoodType(@Param("type") String type);
    List<SpotCheckBase> getPageFoodType(@Param("page") PageQuery page, @Param("type") String type);
    int countListByEnterprise(@Param("name") String name);
    List<SpotCheckBase> getPageByEnterprise(@Param("page") PageQuery page, @Param("name") String name);
    int updateRecord(@Param("id") Integer id);
    void batchInsert(@Param("spotCheckBaseList") List<SpotCheckBase> spotCheckBaseList);
}