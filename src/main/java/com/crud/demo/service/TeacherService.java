package com.crud.demo.service;

import com.crud.demo.generics.GenericRepository;
import com.crud.demo.generics.GenericService;
import com.crud.demo.model.Teacher;
import com.crud.demo.repository.TeacherRepository;
import org.springframework.stereotype.Service;

@Service
public class TeacherService extends GenericService<Teacher, Long> {
    public TeacherService(TeacherRepository genericRepository) {
        super(genericRepository);
    }
}
