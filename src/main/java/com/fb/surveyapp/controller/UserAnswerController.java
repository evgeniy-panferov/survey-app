package com.fb.surveyapp.controller;


import com.fb.surveyapp.model.Answer;
import com.fb.surveyapp.repository.answer.AnswerDaoImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/user/answer")
@AllArgsConstructor
public class UserAnswerController {

    private AnswerDaoImpl answerDao;

    @PostMapping
    public void save(@RequestBody Answer answer) {
        log.info("UserSurveyController findByUserId answer - {}", answer);
        answerDao.save(answer);
    }

    @GetMapping("/{userId}")
    public List<Answer> findAnswerByUserId(@PathVariable Long userId) {
        log.info("UserSurveyController findByUserId userId - {}", userId);
        return answerDao.findAnswerByUserId(userId);
    }

}
