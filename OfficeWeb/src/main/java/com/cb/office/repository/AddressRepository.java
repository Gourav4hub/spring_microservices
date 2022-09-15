package com.cb.office.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cb.office.entity.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{

}
