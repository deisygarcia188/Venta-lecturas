package Presentacion;

import Clases.TiposLecturas;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VenderLecturas extends JFrame implements ItemListener, ActionListener, ILecturas{
	
	 
	  public static JComboBox<String> tipos;
	  public static String tipo_agregado;
	  public static String autor_agregado;
	  public static String editorial_agregada;
	  public static int precio_unidad_agregado;
	  public static int cantidad_disponible_agregada;
	  public static String area_agregada;
	  public static String introduccion_agregada;
	  public static int numero_revista_agregada;
	  public static String tipo_publico_agregada;
	  public static int numero_capitulos_agregada;
	  public static String fechaActual_agregada;
	  ArrayList<TiposLecturas> libros = new ArrayList<>();
	   
	  
	    public VenderLecturas() {
	    	initComponents();		    	
	    } 

	    private void initComponents() {
	    	
	    	 /* Configuración del JFrame */
		    setLayout(null);
		    setBounds(660,200,700,350);
		    setTitle("Vender libros");
		    setDefaultCloseOperation(EXIT_ON_CLOSE);
		    Color azul= new Color(79, 84, 185);
			this.getContentPane().setBackground(azul);
			
		    /* Etiqueta de Titulo*/
		    titulo=new JLabel("Vende tu lectura");
		    titulo.setBounds(290,10,280,30);
		    add(titulo);
		    titulo.setForeground(Color.white);
		    Font fuente = new Font("Calibri", 3, 20);
	        titulo.setFont(fuente); 
		    
		    /* Etiqueta de Tipo*/
		    tipo=new JLabel("Lecturas:");
		    tipo.setBounds(20,50,150,30);
		    tipo.setForeground(Color.white);
		    add(tipo);
			    
		    /* Campo de tipo */
		    tipos=new JComboBox<String>();
	        tipos.setBounds(140,55,225,20);
	        add(tipos);
	        tipos.addItemListener(this);
	        
	        /* Etiqueta de autor*/
		    autor=new JLabel("Autor:");
		    autor.setBounds(390,50,150,30);
		    add(autor);
		    autor.setForeground(Color.white);
	
		    /* Campo de autor */
		    campo_autor=new JTextField();
		    campo_autor.setBounds(500,55,170,20);
		    add(campo_autor);
		    campo_autor.setEnabled(false);
		    campo_autor.setDisabledTextColor(new Color(110, 103, 103));
		    
		    /* Etiqueta de Nombre*/
		    nombre=new JLabel("Nombre:");
		    nombre.setBounds(20,100,100,30);
		    add(nombre);
		    nombre.setForeground(Color.white);
	
		    /* Campo de nombre */
		    campo_nombre=new JTextField();
		    campo_nombre.setBounds(140,105,210,20);
		    add(campo_nombre);
		    campo_nombre.setEnabled(false);
		    campo_nombre.setDisabledTextColor(new Color(110, 103, 103));
		    
		    /* Etiqueta de editorial*/
		    editorial=new JLabel("Editorial:");
		    editorial.setBounds(390,100,100,30);
		    add(editorial);
		    editorial.setForeground(Color.white);
	
		    /* Campo de editorial */
		    campo_editorial=new JTextField();
		    campo_editorial.setBounds(500,105,170,20);
		    add(campo_editorial);
		    campo_editorial.setEnabled(false);
		    campo_editorial.setDisabledTextColor(new Color(110, 103, 103));
		    
		    /* Etiqueta de precio Unidad*/
		    precioUnidad=new JLabel("Precio unidad:");
		    precioUnidad.setBounds(20,150,150,30);
		    add(precioUnidad);
		    precioUnidad.setForeground(Color.white);
	
		    /* Campo de precio */
		    campo_precioUnidad=new JTextField();
		    campo_precioUnidad.setBounds(140,155,210,20);
		    add(campo_precioUnidad);
		    campo_precioUnidad.setEnabled(false);
		    campo_precioUnidad.setDisabledTextColor(new Color(110, 103, 103));		    
		    
		    /* Etiqueta de cantidad*/
		    cantidad=new JLabel("Cantidad existente:");
		    cantidad.setBounds(390,150,150,30);
		    add(cantidad);
		    cantidad.setForeground(Color.white);
	
		    /* Campo de cantidad */
		    campo_cantidad=new JTextField();
		    campo_cantidad.setBounds(500,155,170,20);
		    add(campo_cantidad);
		    campo_cantidad.setEnabled(false);
		    campo_cantidad.setDisabledTextColor(new Color(110, 103, 103));
		    
		    /* Etiqueta de cantidad*/
		    cantidad_vender=new JLabel("Cantidad a vender:");
		    cantidad_vender.setBounds(20,200,150,30);
		    add(cantidad_vender);
		    cantidad_vender.setForeground(Color.white);
	
		    /* Campo de cantidad a vender */
		    campo_cantidad_vender=new JTextField();
		    campo_cantidad_vender.setBounds(140,205,210,20);
		    add(campo_cantidad_vender);
		    
		    /* Etiqueta de precio_total*/
		    boton3=new JButton("Calcular total");
		    boton3.setBounds(390,200,120,30);
		    boton3.getHorizontalAlignment();
		    add(boton3);
	        boton3.addActionListener(this);
	        
		    /* Campo de precio_total */
		    campo_precio_total=new JLabel();
		    campo_precio_total.setBounds(500,205,150,20);
		    campo_precio_total.setForeground(Color.white);
		    Font fuente1 = new Font("Calibri", 3, 20);
		    campo_precio_total.setFont(fuente1); 
		    add(campo_precio_total);
		    
		    /* Botón de Vender*/
		    boton1=new JButton("Vender");
		    boton1.setBounds(400,260,100,30);
		    boton1.getHorizontalAlignment();
		    add(boton1);
	        boton1.addActionListener(this);
	        
	        /* Botón de finalizar*/
		    boton2=new JButton("Finalizar");
		    boton2.setBounds(220,260,100,30);
		    boton2.getHorizontalAlignment();
		    add(boton2);
	        boton2.addActionListener(this);
	        
	        libros.add(new TiposLecturas("Cien años de Soledad"));
			libros.add(new TiposLecturas("El Coronel no tiene quien le escriba"));
			libros.add(new TiposLecturas("La Odisea"));
			libros.add(new TiposLecturas("National Geographi"));
			libros.add(new TiposLecturas("Motor"));
			libros.add(new TiposLecturas("Combustión Interna"));
			libros.add(new TiposLecturas("Programación orienta a Objetos"));
	
			for (TiposLecturas libros2 : libros) {
				tipos.addItem(libros2.getTipo());
				
			}
					 
		    /* Muestro el JFrame */
		    setVisible(true);  	
	    }
	    
	  	public void itemStateChanged(ItemEvent e) {
	  		
	  		String lecturas=(String)tipos.getSelectedItem();
	    	  
			switch(lecturas){
			  case "Cien años de Soledad":
				  String titulo0 ="Cien años de Soledad";
				  String autor0 ="Gabriel García Márquez";
				  String editorial0 ="Sudamericana";
				  String cantidad = "5";
				  String precio = "30000";
				  campo_nombre.setText(titulo0);
				  campo_autor.setText(autor0);
				  campo_editorial.setText(editorial0);
				  campo_cantidad.setText(cantidad);
				  campo_precioUnidad.setText(precio);
				  
			  break;
			  
			  case "La Odisea":                                   
				  String titulo1 ="La Odisea";
				  String autor1 ="Homero";
				  String editorial1 ="La Esfera de Los Libros";
				  String cantidad1 = "5";
				  String precio1 = "15000";
				  campo_nombre.setText(titulo1);
				  campo_autor.setText(autor1);
				  campo_editorial.setText(editorial1);
				  campo_cantidad.setText(cantidad1);
				  campo_precioUnidad.setText(precio1); 
				
			  break;
				  
			  case "El Coronel no tiene quien le escriba":                  
				  String titulo2 ="El Coronel no tiene quien le escriba";
				  String autor2 ="Gabriel García Márquez";
				  String editorial2 ="Anagrama";
				  String cantidad2 = "3";
				  String precio2 = "25000";
				  campo_nombre.setText(titulo2);
				  campo_autor.setText(autor2);
				  campo_editorial.setText(editorial2);
				  campo_cantidad.setText(cantidad2);
				  campo_precioUnidad.setText(precio2);                  
			  break;
				  
			  case "National Geographi":
				  String titulo3 ="National Geographi ";
				  String autor3 ="Susan Goldberg";
				  String editorial3 ="Ciencia";
				  String cantidad3 = "3";
				  String precio3 = "26000";
				  campo_nombre.setText(titulo3);
				  campo_autor.setText(autor3);
				  campo_editorial.setText(editorial3);
				  campo_cantidad.setText(cantidad3);
				  campo_precioUnidad.setText(precio3);   
				  
			  break;
			  
			  case "Motor":
				  String titulo4 ="Motor  ";
				  String autor4 ="José Clopatofsky";
				  String editorial4 ="EL TIEMPO";
				  String cantidad4 = "5";
				  String precio4 = "15000";
				  campo_nombre.setText(titulo4);
				  campo_autor.setText(autor4);
				  campo_editorial.setText(editorial4);
				  campo_cantidad.setText(cantidad4);
				  campo_precioUnidad.setText(precio4);   
			  break;
			  
			  case "Combustión Interna":
				  String titulo5 ="Combustión Interna";
				  String autor5 ="Rodríguez Pérez";
				  String editorial5 ="Técnicas Agropecuarias";
				  String cantidad5 = "2";
				  String precio5 = "65000";
				  campo_nombre.setText(titulo5);
				  campo_autor.setText(autor5);
				  campo_editorial.setText(editorial5);
				  campo_cantidad.setText(cantidad5);
				  campo_precioUnidad.setText(precio5); 
			  break;
			  
			  case "Programación orienta a Objetos":
				  String titulo6 ="Programación orienta a Objetos    ";
				  String autor6 ="López Mendoza";
				  String editorial6 ="Investigación y Ciencia";
				  String cantidad6 = "3";
				  String precio6 = "48000";
				  campo_nombre.setText(titulo6);
				  campo_autor.setText(autor6);
				  campo_editorial.setText(editorial6);
				  campo_cantidad.setText(cantidad6);
				  campo_precioUnidad.setText(precio6);  
			  break;
			  
			  default:
				  String nombre=(String)tipos.getSelectedItem();
				  
				  String cantidad_disponible_agregada1 = Integer.toString(cantidad_disponible_agregada);
				  
				  String precio_unidad_agregado1 = Integer.toString(precio_unidad_agregado);
				  
				  campo_nombre.setText(nombre);
				  campo_cantidad.setText(cantidad_disponible_agregada1);
     			  campo_editorial.setText(editorial_agregada);
				  campo_autor.setText(autor_agregado);
				  campo_precioUnidad.setText(precio_unidad_agregado1);			  
			  break;				   
			}			
	  	}

	    @Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==boton1) {
		      String campo_nombre1= (String)tipos.getSelectedItem();
		      
		      String cantidad_vender0= campo_cantidad_vender.getText();
		     
		      String cantidad_disponible= campo_cantidad.getText();
			  int cantidad_disponible1 = Integer.parseInt(cantidad_disponible); 
	
		        if (cantidad_vender0.equals("")) {
		            JOptionPane.showMessageDialog(null, "El campo esta vacio");
		            
		        }else if(cantidad_disponible1 < Integer.parseInt(cantidad_vender0)){
		        	
		           JOptionPane.showMessageDialog(null, "No se puede vender " +campo_nombre1+ " no hay cantidad suficiente");
		           
		        }else if(cantidad_disponible1 >= Integer.parseInt(cantidad_vender0)){
		    	  
		    	   JOptionPane.showMessageDialog(null, "La lectura fue vendido con exito");
		    	   int cantidad_restante = cantidad_disponible1 - Integer.parseInt(cantidad_vender0);
		    	 
				   String cantidad_restante1 = Integer.toString(cantidad_restante);
				   campo_cantidad.setText(cantidad_restante1);
					 
				   campo_cantidad_vender.setText("");
				   campo_precio_total.setText(" ");
			    	 
			      }		      
		    }
		
			//boton finalizar
			if(e.getSource()== boton2) {
				setVisible(false);
			}

			//calcular precio 
		    if (e.getSource()==boton3) {
		    	String cantidad_vender= campo_cantidad_vender.getText();
			      
		    	if (cantidad_vender.equals("")) {
		            JOptionPane.showMessageDialog(null, "El campo esta vacio");
		            
		        }else if(Integer.parseInt(cantidad_vender) > 0) {
					  String precio_Unidad= campo_precioUnidad.getText();
					  int precio_Unidad1 = Integer.parseInt(precio_Unidad); 
					  
					  int total = precio_Unidad1 * Integer.parseInt(cantidad_vender);
					  String total1 = Integer.toString(total);
					  campo_precio_total.setText("$ "+ total1);
					  
				 }	
		    }
		}

	    public static void AgregarRevista(String tipo_agregado0, String autor_agregado0, String editorial_agregada0, int precio_unidad0, int cantidad_disponible0, int numero_revista, String tipo_publico) {
			tipo_agregado = tipo_agregado0;
	    	autor_agregado = autor_agregado0;
			editorial_agregada = editorial_agregada0;
			precio_unidad_agregado = precio_unidad0;
			cantidad_disponible_agregada = cantidad_disponible0;
			numero_revista_agregada = numero_revista;
			tipo_publico_agregada = tipo_publico;
				
		}
	    
	    public static void AgregarLibro(String tipo_agregado0, String autor_agregado0, String editorial_agregada0, int precio_unidad0, int cantidad_disponible0, int numero_capitulos, String fechaActual) {
	    	tipo_agregado = tipo_agregado0;
	    	autor_agregado = autor_agregado0;
			editorial_agregada = editorial_agregada0;
			precio_unidad_agregado = precio_unidad0;
			cantidad_disponible_agregada = cantidad_disponible0;
			numero_capitulos_agregada = numero_capitulos;
			fechaActual_agregada = fechaActual;
				
		}

		public static void AgregarArticulo(String tipo_agregado0,String autor_agregado0, String editorial_agregada0, int precio_unidad0, int cantidad_disponible0, String area, String introduccion) {
			tipo_agregado = tipo_agregado0;
			autor_agregado = autor_agregado0;
			editorial_agregada = editorial_agregada0;
			precio_unidad_agregado = precio_unidad0;
			cantidad_disponible_agregada = cantidad_disponible0;
			area_agregada = area;
			introduccion_agregada = introduccion;
				
		}
		
		  private JTextField campo_nombre;
		  private JTextField campo_autor;
		  private JTextField campo_editorial;
		  private JTextField campo_cantidad;
		  private JTextField campo_cantidad_vender;
		  private JLabel campo_precio_total;
		  private JTextField campo_precioUnidad;
		  private JLabel titulo;
		  private JLabel nombre;
		  private JLabel tipo;
		  private JLabel cantidad;
		  private JLabel autor;
		  private JLabel editorial;
		  private JLabel cantidad_vender;
		  private JLabel precioUnidad;
		  private JButton boton1;
		  private JButton boton2;
		  private JButton boton3;

}
