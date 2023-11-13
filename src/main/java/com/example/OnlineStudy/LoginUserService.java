package com.example.OnlineStudy;


import org.springframework.stereotype.Service;

@Service
public class LoginUserService {

        private final LoginUserRepository obj;

       
        public LoginUserService(LoginUserRepository userRepository) {
                this.obj = userRepository;
        }

        // Service method to find a user by username and retrieve both username and
        // password
        public LoginUser findUserByUsername(String username) {
                return obj.findByUsername(username);
        }
}
