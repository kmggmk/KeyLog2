package com.test.logkey.repository;

import com.test.logkey.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

        //Optional<User> findById(String userId);
        //User findByUsername(String username);
        boolean existsById(String id);
}
