package com.example.upc.dao;

import com.example.upc.dataobject.ActionJournal;

public interface ActionJournalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table action_journal
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table action_journal
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    int insert(ActionJournal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table action_journal
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    int insertSelective(ActionJournal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table action_journal
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    ActionJournal selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table action_journal
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    int updateByPrimaryKeySelective(ActionJournal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table action_journal
     *
     * @mbg.generated Fri Dec 18 11:19:26 CST 2020
     */
    int updateByPrimaryKey(ActionJournal record);
}