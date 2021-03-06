package com.example.upc.dao;

import com.example.upc.controller.param.PageQuery;
import com.example.upc.controller.searchParam.ComplaintSearchParam;
import com.example.upc.dataobject.ComplaintIncomingCallType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ComplaintIncomingCallTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaint_incoming_call_type
     *
     * @mbg.generated Tue Sep 10 08:36:13 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaint_incoming_call_type
     *
     * @mbg.generated Tue Sep 10 08:36:13 CST 2019
     */
    int insert(ComplaintIncomingCallType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaint_incoming_call_type
     *
     * @mbg.generated Tue Sep 10 08:36:13 CST 2019
     */
    int insertSelective(ComplaintIncomingCallType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaint_incoming_call_type
     *
     * @mbg.generated Tue Sep 10 08:36:13 CST 2019
     */
    ComplaintIncomingCallType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaint_incoming_call_type
     *
     * @mbg.generated Tue Sep 10 08:36:13 CST 2019
     */
    int updateByPrimaryKeySelective(ComplaintIncomingCallType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaint_incoming_call_type
     *
     * @mbg.generated Tue Sep 10 08:36:13 CST 2019
     */
    int updateByPrimaryKey(ComplaintIncomingCallType record);
    int countList(@Param("search") ComplaintSearchParam search);
    List<ComplaintIncomingCallType> getPage(@Param("page") PageQuery page,@Param("search") ComplaintSearchParam search);
    int countByType(@Param("Type") String Type, @Param("Id") Integer Id);
    List<ComplaintIncomingCallType> getPageList(@Param("search") ComplaintSearchParam search);
}