package com.example.OnlineStudy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Loginadmin {
        
        @Id
        public String username;
        public String password;

}
