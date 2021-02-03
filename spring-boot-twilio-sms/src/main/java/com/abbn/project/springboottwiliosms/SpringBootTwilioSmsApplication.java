package com.abbn.project.springboottwiliosms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@SpringBootApplication
public class SpringBootTwilioSmsApplication implements CommandLineRunner{

	private final static String ACCOUNT_SID = "AC4aaa706550ad356b0da04f6028142f33";
	private final static String AUTH_TOKEN = "848fce7c435e60a828e94de9814cf47c";
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTwilioSmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		
		Message.creator(new PhoneNumber("+918660504272"), new PhoneNumber("+19105373721"), "Hi, Greetings from Ananth").create();
		System.out.println("Hi");
		
	}

}
