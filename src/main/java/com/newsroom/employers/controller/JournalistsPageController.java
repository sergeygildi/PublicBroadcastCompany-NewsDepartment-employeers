package com.newsroom.employers.controller;

import com.newsroom.employers.domains.Journalist;
import com.newsroom.employers.repository.JournalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class JournalistsPageController {

  @Autowired
  private JournalRepo journalRepo;

  @GetMapping("/list_of_journalists")
  public String greeting(Map<String, Object> model) {

    Iterable<Journalist> journalists = journalRepo.findAll();
    model.put("journalists", journalists);

    return "JournalistsPage";
  }

  @PostMapping("/list_of_journalists")
  public String addJournalist(
          @RequestParam String employerName,
          @RequestParam String email,
          @RequestParam String phone,
          @RequestParam String homeAddress,
          Map<String, Object> model
  ) {

    Journalist journalist = new Journalist(employerName, email, phone, homeAddress);
    journalRepo.save(journalist);

    Iterable<Journalist> journalists = journalRepo.findAll();
    model.put("journalists", journalists);

    return "JournalistsPage";
  }

}
