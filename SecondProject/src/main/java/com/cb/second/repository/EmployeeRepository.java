package com.cb.second.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cb.second.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> 
{

}
