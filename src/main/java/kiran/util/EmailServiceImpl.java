package kiran.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {
	
	@Autowired
	private JavaMailSender javaMailSender;

	@Override
	public void sendMail(String to, String sub, String body) {
      try {
    	  SimpleMailMessage mailMessage= new SimpleMailMessage();
    	  mailMessage.setTo(to);
    	  mailMessage.setSubject(sub);
    	  mailMessage.setText(body);
    	  
    	  javaMailSender.send(mailMessage);
    	  
		
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	}

}
