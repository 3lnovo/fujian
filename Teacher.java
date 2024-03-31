/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ujianmatrix;

/**
 *
 * @author nuvo
 */

class Teacher extends Person {
    private int numCourses = 0;
    private String[] courses;

    public Teacher(String name, String address) {
        super(name, address);
        courses = new String[10]; // Maksimum Course 10
    }

    public boolean addCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return false; // Course Sudah Ada 
            }
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }

    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                numCourses--;
                return true;
            }
        }
        return false; // Course Tidak Ada
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }
}