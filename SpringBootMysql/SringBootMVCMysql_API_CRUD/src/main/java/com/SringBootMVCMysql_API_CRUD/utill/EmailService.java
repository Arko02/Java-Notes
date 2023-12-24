package com.SringBootMVCMysql_API_CRUD.utill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;

	public void sendEmail(String to, String subject, String text) {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(to);
		mailMessage.setSubject(subject);
		mailMessage.setText(text);

		this.javaMailSender.send(mailMessage);
	}

}
