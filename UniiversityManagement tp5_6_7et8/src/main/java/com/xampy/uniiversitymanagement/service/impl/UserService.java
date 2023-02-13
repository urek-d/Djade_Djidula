/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.xampy.uniiversitymanagement.service.impl;

import com.xampy.uniiversitymanagement.dao.EtudiantDaoInterface;
import com.xampy.uniiversitymanagement.dao.ProfesseurDaoInterface;
import com.xampy.uniiversitymanagement.entity.Etudiant;
import com.xampy.uniiversitymanagement.service.UserServiceInterface;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

/**
 *
 * @author XAMPY
 */
@Stateful
public class UserService implements UserServiceInterface{
	
	@EJB
	private ProfesseurDaoInterface professeurDao;
	
	@EJB
	private  EtudiantDaoInterface etudiantDao;
	
	@Override
	public Etudiant saveEtudiant(Etudiant e) {
		
		return e;
	}

}
