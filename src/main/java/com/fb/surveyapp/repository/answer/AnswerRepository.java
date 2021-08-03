package com.fb.surveyapp.repository.answer;

import com.fb.surveyapp.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer,Long> {

    @Query("SELECT a from Answer a where a.userId=:userId")
    List<Answer> findAnswerByUserId(@Param("userId") Long userId);

}
