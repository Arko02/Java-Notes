package com.SringBootMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SringBootMVC.entity.Student;
import com.SringBootMVC.service.StudentService;
import com.SringBootMVC.utill.EmailService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;

	@Autowired
	private EmailService emailService;

	@RequestMapping("/MenuPage") // http://localhost:8080/MenuPage
	public String MainPage() {
		return "MenuPage";
	}

	@RequestMapping("/Registration-Page")
	public String registrationPage(@ModelAttribute Student student, Model model) {
		return "RegistrationPage";
	}

	@RequestMapping("/SaveReg")
	public String saveStudent(@ModelAttribute Student student, Model model) {
		this.service.saveData(student);

		this.emailService.sendEmail(student.getEmail(), "Welcome to Our Community 🌟", "Dear " + student.getName()
				+ ",\n\n"
				+ "Thank you for registering with us! 🎉 We are excited to have you as part of our community.\n\n"
				+ "Feel free to explore our platform and connect with other members. If you have any questions or need assistance, "
				+ "don't hesitate to reach out to us.\n\n" + "Best regards,\nYour Organization");

		model.addAttribute("Student", student);
		return "RegistrationPage";
	}

	@RequestMapping("/AllDetils-Page")
	public String fetchAllStudent(ModelMap map) {
		List<Student> allStudent = this.service.allData();
		map.addAttribute("Students", allStudent);
		return "AllStudent";
	}

	@RequestMapping("/Delete")
	public String deleteStudent(@RequestParam("id") long id, ModelMap map) {
		this.service.deleteById(id);
		List<Student> allStudent = this.service.allData();
		map.addAttribute("Students", allStudent);
		return "AllStudent";
	}

	@RequestMapping("/GetTheDetail")
	public String getStudentDetailById(@RequestParam("id") long id, ModelMap map) {
		Student getTheDataById = this.service.gettheDataById(id);
		map.addAttribute("Student", getTheDataById);
		return "UpdatePage";
	}

	@RequestMapping("/UpdateDetails")
	public String updateStudentData(@ModelAttribute Student student, Model model) {
		this.service.saveData(student);
		List<Student> allStudent = this.service.allData();
		model.addAttribute("Students", allStudent);
		return "AllStudent";
	}
}
