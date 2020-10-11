package edu.gestion;

import java.util.ArrayList;

import edu.facturacion.Factura;
import edu.facturacion.Producto;
import edu.facturacion.UtilidadesFactura;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		/* Agregar todos los productos*/
		Producto prod1 = new Producto("Leche", 0.75, Producto.IVA.IVASUPERREDUCIDO);
		Producto prod2 = new Producto("Pan", 0.50, Producto.IVA.IVANORMAL);
		Producto prod3 = new Producto("Salmon", 8.99, Producto.IVA.IVANORMAL);
		Producto prod4 = new Producto("Aguacates", 2.95, Producto.IVA.IVANORMAL);
		Producto prod5 = new Producto("Friegasuelos", 1.20, Producto.IVA.IVAREDUCIDO);
		Producto prod6 = new Producto("Cerveza", 0.56, Producto.IVA.IVASUPERREDUCIDO);
		Producto prod7 = new Producto("Sandia", 1.45, Producto.IVA.IVANORMAL);
		
		/* Creación ArrayList de productos*/ 
		ArrayList<Producto> lista = new ArrayList<Producto>();
		
		/* Se añaden los productos a la lista creada*/
		lista.add(prod1);
		lista.add(prod2);
		lista.add(prod3);
		lista.add(prod4);
		lista.add(prod5);
		lista.add(prod6);
		lista.add(prod7);
		
		/* Se crea la factura */
		Factura fac1 = new Factura(2,lista);
		
		System.out.println("Importe de la factura (sin IVA): "+ UtilidadesFactura.calcularImporteFactura(fac1)+"€");
		System.out.println("Importe IVA: "+ UtilidadesFactura.calcularIVAFactura(fac1)+"€");
		System.out.println("TOTAL (con IVA): "+ UtilidadesFactura.calcularImporteFacturaConIVA (fac1)+"€");

		
		

	}

}
