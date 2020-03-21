package com.micro.api.students.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.micro.api.model.Student;


@Service
public class StudentService {
	
	@Autowired
	StudentRepository estudianteRepositorio;
	
	@Transactional(readOnly = true)
	public List<Student> findAll(){
		
		return (List<Student>) estudianteRepositorio.findAll();
		
	}
	
	/*
	public Student save(Student cliente) {
		
	}
	
	public void delete(Long id);
	
	public Student findById(Long id);
	
*/
}
