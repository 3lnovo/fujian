/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ujianmatrix;

/**
 *
 * @author nuvo
 */

class Student extends Person {
    private int numCourses = 0;
    private String[] courses;
    private int[] grades;

    public Student(String name, String address) {
        super(name, address);
        courses = new String[10]; // Maksimum Course 10
        grades = new int[10]; // Maksimum Course 10
    }

    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    public void printGrades() {
        System.out.println("Grades for " + getName() + ":");
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }

    public double getAverageGrade() {
        if (numCourses == 0)
            return 0;
        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return (double) sum / numCourses;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}
