package com.equidad.sisddeq.DAO.Impl;

import javax.inject.Named;
import javax.persistence.EntityManager;

import com.equidad.sisddeq.DAO.PoblacionSisddeqDAO;
import com.equidad.sisddeq.common.GenericDAOImpl;
import com.equidad.sisddeq.entidades.SisddeqCPoblacion;

@Named
public class PoblacionSisddeqDAOImpl extends
		GenericDAOImpl<SisddeqCPoblacion, Integer> implements
		PoblacionSisddeqDAO {

	public PoblacionSisddeqDAOImpl(EntityManager em) {
		super(SisddeqCPoblacion.class, em);
		// TODO Auto-generated constructor stub
	}

}
