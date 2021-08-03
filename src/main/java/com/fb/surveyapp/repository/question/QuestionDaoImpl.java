package com.fb.surveyapp.repository.question;

import com.fb.surveyapp.model.Question;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class QuestionDaoImpl implements QuestionDao {

    private final QuestionRepository questionRepository;

    @Override
    public Question save(Question question) {
        log.info("QuestionDaoImpl save question - {}", question);
        return questionRepository.save(question);
    }

    @Override
    public void delete(Long id) {
        log.info("QuestionDaoImpl delete id - {}", id);
        questionRepository.deleteById(id);
    }
}
