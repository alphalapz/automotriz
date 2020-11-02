/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citelis.Automotriz.servicelmpl;

import com.citelis.Automotriz.entities.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.MailSender;
import org.springframework.stereotype.Service;

@Service
public class EnvioMailImp {

    @Autowired
    private MailSender mailSender;
    
    public void setMailSender(MailSender mailSender){
        this.mailSender = mailSender;
    }
    public void sendEmail(List<Cliente> listClients, String subject, String content) {

        for (Cliente c : listClients) {
            SimpleMailMessage email = new SimpleMailMessage();
            email.setTo(c.getMail());
            email.setSubject(subject);
            email.setText(content);

            mailSender.send(email);
        }
    }
}
