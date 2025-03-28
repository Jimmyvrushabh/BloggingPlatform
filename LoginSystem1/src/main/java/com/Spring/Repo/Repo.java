package com.Spring.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.Spring.Model.User;

@Repository
@EnableJpaRepositories
public interface Repo  extends JpaRepository<User, Long>{
	 User findByUsername(String username);
	 User findByEmail(String email);
	 
	 boolean existsByUsername(String username);
	 boolean existsByEmail(String email);


}
