package com.harsha.studentsapp;

import javax.annotation.sql.DataSourceDefinition;

public class StudentDao {

    private int studentId;
    private String studentName;
    private String fathersName;

    public StudentDao(int studentId, String studentName, String fathersName){
        this.studentId = studentId;
        this.studentName = studentName;
        this.fathersName = fathersName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }
}
