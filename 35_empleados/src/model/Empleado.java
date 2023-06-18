package model;

import java.time.LocalDate;

public class Empleado {
	private String nombre;
	private String dni;
	private LocalDate fechaIngreso;
	private LocalDate fechaNacimiento;
	public Empleado(String nombre, String dni, LocalDate fechaIngreso, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.fechaIngreso = fechaIngreso;
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	

}
