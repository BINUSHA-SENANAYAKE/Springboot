package com.example.agent.repo;

import com.example.agent.dto.UserDTO;
import com.example.agent.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<UserDTO,Long> {

   //Writing Native Query
 //    @Query(value = "SELECT * FROM agent WHERE ID=?1")
 //    User getUserByUserID(String userId);

}
