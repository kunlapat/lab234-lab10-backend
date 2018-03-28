package camt.se234.lab10.service;

import camt.se234.lab10.entity.Grade;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
    @Override
    public String getGrade(double score) {  
            if (score < 0 || score > 100) return "WRONG INPUT";
            else if (score >= 80) return "A";
            else if (score >= 70) return "B";
            else if (score >= 60) return "C";
            else if (score >= 50) return "D";
            else return "F";
    }
}
