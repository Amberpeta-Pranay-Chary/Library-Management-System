package com.project.libraryManagementSystem.repositories;

import com.project.libraryManagementSystem.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This class is used as a repository for Author API.
 *
 * @author rpranay665@gmail.com
 */
public interface AuthorRepository extends JpaRepository<Author, Integer> {
    Author findByAuthorEmail(String email);
    Author findByAuthorName(String authorName);
}
