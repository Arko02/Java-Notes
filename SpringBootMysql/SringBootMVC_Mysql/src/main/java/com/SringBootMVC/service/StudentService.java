package com.SringBootMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SringBootMVC.entity.Student;
import com.SringBootMVC.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public void saveData(Student student) {
		this.repository.save(student);
	}

	public List<Student> allData() {
		List<Student> list = this.repository.findAll();
		return list;
	}

	public void deleteById(long id) {
		this.repository.deleteById(id);
	}

	public Student gettheDataById(long id) {
		Student student = this.repository.findById(id).get();
		return student;
	}

}
