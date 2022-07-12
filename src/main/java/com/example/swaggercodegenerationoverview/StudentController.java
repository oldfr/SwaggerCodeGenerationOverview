package com.example.swaggercodegenerationoverview;

import com.example.swaggercodegenerationoverview.api.StudentApi;
import com.example.swaggercodegenerationoverview.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController implements StudentApi {

    @Override
    public ResponseEntity<Student> getStudentDetail(String studentId) {
        // get student data from service layer
        Student student = new Student();
        student.setId(1);
        student.setName("Vivek");
        student.setAge(27);
        ResponseEntity<Student> responseEntity = ResponseEntity.ok(student);
        return responseEntity;
    }

    @Override
    public ResponseEntity<Student> createStudentDetail(Student student) {
        // create student record in DB and return same
        return ResponseEntity.ok(student);
    }
}
