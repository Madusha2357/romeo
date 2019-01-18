package com.madusha.spring.romeo.car;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	
	@Id
	private String id;
	private String name;
	private String color;
	private String type;
	private String size;
	
	public Car() {
		
	}
	
	public Car(String id, String name, String color, String type, String size) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.type = type;
		this.size = size;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}

}
