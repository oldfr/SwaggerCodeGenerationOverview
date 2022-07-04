package com.example.swaggercodegenerationoverview;

import com.example.swaggercodegenerationoverview.api.StudentApi;
import com.example.swaggercodegenerationoverview.model.Student;
import org.springframework.http.ResponseEntity;

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
//        return StudentApi.super.getStudentDetail(studentId);
    }
}
