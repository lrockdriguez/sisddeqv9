package com.equidad.sisddeq.DAO.Impl;

import javax.inject.Named;
import javax.persistence.EntityManager;

import com.equidad.sisddeq.DAO.TemaSisddeqDAO;
import com.equidad.sisddeq.common.GenericDAOImpl;
import com.equidad.sisddeq.entidades.SisddeqCTema;

@Named
public class TemaSisddeqDAOImpl extends GenericDAOImpl<SisddeqCTema, Integer>
		implements TemaSisddeqDAO {

	public TemaSisddeqDAOImpl(EntityManager em) {
		super(SisddeqCTema.class, em);
		// TODO Auto-generated constructor stub
	}

}
