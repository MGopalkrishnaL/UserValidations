package com.Geekster.UserManagementSystem.controller;

import com.Geekster.UserManagementSystem.model.User;
import com.Geekster.UserManagementSystem.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("/addUser")
    public ResponseEntity<String> addUser(@Valid @RequestBody User user) {
    return userService.saveUser(user);
    }
    @GetMapping("/getUser/{userId}")
    public ResponseEntity<String> getUser(@PathVariable int userId){
        return userService.getUserById(userId);
    }
    @GetMapping("/getAllUser")
    public ResponseEntity<List<User>> getAllusers(){
        return userService.getAllUsers();
    }
    @PutMapping("/updateUserInfo")
    public ResponseEntity<String> updateUser(@Valid @RequestBody User user,@RequestParam int userId){
        return userService.updateTheUserInfo(user,userId);
    }
    @DeleteMapping("/deleteUser")
    public ResponseEntity<String> deleteUser(@RequestParam int userId){
        return userService.deleteUser(userId);
    }

}
