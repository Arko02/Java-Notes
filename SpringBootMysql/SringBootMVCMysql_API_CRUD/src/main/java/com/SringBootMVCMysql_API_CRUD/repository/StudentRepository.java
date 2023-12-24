package com.SringBootMVCMysql_API_CRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SringBootMVCMysql_API_CRUD.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
