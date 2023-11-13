package com.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.entity.Address;

@Repository("address")
public interface AddressRepository extends JpaRepository<Address , Long>{
	
}
