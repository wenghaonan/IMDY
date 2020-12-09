package com.example.upc.dao;

import com.example.upc.controller.param.ImportPoints;
import com.example.upc.dataobject.ImportEnterprisePoints;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImportEnterprisePointsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table import_enterprise_points
     *
     * @mbg.generated Thu Dec 03 21:04:25 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table import_enterprise_points
     *
     * @mbg.generated Thu Dec 03 21:04:25 CST 2020
     */
    int insert(ImportEnterprisePoints record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table import_enterprise_points
     *
     * @mbg.generated Thu Dec 03 21:04:25 CST 2020
     */
    int insertSelective(ImportEnterprisePoints record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table import_enterprise_points
     *
     * @mbg.generated Thu Dec 03 21:04:25 CST 2020
     */
    ImportEnterprisePoints selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table import_enterprise_points
     *
     * @mbg.generated Thu Dec 03 21:04:25 CST 2020
     */
    int updateByPrimaryKeySelective(ImportEnterprisePoints record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table import_enterprise_points
     *
     * @mbg.generated Thu Dec 03 21:04:25 CST 2020
     */
    int updateByPrimaryKey(ImportEnterprisePoints record);

    void batchInsert(@Param("pointsList") List<ImportPoints> list);

    List<ImportPoints> getAll();
}