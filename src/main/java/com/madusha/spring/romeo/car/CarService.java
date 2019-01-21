package com.madusha.spring.romeo.car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
	
	@Autowired
	private CarRepository carrepository;
	
	private List<Car> cars = new ArrayList<>(Arrays.asList(
			
			new Car("A", "Benz", "ash", "mercidiz", "caravan"),
			new Car("B", "Toyota", "black", "hibrid", "normal"),
			new Car("C", "Suzuki", "red", "alto", "mini"),
			new Car("D", "Micro", "white", "nano", "nano"),
			new Car("E", "Nissan", "blue", "normal", "normal")
			));
	
	public List<Car> getAllCars(){
		List<Car> cars = new ArrayList<>();
		carrepository.findAll()
		.forEach(cars::add);
		return cars;
	}
	
	public Optional<Car> getCar(String id) {
		return carrepository.findById(id);
		
	}
	

	public void addCar(Car car) {
		carrepository.save(car);
		
	}

	public void updateCar(String id, Car car) {
		for(int i = 0; i < cars.size(); i++) {
			Car t = cars.get(i);
			if(t.getId().equals(id)) {
				cars.set(i, car);
				return;
			}
		}
		
	}

	public void deleteCar(String id) {
		cars.removeIf(t -> t.getId().equals(id));
	}


}
