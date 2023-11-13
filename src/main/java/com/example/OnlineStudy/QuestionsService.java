package com.example.OnlineStudy;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsService {

        private final QuestionsRepository questionRepository;

        public QuestionsService(QuestionsRepository questionRepository) {
                this.questionRepository = questionRepository;
        }

        public List<Questions> findQuestionsBySubject(Subjectadded subject) {
                return questionRepository.findBySubjects(subject);
        }

        public Questions addQuestion(Questions question) {
                
                return questionRepository.save(question);
        }

        public List<Questions> getAll() {
                return questionRepository.findAll();
        }

}