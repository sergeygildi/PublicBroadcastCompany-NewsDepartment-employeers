package com.newsroom.employers.controller;

import com.newsroom.employers.domains.Journalist;
import com.newsroom.employers.repository.JournalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * TODO Realise JS Code "Add employee button";
 * He must:
 * make push-window "Add new employee";
 * added new employee in the db table;
 **/

/** TODO Realise JS Code "Drop or delete from db line for id";
 *  create img button "X", which when pressed - realizes delete from db line;
 *  create pop-window "Are u sure want delete with employee?" 2 option-button "Yes/No";
 **/

@Controller
public class JournalistsPageController {

  @Autowired
  private JournalRepo journalRepo;

  @GetMapping("/list_of_journalists")
  public String greeting(
          @RequestParam(required = false, defaultValue = "") String filter,
          Model modelNew,
          Map<String, Object> model) {

    Iterable<Journalist> journalists = journalRepo.findAll();

    if (filter != null && !filter.isEmpty()) {
      journalists = journalRepo.findByJournalistSurname(filter);
    } else {
      journalists = journalRepo.findAll();
    }

    modelNew.addAttribute("journalists", journalists);
    modelNew.addAttribute("filter", filter);

    model.put("journalists", journalists);
    return "JournalistsPage";
  }

  @PostMapping("/list_of_journalists")
  public String addJournalist(
          @RequestParam String journalistName,
          @RequestParam String journalistSurname,
          @RequestParam String email,
          @RequestParam String phone,
          @RequestParam String homeAddress,
          @RequestParam String designation,
          Map<String, Object> model
  ) {

    Journalist journalist = new Journalist(journalistName, journalistSurname, email, phone, homeAddress, designation);
    journalRepo.save(journalist);


    Iterable<Journalist> journalists = journalRepo.findAll();
    model.put("journalists", journalists);

    return "JournalistsPage";
  }

}