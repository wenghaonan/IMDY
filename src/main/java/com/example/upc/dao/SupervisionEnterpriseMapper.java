package com.example.upc.dao;

import com.example.upc.controller.param.*;
import com.example.upc.controller.searchParam.ComplaintEnterpriseSearchParam;
import com.example.upc.controller.searchParam.EnterpriseSearchParam;
import com.example.upc.dataobject.SupervisionEnterprise;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupervisionEnterpriseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_enterprise
     *
     * @mbg.generated Sun Apr 19 00:46:37 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_enterprise
     *
     * @mbg.generated Sun Apr 19 00:46:37 CST 2020
     */
    int insert(SupervisionEnterprise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_enterprise
     *
     * @mbg.generated Sun Apr 19 00:46:37 CST 2020
     */
    int insertSelective(SupervisionEnterprise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_enterprise
     *
     * @mbg.generated Sun Apr 19 00:46:37 CST 2020
     */
    SupervisionEnterprise selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_enterprise
     *
     * @mbg.generated Sun Apr 19 00:46:37 CST 2020
     */
    int updateByPrimaryKeySelective(SupervisionEnterprise record);
    int updateByPrimaryKeySelectiveEx(SupervisionEnterprise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_enterprise
     *
     * @mbg.generated Sun Apr 19 00:46:37 CST 2020
     */
    int updateByPrimaryKey(SupervisionEnterprise record);

    SupervisionEnterprise selectByUnit(@Param("unit") String unit);
    int countList( @Param("search") EnterpriseSearchParam search);
    List<EnterpriseListResult> getPage(@Param("page") PageQuery page, @Param("search")EnterpriseSearchParam search);
    int countListState( @Param("search") EnterpriseSearchParam search);
    List<EnterpriseListResult> getPageState(@Param("page") PageQuery page, @Param("search")EnterpriseSearchParam search);
    void changeStop(@Param("id")int id,@Param("isStop")int isStop);
    List<EnterpriseListResult> getAll();
    void batchInsert(@Param("enterpriseList")List<SupervisionEnterprise> enterpriseList);
    void batchDelete(@Param("enterpriseIds")List<Integer> enterpriseIds);
    int countByIdNumber(@Param("idNumber") String idNumber, @Param("id") Integer id);
    void batchUpdateSupervisor(@Param("enterpriseList")List<EnterpriseListResult> enterpriseList);
    List<EnterpriseListResult> selectBySupervisor(@Param("supervisor")String supervisor);

    int countListAllEnterprise( @Param("search") ComplaintEnterpriseSearchParam search);
    List<EnterpriseListResultParam> getAllEnterprise(@Param("page") PageQuery page, @Param("search") ComplaintEnterpriseSearchParam search);

    int countListPreAndEd();
    List<PreAndEdParam> getPagePreAndEd(@Param("page") PageQuery page);
    int countListPre(@Param("dept") Integer dept);
    List<PreAndEdEnterpriseParam> getPagePre(@Param("page") PageQuery page, @Param("dept") Integer dept);
    int countListEd(@Param("dept") Integer dept);
    List<PreAndEdEnterpriseParam> getPageEd(@Param("page") PageQuery page, @Param("dept") Integer dept);

    int countListPhone( @Param("search") EnterpriseSearchParam search);
    List<SmilePoints> getListPhone(@Param("search") EnterpriseSearchParam search);

    int countListPC( @Param("search") EnterpriseSearchParam search);
    int countListPCHave( @Param("search") EnterpriseSearchParam search);
    int countListPCNone( @Param("search") EnterpriseSearchParam search);
    int changeFlagByIdNumber(@Param("idNumber") String idNumber);

    List<SmilePoints> getSimpleEnterpriseInfo();
}