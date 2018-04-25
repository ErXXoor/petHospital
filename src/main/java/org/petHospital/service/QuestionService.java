package org.petHospital.service;

import java.util.List;

import org.petHospital.model.Questions;
import org.springframework.stereotype.Service;

public interface QuestionService {
	Integer saveQuestions(Questions questions);

    List<Questions> getAllQuestions();

    Questions getQuestions(Integer id);

    void deleteQuestions(Integer id);

    void updateQuestions(Questions questions);
}
