package com.javaguides.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.javaguides.main.model.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}