package com.equidad.sisddeq.DAO.Impl;

import javax.inject.Named;
import javax.persistence.EntityManager;

import com.equidad.sisddeq.DAO.OrigenAsistenciaSisddeqDAO;
import com.equidad.sisddeq.common.GenericDAOImpl;
import com.equidad.sisddeq.entidades.SisddeqTOrigenAsistencia;

@Named
public class OrigenAsistenciaSisddeqDAOImpl extends
		GenericDAOImpl<SisddeqTOrigenAsistencia, Integer> implements
		OrigenAsistenciaSisddeqDAO {

	public OrigenAsistenciaSisddeqDAOImpl(EntityManager em) {
		super(SisddeqTOrigenAsistencia.class, em);
		// TODO Auto-generated constructor stub
	}

}
