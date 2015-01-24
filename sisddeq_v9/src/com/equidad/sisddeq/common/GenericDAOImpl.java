package com.equidad.sisddeq.common;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;


public class GenericDAOImpl<T, PK> implements GenericDAO<T, PK> {

	//@PersistenceContext(unitName = "sisddeq-persistencia")
	protected EntityManager em = (EntityManager)
	Persistence.createEntityManagerFactory("sisddeq-persistencia").createEntityManager();

	private Class<T> claseEntidad;

	public GenericDAOImpl() {

		System.out.println("============= CLASE :" + this.getClass());

		Type tipo = this.getClass().getGenericSuperclass();
		ParameterizedType tipoGenerics = (ParameterizedType) tipo;

		System.out.println("========== generic super clas:" + tipoGenerics);
		Type[] valoresGenerics = tipoGenerics.getActualTypeArguments();

		this.claseEntidad = (Class<T>) valoresGenerics[0];
		
	}

	public GenericDAOImpl(Class<T> claseEntidad, EntityManager em) {
		// TODO Auto-generated constructor stub
		this.em = em;
		this.claseEntidad = claseEntidad;
	}

	public GenericDAOImpl(EntityManager em) {
		this();
		this.em = em;
	}

	public T crear(T entidad) {
		em.getTransaction().begin();
		em.persist(entidad);
		em.getTransaction().commit();
		return entidad;
	}

	public T buscaPorId(PK id) {
		return em.find(this.claseEntidad, id);
	}

	public void borrar(PK id) {

		em.remove(em.find(this.claseEntidad, id));

	}

	public T actualizar(T entidad) {
		// TODO Auto-generated method stub
		return em.merge(entidad);
	}

}
