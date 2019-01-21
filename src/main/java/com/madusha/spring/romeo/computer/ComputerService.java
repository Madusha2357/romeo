package com.madusha.spring.romeo.computer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComputerService {
	
	@Autowired
	private ComputerRepository computerRepository;

	public Computer addCar(Computer computer) {
		return computerRepository.save(computer);
	}

	public List<Computer> getAllComputers() {
		return computerRepository.findAll();
	}
	
	
}
