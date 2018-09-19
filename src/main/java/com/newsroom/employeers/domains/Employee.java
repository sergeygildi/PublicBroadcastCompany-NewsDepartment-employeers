package com.newsroom.employeers.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String employerName;
  private String email;
  private String phone;
  private String homeAddress;

  public Employee() {
  }

  public Employee(String employeerName, String phone) {
    this.employerName = employeerName;
    this.phone = phone;
  }

  public Employee(String employeerName, String email, String phone, String homeAddress) {
    this.employerName = employeerName;
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
