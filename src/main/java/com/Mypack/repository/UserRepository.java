package com.Mypack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Mypack.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
