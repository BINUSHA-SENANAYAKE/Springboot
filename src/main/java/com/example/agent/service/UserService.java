package com.example.agent.service;

import com.example.agent.dto.UserDTO;
import com.example.agent.entity.User;
import com.example.agent.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public UserDTO saveUser(UserDTO userDTO){
        userRepo.save(userDTO);
        return userDTO;
    }
    public List<UserDTO> getAllUsers(){
       List<UserDTO> userList = userRepo.findAll();
        return userList;
    }


    public UserDTO updateUser(UserDTO userDTO){
        userRepo.save(userDTO);
        return userDTO;
    }
    public boolean deleteDTO(UserDTO userDTO){
        userRepo.delete(userDTO);
        return true;
    }

    //Writing native query

    //user id> user details
    //Select * from user where id =2
//    public UserDTO getUserByUserID(String userID){
//        User user = userRepo.getUserByUserID(userID);
//        return  (user,UserDTO.class);
//    }

    //user id, address > user details
    //Select * from user where id= 2 and address = "Ratmalana"

}
