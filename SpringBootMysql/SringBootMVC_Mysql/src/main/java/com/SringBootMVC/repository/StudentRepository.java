package com.SringBootMVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SringBootMVC.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
