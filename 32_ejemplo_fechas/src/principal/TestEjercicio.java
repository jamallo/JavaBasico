package principal;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class TestEjercicio {

	public static void main(String[] args) {
		Date[] fechas= {new Date(2303948477L),new Date(8394866773L),new Date(8414200073L)};
        //Mostrar las fechas anteriores de menor a mayor en formato dia/mes/año - hora:minutos:segundos

		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        
        // Ordenar las fechas de menor a mayor
        Arrays.sort(fechas);
        
        // Mostrar las fechas formateadas
        System.out.println("Fechas ordenadas de menor a mayor:");
        for (Date fecha : fechas) {
            String fechaFormateada = formato.format(fecha);
            System.out.println(fechaFormateada);
        }
        System.out.println("--------------");
        
        Date aux;
        for(int i = 0; i<fechas.length;i++) {
        	for(int k=i+1; k<fechas.length;k++) {
        		if (fechas[i].compareTo(fechas[k]) < 0) {
        			//intercambio
        			aux = fechas[i];
        			fechas[i] = fechas[k];
        			fechas[k] = aux;
        		}
        	}
        }
		imprimir(fechas);
		
	}
	private static void imprimir(Date[] fechas) {
		String formato = "dd/MM/yyyy - HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		for( Date d: fechas) {
			System.out.println(sdf.format(d));
		}
	}

}
