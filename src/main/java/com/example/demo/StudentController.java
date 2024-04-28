package com.example.demo;

import com.example.demo.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/student_api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("add_student")
    public ResponseEntity addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

}