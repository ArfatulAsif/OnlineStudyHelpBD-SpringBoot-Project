package com.example.OnlineStudy;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("api/v2")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class Controllers {

        private final LoginUserService userService;
        private final LoginadminService adminService;
        private final SubjectaddedService subjectService;
        private final QuestionsService questionService;

        public Controllers(LoginUserService userService, LoginadminService adminService,
                        SubjectaddedService subjectService, QuestionsService questionService) {
                this.userService = userService;
                this.adminService = adminService;
                this.subjectService = subjectService;
                this.questionService = questionService;
        }

        @PostMapping("User")
        public ResponseEntity<Confirmation> func1(@RequestBody Person obj)
        {
                LoginUser user = userService.findUserByUsername(obj.username);

                System.out.println(obj.username + " " + obj.password + " " + obj.type);

                Confirmation ret = new Confirmation();

                if (user == null)
                {
                        ret.validity = false;
                        ret.message = "Username doesn't exits";
                        return new ResponseEntity<>(ret, HttpStatus.OK);
                } 
                else if (obj.password.equals(user.password))
                {
                        ret.validity = true;
                        ret.message = "Username and password matches";
                        return new ResponseEntity<>(ret, HttpStatus.OK);
                }

                else 
                {
                        ret.validity = false;
                        ret.message = "Username and password doesn't matches";
                        return new ResponseEntity<>(ret, HttpStatus.OK);
                }

        }

        @PostMapping("Admin")
        public ResponseEntity<Confirmation> func2(@RequestBody Person obj) 
        {
                Confirmation ret = new Confirmation();

                Loginadmin user = adminService.findUserByUsername(obj.username);

                System.out.println("----------------");
                System.out.println(obj.username + " " + obj.password + " " + obj.type);

                if (user == null)
                 {
                        ret.validity = false;
                        ret.message = "Username doesn't exits";
                        System.out.println(ret.validity);
                        return new ResponseEntity<>(ret, HttpStatus.OK);
                } else if (obj.password.equals(user.password)) 
                {
                        ret.validity = true;
                        ret.message = "Username and password matches";
                        System.out.println(ret.validity);
                        return new ResponseEntity<>(ret, HttpStatus.OK);
                }

                else 
                {
                        ret.validity = false;
                        ret.message = "Username and password doesn't matches";
                        System.out.println(ret.validity);
                        return new ResponseEntity<>(ret, HttpStatus.OK);
                }

        }

        @GetMapping("subjects")
        public List<Subjectadded> func3() 
        {
                return subjectService.getAll();
        }

        @PostMapping("addsubject")
        public Subjectadded func4(@RequestBody Subjectadded obj) 
        {
                return subjectService.saveEntity(obj);
        }

        @GetMapping("/question/{subject}")
        public ResponseEntity<List<Questions>> getQuestionsBySubject(@PathVariable String subject) 
        {

                System.out.println(subject + " Here inside the question");

                Subjectadded subjectAdded = new Subjectadded(subject);

                List<Questions> questions = questionService.findQuestionsBySubject(subjectAdded);
                return ResponseEntity.ok(questions);
        }

        @PostMapping("addQuestion")
        public ResponseEntity<Questions> addQuestion(@RequestBody QuestionRequest question) 
        {

                System.out.println(question.question);

                Subjectadded subjectAdded = new Subjectadded(question.subjects);

                List<Questions> questions = questionService.getAll();
                Questions obj = new Questions();

                Long a = questions.size() + 1L;

                obj.setId(a);

                obj.setQuestion(question.question);

                obj.setSubjects(subjectAdded);

                Questions addedQuestion = questionService.addQuestion(obj);
                return new ResponseEntity<>(addedQuestion, HttpStatus.CREATED);
        }



}
