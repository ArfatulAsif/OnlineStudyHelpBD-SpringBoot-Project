package com.example.OnlineStudy;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginUserRepository extends JpaRepository<LoginUser, String> {

        // Query method to find a user by username and retrieve both username and
        // password

        LoginUser findByUsername(String username);

        // this uses jpa's naming convention for finding by username

}