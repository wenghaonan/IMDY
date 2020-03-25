package com.example.upc.dao;

import com.example.upc.controller.param.*;
import com.example.upc.controller.searchParam.ComplaintEnterpriseSearchParam;
import com.example.upc.controller.searchParam.EnterpriseSearchParam;
import com.example.upc.dataobject.SupervisionEnterprise;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupervisionEnterpriseMapper {
    int deleteByPrimaryKey(Integer id);
    int insert(SupervisionEnterprise record);
    int insertSelective(SupervisionEnterprise record);
    SupervisionEnterprise selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(SupervisionEnterprise record);
    int updateByPrimaryKey(SupervisionEnterprise record);



    SupervisionEnterprise selectByUnit(@Param("unit") String unit);
    int countList( @Param("search") EnterpriseSearchParam search);
    List<EnterpriseListResult> getPage(@Param("page") PageQuery page, @Param("search")EnterpriseSearchParam search);
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
}