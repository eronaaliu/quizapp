package com.eronaaliu.QuizApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eronaaliu.QuizApp.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

}
