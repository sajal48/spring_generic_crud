package com.crud.demo.service;

import com.crud.demo.generics.GenericRepository;
import com.crud.demo.generics.GenericService;
import com.crud.demo.model.Student;
import com.crud.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService extends GenericService<Student, Long> {
    public StudentService(StudentRepository genericRepository) {
        super(genericRepository);
    }
}
