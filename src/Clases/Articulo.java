package Clases;


public class Articulo extends Lecturas{
	
	 private String area;
	 private String introduccion;
	
	public Articulo(String tipo2, String nombre2, int cantidad2, float precioUnidad2, String autor2, String editorial2, String area, String introduccion) {
		super(tipo2,nombre2, cantidad2, precioUnidad2,autor2,  editorial2);
		this.area = area;
		this.introduccion = introduccion;	
	}
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getIntroduccion() {
		return introduccion;
	}

	public void setIntroduccion(String introduccion) {
		this.introduccion = introduccion;
	}
	
	
}
