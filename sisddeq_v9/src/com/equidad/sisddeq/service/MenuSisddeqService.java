package com.equidad.sisddeq.service;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.equidad.sisddeq.entidades.SisddeqCMenu;



public interface MenuSisddeqService {
	
public void insertarMenu(SisddeqCMenu sisddeqcmenu );
	
	public List<SisddeqCMenu> consultaMenu();

}
