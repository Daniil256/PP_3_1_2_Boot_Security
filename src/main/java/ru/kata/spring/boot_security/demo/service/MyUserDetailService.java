package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.configs.MyUserDetails;
import ru.kata.spring.boot_security.demo.models.MyUser;
import ru.kata.spring.boot_security.demo.repository.IUserRepository;

import java.util.Optional;

@Service
public class MyUserDetailService implements UserDetailsService {

    private final IUserRepository repository;

    @Autowired
    public MyUserDetailService(IUserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Optional<MyUser> user = repository.findByName(name);
        return user.map(MyUserDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException(name + " error"));
    }
}
