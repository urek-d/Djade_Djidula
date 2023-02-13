/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xampy.uniiversitymanagement.web.bean;


import com.xampy.uniiversitymanagement.entity.Departement;
import com.xampy.uniiversitymanagement.entity.Etudiant;
import com.xampy.uniiversitymanagement.service.DepartementServiceInterface;
import com.xampy.uniiversitymanagement.service.EtudiantServiceInterface;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

/**
 *
 * @author XAMPY
 */
@Named(value = "etudiantBean")
@RequestScoped
public class EtudiantBean implements Serializable{
	
	private Etudiant etudiant;
	private String selectedDepartementId;
	
	@EJB
	private EtudiantServiceInterface etudiantService;
	
	@EJB
	private DepartementServiceInterface departementService;
	
	private List<Etudiant> etudiants;
		
	public EtudiantBean() {
		this.etudiant = new Etudiant();
	}
	
	/**
	 * To redirect just put returnthe string form of the 
	 * @return 
	 */
	public String creer(){
		System.err.println("Created New Student " + this.etudiant.getNom());
		System.out.println("Departeme t Id  -> " +  this.selectedDepartementId);
		Departement departement = this.departementService.getById(Long.parseLong(this.selectedDepartementId));
		System.out.println("Departeme t Id  -> " +  departement.getNom());
		
		//System.out.println("Departement " + this.etudiant.getDepartement().getNom());
		this.etudiant.setDepartement(departement);
		this.etudiantService.create(this.etudiant);
		return "";
	}
	
	public ArrayList<SelectItem> getDepartementsSelectOptions(){
		ArrayList<SelectItem> options = new ArrayList<>();
		options.add(new SelectItem(null, "Choisissez..."));
		List<Departement> departements = this.departementService.getAll();
		for (Departement d: departements){
			options.add(new SelectItem(d.getId().toString(), d.getNom()));
		}
		return options;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public List<Etudiant> getEtudiantsList() {
		etudiants = this.etudiantService.getAll();
		return etudiants;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public String getSelectedDepartementId() {
		return selectedDepartementId;
	}

	public void setSelectedDepartementId(String selectedDepartementId) {
		this.selectedDepartementId = selectedDepartementId;
	}

}