package com.example.OnlineStudy;

import org.springframework.data.jpa.repository.JpaRepository;


public interface SubjectaddedRepository extends JpaRepository<Subjectadded, String> {

       // nothing cause we shall get all the subject using a default method
}