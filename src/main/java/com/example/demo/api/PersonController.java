package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    //POST Request
    @PostMapping //Tells Spring this is a post request.. The RequestBody tells the parser to turnt he addPerson into a person object
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }


    //Method that tells Spring GET
    @GetMapping
    public List<Person> getAllPeople(){
        return personService.getAllPeople();
    }

}
