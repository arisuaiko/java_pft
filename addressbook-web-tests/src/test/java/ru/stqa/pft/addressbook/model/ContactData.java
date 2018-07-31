package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String name;
  private final String middlename;
  private final String lastname;
  private final String number;
  private final String email;

  public ContactData(String name, String middlename, String lastname, String number, String email) {
    this.name = name;
    this.middlename = middlename;
    this.lastname = lastname;
    this.number = number;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNumber() {
    return number;
  }

  public String getEmail() {
    return email;
  }
}
