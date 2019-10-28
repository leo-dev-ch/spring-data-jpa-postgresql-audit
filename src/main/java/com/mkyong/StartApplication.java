package com.mkyong;

import com.mkyong.entity.Book;
import com.mkyong.entity.BookRepository;
import com.mkyong.entity.Person;
import com.mkyong.entity.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class StartApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(StartApplication.class);

    @Autowired
    private BookRepository repository;
    @Autowired
    private PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

    @Override
    public void run(String... args) {
   /*   repository.save(new Book("Java"));
        repository.save(new Book("Node"));
        repository.save(new Book("Python"));
        personRepository.save(new Person("leo"));
        personRepository.save(new Person("Nico"));
        personRepository.save(new Person("Jona"));
        personRepository.save(new Person("Maxi"));
*/
         Optional<Person> p1 = personRepository.findById(4);
        Optional<Person> p2 = personRepository.findById(5);
        Optional<Person> p3 = personRepository.findById(6);
        Optional<Person> p4 = personRepository.findById(7);
        p1.get().setName("Leonardo ");
        p2.get().setName("Nicolas");
        p3.get().setName("Jonathan");
        p4.get().setName("Maximiliadno");
        personRepository.save(p1.get());
        personRepository.save(p2.get());
        personRepository.save(p3.get());
        personRepository.save(p4.get());

    }

}