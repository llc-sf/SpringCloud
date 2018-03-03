package com.jadyer.demo.jpa;

import com.jadyer.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface UserJpa extends JpaRepository<User,Long> ,JpaSpecificationExecutor<User>,Serializable{
}
