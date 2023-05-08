package com.example.pirmaslab.persistence;

import com.example.pirmaslab.entities.Student;
import com.example.pirmaslab.entities.Subject;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class SubjectDAO {
    @Inject
    private EntityManager em;

    public void AddOne(Subject subject){
        this.em.persist(subject);
    }

    public Subject GetOne(Long id){
        return this.em.find(Subject.class, id);
    }

    public Subject update(Subject subject){
        return em.merge(subject);
    }

}
