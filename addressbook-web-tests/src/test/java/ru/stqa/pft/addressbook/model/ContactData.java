package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String middlename;
  private final String lastname;
  private final String nickname;
  private final String title;
  private final String company;
  private final String address;
  private final String homephonenumber;
  private final String mobilenumber;
  private final String worknumber;
  private final String fax;
  private final String email;
  private final String email2;
  private final String email3;
  private String group;

  public ContactData(String firstname, String middlename, String lastname, String nickname, String title, String company, String address, String homephonenumber, String mobilenumber, String worknumber, String fax, String email, String email2, String email3, String group) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
    this.nickname = nickname;
    this.title = title;
    this.company = company;
    this.address = address;
    this.homephonenumber = homephonenumber;
    this.mobilenumber = mobilenumber;
    this.worknumber = worknumber;
    this.fax = fax;
    this.email = email;
    this.email2 = email2;
    this.email3 = email3;
    this.group = group;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNickname() {
    return nickname;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public String getAddress() {
    return address;
  }

  public String getHomephonenumber() {
    return homephonenumber;
  }

  public String getMobilenumber() {
    return mobilenumber;
  }

  public String getWorknumber() {
    return worknumber;
  }

  public String getFax() {
    return fax;
  }

  public String getEmail() {
    return email;
  }

  public String getEmail2() {
    return email2;
  }

  public String getEmail3() {
    return email3;
  }

  public String getGroup() {
    return group;
  }
}
