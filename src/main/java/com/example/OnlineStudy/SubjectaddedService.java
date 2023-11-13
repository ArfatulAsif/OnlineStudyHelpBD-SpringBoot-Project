package com.example.OnlineStudy;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class SubjectaddedService {
        
        private final SubjectaddedRepository obj;

        public SubjectaddedService(SubjectaddedRepository obj)
        {
                this.obj = obj;
        }

        public List<Subjectadded> getAll() {
                return obj.findAll();
        }

        public Subjectadded saveEntity(Subjectadded obj2)
        {
                return obj.save(obj2);
        }
}
