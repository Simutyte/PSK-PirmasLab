package com.example.pirmaslab.mybatis.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Student {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.STUDENT.ID
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.STUDENT.NAME
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.STUDENT.PHONE_NUMBER
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    private String phoneNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.STUDENT.SURNAME
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    private String surname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.STUDENT.UNIVERSITY_ID
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    private Long universityId;

    // Added manually
    @Getter @Setter
    private University university;

    @Getter @Setter
    private List<Subject> subjects;

    //end of add

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.STUDENT.ID
     *
     * @return the value of PUBLIC.STUDENT.ID
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.STUDENT.ID
     *
     * @param id the value for PUBLIC.STUDENT.ID
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.STUDENT.NAME
     *
     * @return the value of PUBLIC.STUDENT.NAME
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.STUDENT.NAME
     *
     * @param name the value for PUBLIC.STUDENT.NAME
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.STUDENT.PHONE_NUMBER
     *
     * @return the value of PUBLIC.STUDENT.PHONE_NUMBER
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.STUDENT.PHONE_NUMBER
     *
     * @param phoneNumber the value for PUBLIC.STUDENT.PHONE_NUMBER
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.STUDENT.SURNAME
     *
     * @return the value of PUBLIC.STUDENT.SURNAME
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    public String getSurname() {
        return surname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.STUDENT.SURNAME
     *
     * @param surname the value for PUBLIC.STUDENT.SURNAME
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.STUDENT.UNIVERSITY_ID
     *
     * @return the value of PUBLIC.STUDENT.UNIVERSITY_ID
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    public Long getUniversityId() {
        return universityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.STUDENT.UNIVERSITY_ID
     *
     * @param universityId the value for PUBLIC.STUDENT.UNIVERSITY_ID
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    public void setUniversityId(Long universityId) {
        this.universityId = universityId;
    }
}