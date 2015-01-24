package com.equidad.sisddeq.DAO.Impl;

import javax.inject.Named;
import javax.persistence.EntityManager;

import com.equidad.sisddeq.DAO.OrganizacionSisddeqDAO;
import com.equidad.sisddeq.common.GenericDAOImpl;
import com.equidad.sisddeq.entidades.SisddeqCOrganizacion;

@Named
public class OrganizacionSisddeqDAOImpl extends GenericDAOImpl<SisddeqCOrganizacion, Integer> implements OrganizacionSisddeqDAO {

	public OrganizacionSisddeqDAOImpl(EntityManager em) {
		super(SisddeqCOrganizacion.class,em);
		// TODO Auto-generated constructor stub
	}

	
	
}
