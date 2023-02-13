/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xampy.uniiversitymanagement.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author DREE
 */
@Entity
public class Intervention {

	@EmbeddedId
	private InterventionPK id;

	public Intervention() {
		this.id = new InterventionPK();
	}

	public Intervention(Cours cours, Departement departement, Professeur professeur) {
		this.id = new InterventionPK();

		this.id.setCoursId(cours.getId());
		this.id.setDepartementId(departement.getId());
		this.id.setProfesseurId(professeur.getId());

	}

	public InterventionPK getId() {
		return id;
	}
}
