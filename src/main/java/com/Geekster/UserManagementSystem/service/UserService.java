package com.Geekster.UserManagementSystem.service;

import com.Geekster.UserManagementSystem.model.User;
import com.Geekster.UserManagementSystem.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public ResponseEntity<String> saveUser(User user) {
            userRepository.save(user);
        return new ResponseEntity<>("user is saved", HttpStatus.CREATED);
    }

    public ResponseEntity<String> getUserById(int userId) {
       User user= userRepository.findById(userId).get();
        if(user==null){
            return new ResponseEntity<>("UserNotFound",HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(user+"found",HttpStatus.FOUND);
        }
    }

    public ResponseEntity<List<User>> getAllUsers() {
        List<User> userList = userRepository.findAll();
        return new ResponseEntity<>(userList,HttpStatus.ACCEPTED);
    }

    public ResponseEntity<String> updateTheUserInfo(User user, int userId) {
        User user1 = userRepository.findById(userId).get();
        if(user1==null){
            return new ResponseEntity<>("user is not found",HttpStatus.OK);
        }else{
            User updateUser = new User();
            updateUser.setUserId(user1.getUserId());
            updateUser.setUsername(user1.getUsername());
            updateUser.setEmail(user1.getEmail());
            updateUser.setDate(user1.getDate());
            updateUser.setTime(user1.getTime());
            updateUser.setPhoneNumber(user1.getPhoneNumber());
            updateUser.setDateOfBirth(user1.getDateOfBirth());
        return new ResponseEntity<>("user is updated successfully",HttpStatus.OK);
        }

    }

    public ResponseEntity<String> deleteUser(int userId) {
        User user = userRepository.findById(userId).get();
        if(user!=null){
            userRepository.delete(user);
            return new ResponseEntity<>("user is deleted successfully",HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity<>("user is Not found to delete",HttpStatus.BAD_REQUEST);
        }
    }
}
