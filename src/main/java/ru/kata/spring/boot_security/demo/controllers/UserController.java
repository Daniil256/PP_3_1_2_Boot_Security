package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.models.MyUser;
import ru.kata.spring.boot_security.demo.service.UserService;


@RestController
public class UserController {
    private final UserService service;

    @Autowired
    public UserController(UserService service){
        this.service = service;
    }
    @GetMapping
    public String index(Model model) {
        model.addAttribute("users", service.findAllUsers());
        return "index";
    }

    @GetMapping("/new")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String newUser(@ModelAttribute("user") MyUser myUser) {
        return "new";
    }

    @PostMapping("/new")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String create(@ModelAttribute("user") MyUser myUser) {
        service.saveUser(myUser);
        return "redirect:/";
    }

    @GetMapping("/edit")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String edit(@RequestParam("id") long id, Model model) {
        model.addAttribute("user", service.findByIdUser(id));
        return "edit";
    }

    @PostMapping("/edit")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String update(MyUser myUser) {
        service.updateUser(myUser);
        return "redirect:/";
    }

    @GetMapping("/delete")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String delete(@RequestParam("id") long id) {
        service.deleteByIdUser(id);
        return "redirect:/";
    }

    @GetMapping("/clear")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String clear() {
        service.deleteAllUsers();
        return "redirect:/";
    }
}
