package com.studentsregister.ws.controller;

import javax.validation.Valid;

import com.studentsregister.ws.business.StudentBusiness;
import com.studentsregister.ws.dto.StudentDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("students")
public class StudentController {

    @Autowired
    private StudentBusiness studentBusiness;

    @PostMapping
    public StudentDTO createUser(@RequestBody @Valid StudentDTO studentDTO) {

        studentBusiness.insertStudent(studentDTO);
        return null;
    }
}
