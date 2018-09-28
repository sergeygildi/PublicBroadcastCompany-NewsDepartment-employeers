package com.newsroom.employers.repository;

import com.newsroom.employers.domains.Journalist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JournalRepo extends JpaRepository<Journalist, Long> {
  List<Journalist> findByJournalistSurname(String journalistSurname);
}

