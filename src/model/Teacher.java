package model;

import java.util.UUID;

public class Teacher {
    private  String name;
    private  int experience;
    private  int salary;
    private UUID teacherId;

    public Teacher() {
        this.teacherId=UUID.randomUUID();
    }

    public UUID getTeacherId() {
        return teacherId;
    }

    public Teacher(String name, int experience, int salary) {
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
