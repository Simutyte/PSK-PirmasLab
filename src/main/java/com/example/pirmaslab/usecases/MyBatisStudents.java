package com.example.pirmaslab.usecases;

import com.example.pirmaslab.mybatis.model.Student;
import com.example.pirmaslab.mybatis.model.Subject;
import com.example.pirmaslab.mybatis.model.University;
import com.example.pirmaslab.interceptors.LoggedInvocation;
import com.example.pirmaslab.mybatis.dao.StudentMapper;
import com.example.pirmaslab.mybatis.dao.UniversityMapper;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@Model
public class MyBatisStudents {
    @Inject
    private StudentMapper studentMapper;

    @Inject
    private UniversityMapper universityMapper;

    @Getter @Setter
    private University university;

    @Getter @Setter
    private List<Student> studentList;

    @Getter @Setter
    private Student studentToCreate = new Student();

    @PostConstruct
    public void init() {
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Long universityId = Long.parseLong(requestParameters.get("universityId"));
        this.university = universityMapper.selectByPrimaryKey(universityId);
        //this.studentList = universityMapper.selectStudentsForUniversity(universityId);
        //System.out.println(studentList.get(0).getSubjects().size());
    }

    @Transactional
    public List<Student> getAllStudents(){
        return universityMapper.selectStudentsForUniversity(university.getId());
    }

    @Transactional
    public List<Subject> getStudentSubjects(Long id){
        return studentMapper.selectSubjectsForStudent(id);
    }

    @Transactional
    public List<Subject> getUniversitySubjects(){
        return universityMapper.selectSubjectsForUniversity(university.getId());
    }

    @Transactional
    @LoggedInvocation
    public void createStudent() {
        studentToCreate.setUniversity(university);
    }
}
