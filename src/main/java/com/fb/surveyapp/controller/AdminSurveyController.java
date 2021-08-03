package com.fb.surveyapp.controller;

import com.fb.surveyapp.exception.DateException;
import com.fb.surveyapp.model.Survey;
import com.fb.surveyapp.repository.survey.SurveyDaoImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/admin/survey")
@AllArgsConstructor
public class AdminSurveyController {

    private SurveyDaoImpl surveyDao;

    @PostMapping("/save")
    public void save(@RequestBody Survey survey) {
        log.info("AdminSurveyController save survey - {}", survey);
        surveyDao.save(survey);
    }

    @PutMapping("/update")
    public void update(@RequestBody Survey survey) throws Exception {
        log.info("AdminSurveyController update survey - {}", survey);
        if (survey.getDateStart() != null) {
            throw new DateException("Date start must not be update");
        }
        surveyDao.save(survey);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        log.info("AdminSurveyController delete id - {}", id);
        surveyDao.delete(id);
    }

    @ExceptionHandler(DateException.class)
    public String handleDateException(DateException exception) {
        return exception.getMessage();
    }
}
