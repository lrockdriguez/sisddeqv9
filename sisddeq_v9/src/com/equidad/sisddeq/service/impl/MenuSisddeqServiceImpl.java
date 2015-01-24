package com.equidad.sisddeq.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.equidad.sisddeq.DAO.Impl.MenuSisddeqDAOImpl;
import com.equidad.sisddeq.entidades.SisddeqCMenu;
import com.equidad.sisddeq.service.MenuSisddeqService;
import com.equidad.sisddeq.DAO.*;

@Named("menuSisddeqService")
public class MenuSisddeqServiceImpl  implements MenuSisddeqService {
	
	public static MenuSisddeqDAOImpl menuSisddeqDAO = new MenuSisddeqDAOImpl(null);
	
	public void insertarMenu(SisddeqCMenu sisddeqcmenu ){
		menuSisddeqDAO.crear(sisddeqcmenu);
			
	}
	
	public List<SisddeqCMenu> consultaMenu() {
		try {
			List<SisddeqCMenu> listaMenu = new ArrayList<SisddeqCMenu>();	
			listaMenu = ((MenuSisddeqService) menuSisddeqDAO).consultaMenu();	
			return listaMenu;
		} catch (Exception e) {
			System.out.println("ERROR SE::"+e);
		}
		
		return null;
	}

	public static MenuSisddeqDAOImpl getMenuSisddeqDAO() {
		return menuSisddeqDAO;
	}

	public static void setMenuSisddeqDAO(MenuSisddeqDAOImpl menuSisddeqDAO) {
		MenuSisddeqServiceImpl.menuSisddeqDAO = menuSisddeqDAO;
	}
	
	
	
	

}
