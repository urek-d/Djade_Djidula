/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.xampy.uniiversitymanagement.service.impl;

import com.xampy.uniiversitymanagement.dao.DepartementDaoInterface;
import com.xampy.uniiversitymanagement.entity.Departement;
import com.xampy.uniiversitymanagement.service.DepartementServiceInterface;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author XAMPY
 */
@Stateless
public class DepartementService  implements DepartementServiceInterface {
	
	@EJB
	private DepartementDaoInterface departementDao;
	
	@Override
	public Departement create(Departement departement) {
		this.departementDao.create(departement);
		return departement;
	}

	@Override
	public List<Departement> getAll() {
		List<Departement> departements = this.departementDao.findAll();		
		return departements;
	}

	@Override
	public Departement getById(Long id) {
		return this.departementDao.find(id);
	}

	@Override
	public void delete(Long id) {
		Departement e = this.departementDao.find(id);
		System.out.println("Departement à supprimer " + e.getNom());
		this.departementDao.delete(e);
	}

	@Override
	public Departement update(Departement e) {
		this.departementDao.update(e);
		return e;
	}

}
