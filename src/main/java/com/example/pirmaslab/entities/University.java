package com.example.pirmaslab.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@NamedQueries(
        {
        @NamedQuery(name = "University.GetAll", query = "select u from University as u")
        })
@Getter @Setter
public class University{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 150)
    private String title;

    @OneToMany(mappedBy = "university")
    private List<Student> students = new ArrayList<>();

    @OneToMany(mappedBy = "university")
    private List<Subject> subjects = new ArrayList<>();
}
