package com.example.pirmaslab.usecases;

import com.example.pirmaslab.entities.Student;
import com.example.pirmaslab.entities.Subject;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Model
public class OneStudentInfo {
    @Inject
    private StudentDAO studentDAO;

    @Inject
    private SubjectDAO subjectDAO;
    @Inject
    private UniversityDAO universityDAO;

    @Getter @Setter
    private Student studentToUpdate;

    @Getter @Setter
    private Long selectedSubjectId;

    @Getter @Setter
    private List<Subject> subjectList = new ArrayList<>();

    @Getter @Setter
    private List<Subject> universitySubjects = new ArrayList<>();

    @Getter @Setter
    private Subject subjectToAdd = new Subject();

    @PostConstruct
    public void init() {
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Long studentId = Long.parseLong(requestParameters.get("studentId"));
        this.studentToUpdate = studentDAO.GetOne(studentId);
        this.universitySubjects = universityDAO.GetOne(studentToUpdate.getUniversity().getId()).getSubjects();
        this.subjectList = studentToUpdate.getSubjects(); //nebutinas sitas galima psl pakeist getSubjects()
    }

    @Transactional
    @LoggedInvocation
    public void updateStudentInfo() {
        studentDAO.update(studentToUpdate);
    }


    @Transactional
    public void addOneSubject() {
        Subject subject = new Subject();
        subject = subjectDAO.GetOne(this.selectedSubjectId);
        studentToUpdate.getSubjects().add(subject);
        studentDAO.update(studentToUpdate);
        System.out.println("Pasirinkta reikšmė: " + this.selectedSubjectId);
    }
}
