package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//This class is served as a repository
@Repository("fakeDao") //Allows us to have multiple implementations, can use mongo or postgres if we want
public class FakePersonDataAccessService implements PersonDao {
    //Make a list
    private ArrayList<Person> db = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        //add a new person
        if (db.add(new Person(id, person.getName())))
            return 0;
        return -1;
    }
    @Override
    public List<Person> selectAllPeople(){
        return db;
}
}
