package com.esprit.examen.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level =AccessLevel.PRIVATE)
public class Client implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idClient")
	 Long idclient; // Clé primaire
	  String nom;
	  String prenom;
	  String email;
	  String password;
	
	
	@Temporal(TemporalType.DATE) //.DATE ou .TIMESTAMP  
	 Date date_naissance;
	@Enumerated(EnumType.STRING) // .ordinal sauvegarde different 
	 Profession profession;
	@Enumerated(EnumType.STRING)
	 CategorieClient categorie_client;
	

	public Client(Long idclient, String nom, String prenom, String email, String password) {
		
		this.idclient = idclient;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		
	}
	
}
