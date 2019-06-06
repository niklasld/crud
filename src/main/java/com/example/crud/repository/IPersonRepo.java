package com.example.crud.repository;

import com.example.crud.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPersonRepo extends CrudRepository<Person, Long> {
    //List<Person> fetchAll();
    //Person findPersonById(int id);
    //boolean addPerson(Person p);
    //boolean deletePerson(int id);
    //boolean updatePerson(Person p);
}
