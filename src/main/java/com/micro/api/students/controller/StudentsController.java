package com.micro.api.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.api.model.Student;
import com.micro.api.students.service.StudentService;


@RestController
@RequestMapping(value = "/estudiante")
public class StudentsController {
	

	@Autowired
	private StudentService servicio;
	
	@GetMapping("/mostrar")
	public List<Student>getEstudiantes(){
		
		return servicio.findAll();
		
	}

}
