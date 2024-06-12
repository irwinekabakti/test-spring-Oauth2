package com.example.test_spring_Oauth2.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test_spring_Oauth2.models.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
	Optional<Users> findByUsername(String username);
}
