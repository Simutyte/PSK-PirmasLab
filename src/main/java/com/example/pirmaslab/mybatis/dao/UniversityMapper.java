package com.example.pirmaslab.mybatis.dao;

import com.example.pirmaslab.mybatis.model.Student;
import com.example.pirmaslab.mybatis.model.Subject;
import com.example.pirmaslab.mybatis.model.University;
import org.mybatis.cdi.Mapper;

import java.util.List;

@Mapper
public interface UniversityMapper {

    //added manually
    List<Student> selectStudentsForUniversity(Long id);

    List<Subject> selectSubjectsForUniversity(Long id);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.UNIVERSITY
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.UNIVERSITY
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    int insert(University record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.UNIVERSITY
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    University selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.UNIVERSITY
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    List<University> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.UNIVERSITY
     *
     * @mbg.generated Sun Apr 16 14:15:27 EEST 2023
     */
    int updateByPrimaryKey(University record);
}