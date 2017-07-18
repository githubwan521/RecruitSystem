package com.chinasofti.model;

import java.util.Date;

public class project_experience {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_experience.project_id
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     * 项目经验ID
     */
    private Integer projectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_experience.com_name
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     * 项目名称
     */
    private String comName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_experience.job_name
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     * 工作类型
     */
    private String jobName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_experience.pro_name
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     * 项目名称
     */
    private String proName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_experience.start_date
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     * 项目开始时间
     */
    private Date startDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_experience.end_date
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     * 
     * 项目结束时间
     */
    private Date endDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column project_experience.pro_content
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     * 
     * 项目内容
     */
    private String proContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_experience.project_id
     *
     * @return the value of project_experience.project_id
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_experience.project_id
     *
     * @param projectId the value for project_experience.project_id
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_experience.com_name
     *
     * @return the value of project_experience.com_name
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     */
    public String getComName() {
        return comName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_experience.com_name
     *
     * @param comName the value for project_experience.com_name
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     */
    public void setComName(String comName) {
        this.comName = comName == null ? null : comName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_experience.job_name
     *
     * @return the value of project_experience.job_name
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_experience.job_name
     *
     * @param jobName the value for project_experience.job_name
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     */
    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_experience.pro_name
     *
     * @return the value of project_experience.pro_name
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     */
    public String getProName() {
        return proName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_experience.pro_name
     *
     * @param proName the value for project_experience.pro_name
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     */
    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_experience.start_date
     *
     * @return the value of project_experience.start_date
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_experience.start_date
     *
     * @param startDate the value for project_experience.start_date
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_experience.end_date
     *
     * @return the value of project_experience.end_date
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_experience.end_date
     *
     * @param endDate the value for project_experience.end_date
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column project_experience.pro_content
     *
     * @return the value of project_experience.pro_content
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     */
    public String getProContent() {
        return proContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column project_experience.pro_content
     *
     * @param proContent the value for project_experience.pro_content
     *
     * @mbggenerated Tue Jul 18 11:12:09 CST 2017
     */
    public void setProContent(String proContent) {
        this.proContent = proContent == null ? null : proContent.trim();
    }
}