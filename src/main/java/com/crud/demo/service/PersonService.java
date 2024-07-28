package com.crud.demo.service;

import com.crud.demo.generics.GenericRepository;
import com.crud.demo.generics.GenericService;
import com.crud.demo.model.Person;
import com.crud.demo.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends GenericService<Person, Long> {
    public PersonService(PersonRepository genericRepository) {
        super(genericRepository);
    }
}
