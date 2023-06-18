package com.sepe.gestionCursos.model;

import java.time.LocalDate;
import java.util.Date;

public class Curso {
	//Características:
	Integer codigoCurso;
	String nombre;
	int precio;
	LocalDate fechaInicio;
	LocalDate fechaFinalizacion;
	
	//Constructor:
	
	public Curso(Integer codigoCurso, String nombre, int precio, LocalDate fechaInicio, LocalDate fechaFinalizacion) {
		super();
		this.codigoCurso = codigoCurso;
		this.nombre = nombre;
		this.precio = precio;
		this.fechaInicio = fechaInicio;
		this.fechaFinalizacion = fechaFinalizacion;
	}
	
	//getter y setter:
	public Integer getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(Integer codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaFinalizacion() {
		return fechaFinalizacion;
	}
	public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}

}
