package com.example.upc.dao;

import com.example.upc.dataobject.ViewQuickCheckTypePercentResult;

import java.util.List;

public interface ViewQuickCheckTypePercentResultMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_quick_check_type_percent_result
     *
     * @mbg.generated Fri Aug 09 23:22:50 CST 2019
     */
    int insert(ViewQuickCheckTypePercentResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_quick_check_type_percent_result
     *
     * @mbg.generated Fri Aug 09 23:22:50 CST 2019
     */
    int insertSelective(ViewQuickCheckTypePercentResult record);
    List<ViewQuickCheckTypePercentResult> getListAll();
}