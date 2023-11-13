package com.example.OnlineStudy;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Subjectadded {
        @Id
        public String subjects;

        public Subjectadded() {
                
        }

        public Subjectadded(String subjectName) {
                this.subjects = subjectName;
        }
}
