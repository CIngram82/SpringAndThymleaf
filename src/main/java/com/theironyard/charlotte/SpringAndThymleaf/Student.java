package com.theironyard.charlotte.SpringAndThymleaf;

public class Student {
  public String firstName;
  public String lastName;
  public Grade grade; //(see Grade enum in starter files);

  public Student() {
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Grade getGrade() {
    return grade;
  }

  public void setGrade(Grade grade) {
    this.grade = grade;
  }

  public Student(String firstName, String lastName, Grade grade) {

    this.firstName = firstName;
    this.lastName = lastName;
    this.grade = grade;
  }
}
