package com.crud.demo.repository;

import com.crud.demo.generics.GenericRepository;
import com.crud.demo.model.Person;
import org.springframework.stereotype.Component;

@Component
public interface PersonRepository extends GenericRepository<Person, Long> {
}
