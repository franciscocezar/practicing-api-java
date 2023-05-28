package com.projetojava.userdep.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojava.userdep.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
