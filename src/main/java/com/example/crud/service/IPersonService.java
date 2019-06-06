package com.example.crud.service;

import com.example.crud.model.Person;

import java.util.List;
import java.util.Optional;

public interface IPersonService {

    List<Person> findAll();
    Optional<Person> findPersonById(Long id);
    Person addPerson(Person p);
    void deletePerson(Long id);
    void updatePerson(Person p);
}
