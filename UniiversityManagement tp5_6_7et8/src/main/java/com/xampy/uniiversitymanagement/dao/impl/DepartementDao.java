/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xampy.uniiversitymanagement.dao.impl;

import com.xampy.uniiversitymanagement.dao.AbstractDao;
import com.xampy.uniiversitymanagement.dao.DepartementDaoInterface;
import com.xampy.uniiversitymanagement.entity.Departement;
import javax.ejb.Stateless;

/**
 *
 * @author XAMPY
 */
@Stateless
public class DepartementDao extends AbstractDao<Departement, Long> implements DepartementDaoInterface {

	public DepartementDao() {
		super(Departement.class);
	}

}
