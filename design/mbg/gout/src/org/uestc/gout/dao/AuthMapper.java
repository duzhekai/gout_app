package org.uestc.gout.dao;

import org.uestc.gout.model.Auth;

public interface AuthMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbggenerated Wed May 04 20:10:01 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbggenerated Wed May 04 20:10:01 CST 2016
     */
    int insert(Auth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbggenerated Wed May 04 20:10:01 CST 2016
     */
    int insertSelective(Auth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbggenerated Wed May 04 20:10:01 CST 2016
     */
    Auth selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbggenerated Wed May 04 20:10:01 CST 2016
     */
    int updateByPrimaryKeySelective(Auth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth
     *
     * @mbggenerated Wed May 04 20:10:01 CST 2016
     */
    int updateByPrimaryKey(Auth record);
}