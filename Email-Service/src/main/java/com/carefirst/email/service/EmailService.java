package com.carefirst.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.carefirst.email.repository.EmailRepository;

@Component
public class EmailService {

	@Autowired
	EmailRepository emailRepository;
	
	public String sendEmail() throws Exception {
		return emailRepository.sendMail();
	}
	
	
}
