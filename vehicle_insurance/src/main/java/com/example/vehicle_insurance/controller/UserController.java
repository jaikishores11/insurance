package com.example.vehicle_insurance.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.vehicle_insurance.Bean.UserDetails;
import com.example.vehicle_insurance.service.UserService;

@Controller
@RequestMapping("/admin")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/Adduser")
    public String addUser(@RequestBody UserDetails AddUser) {
        return userService.AddUser_details(AddUser);
    }
    @GetMapping("/GetUser")
    public List<UserDetails> getUser() {
        return userService.GetUser_details();
    }
    @GetMapping("/GetUserById/{id}")
    public Optional<UserDetails> getUserById( @PathVariable Long id) {
        return userService.GetUserById(id);
    }
    @DeleteMapping("/deleteUserById/{id}")
    public String deleteUserById( @PathVariable Long id) {
        return userService.deleteUserById(id);
    }
    @PutMapping("/UpdateUser/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody UserDetails updatedUser) {
        return userService.updateUser(id, updatedUser);
    }
    @GetMapping("/home")
    public String showHomePage() {
        return "home"; // This refers to home.jsp
    }
@GetMapping("/Homepage")
public  String Home() {
    return "Homepage/Home";
}
@GetMapping("/admins")
public  String admin() {
    return "homepage/admin";
}
@GetMapping("/login")
public  String login() {
    return "homepage/Login";
}
}