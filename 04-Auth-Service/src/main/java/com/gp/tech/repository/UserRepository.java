package com.gp.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gp.tech.entity.User;

@Repository
public interface UserRepository  extends JpaRepository<User,Integer>{

}
