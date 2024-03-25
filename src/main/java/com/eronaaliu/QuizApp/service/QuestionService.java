package com.eronaaliu.QuizApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eronaaliu.QuizApp.Question;
import com.eronaaliu.QuizApp.dao.QuestionDao;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }
    
}
