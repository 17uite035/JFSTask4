package com.java.demos;

import java.util.*;

public class StudentGradeBook {
    private Map<String, Integer> studentGrades;

    public StudentGradeBook() {
        this.studentGrades = new HashMap<>();
    }

    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student added successfully!");
    }

    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            System.out.println("Grade for " + name + ": " + studentGrades.get(name));
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void main(String[] args) {
        StudentGradeBook gradeBook = new StudentGradeBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Display grade");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.next();
                    System.out.print("Enter student grade: ");
                    int grade = scanner.nextInt();
                    gradeBook.addStudent(name, grade);
                    break;
                case 2:
                    System.out.print("Enter student name: ");
                    String removeName = scanner.next();
                    gradeBook.removeStudent(removeName);
                    break;
                case 3:
                    System.out.print("Enter student name: ");
                    String displayName = scanner.next();
                    gradeBook.displayGrade(displayName);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
