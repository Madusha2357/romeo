package com.madusha.spring.romeo.student;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StuentRepository extends CrudRepository<Student, Long>{
	
	List<Student> findAll();

}
