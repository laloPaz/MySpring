package com.myproject.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.myproject.account.model.User;

public interface RoleRepository extends JpaRepository<User,Long>{
	
	
}
