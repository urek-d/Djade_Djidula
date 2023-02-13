/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xampy.uniiversitymanagement.dao.impl;

import com.xampy.uniiversitymanagement.dao.AbstractDao;
import com.xampy.uniiversitymanagement.dao.InterventionDaoInterface;
import com.xampy.uniiversitymanagement.entity.Intervention;
import javax.ejb.Stateless;

/**
 *
 * @author XAMPY
 */
@Stateless
public class InterventionDao extends AbstractDao<Intervention, Long>
	implements InterventionDaoInterface {

	public InterventionDao() {
		super(Intervention.class);
	}

}
