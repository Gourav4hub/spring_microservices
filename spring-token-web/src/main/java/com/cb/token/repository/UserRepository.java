package com.cb.token.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cb.token.entity.Role;
import com.cb.token.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, String> {

	Optional<User> findByUsername(String name);

}
