package com.DZ4;

public class Student implements Comparable<Student> {

    private String student;

    public Student(String student) {
        this.student = student;
    }
    public String getStudent() {
        return student;
    }
    public int getNumber() {
        String s = this.student;
        return Integer.parseInt(s.substring(0, s.indexOf(" ")));
    }
    public String getStudentSurname() {
        String s = this.student;
        return s.substring(s.indexOf(" ")+1);
    }
    @Override
    public int compareTo(Student s) {
        int result = (this.getNumber()!=(s.getNumber())? (this.getNumber()-s.getNumber()) : (this.getStudentSurname().compareTo(s.getStudentSurname())));
        return result;
    }
}