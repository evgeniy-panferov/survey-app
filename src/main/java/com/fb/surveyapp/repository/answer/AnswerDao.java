package com.fb.surveyapp.repository.answer;

import com.fb.surveyapp.model.Answer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerDao {
     List<Answer> findAnswerByUserId(Long userId);

     Answer save(Answer answer);
}
