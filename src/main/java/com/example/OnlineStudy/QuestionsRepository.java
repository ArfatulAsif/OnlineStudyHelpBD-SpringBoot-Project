package com.example.OnlineStudy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions, Long> {
    
         // You can add custom query methods here if needed
        // For example, finding questions by subject or any other criteria

         List<Questions> findBySubjects(Subjectadded subjects);


}