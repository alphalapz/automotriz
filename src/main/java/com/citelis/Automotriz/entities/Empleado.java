/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.citelis.Automotriz.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLEADO")
public class Empleado implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	Long id;
	@Column(name="NAME")
	String name;
	@Column(name="MAIL")
        String mail;
        @Column(name="JOB")
        String job;
        @Column(name="FK_AGENCI")
        Long fk_agenci;
        @Column(name="FK_ROL")
        Long fk_rol;
	//GETTERS & SETTERS
	public Long getId() {
		return id;
	}
	public void setId(Long i) {
		this.id = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String s) {
		this.name = s;
	}
        public String getMail() {
		return mail;
	}
	public void setMail(String s) {
		this.mail = s;
	}
        public String getJob() {
		return mail;
	}
	public void setJob(String s) {
		this.mail = s;
	}
        public long getFkAgenci() {
		return fk_agenci;
	}
	public void setFkAgenci(long l) {
		this.fk_agenci = l;
	}
        public long getFkRol() {
		return fk_rol;
	}
	public void setFkRol(long l) {
		this.fk_rol = l;
	}
	
}