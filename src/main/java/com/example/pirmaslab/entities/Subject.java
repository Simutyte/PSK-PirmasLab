package com.example.pirmaslab.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 150)
    private String title;

    @Basic(optional = false)
    private int credits;

    private String description;
    @ManyToMany(mappedBy = "subjects")
    private List<Student> students = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="UNIVERSITY_ID")
    private University university;

}
