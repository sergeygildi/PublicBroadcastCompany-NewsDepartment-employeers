package com.newsroom.employers.controller;

import com.newsroom.employers.domains.Role;
import com.newsroom.employers.domains.User;
import com.newsroom.employers.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.Map;

@Controller
public class RegistrationController {
  @Autowired
  private UserRepo userRepo;

  @GetMapping("/registration")
  public String registration() {
    return "registration";
  }

  @PostMapping("/registration")
  public String addUser(User user, Map<String, Object> model) {
    User userFromDb = userRepo.findByUsername(user.getUsername());

    if (userFromDb != null) {
      model.put("message", "Аккаунт с таким именем уже существует!");
      return "registration";
    }

    user.setActive(true);
    user.setRoles(Collections.singleton(Role.USER));
    userRepo.saveAndFlush(user);

    return "redirect:/login";
  }
}
