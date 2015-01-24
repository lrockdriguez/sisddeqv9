package com.equidad.sisddeq.DAO.Impl;

import javax.inject.Named;
import javax.persistence.EntityManager;

import com.equidad.sisddeq.DAO.MenuSisddeqDAO;
import com.equidad.sisddeq.common.GenericDAOImpl;
import com.equidad.sisddeq.entidades.SisddeqCMenu;

@Named
public class MenuSisddeqDAOImpl extends GenericDAOImpl<SisddeqCMenu, Integer> implements MenuSisddeqDAO{

	public MenuSisddeqDAOImpl(EntityManager em) {
		super(SisddeqCMenu.class,em);
		// TODO Auto-generated constructor stub
	}
	
	

}
