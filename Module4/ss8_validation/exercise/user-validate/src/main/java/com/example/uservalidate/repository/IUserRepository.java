package com.example.uservalidate.repository;

import com.example.uservalidate.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Integer> {
}
