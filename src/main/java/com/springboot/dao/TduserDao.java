package com.springboot.dao;

import com.springboot.model.TdUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TduserDao extends JpaRepository<TdUserEntity,String>{
}
