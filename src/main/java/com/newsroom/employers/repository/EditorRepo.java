package com.newsroom.employers.repository;

import com.newsroom.employers.domains.Editor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditorRepo extends JpaRepository<Editor, Long> {
}
