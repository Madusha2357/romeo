package com.madusha.spring.romeo.car;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
	
	@Autowired
	private CarService carservice;
	
	@RequestMapping("/cars")
	public List<Car>getAllCars(){
		return carservice.getAllCars();
	}	
	
	@RequestMapping("/cars/{id}")
	public Optional<Car> getCar(@PathVariable String id) {
		return carservice.getCar(id);
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/cars")
	public void addCar(@RequestBody Car car) {
		carservice.addCar(car);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/cars/{id}")
	public void updateCar(@RequestBody Car car, @PathVariable String id) {
		carservice.updateCar(id, car);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/cars/{id}")
	public void deleteCar(@PathVariable String id) {
		carservice.deleteCar(id);
	}
	
}
