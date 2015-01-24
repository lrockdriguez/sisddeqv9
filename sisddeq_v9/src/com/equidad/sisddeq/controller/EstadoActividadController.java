package com.equidad.sisddeq.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;
import org.primefaces.event.TransferEvent;
import org.primefaces.model.DualListModel;

import com.equidad.sisddeq.DAO.EstadoActividadSisddeqDAO;
import com.equidad.sisddeq.DAO.Impl.EstadoActividadSisddeqDAOImpl;
import com.equidad.sisddeq.entidades.SisddeqCEstadoActividad;
import com.equidad.sisddeq.service.EstadoActividadSisddeqService;
import com.equidad.sisddeq.service.impl.EstadoActividadSisddeqServiceImpl;

@ManagedBean(name = "estadoActividadController")
@ViewScoped
public class EstadoActividadController implements Serializable {

	private static final long serialVersionUID = 1L;

	private EstadoActividadSisddeqService estadoActividadSisddeq = new EstadoActividadSisddeqServiceImpl();

	public List<SisddeqCEstadoActividad> listaActividad = new ArrayList<SisddeqCEstadoActividad>();
	
	// Un objeto singular de nuestra tabla
	
	public SisddeqCEstadoActividad actividad = new SisddeqCEstadoActividad();

	public SisddeqCEstadoActividad sisddeqCEstadoActividad = new SisddeqCEstadoActividad();

	private DualListModel<String> dualListaActividad;

	public String nombre = "";

	public String descripcion = "";
	
	//Variable que va a recibir el id del objeto seleccionado
	public String idActividad = "";

	List<String> actividadSource = new ArrayList<String>();
	List<String> actividadTarget = new ArrayList<String>();

	// Controles de los botones
	public void crearActividad() {
		System.out.println("Entra a crear actividad" + getNombre() + "::"
				+ getDescripcion());
		sisddeqCEstadoActividad.setNombre(getNombre());
		sisddeqCEstadoActividad.setDescripcion(getDescripcion());
		try {
			estadoActividadSisddeq.crearActividad(sisddeqCEstadoActividad);
		} catch (Exception e) {
			System.out.println("Error:::" + e);
		}

	}

	@PostConstruct
	public void init() {
		try {
			limpiarCampos();
			listaActividad = new ArrayList<SisddeqCEstadoActividad>();
			listaActividad = estadoActividadSisddeq
					.consultaEstadoActividad(sisddeqCEstadoActividad);

			for (SisddeqCEstadoActividad activdad : listaActividad) {
				actividadSource.add(activdad.getNombre());
				// actividadTarget.add(String.valueOf(activdad.getIdEstado()));
			}

			dualListaActividad = new DualListModel<String>(actividadSource,
					actividadTarget);

			// listaActividad = estadoActividadSisddeq.consultaActividad();
		} catch (Exception e) {
			System.out.println("ERROR MB::" + e);
		}
	}

	// metodo que limpia los campos de consulta

	private void limpiarCampos() {
		setNombre("");

		setDescripcion("");

	}
	
	//Metodo que se ejecuta cada vez que se selecciona un registro
	
	public void onRowSelect(SelectEvent event) {
		//String.valueOf forza A CONVERTIRSE EN STRING A CUALQUIER VALOR DENTRO DEL PARENTESIS
		SisddeqCEstadoActividad actividadCompleta = new SisddeqCEstadoActividad();
		idActividad = String.valueOf(actividad.getIdEstado());
		actividadCompleta = estadoActividadSisddeq.consultaActividadPorId(actividad.getIdEstado());
		System.out.println("id::"+actividadCompleta.getIdEstado());
		System.out.println("Nombre::"+actividadCompleta.getNombre());
		System.out.println("Descripcion::"+actividadCompleta.getDescripcion());
		nombre = actividadCompleta.getNombre();
        
    }

	public void consultarActividad() {
		try {
			listaActividad = new ArrayList<SisddeqCEstadoActividad>();
			listaActividad = estadoActividadSisddeq.consultaActividad();

		} catch (Exception e) {
			System.out.println("ERROR MB::" + e);
		}

	}

	public void onTransfer(TransferEvent event) {
		System.out.println("muestra valores");
		StringBuilder builder = new StringBuilder();
		for (Object item : event.getItems()) {
			builder.append((String) item);
			System.out.println("valores" + item);
		}
		FacesMessage msg = new FacesMessage();
		msg.setSeverity(FacesMessage.SEVERITY_INFO);
		msg.setSummary("Se agregó la actividad satisfactoriamente");
		msg.setDetail(builder.toString());

		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public List<SisddeqCEstadoActividad> getListaActividad() {
		return listaActividad;
	}

	public void setListaActividad(List<SisddeqCEstadoActividad> listaActividad) {
		this.listaActividad = listaActividad;
	}

	public DualListModel<String> getDualListaActividad() {
		return dualListaActividad;
	}

	public void setDualListaActividad(DualListModel<String> dualListaActividad) {
		this.dualListaActividad = dualListaActividad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public SisddeqCEstadoActividad getActividad() {
		return actividad;
	}

	public void setActividad(SisddeqCEstadoActividad actividad) {
		this.actividad = actividad;
	}

	public String getIdActividad() {
		return idActividad;
	}

	public void setIdActividad(String idActividad) {
		this.idActividad = idActividad;
	}
	
	

}
