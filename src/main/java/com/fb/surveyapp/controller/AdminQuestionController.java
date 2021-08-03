package com.fb.surveyapp.controller;

import com.fb.surveyapp.model.Question;
import com.fb.surveyapp.repository.question.QuestionDaoImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "admin/question")
@AllArgsConstructor
public class AdminQuestionController {

    private QuestionDaoImpl questionDao;

    @PostMapping("/save")
    public void save(@RequestBody Question question) {
        log.info("AdminQuestionController save question - {}", question);
        questionDao.save(question);
    }

    @PutMapping("/update")
    public void update(@RequestBody Question question) {
        log.info("AdminQuestionController update question - {}", question);
        questionDao.save(question);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        log.info("AdminQuestionController delete question - {}", id);
        questionDao.delete(id);
    }

}
