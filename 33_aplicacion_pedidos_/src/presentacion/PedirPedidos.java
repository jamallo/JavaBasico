package presentacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import JavaBeans.Pedido;
import service.PedidosService;

public class PedirPedidos {
	static PedidosService pedidosService = new PedidosService();
	static Scanner sc=new Scanner(System.in);
	static String formato = "dd/MM/yyyy";


	public static void main(String[] args) {
		int opcion;
		do {
			mostrarMenu();
			opcion=sc.nextInt();//lee la opción elegida
			switch(opcion) { //evaluamos
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
					System.out.println("---Adios---");
			}
		}while(opcion!=4);
	}
	static void mostrarMenu() {
		System.out.println("1.- Nuevo pedido");
		System.out.println("2.- Pedido mas reciente");
		System.out.println("3.- Pedidos entre fechas");
		System.out.println("4.- Salir");
		
	}
	static void guardarPedido() {
		int unidades;
		String producto, fecha;		
		Date fechaPedido;
		String formato = "dd/MM/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		System.out.println("Introduce producto");
		producto=sc.nextLine();
		System.out.println("Introduce unidades");
		unidades=Integer.parseInt(sc.nextLine());	
		System.out.println("Introduce fecha (día/mes/año");
		fecha=sc.nextLine();
		fechaPedido=sdf.parse(fecha);
		pedidosService.nuevoPedido(producto,unidades,fecha);
		
	}
	static void mostrarPedidoReciente() {
		Pedido pedido = pedidosService.pedidoMasReciente();
		System.out.println(pedido.getProducto() + "-" + pedido.getUnidades() + "-" + pedido.getFecha());
	}
	
	static void pedidosEntreFechas() throws Throwable {
		Scanner sc=new Scanner(System.in);
		Date fecha1, fecha2;
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		System.out.println("Introduce fecha primera (dia/mes/año)");
		fecha1 = sdf.parse(sc.nextLine());
		System.out.println("Introduce fecha segunda (dia/mes/año)");
		fecha2 = sdf.parse(sc.nextLine());
		Date fmin, fmax;
		fmin = fecha1.before(fecha2)?fecha1:fecha2;
		fmax = fecha1.after(fecha2)?fecha1:fecha2;

	}
}
