package com.newsroom.employers.domains;

import javax.persistence.*;

@Entity
@Table(name = "editor")
public class Editor {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String employerName;
  private String email;
  private String phone;
  private String homeAddress;

  public Editor() {
  }

  public Editor(String employerName, String phone) {
    this.employerName = employerName;
    this.phone = phone;
  }

  public Editor(String employerName, String email, String phone, String homeAddress) {
    this.employerName = employerName;
    this.email = email;
    this.phone = phone;
    this.homeAddress = homeAddress;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getEmployerName() {
    return employerName;
  }

  public void setEmployerName(String employeerName) {
    this.employerName = employeerName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getHomeAddress() {
    return homeAddress;
  }

  public void setHomeAddress(String homeAddress) {
    this.homeAddress = homeAddress;
  }
}
