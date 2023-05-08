package com.example.pirmaslab.persistence;

import com.example.pirmaslab.entities.Student;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class StudentDAO {
    @Inject
    private EntityManager em;

    public void AddOne(Student student){
        this.em.persist(student);
    }

    public Student GetOne(Long id){
        return this.em.find(Student.class, id);
    }

    public Student update(Student student){
        return em.merge(student);
    }

    public void delete(Student student){
        em.remove(student);
    }
}
