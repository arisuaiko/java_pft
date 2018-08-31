package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String name;
  private final String middlename;
  private final String lastname;
  private final String number;
  private final String email;
  private final String group;

  public ContactData(String name, String middlename, String lastname, String number, String email, String group) {
    this.name = name;
    this.middlename = middlename;
    this.lastname = lastname;
    this.number = number;
    this.email = email;
    this.group = group;
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

  public String getGroup() { return group; }
}
