package com.myproject.account.repository;


import com.myproject.account.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
	
	User findByUsername(String userName);
}
