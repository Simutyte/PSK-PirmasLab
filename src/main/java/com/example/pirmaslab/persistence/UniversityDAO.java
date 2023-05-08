package com.example.pirmaslab.persistence;

import com.example.pirmaslab.entities.University;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class UniversityDAO {
//veikimas repository analogas

    @Inject
    private EntityManager em;

    public void AddOne(University university){
        this.em.persist(university);
    }

    public University GetOne(Long id){
        return this.em.find(University.class, id);
    }

    public List<University> GetAll(){
        return em.createNamedQuery("University.GetAll", University.class).getResultList();
    }

    public University update(University university){
        return em.merge(university);
    }

    public void delete(University university){
        em.remove(university);
    }
}
