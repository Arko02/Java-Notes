package com.SringBootMVCMysql_API_CRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SringBootMVCMysql_API_CRUD.dto.StudentDto;
import com.SringBootMVCMysql_API_CRUD.entity.Student;
import com.SringBootMVCMysql_API_CRUD.repository.StudentRepository;
import com.SringBootMVCMysql_API_CRUD.utill.EmailService;

@RestController // -> Make this Class As a API Layer of this Project
@RequestMapping("/API/Students") // -> provide The Link to call this Class.

// http://localhost:8080/API/Students -> A P I

public class RestStudentController extends Student {

	@Autowired
	private StudentRepository repository;

	@Autowired
	private EmailService emailService;

	// Save new Student details
	// POST : http://localhost:8080/API/Students
	@PostMapping
	public void saveStudent(@RequestBody Student student) {
		this.repository.save(student);
		this.emailService.sendEmail(student.getEmail(), "Welcome to Our Community 🌟",
				"Hey " + student.getName() + " API SprintBoot App");
	}

	// All Student Details
	// GET : http://localhost:8080/API/Students
	@GetMapping
	public List<Student> getAllStudnets() {

		List<Student> all = this.repository.findAll();
		return all;
	}

	// Update Existing Student details
	// PUT : http://localhost:8080/API/Students?id=value
	@PutMapping
	public void updateStudentDetailsById(@RequestParam("id") long id, @RequestBody StudentDto dto) {

		Student student = this.repository.findById(id).get();

		student.setName(dto.getName());
		student.setEmail(dto.getEmail());
		student.setMobile(dto.getMobile());
		student.setPassword(dto.getPassword());

		this.repository.save(student);
	}

	// Delete the Student By Id
	// DELETE : http://localhost:8080/API/Students/Value
	@DeleteMapping("{id}")
	public Student deleteStudent(@PathVariable long id) { // http://localhost:8080/API/Student/Value
		this.repository.deleteById(id);
		return null;
	}

}
