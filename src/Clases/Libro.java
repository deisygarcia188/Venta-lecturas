package Clases;

public class Libro extends Lecturas {

	 private int numero_capitulos;
	 private String fechaActual;
 
	 public Libro() {
		super();
	 }
	
	public Libro(String tipo2, String nombre2, int cantidad2, float precioUnidad2, String autor2, String editorial2, int numero_capitulos, String fechaActual) {
		super(tipo2,nombre2, cantidad2, precioUnidad2,autor2,  editorial2);
		this.numero_capitulos = numero_capitulos;
		this.fechaActual = fechaActual;
	}

	public int getNumero_capitulos() {
		return numero_capitulos;
	}

	public void setNumero_capitulos(int numero_capitulos) {
		this.numero_capitulos = numero_capitulos;
	}

	public String getFechaActual() {
		return fechaActual;
	}

	public void setFechaActual(String fechaActual) {
		this.fechaActual = fechaActual;
	}
}