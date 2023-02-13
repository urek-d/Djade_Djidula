/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xampy.uniiversitymanagement.dao.impl;

import com.xampy.uniiversitymanagement.dao.AbstractDao;
import com.xampy.uniiversitymanagement.dao.EtudiantDaoInterface;
import com.xampy.uniiversitymanagement.entity.Etudiant;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author XAMPY
 */
@Stateless
public class EtudiantDao extends AbstractDao<Etudiant, Long> implements EtudiantDaoInterface {

	public EtudiantDao() {
		super(Etudiant.class);
	}

	@Override
	public List<String> getNames() {
		String query = "SELECT e.nom FROM " + this.clazz.getName() + " e";
		List<String> names = (List<String>) this.entityManager.createNamedQuery(query);

		return names;
	}

}
