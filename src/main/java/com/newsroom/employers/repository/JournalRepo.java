package com.newsroom.employers.repository;

import com.newsroom.employers.domains.Journalist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepo extends JpaRepository<Journalist, Long> {
}

