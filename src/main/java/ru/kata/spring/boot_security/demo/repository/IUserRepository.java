package ru.kata.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kata.spring.boot_security.demo.models.MyUser;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<MyUser, Long> {
    Optional<MyUser> findByName(String name);
}
