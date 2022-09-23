package com.cb.office.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cb.office.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>
{
	User findByEmail(String email);
}
