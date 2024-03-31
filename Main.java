/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ujianmatrix;

/**
 *
 * @author nuvo
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nama dan Alamat Student
        System.out.println("Enter student name:");
        String studentName = scanner.nextLine();
        System.out.println("Enter student address:");
        String studentAddress = scanner.nextLine();
        Student student = new Student(studentName, studentAddress);

        // Menambahkan Courses dan Grades Student
        System.out.println("Enter number of courses for " + student.getName() + ":");
        int numCourses = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < numCourses; i++) {
            System.out.println("Enter course name:");
            String course = scanner.nextLine();
            System.out.println("Enter grade for course " + course + ":");
            int grade = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            student.addCourseGrade(course, grade);
        }

        // Cetak Informasi Student dan Grades
        System.out.println(student);
        student.printGrades();

        // Nama dan Alamat Teacher
        System.out.println("Enter teacher name:");
        String teacherName = scanner.nextLine();
        System.out.println("Enter teacher address:");
        String teacherAddress = scanner.nextLine();
        Teacher teacher = new Teacher(teacherName, teacherAddress);

        // Menambahkan Courses Teacher
        System.out.println("Enter number of courses for " + teacher.getName() + ":");
        numCourses = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < numCourses; i++) {
            System.out.println("Enter course name:");
            String course = scanner.nextLine();
            teacher.addCourse(course);
        }

        // Cetak Informasi Teacher
        System.out.println(teacher);

        scanner.close();
    }
}
