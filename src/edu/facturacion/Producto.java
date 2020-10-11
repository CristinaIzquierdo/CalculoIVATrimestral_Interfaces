package edu.facturacion;

public class Producto {
		
	public enum IVA{
		
		IVASUPERREDUCIDO 	("Superreducido", 0.04), 
		IVAREDUCIDO 		("Reducido", 0.1), 
		IVANORMAL 			("Normal", 0.21);
		
		private final String nombreTipoIVA;
		private final double porcentaje;
		
		private IVA(String nombreTipoIVA, double porcentaje){
			this.nombreTipoIVA = nombreTipoIVA;
			this.porcentaje = porcentaje;
		}

		public String getNombreTipoIVA() {
			return nombreTipoIVA;
		}

		public double getPorcentaje() {
			return porcentaje;
		}

				
	}
	
	private IVA tipoIVA;
	private String descripcion;
	private double importe;
	
		
	public Producto( String descripcion, double importe) {
		this.descripcion = descripcion;
		this.importe = importe;
	}
	
	public Producto( String descripcion, double importe, IVA tipoIVA) {
		this.descripcion = descripcion;
		this.importe = importe;
		this.tipoIVA = tipoIVA;
	}
	
	public double getImporte() {
		return importe;
	}
	
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

	public IVA getTipoIVA() {
		return tipoIVA;
	}

	public void setTipoIVA(IVA tipoIVA) {
		this.tipoIVA = tipoIVA;
	}

	@Override
	public String toString() {
		return "\nPRODUCTO: " + descripcion + "\t IMPORTE: " + importe + "€";
	}
	
	
	

}
