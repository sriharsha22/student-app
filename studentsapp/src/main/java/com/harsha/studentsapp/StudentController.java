package com.harsha.studentsapp;

import com.harsha.studentsapp.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studentsapp")
public class StudentController {

    @GetMapping("/get-student")
    public StudentDao getStudents(){
        return new StudentDao(1, "tim", "harry");
    }
}
