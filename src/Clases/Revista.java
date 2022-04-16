package Clases;

public class Revista extends Lecturas {

     private int numero_revista;
	 private String tipo_publico;
	  
	 public Revista() {
		super();
	 }
	
	public Revista(String tipo2, String nombre2, int cantidad2, float precioUnidad2, String autor2, String editorial2, int numero_revista, String tipo_publico ) {
		super(tipo2,nombre2, cantidad2, precioUnidad2,autor2,  editorial2);
		this.numero_revista = numero_revista;
		this.tipo_publico = tipo_publico;
	}
	
	public int getNumero_revista() {
		return numero_revista;
	}

	public void setNumero_revista(int numero_revista) {
		this.numero_revista = numero_revista;
	}

	public String getTipo_publico() {
		return tipo_publico;
	}

	public void setTipo_publico(String tipo_publico) {
		this.tipo_publico = tipo_publico;
	}


}

