package JavaBeans;

import java.util.Date;

public class Pedido {

	private String producto;
    private int unidades;
    private Date fecha;

    public Pedido(String producto, int unidades, Date fecha) {
        this.producto = producto;
        this.unidades = unidades;
        this.fecha = fecha;
    }

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

   
}


