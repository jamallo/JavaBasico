package com.sepe.gestionCursos.services;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;

import com.sepe.gestionCursos.model.Curso;

import Utilities.Utilidades;

public class CursosService {
	
	private final String DIR = "D:\\Users\\temporal\\cursos.txt";
	
	public Curso buscarCurso (Integer codigoCurso) {
		Curso res = null;
		try (FileReader fr = new FileReader(DIR); BufferedReader bf = new BufferedReader(fr);) {
			String dato = bf.readLine(); // lee una linea del fichero
			while (dato != null) {
				String partes [] = dato.split(";");
				if (Integer.parseInt(partes[0]) == codigoCurso) {
					String formato = "dd/MM/yyyy";
					DateTimeFormatter sdf = DateTimeFormatter.ofPattern(formato);
					res = new Curso(Integer.parseInt(partes[0]), partes[1], Integer.parseInt(partes[2]), LocalDate.parse(partes[3], sdf), LocalDate.parse(partes[4], sdf));
					break;
				}
				dato = bf.readLine();

			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return res;
	}

	public boolean guardarCurso (Integer codigoCurso, String nombre, int precio, LocalDate fechaInicio, LocalDate fechaFinalizacion) {
		
		if (buscarCurso (codigoCurso) == null) {
			boolean save = false;
			try (FileOutputStream fos = new FileOutputStream(DIR, true); PrintStream out = new PrintStream(fos);) {
				// creamos FileOutputStream que nos permita añadir el contacto
				out.println(codigoCurso + "," + nombre + "," + precio + "," + Utilidades.convertirFechaATexto(fechaInicio) + "," + Utilidades.convertirFechaATexto(fechaFinalizacion));
				save=true;
			} catch (IOException ex) {
				ex.printStackTrace();
			} return save;
		} else {
			return false;
		}
			
	}
	
	public Curso precioMaximo() {
		HashSet<Curso> curso= new HashSet<>();
		Curso auxmaximo = new Curso (0, "", 0, LocalDate.of(0111, 01, 01), LocalDate.of(0111, 01, 01));
		try (FileReader fr = new FileReader(DIR); BufferedReader bf = new BufferedReader(fr);) {
			String dato = bf.readLine(); // lee una linea del fichero
			while (dato != null) {
				String partes [] = dato.split(",");
				//comprobamos si el primer elemento del array
				//coincide con el número recibido
				if (Integer.parseInt(partes[2]) > auxmaximo.getPrecio()) {
					//creamos el objeto Contacto a partir del array con las partes del mismo
					auxmaximo = new Curso(Integer.parseInt(partes[0]), partes[1], Integer.parseInt(partes[2]), Utilidades.convertirTextoAFecha(partes[3]), Utilidades.convertirTextoAFecha(partes[4]));
				}
				dato = bf.readLine();

			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} return auxmaximo;
		
		
	}
	
	public Curso duracionMaximo () {
		HashSet<Curso> curso= new HashSet<>();
		Curso duracionMax = new Curso (0, "", 0, LocalDate.of(0111, 01, 01), LocalDate.of(0111, 01, 01));
		try (FileReader fr = new FileReader(DIR); BufferedReader bf = new BufferedReader(fr);) {
			String dato = bf.readLine(); // lee una linea del fichero
			while (dato != null) {
				String partes [] = dato.split(",");
				//comprobamos si el primer elemento del array
				//coincide con el número recibido
				Period period1 = Period.between(Utilidades.convertirTextoAFecha(partes[3]), Utilidades.convertirTextoAFecha(partes[4]));
				Period period2 = Period.between(duracionMax.getFechaInicio(), duracionMax.getFechaFinalizacion());
				if (period1.toTotalMonths() > period2.toTotalMonths()) {
					//creamos el objeto Contacto a partir del array con las partes del mismo
					duracionMax = new Curso(Integer.parseInt(partes[0]), partes[1], Integer.parseInt(partes[2]), Utilidades.convertirTextoAFecha(partes[3]), Utilidades.convertirTextoAFecha(partes[4]));
				}
				dato = bf.readLine();

			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} return duracionMax;
	}
	
	public Curso finalizado () {
		HashSet<Curso> curso= new HashSet<>();
		Date hoy = new Date();
		LocalDate localHoy = hoy.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		try (FileReader fr = new FileReader(DIR); BufferedReader bf = new BufferedReader(fr);) {
			String dato = bf.readLine(); // lee una linea del fichero
			while (dato != null) {
				String partes [] = dato.split(",");
				Curso cr = new Curso(Integer.parseInt(partes[0], partes[1], Integer.parseInt(partes[2]), Utilidades.convertirTextoAFecha(partes[3]), Utilidades.convertirTextoAFecha(partes[4]));
				//comprobamos si el primer elemento del array
				//coincide con el número recibido
				if (localHoy.isBefore(Utilidades.convertirTextoAFecha(partes[4]))) {
					//creamos el objeto Contacto a partir del array con las partes del mismo
					dato.add(new Curso(Integer.parseInt(partes[0]), partes[1], Integer.parseInt(partes[2]), Utilidades.convertirTextoAFecha(partes[3]), Utilidades.convertirTextoAFecha(partes[4])););
				}
				dato = bf.readLine();

			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} return dato;
	}
	
	
	
}
