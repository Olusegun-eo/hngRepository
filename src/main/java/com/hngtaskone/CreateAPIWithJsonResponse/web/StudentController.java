package com.hngtaskone.CreateAPIWithJsonResponse.web;

import com.hngtaskone.CreateAPIWithJsonResponse.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/student/")
public class StudentController {

    @Value("${app.name: Create Get Api}")


    @GetMapping("/get")
    public Student getStudentDetails() {

               return new Student("Emm's", true, 25, "I had a background " +
                        "in Computer Science, and I have experience both in front-end and backend");

    }
}