package com.madusha.spring.romeo.computer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputerController {
	
	@Autowired
	private ComputerService computerService;
	
	@RequestMapping(value = "/computer", method = RequestMethod.POST)
	public Computer addCar(@RequestBody Computer computer) {
		return computerService.addCar(computer);
	}
	
	@RequestMapping(value = "/computer", method = RequestMethod.GET)
	public List<Computer> getAllComputers() {
		return computerService.getAllComputers();
	}

	
	


}
