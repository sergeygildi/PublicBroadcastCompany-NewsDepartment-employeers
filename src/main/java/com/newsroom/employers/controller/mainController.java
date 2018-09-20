package com.newsroom.employers.controller;

import com.newsroom.employers.domains.Editor;
import com.newsroom.employers.domains.Journalist;
import com.newsroom.employers.repository.EditorRepo;
import com.newsroom.employers.repository.JournalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class mainController {

  @Autowired
  private JournalRepo journalRepo;
  @Autowired
  private EditorRepo editorRepo;

  @GetMapping("/main")
  public String greeting(Map<String, Object> model) {

    Iterable<Editor> editors = editorRepo.findAll();
    model.put("editors", editors);

    Iterable<Journalist> journalists = journalRepo.findAll();
    model.put("journalists", journalists);

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

    Editor editor = new Editor(employerName, email, phone, homeAddress);
    editorRepo.save(editor);

    Iterable<Editor> editors = editorRepo.findAll();
    model.put("editors", editors);

    return "HelloPage";
  }

}
