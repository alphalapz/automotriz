package com.citelis.Automotriz.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mail.Email;

public class App
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Email email = (Email) context.getBean("email");

		String senderEmailId = "hola@alfasystem.com.mx";
		String receiverEmailId = "hola@alfasystem.com.mx";
		String subject = "Test";
		String message = "Saludos!";

		email.sendEmail(senderEmailId, receiverEmailId, subject, message);

		System.out.println("Email sent successfully");

	}
}
