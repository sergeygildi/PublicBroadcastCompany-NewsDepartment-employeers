package com.newsroom.employers.domains;

import javax.persistence.*;

@Entity
@Table(name = "journalistsTable")
public class Journalist {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)

  @Column(name = "journalistId")
  private Integer id;
  @Column(name = "journalistName")
  private String journalistName;
  @Column(name = "journalistSurname")
  private String journalistSurname;
  @Column(name = "journalistEmail")
  private String email;
  @Column(name = "journalistPhone")
  private String phone;
  @Column(name = "journalistHomeAddress")
  private String homeAddress;
  @Column(name = "journalistDesignation")
  private String designation;

  public Journalist() {
  }

  public Journalist(
          String journalistName,
          String journalistSurname,
          String email,
          String phone,
          String homeAddress,
          String designation
  ) {
    this.journalistName = journalistName;
    this.journalistSurname = journalistSurname;
    this.email = email;
    this.phone = phone;
    this.homeAddress = homeAddress;
    this.designation = designation;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getJournalistName() {
    return journalistName;
  }

  public void setJournalistName(String journalistName) {
    this.journalistName = journalistName;
  }

  public String getJournalistSurname() {
    return journalistSurname;
  }

  public void setJournalistSurname(String journalistSurname) {
    this.journalistSurname = journalistSurname;
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

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }
}
