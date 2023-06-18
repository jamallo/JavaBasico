package presentacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import model.Pedido;
import service.PedidosService;

public class GestionPedidos {
	
	static PedidosService pedidosService=new PedidosService();
	
	static Scanner sc=new Scanner(System.in);
	static String formato="dd/MM/yyyy";
	
	public static void main(String[] args)  {
		
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			mostrarMenu();
			try {
			
			opcion=Integer.parseInt(sc.nextLine());
			
			switch(opcion) {
				case 1:
					guardarPedido();
					break;
				case 2:
					mostrarPedidoReciente();
					break;
				case 3:
					pedidosEntreFechas();
					break;
				case 4:
					System.out.println("Adios");
			}
		} catch (NumberFormatException ex) {
			System.out.println("Introduce un número correcto");
			opcion=0;
		}
			
		}while(opcion!=4);
		

	}
	
	static void mostrarMenu() {
		System.out.println("1.- Nuevo pedido");
		System.out.println("2.- Pedido más reciente");
		System.out.println("3.- Pedidos entre fechas");
		System.out.println("4.- Salir");
		
	}
	static void guardarPedido() {		
		int unidades;
		String producto,fecha;
		Date fechaPedido;		
		SimpleDateFormat sdf=new SimpleDateFormat(formato);
		System.out.println("Introduce producto");
		producto=sc.nextLine();
		System.out.println("Introduce unidades");
		unidades=Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduce fecha (dia/mes/año)");
		fecha=sc.nextLine();	
		try {
			fechaPedido=sdf.parse(fecha);
			pedidosService.agregar(producto, unidades, fechaPedido);

		} catch (ParseException e) {
			System.out.println("La fecha es incorrecta, vuelve a intentarlo");
			guardarPedido();
		}
	}
	
	static void mostrarPedidoReciente() {
		Pedido pedido=pedidosService.pedidoReciente();
		System.out.println(pedido.getProducto()+"-"+pedido.getUnidades()+"-"+pedido.getFecha());
	}
	static void pedidosEntreFechas() {	
		Date fecha1, fecha2;
		SimpleDateFormat sdf=new SimpleDateFormat(formato);
		try {
			System.out.println("Introduce fecha primera (dia/mes/año)");
			fecha1=sdf.parse(sc.nextLine());
			System.out.println("Introduce fecha segunda (dia/mes/año)");
			fecha2=sdf.parse(sc.nextLine());
			Date fmin, fmax;
			fmin=fecha1.before(fecha2)?fecha1:fecha2;
			fmax=fecha1.after(fecha2)?fecha1:fecha2;
			ArrayList<Pedido> pedidos=pedidosService.pedidosEntreFechas(fmin, fmax);
			for(Pedido p:pedidos) {
				System.out.println(p.getProducto()+"-"+p.getUnidades()+"-"+p.getFecha());
			}
		} catch (ParseException ex) {
			System.out.println("La fecha es incorrecta, intenta de nuevo");
			pedidosEntreFechas();
		}
	}
}
