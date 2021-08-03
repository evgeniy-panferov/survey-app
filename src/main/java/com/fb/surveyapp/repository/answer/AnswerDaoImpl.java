package com.fb.surveyapp.repository.answer;

import com.fb.surveyapp.model.Answer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Slf4j
@AllArgsConstructor
public class AnswerDaoImpl implements AnswerDao{

    private AnswerRepository answerRepository;

    @Override
    public List<Answer> findAnswerByUserId(Long userId) {
        return answerRepository.findAnswerByUserId(userId);
    }

    @Override
    public Answer save(Answer answer) {
        return answerRepository.save(answer);
    }
}
