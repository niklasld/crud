package com.example.crud.controller;

import com.example.crud.model.Person;
import com.example.crud.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class HomeController {

    @Autowired
    private IPersonService personService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("people", personService.findAll());

        return "index";
    }

    @PostMapping("/create")
    public String create(Person person) {
        personService.addPerson(person);

        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        personService.deletePerson(id);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") Long id, Model model) {

        Optional<Person> person = personService.findPersonById(id);
        Person test = person.get();
        model.addAttribute("person", test);

        return "update";
    }

    @PostMapping("/update")
    public String update(Person person) {
        //Optional<Person> temp = personService.findPersonById(person.getId());
        System.out.println("modtaget person "+person.getFirst_name()+"ID: "+person.getId());
        personService.addPerson(person);

        return "redirect:/";
    }
}
