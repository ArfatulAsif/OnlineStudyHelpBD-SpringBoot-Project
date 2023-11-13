package com.example.OnlineStudy;

import org.springframework.stereotype.Service;

@Service
public class LoginadminService {
        private final LoginadminRepository obj;

        public LoginadminService(LoginadminRepository obj )
        {
                this.obj = obj;
        }

        public Loginadmin findUserByUsername(String username)
        {
                return obj.findByUsername(username);
        }
}
