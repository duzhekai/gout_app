package org.uestc.gout.model;

import java.util.Date;

public class Reminder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reminder.reminderid
     *
     * @mbggenerated Wed May 04 20:10:01 CST 2016
     */
    private Integer reminderid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reminder.userid
     *
     * @mbggenerated Wed May 04 20:10:01 CST 2016
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reminder.remindertime
     *
     * @mbggenerated Wed May 04 20:10:01 CST 2016
     */
    private Date remindertime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reminder.reminderid
     *
     * @return the value of reminder.reminderid
     *
     * @mbggenerated Wed May 04 20:10:01 CST 2016
     */
    public Integer getReminderid() {
        return reminderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reminder.reminderid
     *
     * @param reminderid the value for reminder.reminderid
     *
     * @mbggenerated Wed May 04 20:10:01 CST 2016
     */
    public void setReminderid(Integer reminderid) {
        this.reminderid = reminderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reminder.userid
     *
     * @return the value of reminder.userid
     *
     * @mbggenerated Wed May 04 20:10:01 CST 2016
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reminder.userid
     *
     * @param userid the value for reminder.userid
     *
     * @mbggenerated Wed May 04 20:10:01 CST 2016
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reminder.remindertime
     *
     * @return the value of reminder.remindertime
     *
     * @mbggenerated Wed May 04 20:10:01 CST 2016
     */
    public Date getRemindertime() {
        return remindertime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reminder.remindertime
     *
     * @param remindertime the value for reminder.remindertime
     *
     * @mbggenerated Wed May 04 20:10:01 CST 2016
     */
    public void setRemindertime(Date remindertime) {
        this.remindertime = remindertime;
    }
}