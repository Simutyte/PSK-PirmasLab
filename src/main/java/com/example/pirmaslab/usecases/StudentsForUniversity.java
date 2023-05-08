package com.example.pirmaslab.usecases;

import com.example.pirmaslab.entities.Student;
import com.example.pirmaslab.entities.Subject;
import com.example.pirmaslab.entities.University;
import com.example.pirmaslab.interceptors.LoggedInvocation;
import com.example.pirmaslab.persistence.StudentDAO;
import com.example.pirmaslab.persistence.SubjectDAO;
import com.example.pirmaslab.persistence.UniversityDAO;
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
public class StudentsForUniversity {

    @Inject
    private StudentDAO studentDAO;

    @Inject
    private UniversityDAO universityDAO;
    @Inject
    private SubjectDAO subjectDAO;

    @Getter @Setter
    private University university;

    @Getter @Setter
    private Student studentToCreate = new Student();

    @Getter @Setter
    private Subject subjectToCreate = new Subject();

    @PostConstruct
    public void init() {
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Long universityId = Long.parseLong(requestParameters.get("universityId"));
        this.university = universityDAO.GetOne(universityId);
    }

    @Transactional
    @LoggedInvocation
    public void createStudent() {
        studentToCreate.setUniversity(university);
        studentDAO.AddOne(studentToCreate);
    }

    @Transactional
    public void createSubject() {
        subjectToCreate.setUniversity(university);
        subjectDAO.AddOne(subjectToCreate);
    }
}
