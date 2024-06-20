package com.java.demos;

//Define the custom exception classes
class AgeNotWithinRangeException extends Exception {
 public AgeNotWithinRangeException(String message) {
     super(message);
 }
}

class NameNotValidException extends Exception {
 public NameNotValidException(String message) {
     super(message);
 }
}

//Define the Student class
class Student {
 private int rollNo;
 private String name;
 private int age;
 private String course;

 public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
     if (!isValidName(name)) {
         throw new NameNotValidException("Name is not valid. It should not contain numbers or special symbols.");
     }
     if (!isValidAge(age)) {
         throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21.");
     }
     this.rollNo = rollNo;
     this.name = name;
     this.age = age;
     this.course = course;
 }

 private boolean isValidName(String name) {
     for (char c : name.toCharArray()) {
         if (!Character.isLetter(c) &&!Character.isSpaceChar(c)) {
             return false;
         }
     }
     return true;
 }

 private boolean isValidAge(int age) {
     return age >= 15 && age <= 21;
 }

 // Getters and setters
 public int getRollNo() {
     return rollNo;
 }

 public void setRollNo(int rollNo) {
     this.rollNo = rollNo;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) throws NameNotValidException {
     if (!isValidName(name)) {
         throw new NameNotValidException("Name is not valid. It should not contain numbers or special symbols.");
     }
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) throws AgeNotWithinRangeException {
     if (!isValidAge(age)) {
         throw new AgeNotWithinRangeException("Age is not within the range of 15 to 21.");
     }
     this.age = age;
 }

 public String getCourse() {
     return course;
 }

 public void setCourse(String course) {
     this.course = course;
 }
 
 
}


package com.java.demos;

import java.util.Scanner;

//Test the Student class
public class StudentMain {
public static void main(String[] args) {
   try {
	   int rollNo; String name; int age; String course;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter rollno:");
	   rollNo=sc.nextInt();
	   System.out.println("Enter name:");
	   name=sc.next();
	   System.out.println("Enter age:");
	   age=sc.nextInt();
	   System.out.println("Enter course:");
	   course=sc.next();
       Student student = new Student(rollNo, name,age, course);
       System.out.println("Student created successfully!");
   } catch (AgeNotWithinRangeException | NameNotValidException e) {
       System.out.println("Error: " + e.getMessage());
   }
}
}
