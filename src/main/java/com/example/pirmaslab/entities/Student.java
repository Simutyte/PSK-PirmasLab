package com.example.pirmaslab.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 50)
    private String name;

    @Size(max = 50)
    private String surname;

    @Size(max = 12)
    @Column(name = "PHONE_NUMBER")
    private String phoneNr;
    @ManyToOne
    @JoinColumn(name="UNIVERSITY_ID")
    private University university;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable( name = "STUDENTS_SUBJECTS",
                joinColumns = @JoinColumn(name = "STUDENT_ID"),
                inverseJoinColumns = @JoinColumn(name = "SUBJECT_ID"))
    private List<Subject> subjects = new ArrayList<>();

}
