package com.example.OnlineStudy;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Questions {

        @Id
        public Long id;

        public String question;

        @ManyToOne
        @JoinColumn(name = "subjects", referencedColumnName = "subjects")
        public Subjectadded subjects;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getQuestion() {
                return question;
        }

        public void setQuestion(String question) {
                this.question = question;
        }

        public Subjectadded getSubjects() {
                return subjects;
        }

        public void setSubjects(Subjectadded subjects) {
                this.subjects = subjects;
        }

}
