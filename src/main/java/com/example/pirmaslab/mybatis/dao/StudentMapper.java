package com.example.pirmaslab.mybatis.dao;

import com.example.pirmaslab.mybatis.model.Student;
import com.example.pirmaslab.mybatis.model.Subject;
import org.mybatis.cdi.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    //added manually
    List<Subject> selectSubjectsForStudent(Long id);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.STUDENT
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.STUDENT
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    int insert(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.STUDENT
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    Student selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.STUDENT
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    List<Student> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.STUDENT
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    int updateByPrimaryKey(Student record);
}