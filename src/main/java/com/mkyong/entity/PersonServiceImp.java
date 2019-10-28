package com.mkyong.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImp implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public void save(Person person) {
            personRepository.save(person);
    }
}
