/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xampy.uniiversitymanagement.dao.impl;

import com.xampy.uniiversitymanagement.dao.AbstractDao;
import com.xampy.uniiversitymanagement.dao.CoursDaoInterface;
import com.xampy.uniiversitymanagement.entity.Cours;
import javax.ejb.Stateless;

/**
 *
 * @author XAMPY
 */
@Stateless
public class CoursDao extends AbstractDao<Cours, Long> implements CoursDaoInterface {

	public CoursDao() {
		super(Cours.class);
	}

}
