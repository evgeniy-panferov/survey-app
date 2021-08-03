package com.fb.surveyapp.repository.survey;

import com.fb.surveyapp.model.Survey;

import java.util.List;

public interface SurveyDao {

    Survey save(Survey survey);

    void delete(Long id);

    List<Survey> findAll();
}
