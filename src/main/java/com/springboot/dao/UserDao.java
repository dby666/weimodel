package com.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.model.Demo_user;

@Repository
public interface UserDao extends JpaRepository<Demo_user,Long> {
}
