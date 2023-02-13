/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xampy.uniiversitymanagement.dao.impl;

import com.xampy.uniiversitymanagement.dao.AbstractDao;
import com.xampy.uniiversitymanagement.dao.ProfesseurDaoInterface;
import com.xampy.uniiversitymanagement.entity.Professeur;
import javax.ejb.Stateless;

/**
 *
 * @author XAMPY
 */
@Stateless
public class ProfesseurDao extends AbstractDao<Professeur, Long>
	implements ProfesseurDaoInterface {

	public ProfesseurDao() {
		super(Professeur.class);
	}

}
