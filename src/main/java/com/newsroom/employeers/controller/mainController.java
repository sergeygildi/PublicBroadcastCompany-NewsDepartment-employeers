package com.newsroom.employeers.controller;

import com.newsroom.employeers.domains.Employee;
import com.newsroom.employeers.myRepository.EmployRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class mainController {

  @Autowired
  private EmployRepo employRepo;

  @GetMapping("/main")
  public String greeting(Map<String, Object> model) {

    Iterable<Employee> employers = employRepo.findAll();
    model.put("employers", employers);
//    model.remove("employDelete", employDel);

    return "HelloPage";
  }

  @PostMapping
  public String add(
          @RequestParam String employerName,
          @RequestParam String email,
          @RequestParam String phone,
          @RequestParam String homeAddress,
          Map<String, Object> model
  ) {

    Employee employer = new Employee(employerName, email, phone, homeAddress);
    employRepo.save(employer);

    Iterable<Employee> employers = employRepo.findAll();
    model.put("employers", employers);

    return "HelloPage";
  }

}
