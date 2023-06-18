package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

import model.Pedido;

public class PedidosService {
	HashSet<Pedido> pedidos=new HashSet<>();
	public void agregar(String producto, int unidades, Date fecha) {
		pedidos.add(new Pedido(producto,unidades,fecha));
	}
	public Pedido pedidoReciente() {
		Pedido pedidoReciente=new Pedido("",0,new Date(0));
		for(Pedido p:pedidos) {
			if(p.getFecha().after(pedidoReciente.getFecha())) {
				pedidoReciente=p;
			}
		}
		return pedidoReciente;
		
	}
	public ArrayList<Pedido> pedidosEntreFechas(Date fecha1, Date fecha2){
		ArrayList<Pedido> aux=new ArrayList<>();
		for(Pedido p:pedidos) {
			if(p.getFecha().after(fecha1)&&p.getFecha().before(fecha2)) {
				aux.add(p);
			}
		}
		return aux;
	}
}
