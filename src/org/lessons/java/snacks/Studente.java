package org.lessons.java.snacks;

public class Studente {

  // ATTRIBUTES
  private String firstName;
  private String lastName;
  private int age;

  // CONSTRUCTORS
  protected Studente(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  // METHODS
  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    if (firstName != null) {
      this.firstName = firstName;
    }
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    if (lastName != null) {
      this.lastName = lastName;
    }
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    if (age != 0) {
      this.age = age;
    }
  }

}
