package com.example.jeedemo.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.jeedemo.domain.Foka;


/* 
 * This is a Stateless EJB Bean
 * All its methods are transactional
 */
@Stateless
public class FokaManager{

	@PersistenceContext
	EntityManager em;
	
	public void addFoka(Foka foka) {
		em.persist(foka);
	}
}
