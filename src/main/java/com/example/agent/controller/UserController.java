package com.example.agent.controller;

import com.example.agent.dto.UserDTO;
import com.example.agent.repo.UserRepo;
import com.example.agent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {

@Autowired
private UserService userService;
    @GetMapping("/getUser")
    public List<UserDTO> getUser(){
      return userService.getAllUsers();
    }


    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {
      return userService.saveUser(userDTO);
    }
    @PutMapping("/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO) {
        return userService.updateUser(userDTO);
    }
    @DeleteMapping("/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO) {
        return userService.deleteDTO(userDTO);
    }


//    Get a Specific user by passing the ID
@Autowired
private UserRepo userrepo;
    @GetMapping("/SpecificUser/{id}")
    public UserDTO getUserById(@PathVariable Long id) {
        return userrepo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Book not found"));
    }
}

