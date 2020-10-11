package edu.facturacion;

import java.util.ArrayList;
import java.util.List;

public class UtilidadesFactura {
	
	private static double totalSinIva;
	private static double totalConIVa;
	private static double total;
	
	
	
	
	// Calcula el importe SIN IVA de la factura
	public static double calcularImporteFactura(Factura f) {
		ArrayList<Producto> listaProd = new ArrayList<Producto>();
		totalSinIva = 0;
		
		listaProd = (ArrayList<Producto>) f.getProductos();
		
		for(Producto producto: listaProd) {
			totalSinIva += producto.getImporte();
		}
		return totalSinIva;
	}//Fin calcularImporteFactura
	
	
	
	
	// Calcula el IVA total de la factura
	public static double calcularIVAFactura(Factura f) 	{
		List<Producto> listaProd = new ArrayList<Producto>();
		totalConIVa = 0;
		
		listaProd = f.getProductos();
		
		for(Producto producto: listaProd) {
			double IVA = producto.getTipoIVA().getPorcentaje();
			double precio = producto.getImporte();
			
			totalConIVa += (precio*IVA);
		}
		return totalConIVa;
	}//Fin calcularIVAFactura
	
	
	
	
	//CalcularImporteFacturaConIVA
	public static double calcularImporteFacturaConIVA (Factura f) {
		total = totalSinIva + totalConIVa;
		return total;
	}//Fin CalcularImporteFacturaConIVA	

}
