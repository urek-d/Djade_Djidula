/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.xampy.uniiversitymanagement.service;

import com.xampy.uniiversitymanagement.entity.Etudiant;
import javax.ejb.Local;

/**
 *
 * @author XAMPY
 */
@Local
public interface UserServiceInterface {
	
	public Etudiant saveEtudiant(Etudiant e);

}
