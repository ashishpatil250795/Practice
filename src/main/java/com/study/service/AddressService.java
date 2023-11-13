package com.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.study.entity.Address;
import com.study.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.NESTED)
	public void saveStudentAddress() {
		Address address = new Address();
		address.setCity("Kolhapur");
		address.setState("Maharashtra");
		address.setPin(416109);
		address.setId(1L);
		addressRepository.save(address);
		throw new RuntimeException("Nested PRopagation failed");
	}
	
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.MANDATORY)
	public void mandatoryPropagation() {
		Address address = new Address();
		address.setCity("Latur");
		address.setState("Maharashtra");
		address.setPin(416109);
		address.setId(9L);
		addressRepository.save(address);
//		throw new RuntimeException("Nested PRopagation failed");
	}
	
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.NEVER)
	public void neverPropagation() {
		Address address = new Address();
		address.setCity("Latur");
		address.setState("Maharashtra");
		address.setPin(416109);
		address.setId(10L);
		addressRepository.save(address);
	}
	
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.NOT_SUPPORTED)
	public void notSupportedPropagation() {
		Address address = new Address();
		address.setCity("Pandharpur");
		address.setState("Maharashtra");
		address.setPin(416109);
		address.setId(11L);
		addressRepository.save(address);
		throw new RuntimeException("NOT_SUPPORTED PRopagation failed");
	}
	
	public void nonPropagation() {
		Address address = new Address();
		address.setCity("Kanpur");
		address.setState("Maharashtra");
		address.setPin(416109);
		address.setId(14L);
		addressRepository.save(address);
		throw new RuntimeException("non PRopagation failed");
	}
}

