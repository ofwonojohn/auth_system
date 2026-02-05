package com.auth.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import com.auth.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
