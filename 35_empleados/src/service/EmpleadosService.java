package service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;

import model.Empleado;

public class EmpleadosService {
	
	ArrayList<Empleado> empleado = new ArrayList<>();
	
	//devuelve el empleado con más antigüedad
	
	public Empleado antiguo() {
//		LocalDate hoy = LocalDate.now();
//		LocalDate fnacimiento = LocalDate.of(1985, 04, 26);
//		Empleado empleadoAntiguo = new Empleado("", "", hoy, fnacimiento);
//		for(Empleado e:empleado) {
//			if(e.getFechaIngreso().isBefore(empleadoAntiguo.getFechaIngreso())) {
//				empleadoAntiguo=e;
//				
//			}
//			
//			
//		} return empleadoAntiguo;
		Empleado aux = empleado.get(0);
		//recorremos empleados para encontrar el de fecha de ingreso más antiguo
		for(Empleado emp:empleado) {
			if (emp.getFechaIngreso().isBefore(aux.getFechaIngreso())) {
				aux=emp;
			}
		} return aux;
		
	}
	
	//a partir del nombre de un empleado devuelve el número de meses que lleva en la empresa
	
//	public int mesesAntiguedad (Empleado nombre) {
//		Empleado aux = new Empleado(null, null, null, null);
//		int meses = aux.getFechaIngreso().lengthOfMonth();
//		return meses;		
	public long mesesAntiguedad (String nombre) {
		long meses;
		Empleado emp =null;
		for (Empleado e : empleado) {
			if (e.getNombre().equals(nombre)) {
				emp=e;
				break; //salimos, no necesitamos seguir comprobando
			}
		} if (emp!=null) { //lo ha encontrado
			meses = Period.between(emp.getFechaIngreso(), LocalDate.now()).toTotalMonths();
		} else {
			meses = 0;
		} return meses;
	}
	//devuelve el empleado que comenzó a trabajar en la empresa con menos edad
	public Empleado joven() {
//		LocalDate hoy = LocalDate.now();
//		LocalDate fnacimiento = LocalDate.of(1985, 04, 26);
//		Empleado empleadoJoven = new Empleado("", "", hoy, fnacimiento);
//		for(Empleado e:empleado) {
//			if(e.getFechaNacimiento().isAfter(empleadoJoven.getFechaNacimiento())) {
//				empleadoJoven=e;
//				
//			}
//			
//			
//		} return empleadoJoven;
		Empleado emp = empleado.get(0);
		for (Empleado e : empleado) {
			if (Period.between(e.getFechaNacimiento(), e.getFechaIngreso()).toTotalMonths() <
					Period.between(emp.getFechaNacimiento(), emp.getFechaIngreso()).toTotalMonths()) {
				emp=e;
			}
				
		} return emp;
	}
	
	//lista de empleados que lleven en la empresa un mínimo de meses recibido como parámetro
	public ArrayList<Empleado> empleadosMinimoTiempo (int meses) {
		ArrayList<Empleado> encontrados = new ArrayList<>();
		for (Empleado e : empleado) {
			// comprobamos los meses que lleva trabajando cada empleado a través del método anterior
			// si es mayor que el número de meses de parámetro lo añadimos a la lista.
			if (mesesAntiguedad(e.getNombre())>meses) {
				encontrados.add(e);
			}
			
		} return encontrados;
	}

}
