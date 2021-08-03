package com.fb.surveyapp.repository.survey;

import com.fb.surveyapp.model.Survey;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.mapping.Collection;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Repository
@RequiredArgsConstructor
public class SurveyDaoImpl implements SurveyDao {

    private final SurveyRepository surveyRepository;

    @Override
    public Survey save(Survey survey) {
        log.info("SurveyDaoImpl save survey- {}", survey);
        return surveyRepository.save(survey);
    }

    @Override
    public void delete(Long id) {
        log.info("SurveyDaoImpl delete - {}", id);
        surveyRepository.deleteById(id);
    }

    @Override
    public List<Survey> findAll() {
        log.info("SurveyDaoImpl findAll");
        List<Survey> collect = surveyRepository.findAll()
                .stream()
                .filter(survey -> survey.getDateFinish().isAfter(LocalDateTime.now()) && survey.getDateStart().isBefore(LocalDateTime.now()))
                .collect(Collectors.toList());
        return Optional.ofNullable(collect)
                .orElse(Collections.emptyList());
    }
}
