package com.example.OnlineStudy;

import org.springframework.data.jpa.repository.JpaRepository;


public interface LoginadminRepository extends JpaRepository<Loginadmin, String> {

        Loginadmin findByUsername(String username); // follow this naming convention
}