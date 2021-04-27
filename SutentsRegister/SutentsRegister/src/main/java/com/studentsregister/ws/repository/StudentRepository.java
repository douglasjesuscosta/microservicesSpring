package com.studentsregister.ws.repository;

import javax.transaction.Transactional;

import com.studentsregister.ws.model.Student;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface StudentRepository {

    @Transactional
    public Student insertStudent(Student student) {
        return null;
    }

}
