package com.example.test_spring_Oauth2.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test_spring_Oauth2.models.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer>{
    Optional<Roles> findByAuthority(String authority);
}
