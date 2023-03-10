package com.example.agent.controller;

import com.example.agent.dto.UserDTO;
import com.example.agent.entity.User;
import com.example.agent.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

//    @GetMapping("/{id}")
//    public User getUserById(@PathVariable Long id) {
//        return userRepository.findById(id).orElse(null);
//    }
//    @GetMapping("/{id}")
//    public List<UserDTO> id(){
//        return userService.getAllUsers();
//    }

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


//    @GetMapping("/getUserByUserId{userID}")
//    public UserDTO getUserByUserID(@PathVariable String userID){
//        return userService.getUserByUserID(userID);
//    }
}
