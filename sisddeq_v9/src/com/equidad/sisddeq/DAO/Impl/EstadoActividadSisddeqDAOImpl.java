package com.equidad.sisddeq.DAO.Impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.equidad.sisddeq.DAO.EstadoActividadSisddeqDAO;
import com.equidad.sisddeq.common.GenericDAOImpl;
import com.equidad.sisddeq.entidades.SisddeqCEstadoActividad;
import com.equidad.sisddeq.entidades.SisddeqCRol;

@Named
public class EstadoActividadSisddeqDAOImpl extends
		GenericDAOImpl<SisddeqCEstadoActividad, Integer> implements
		EstadoActividadSisddeqDAO {

	//En las demás clases dao comentar este metodo.
//	public EstadoActividadSisddeqDAOImpl(EntityManager em) {
//		super(SisddeqCEstadoActividad.class, em);
//		// TODO Auto-generated constructor stub
//	}

	public List<SisddeqCEstadoActividad> consultaActividades() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SisddeqCEstadoActividad> consultaEstadoActividad(
			SisddeqCEstadoActividad sisddeqcesatdoactividad) {
		List<SisddeqCEstadoActividad> listaActividad = new ArrayList<SisddeqCEstadoActividad>();
		TypedQuery<SisddeqCEstadoActividad> query = em.createQuery(
				"SELECT s FROM SisddeqCEstadoActividad s",
				SisddeqCEstadoActividad.class);

		try {
			listaActividad = query.getResultList();
		} catch (Exception e) {
			System.out.println("Error al hacer la consulta::" + e);
			listaActividad = null;
		}

		return 	listaActividad;

	}

}
