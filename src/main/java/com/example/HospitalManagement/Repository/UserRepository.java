package com.example.HospitalManagement.Repository;

import com.example.HospitalManagement.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<User,Long> {

    Optional<User> findByEmail(String str);
    Optional<User> findByuserName(String str);
    boolean existsByEmail(String email);
}
