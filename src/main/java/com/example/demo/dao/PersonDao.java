package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.List;
import java.util.UUID;


//The operations for a person
public interface PersonDao {

    //If we implement a PersonDao we need to implement this method

    /**
     * Method insertPerson takes a UUID(identifier) and a person object and returns 0 if successful or -1 if failed
     * @param id
     * @param person
     * @return 0 or 1
     */
    int insertPerson(UUID id, Person person);

    //All that implement have this, so we can have a body
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();//If we want to insert a person and we dont have an id, get a new random UUID
        return insertPerson(id, person);
    }

    //Interface requires that you implement a returnAll,assume it is a list
    List<Person> selectAllPeople();
}
