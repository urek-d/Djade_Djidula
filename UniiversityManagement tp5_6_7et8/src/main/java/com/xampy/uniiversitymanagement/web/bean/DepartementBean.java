/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.xampy.uniiversitymanagement.web.bean;

import com.xampy.uniiversitymanagement.entity.Departement;
import com.xampy.uniiversitymanagement.service.DepartementServiceInterface;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author XAMPY
 */
@Named(value = "departementBean") 
@RequestScoped
public class DepartementBean implements Serializable {
	
	@EJB
	private DepartementServiceInterface departementService;
	
	private Departement departement;
	private long departementId = -1;

	public DepartementBean() {
		this.departement = new Departement();
	}
	
	@PostConstruct
	public void init(){
		HttpServletRequest request =  (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		System.out.println("Departement Id " + request.getParameter("departementId"));
		
		if (request.getParameter("departementId") != null){
			this.departementId = Long.parseLong(request.getParameter("departementId"));
			this.departement = this.departementService.getById(this.departementId);
		}
	}
	
	
	
	
	public void create(){
		if (this.departementId == -1){
			this.departementService.create(departement);
		}else {
			this.departementService.update(departement);
		}
	}
	
	public String delete(Long id){
		System.out.println("Supress " + id);
		this.departementService.delete(id);
		return "";
	}
	
	public List<Departement> getDepartementsList(){
		return this.departementService.getAll();
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	
	
	
}
