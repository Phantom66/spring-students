package com.micro.api.students.service;

import org.springframework.data.repository.CrudRepository;

import com.micro.api.model.Student;


public interface StudentRepository extends CrudRepository<Student, Long>  {

}
