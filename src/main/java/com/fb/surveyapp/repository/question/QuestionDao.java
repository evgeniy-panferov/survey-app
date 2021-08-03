package com.fb.surveyapp.repository.question;

import com.fb.surveyapp.model.Question;

public interface QuestionDao {

    Question save(Question survey);

    void delete(Long id);

}
