package com.equidad.sisddeq.DAO.Impl;

import javax.inject.Named;
import javax.persistence.EntityManager;

import com.equidad.sisddeq.DAO.ProyectosSisddeqDAO;
import com.equidad.sisddeq.common.GenericDAOImpl;
import com.equidad.sisddeq.entidades.SisddeqCProyecto;

@Named
public class ProyectoSisddeqDAOImpl extends
		GenericDAOImpl<SisddeqCProyecto, Integer> implements
		ProyectosSisddeqDAO {

	public ProyectoSisddeqDAOImpl(EntityManager em) {
		super(SisddeqCProyecto.class, em);
		// TODO Auto-generated constructor stub
	}

}
