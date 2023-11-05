package com.practiceProjects;

enum GradeLevel {
    Freshman,
    Sophomore,
    Junior,
    Senior
}
public class Student {
    private int studentID;
    private String name;
    private GradeLevel gradeLevel;
    public Student (int studentID) {
        this.studentID = studentID;
    }
    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setGradeLevel (GradeLevel gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    //getters

}
