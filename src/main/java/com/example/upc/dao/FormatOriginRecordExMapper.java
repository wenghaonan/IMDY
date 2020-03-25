package com.example.upc.dao;

import com.example.upc.controller.param.FormatOriginRecordExEnParam;
import com.example.upc.controller.param.PageQuery;
import com.example.upc.controller.searchParam.OriginRecordExSearchParam;
import com.example.upc.dataobject.FormatOriginRecordEx;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FormatOriginRecordExMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_origin_record_ex
     *
     * @mbg.generated Fri Oct 25 10:27:54 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_origin_record_ex
     *
     * @mbg.generated Fri Oct 25 10:27:54 CST 2019
     */
    int insert(FormatOriginRecordEx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_origin_record_ex
     *
     * @mbg.generated Fri Oct 25 10:27:54 CST 2019
     */
    int insertSelective(FormatOriginRecordEx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_origin_record_ex
     *
     * @mbg.generated Fri Oct 25 10:27:54 CST 2019
     */
    FormatOriginRecordEx selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_origin_record_ex
     *
     * @mbg.generated Fri Oct 25 10:27:54 CST 2019
     */
    int updateByPrimaryKeySelective(FormatOriginRecordEx record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_origin_record_ex
     *
     * @mbg.generated Fri Oct 25 10:27:54 CST 2019
     */
    int updateByPrimaryKey(FormatOriginRecordEx record);

    int countListSup(@Param("search") OriginRecordExSearchParam search);
    List<FormatOriginRecordExEnParam> getPage(@Param("page") PageQuery page, @Param("search") OriginRecordExSearchParam search);
    int countListAdmin(@Param("search") OriginRecordExSearchParam search);
    List<FormatOriginRecordExEnParam> getPageAdmin(@Param("page") PageQuery page, @Param("search") OriginRecordExSearchParam search);
    int countListEnterprise(@Param("enterprise") Integer enterprise, @Param("search") OriginRecordExSearchParam search);
    List<FormatOriginRecordExEnParam> getPageEnterprise(@Param("page") PageQuery page, @Param("enterprise") Integer enterprise, @Param("search") OriginRecordExSearchParam search);
    void batchInsertEx(@Param("formatOriginRecordExList") List<FormatOriginRecordEx> formatOriginRecordExList);
}