package com.newsroom.employers.service;

import com.newsroom.employers.domains.Journalist;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface JournalistService {

  Journalist addUser(Journalist journalist);

  void delete(long id);

  Journalist getByName(String name);

  Journalist editBank(Journalist journalist);

  List<Journalist> getAll();
}