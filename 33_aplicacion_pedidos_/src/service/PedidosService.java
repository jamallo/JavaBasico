package service;

import java.util.ArrayList;
import java.util.Date;


import JavaBeans.Pedido;

public class PedidosService {

        ArrayList <Pedido> pedidos = new ArrayList<>();
        
        public void nuevoPedido(String producto, int unidades, Date fecha) {        
        	Pedido pedido = new Pedido(producto, unidades, fecha);
        	pedidos.add(pedido);
        }
        
        public Pedido pedidoMasReciente() {
//        	Date fechahoy = new Date(0);
//        	Date fechaPedido = null;
//        	Pedido pedidoReciente = null;
//        	for (int i = 0; i < pedidos.size(); i++ ) {
//        		pedidoReciente = pedidos.get(i);
//        		fechaPedido = pedidoReciente.getFecha(); 
//        		if (fechahoy.before(fechaPedido)) {
//            	pedidoReciente=fechahoy;
//        		}else {
//        			continue;
//        		}
//        	}
//        return pedidoReciente;
        	
        	Pedido pedidoReciente = new Pedido("", 0, new Date (0));
        	for (Pedido p:pedidos) {
        		if (p.getFecha().after(pedidoReciente.getFecha())) {
        			pedidoReciente=p;
        		}
        	}return pedidoReciente;
        }
        
        public ArrayList<Pedido> mostrarPedidosEntreFechas(Date fecha1, Date fecha2) {
        	ArrayList<Pedido> aux = new ArrayList<>();
        	for (Pedido p : pedidos) {
                if (p.getFecha().after(fecha1) && p.getFecha().before(fecha2)) {
                }
            }
			return aux;
        	
        }

}
