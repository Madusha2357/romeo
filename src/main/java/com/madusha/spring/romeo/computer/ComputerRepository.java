package com.madusha.spring.romeo.computer;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ComputerRepository extends CrudRepository<Computer, Long>{
	
	List<Computer> findAll();

}
