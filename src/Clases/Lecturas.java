package Clases;

public class Lecturas {
	
	 private String tipo2;
	 private String nombre2;
     private int cantidad2;
	 private float precioUnidad2;
	 private String autor2;
	 private String editorial2;
	 
	 public Lecturas() {
		super();
	 }
		
	public Lecturas(String tipo2,String nombre2, int cantidad2, float precioUnidad2, String autor2, String editorial2) {
		super();
		this.tipo2 = tipo2;
		this.nombre2 = nombre2;
		this.cantidad2 = cantidad2;
		this.precioUnidad2 = precioUnidad2;
		this.autor2 = autor2;
		this.editorial2 = editorial2;
	}
		
	public String getTipo2() {
		return tipo2;
	}

	public void setTipo2(String tipo2) {
		this.tipo2 = tipo2;
	}
	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public int getCantidad2() {
		return cantidad2;
	}

	public void setCantidad2(int cantidad2) {
		this.cantidad2 = cantidad2;
	}

	public float getPrecioUnidad2() {
		return precioUnidad2;
	}

	public void setPrecioUnidad2(float precioUnidad2) {
		this.precioUnidad2 = precioUnidad2;
	}

	public String getAutor2() {
		return autor2;
	}

	public void setAutor2(String autor2) {
		this.autor2 = autor2;
	}

	public String getEditorial2() {
		return editorial2;
	}

	public void setEditorial2(String editorial2) {
		this.editorial2 = editorial2;
	}
	
}
