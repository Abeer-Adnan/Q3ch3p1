/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginfxx;

/**
 *
 * @author rant
 */
public class Student {
    private int id ;
    private String name ;
   private  String major;
    private double grade;

    public Student(int id, String name, String major, double grade) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("%-5d  %-10s %-13s %-2.2f %n", getId(),getName(),getMajor(),getGrade());
    }
     public int compareTo(Student s) {
       return (int)-( this.grade-s.grade);
    }
}
