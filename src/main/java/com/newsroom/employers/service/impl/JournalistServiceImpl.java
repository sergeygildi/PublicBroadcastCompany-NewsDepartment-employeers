package com.newsroom.employers.service.impl;

import com.newsroom.employers.domains.Journalist;
import com.newsroom.employers.repository.JournalRepo;
import com.newsroom.employers.service.JournalistService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class JournalistServiceImpl implements JournalistService {

  @Autowired
  private JournalRepo journalRepo;

  @Override
  public Journalist addBank(Journalist journalist) {
    Journalist savedJournalist = journalRepo.saveAndFlush(journalist);
    return savedJournalist;
  }

  @Override
  public void delete(long id) {
    journalRepo.deleteById(id);
  }

  @Override
  public Journalist getByName(String name) {
    return null;
  }

  @Override
  public Journalist editBank(Journalist journalist) {
    return journalRepo.saveAndFlush(journalist);
  }

  @Override
  public List<Journalist> getAll() {
    return journalRepo.findAll();
  }
}
