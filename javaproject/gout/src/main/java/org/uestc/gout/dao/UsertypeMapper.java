package org.uestc.gout.dao;

import org.uestc.gout.model.Usertype;

public interface UsertypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usertype
     *
     * @mbggenerated Thu Apr 21 14:35:39 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usertype
     *
     * @mbggenerated Thu Apr 21 14:35:39 CST 2016
     */
    int insert(Usertype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usertype
     *
     * @mbggenerated Thu Apr 21 14:35:39 CST 2016
     */
    int insertSelective(Usertype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usertype
     *
     * @mbggenerated Thu Apr 21 14:35:39 CST 2016
     */
    Usertype selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usertype
     *
     * @mbggenerated Thu Apr 21 14:35:39 CST 2016
     */
    int updateByPrimaryKeySelective(Usertype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usertype
     *
     * @mbggenerated Thu Apr 21 14:35:39 CST 2016
     */
    int updateByPrimaryKey(Usertype record);
}