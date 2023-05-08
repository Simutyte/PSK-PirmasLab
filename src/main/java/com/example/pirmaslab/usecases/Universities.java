package com.example.pirmaslab.usecases;

import com.example.pirmaslab.entities.University;
import com.example.pirmaslab.persistence.UniversityDAO;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Model
public class Universities {
    @Inject
    private UniversityDAO universityDAO;

    @Getter @Setter
    private University universityToCreate = new University();

    @Getter
    private List<University> universityList;

    @PostConstruct
    public void init(){
        loadUniversities();
    }

    @Transactional
    public void createUniversity(){
        this.universityDAO.AddOne(universityToCreate);
    }

    @Transactional
    private void loadUniversities(){
        this.universityList = universityDAO.GetAll();
    }
}
