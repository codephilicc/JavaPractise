package com.email.writer.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
@Data
@RequestMapping("api/email")
@CrossOrigin(origins = "*")
//@AllArgsConstructor
public class EmailGeneratorController {
	
	@Autowired
	private EmailGeneratorService emailGeneratorService;
	
//	@Autowired
//	public EmailGeneratorController(EmailGeneratorService emailGeneratorService) {
//		super();
//		this.emailGeneratorService = emailGeneratorService;
//	}
//	
//	public EmailGeneratorController() {
//		
//	}
	
	@PostMapping("/generate")
	public ResponseEntity<String> emailGeneratorMethod(@RequestBody EmailRequest emailRequest) {
		String response = emailGeneratorService.generateEmailReply(emailRequest);
		return ResponseEntity.ok(response); 
	}



}
