package com.fb.surveyapp.controller;

import com.fb.surveyapp.model.Survey;
import com.fb.surveyapp.repository.survey.SurveyDaoImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/user/surveys")
@AllArgsConstructor
public class UserSurveyController {

    private SurveyDaoImpl surveyDao;

    @GetMapping
    public List<Survey> findAll() {
        log.info("UserSurveyController findAll");
        return surveyDao.findAll();
    }
}
