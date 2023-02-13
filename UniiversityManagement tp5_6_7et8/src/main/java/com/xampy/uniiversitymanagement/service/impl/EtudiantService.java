/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.xampy.uniiversitymanagement.service.impl;

import com.xampy.uniiversitymanagement.dao.EtudiantDaoInterface;
import com.xampy.uniiversitymanagement.entity.Etudiant;
import com.xampy.uniiversitymanagement.service.EtudiantServiceInterface;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author XAMPY
 */
@Stateless
public class EtudiantService implements EtudiantServiceInterface {
	
	@EJB
	private EtudiantDaoInterface etudiantDao;
	
	@Override
	public Etudiant create(Etudiant entity) {
		this.etudiantDao.create(entity);
		return entity;
	}

	@Override
	public List<Etudiant> getAll() {
		List<Etudiant> etudiants = this.etudiantDao.findAll();
		
		return etudiants;
	}

	@Override
	public Etudiant getById(Long id) {
		return null;
	}

	@Override
	public void delete(Long l) {
		
	}

	@Override
	public Etudiant update(Etudiant e) {
		return null;
	}

}
