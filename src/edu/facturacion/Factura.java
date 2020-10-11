package edu.facturacion;

import java.util.Calendar;
import java.util.List;

public class Factura {
	
	private int numero;
	
    private List<Producto> productos;
    
    private Calendar fecha;
    
        
	public Factura(int numero, List<Producto> productos, Calendar fecha) {
		this.numero = numero;
		this.productos = productos;
		this.fecha = fecha;
	}
	
	public Factura(int numero, List<Producto> productos) {
		this.numero = numero;
		this.productos = productos;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public List<Producto> getProductos() {
		return productos;
	}
	
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
	public Calendar getFecha() {
		return fecha;
	}
	
	
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		
		return "***** FACTURA NÚMERO " +numero+ " *****\nLISTA DE PRODUCTOS: \n" +productos.toString();
	}
	
	
	
	
	
    
}
