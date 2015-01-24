package com.equidad.sisddeq.DAO.Impl;

import javax.inject.Named;
import javax.persistence.EntityManager;

import com.equidad.sisddeq.DAO.PropositoSisddeqDAO;
import com.equidad.sisddeq.common.GenericDAOImpl;
import com.equidad.sisddeq.entidades.SisddeqCProposito;

@Named
public class PropositoSisddeqDAOImpl extends
		GenericDAOImpl<SisddeqCProposito, Integer> implements
		PropositoSisddeqDAO {

	public PropositoSisddeqDAOImpl(EntityManager em) {
		super(SisddeqCProposito.class, em);
	}

}
