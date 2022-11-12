package com.cybersoft.fooddelivery.repository;

import com.cybersoft.fooddelivery.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
    List<User> findByEmailAndPassword(String email, String password);


}
