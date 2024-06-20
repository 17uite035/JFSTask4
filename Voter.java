package com.java.demos;

import java.util.Scanner;

//Define the custom exception class
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

//Define the Voter class
class Voter {
 private int voterId;
 private String name;
 private int age;

 public Voter(int voterId, String name, int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Invalid age for voter");
     }
     this.voterId = voterId;
     this.name = name;
     this.age = age;
 }

 // Getters and setters
 public int getVoterId() {
     return voterId;
 }

 public void setVoterId(int voterId) {
     this.voterId = voterId;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Invalid age for voter");
     }
     this.age = age;
 }

 public static void main(String[] args) {
     try {
    	int voterId; String name; int age;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter VoterId:");
	   voterId=sc.nextInt();
	   System.out.println("Enter name:");
	   name=sc.next();
	   System.out.println("Enter age:");
	   age=sc.nextInt();
         Voter voter = new Voter(voterId, name, age);
         System.out.println("Voter created successfully!");
     } catch (InvalidAgeException e) {
         System.out.println("Error: " + e.getMessage());
     }

 }
}
