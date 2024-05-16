package com.preetha.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.preetha.restapi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}

