package com.equidad.sisddeq.service;

import java.util.List;

import com.equidad.sisddeq.entidades.SisddeqCEstadoActividad;

public interface EstadoActividadSisddeqService {
	
	public List<SisddeqCEstadoActividad>consultaEstadoActividad(SisddeqCEstadoActividad sisddeqcesatdoactividad);
	
	public List<SisddeqCEstadoActividad> consultaActividad();
	
	public void crearActividad(SisddeqCEstadoActividad sisddeqCEstadoActividad);
	
	//este metodo consulta una actividad por id y nos devolvera un objeto cargado con un objeto de tipo 
	// siseddeqCEstadoActividad
	
	public SisddeqCEstadoActividad consultaActividadPorId(int idActividad);

}
