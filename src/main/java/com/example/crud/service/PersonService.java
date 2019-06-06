package com.example.crud.service;

import com.example.crud.model.Person;
import com.example.crud.repository.IPersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService implements IPersonService {

    @Autowired
    IPersonRepo personRepo;

    //@Override
    public List<Person> findAll() {
        return (List<Person>) personRepo.findAll();
    }

    //@Override
    public Optional<Person> findPersonById(Long id) {
        final Optional<Person> byId = personRepo.findById(id);
        System.out.println(byId.get());
        return byId;
    }

    //@Override
    public Person addPerson(Person p) {

        return personRepo.save(p);
    }

    //@Override
    public void deletePerson(Long id) {
        personRepo.deleteById(id);
    }

    //@Override
    public void updatePerson(Person p) {

        personRepo.save(p);
    }
}
