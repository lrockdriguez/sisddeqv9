package com.equidad.sisddeq.DAO.Impl;

import javax.inject.Named;
import javax.persistence.EntityManager;

import com.equidad.sisddeq.DAO.SectorSisddeqDAO;
import com.equidad.sisddeq.common.GenericDAOImpl;
import com.equidad.sisddeq.entidades.SisddeqCSector;

@Named
public class SectorSisddeqDAOImpl extends
		GenericDAOImpl<SisddeqCSector, Integer> implements SectorSisddeqDAO {

	public SectorSisddeqDAOImpl(EntityManager em) {
		super(SisddeqCSector.class, em);
		// TODO Auto-generated constructor stub
	}

}
