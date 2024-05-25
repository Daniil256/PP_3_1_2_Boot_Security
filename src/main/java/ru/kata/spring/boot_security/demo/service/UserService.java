package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.models.MyUser;
import ru.kata.spring.boot_security.demo.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository){
        this.repository = repository;
    }
    private final List<Person> findAllUsers(){
        return repository.findAll();
    }

    public List<Person> getAllUsers() {
        return List.of();
    }

    public Person getUserById(long id) {
        return people.stream()
                .filter(el -> el.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void addUser(MyUser myUser){
        repository.save(myUser);
    }
}
