package com.example.demo.student;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {



    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequnce",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequnce"
    )
    @Id

    private Long id;
    private String name;
    @Transient
    private Integer age;
    private  String email;
    private Darasa stream;
    private LocalDate dob;


    public Student() {
    }

    public Student(Long id, String name, Integer age, String email, Darasa stream, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.stream = stream;
        this.dob = dob;
    }

    public Student(String name, Integer age, String email, Darasa stream, LocalDate dob) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.stream = stream;
        this.dob = dob;
    }

    public Integer getAge() {
        return Period.between(this.dob,LocalDate.now()).getYears();
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public Student(String name, String email, Darasa stream, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.stream = stream;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Darasa getStream() {
        return stream;
    }

    public void setStream(Darasa stream) {
        this.stream = stream;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
