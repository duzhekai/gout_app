package org.uestc.gout.dao;

import org.uestc.gout.model.PatientDetail;

public interface PatientDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patientdetail
     *
     * @mbggenerated Wed May 04 20:10:01 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patientdetail
     *
     * @mbggenerated Wed May 04 20:10:01 CST 2016
     */
    int insert(PatientDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patientdetail
     *
     * @mbggenerated Wed May 04 20:10:01 CST 2016
     */
    int insertSelective(PatientDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patientdetail
     *
     * @mbggenerated Wed May 04 20:10:01 CST 2016
     */
    PatientDetail selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patientdetail
     *
     * @mbggenerated Wed May 04 20:10:01 CST 2016
     */
    int updateByPrimaryKeySelective(PatientDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table patientdetail
     *
     * @mbggenerated Wed May 04 20:10:01 CST 2016
     */
    int updateByPrimaryKey(PatientDetail record);
}