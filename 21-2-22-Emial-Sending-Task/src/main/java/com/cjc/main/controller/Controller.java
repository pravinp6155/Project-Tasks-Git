package com.cjc.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.Service.HomeService;
import com.cjc.main.model.EmailSender;


@RestController
public class Controller {
	@Autowired
   HomeService ess;

	@Value("${spring.mail.username}")
	private String fromEmail;
	
	@PostMapping(value = "/sendemail")// http://localhost:2233/sendemail
	public String EmailSend(@RequestBody EmailSender eml) {
		eml.setFromEmail(fromEmail);
		try {
			ess.sendEmail(eml);
			return "Emailsend";
		}
		catch (Exception e) {
			e.printStackTrace();
			return "Email can not sent";
		}
	}
	
	  @PostMapping(value = "/sendemailwithattch") 
	  public String sendEmailAttachement(@RequestBody EmailSender eml)
	  {
	  eml.setFromEmail(fromEmail); 
	  
	  return ess.sendEmailAttachement(eml); 
	  }
	
}
