package TP3.exercice1;

import java.time.LocalDate;

public class Director {

    private String name;

    private LocalDate birthdate;

    private double salary;

    public Director(String name, LocalDate birthdate, double salary) {
        this.name = name;
        this.birthdate = birthdate;
        this.salary = salary;
    }
}
