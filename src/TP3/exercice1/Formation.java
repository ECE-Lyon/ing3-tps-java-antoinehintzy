package TP3.exercice1;

import java.time.LocalDate;

public class Formation {

    private String name;

    private School school;

    private Student student;

    private int nbYearsDuration;

    private LocalDate inscriptionDate;

    public Formation(String name, School school, Student student, int nbYearsDuration, LocalDate inscriptionDate) {
        this.name = name;
        this.school = school;
        this.student = student;
        this.nbYearsDuration = nbYearsDuration;
        this.inscriptionDate = inscriptionDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getNbYearsDuration() {
        return nbYearsDuration;
    }

    public void setNbYearsDuration(int nbYearsDuration) {
        this.nbYearsDuration = nbYearsDuration;
    }

    public LocalDate getInscriptionDate() {
        return inscriptionDate;
    }

    public void setInscriptionDate(LocalDate inscriptionDate) {
        this.inscriptionDate = inscriptionDate;
    }
}
