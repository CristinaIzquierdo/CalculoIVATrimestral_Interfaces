package edu.gestion;

import java.util.ArrayList;

import edu.facturacion.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		/* Agregar todos los productos*/
		Producto prod1 = new Producto("Leche", 0.75);
		Producto prod2 = new Producto("Pan", 0.50);
		Producto prod3 = new Producto("Salmon", 8.99);
		Producto prod4 = new Producto("Aguacates", 2.95);
		Producto prod5 = new Producto("Friegasuelos", 1.20);
		Producto prod6 = new Producto("Cerveza", 0.56);
		Producto prod7 = new Producto("Sandia", 1.45);
		
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
		Factura fac1 = new Factura(1,lista);
		
		/* Impresión de datos de la factura (llamada al método toString) */
		System.out.println(fac1.toString());
		
	} // fin del main

} // fin de la clase
