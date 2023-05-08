package com.example.pirmaslab.usecases;

import com.example.pirmaslab.mybatis.dao.UniversityMapper;
import com.example.pirmaslab.mybatis.model.University;
import lombok.Getter;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Model
public class MyBatisUniversities {
    @Inject
    UniversityMapper universityMapper;

    @Transactional
    public List<University> loadUniversities() {
        return universityMapper.selectAll();
    }

}
