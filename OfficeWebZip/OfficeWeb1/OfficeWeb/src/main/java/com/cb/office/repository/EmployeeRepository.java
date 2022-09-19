package com.cb.office.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cb.office.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> 
{

}
