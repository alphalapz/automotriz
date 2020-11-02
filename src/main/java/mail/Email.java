package mail;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class Email
{
	private MailSender mailSender;

	public void setMailSender(MailSender mailSender)
	{
		this.mailSender = mailSender;
	}

	public void sendEmail(String from, String to, String subject, String message)
	{
                //Cambiar los parametros que recibe
                //Ciclar las listas
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

		simpleMailMessage.setFrom(from);
		simpleMailMessage.setTo(to);
                simpleMailMessage.setCc("");
                simpleMailMessage.setBcc("");
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(message);
		mailSender.send(simpleMailMessage);
	}
}
