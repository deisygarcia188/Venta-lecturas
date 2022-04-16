package Presentacion;

import javax.swing.*;
import Clases.Articulo;
import Clases.Libro;
import Clases.Revista;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.*;


public class AgregarLecturas extends JFrame implements ActionListener, ILecturas, ItemListener {
	
	  public AgregarLecturas() {	  
		  initComponents();
	  }
	 
	  public void itemStateChanged(ItemEvent e) {
		  String lecturas=(String)tipos.getSelectedItem();
		  
		  switch(lecturas){
		  
		  case "Libro":      
			  campo_numero_revista.setVisible(false); 
			  numero_revista.setVisible(false); 
			  campo_tipo_publico.setVisible(false);
			  tipo_publico.setVisible(false); 
			  campo_numero_capitulos.setVisible(true);
			  numero_capitulos.setVisible(true);
			  campo_fecha.setVisible(true);
			  fecha.setVisible(true);
			  campo_area.setVisible(false); 
			  area.setVisible(false); 
			  campo_introduccion.setVisible(false);
			  introduccion.setVisible(false); 
			
		  break;
		  
		  case "Articulo":                                   
			  campo_numero_revista.setVisible(false); 
			  numero_revista.setVisible(false); 
			  campo_tipo_publico.setVisible(false);
			  tipo_publico.setVisible(false); 
			  campo_numero_capitulos.setVisible(false);
			  numero_capitulos.setVisible(false);
			  campo_fecha.setVisible(false);
			  fecha.setVisible(false);
			  campo_area.setVisible(true); 
			  area.setVisible(true); 
			  campo_introduccion.setVisible(true);
			  introduccion.setVisible(true);   
			
		  break;
			  
		  case "Revista":                  
			  campo_numero_revista.setVisible(true); 
			  numero_revista.setVisible(true); 
			  campo_tipo_publico.setVisible(true);
			  tipo_publico.setVisible(true); 
			  campo_numero_capitulos.setVisible(false);
			  numero_capitulos.setVisible(false);
			  campo_fecha.setVisible(false);
			  fecha.setVisible(false);
			  campo_area.setVisible(false); 
			  area.setVisible(false); 
			  campo_introduccion.setVisible(false);
			  introduccion.setVisible(false); 
		  break;
			  
		  default:
		  break;				   
		}		
			
	  }
	  
	  /* Método que implementa la acción del botón */
	  public void actionPerformed(ActionEvent e) {
		  
	    if (e.getSource()==boton1) {
	    	if (campo_nombre.getText().equals("") || campo_cantidad.getText().equals("") || campo_precioUnidad.getText().equals("") || campo_autor.getText().equals("") || campo_editorial.getText().equals("")) {
	    		JOptionPane.showMessageDialog(null, "Debes completar todos los campos");
	    		 
	        }else if((String)tipos.getSelectedItem() == "Libro") {
	        	 
	        	 Libro libro1= new Libro((String)tipos.getSelectedItem(), campo_nombre.getText(), Integer.parseInt(campo_cantidad.getText()), Integer.parseInt(campo_precioUnidad.getText()), campo_autor.getText(), campo_editorial.getText(), Integer.parseInt(campo_numero_capitulos.getText()),campo_fecha.getText());
				 
	        	 libro1.setNombre2(campo_nombre.getText());
	        	 
				 int cantidad_disponible1 = Integer.parseInt(campo_cantidad.getText()); 
				 libro1.setCantidad2(cantidad_disponible1);
		
				 int precio_unidad1 = Integer.parseInt(campo_precioUnidad.getText()); 
				 libro1.setPrecioUnidad2(precio_unidad1);
				 
				 libro1.setAutor2(campo_autor.getText());
				 
				 libro1.setEditorial2(campo_editorial.getText());
				 
				 libro1.setTipo2((String)tipos.getSelectedItem());
				 
				 int numero_capitulos0 = Integer.parseInt(campo_numero_capitulos.getText()); 
				 libro1.setNumero_capitulos(numero_capitulos0);
				 
				 libro1.setFechaActual(campo_fecha.getText());
				 
				 setVisible(false);
				 
				 VenderLecturas.tipos.addItem(campo_nombre.getText());
				 VenderLecturas.AgregarLibro((String)tipos.getSelectedItem(), campo_autor.getText(), campo_editorial.getText(), precio_unidad1, cantidad_disponible1, numero_capitulos0, campo_fecha.getText()); 
			     
				 JOptionPane.showMessageDialog(null, "Su "+ libro1.getTipo2()+ " " + libro1.getNombre2()+ " " + "fue agregado con exito");
			     
	    	}else if((String)tipos.getSelectedItem() == "Revista") {
	    		 Revista revista1= new Revista((String)tipos.getSelectedItem(), campo_nombre.getText(), Integer.parseInt(campo_cantidad.getText()), Integer.parseInt(campo_precioUnidad.getText()), campo_autor.getText(), campo_editorial.getText(), Integer.parseInt(campo_numero_revista.getText()), campo_tipo_publico.getText());
	    		 
	    		 revista1.setNombre2(campo_nombre.getText());
				 
				 int cantidad_disponible1 = Integer.parseInt(campo_cantidad.getText()); 
				 revista1.setCantidad2(cantidad_disponible1);
		
				 int precio_unidad1 = Integer.parseInt(campo_precioUnidad.getText()); 
				 revista1.setPrecioUnidad2(precio_unidad1);
				 
				 revista1.setAutor2(campo_autor.getText());
				 
				 revista1.setEditorial2(campo_editorial.getText());
				 
				 int numero_revista0 = Integer.parseInt(campo_numero_revista.getText()); 
				 revista1.setNumero_revista(numero_revista0);
				 
				 revista1.setTipo_publico(campo_tipo_publico.getText());
				 
				 revista1.setTipo2((String)tipos.getSelectedItem());
				 
				 setVisible(false);
				 
				 VenderLecturas.tipos.addItem(campo_nombre.getText());
				 
				 VenderLecturas.AgregarRevista((String)tipos.getSelectedItem(), campo_autor.getText(), campo_editorial.getText(), precio_unidad1, cantidad_disponible1, Integer.parseInt(campo_numero_revista.getText()), campo_tipo_publico.getText()); 
				 
			     JOptionPane.showMessageDialog(null, "Su "+ revista1.getTipo2()+ " " + revista1.getNombre2()+ " " + "fue agregada con exito");
			  
	    	}else if((String)tipos.getSelectedItem() == "Articulo") {
	    		 Articulo articulo1= new Articulo((String)tipos.getSelectedItem(), campo_nombre.getText(), Integer.parseInt(campo_cantidad.getText()), Integer.parseInt(campo_precioUnidad.getText()), campo_autor.getText(), campo_editorial.getText(), campo_area.getText(), campo_introduccion.getText());
	    		 
	    		 articulo1.setNombre2(campo_nombre.getText());
				 
				 int cantidad_disponible1 = Integer.parseInt(campo_cantidad.getText()); 
				 articulo1.setCantidad2(cantidad_disponible1);
		
				 int precio_unidad1 = Integer.parseInt(campo_precioUnidad.getText()); 
				 articulo1.setPrecioUnidad2(precio_unidad1);
				 
				 articulo1.setAutor2(campo_autor.getText());
				 
				 articulo1.setEditorial2(campo_editorial.getText());
				 
				 articulo1.setArea(campo_area.getText());
				 
				 articulo1.setIntroduccion(campo_introduccion.getText());
				 
				 articulo1.setTipo2((String)tipos.getSelectedItem());
				 
				 VenderLecturas.tipos.addItem(campo_nombre.getText());
				 
				 VenderLecturas.AgregarArticulo((String)tipos.getSelectedItem(), campo_autor.getText(), campo_editorial.getText(), precio_unidad1, cantidad_disponible1, campo_area.getText(), campo_introduccion.getText()); 
				 
				 JOptionPane.showMessageDialog(null, "Su "+ articulo1.getTipo2()+ " " + articulo1.getNombre2()+ " " + "fue agregado con exito");     	    	
				 this.setVisible(false);
	    	}
	    }
	  }
	  	 
	  private void initComponents() {
		  
		/* Configuración del JFrame */
		setLayout(null);
		setBounds(7,200,640,320);
		setTitle("Agregar libros");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Color azul= new Color(79, 84, 185);
		this.getContentPane().setBackground(azul);
					
		/* Etiqueta de Titulo*/
		titulo=new JLabel("Agrega tu lectura favorita");
		titulo.setBounds(205,10,280,30);
		titulo.setForeground(Color.white);
		Font fuente = new Font("Calibri", 3, 20);
		titulo.setFont(fuente);
		add(titulo);
		    
		/* Etiqueta de Tipo*/
		tipo=new JLabel("Tipo de lectura:");
		tipo.setBounds(20,50,150,30);
		tipo.setForeground(Color.white);
		add(tipo);
		
		/* Campo de tipo */
		tipos=new JComboBox<String>();
		tipos.setBounds(140,55,150,20);
		add(tipos);
		tipos.addItem("Libro");
		tipos.addItem("Revista");
		tipos.addItem("Articulo");
	    tipos.addItemListener(this);
		    
		/* Etiqueta de Nombre*/
		nombre=new JLabel("Nombre:");
		nombre.setBounds(340,50,150,30);
		add(nombre);
		nombre.setForeground(Color.white);
		
		/* Campo de nombre */
		campo_nombre=new JTextField();
		campo_nombre.setBounds(450,55,150,20);
		add(campo_nombre);
		    
		/* Etiqueta de autor*/
		autor=new JLabel("Autor:");
		autor.setBounds(20,100,100,30);
		add(autor);
		autor.setForeground(Color.white);
		
		/* Campo de autor */
		campo_autor=new JTextField();
		campo_autor.setBounds(140,105,150,20);
		add(campo_autor);
		    
		/* Etiqueta de editorial*/
		editorial=new JLabel("Editorial:");
		editorial.setBounds(340,100,100,30);
		add(editorial);
		editorial.setForeground(Color.white);
		
		/* Campo de editorial */
		campo_editorial=new JTextField();
		campo_editorial.setBounds(450,105,150,20);
		add(campo_editorial);
		
		/* Etiqueta de cantidad*/
		cantidad=new JLabel("Cantidad de libro:");
		cantidad.setBounds(20,150,150,30);
		add(cantidad);
		cantidad.setForeground(Color.white);
		
		/* Campo de cantidad */
		campo_cantidad=new JTextField();
		campo_cantidad.setBounds(140,155,150,20);
		add(campo_cantidad);
		    
		/* Etiqueta de precio*/
		precioUnidad=new JLabel("Precio del libro:");
		precioUnidad.setBounds(340,150,150,30);
		add(precioUnidad);
		precioUnidad.setForeground(Color.white);
		
		/* Campo de precio */
		campo_precioUnidad=new JTextField();
		campo_precioUnidad.setBounds(450,155,150,20);
		add(campo_precioUnidad);
		
		/* Etiqueta de numero_capitulos*/
		numero_capitulos=new JLabel("Numero de capitulos:");
		numero_capitulos.setBounds(20,200,150,30);
		add(numero_capitulos);
		numero_capitulos.setForeground(Color.white);

		/* Campo de numero_capitulos */
		campo_numero_capitulos=new JTextField();
		campo_numero_capitulos.setBounds(140,205,150,20);
		add(campo_numero_capitulos);
		
		/* Etiqueta de fecha*/
		fecha=new JLabel("Fecha:");
		fecha.setBounds(340,200,150,30);
		add(fecha);
		fecha.setForeground(Color.white);
		
		/* Campo de fecha */
		campo_fecha=new JLabel();
		campo_fecha.setBounds(450,205,150,20);
		campo_fecha.setForeground(Color.white);
		Font fuente1 = new Font("Calibri", 3, 20);
		campo_fecha.setFont(fuente1); 
		add(campo_fecha);			
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");  
		String strFecha = formato.format(fechaActual);
		campo_fecha.setText( strFecha);
		    
		/* Etiqueta de area*/
		area=new JLabel("area del articulo:");
		area.setBounds(20,200,150,30);
		add(area);
		area.setForeground(Color.white);
		area.setVisible(false);
		
		/* Campo de area */
		campo_area=new JTextField();
		campo_area.setBounds(140,205,150,20);
		add(campo_area);
		campo_area.setVisible(false);
		    
		/* Etiqueta de introduccion*/
		introduccion=new JLabel("Introduccion:");
		introduccion.setBounds(340,200,150,30);
		add(introduccion);
		introduccion.setForeground(Color.white);
		introduccion.setVisible(false);
		
		/* Campo de introduccion */
		campo_introduccion=new JTextField();
		campo_introduccion.setBounds(450,205,150,20);
		add(campo_introduccion);
		campo_introduccion.setVisible(false);
		
		/* Etiqueta de numero_revista*/
		numero_revista=new JLabel("numero de revista:");
		numero_revista.setBounds(20,200,150,30);
		add(numero_revista);
		numero_revista.setForeground(Color.white);
		numero_revista.setVisible(false);

		/* Campo de numero_revista */
		campo_numero_revista=new JTextField();
		campo_numero_revista.setBounds(140,205,150,20);
		add(campo_numero_revista);
		campo_numero_revista.setVisible(false);
		
		/* Etiqueta de tipo_publico*/
		tipo_publico=new JLabel("Tipo de publico:");
		tipo_publico.setBounds(340,200,150,30);
		add(tipo_publico);
		tipo_publico.setForeground(Color.white);
		tipo_publico.setVisible(false);
		
		/* Campo de tipo_publico */
		campo_tipo_publico=new JTextField();
		campo_tipo_publico.setBounds(450,205,150,20);
		add(campo_tipo_publico);
		campo_tipo_publico.setVisible(false);
		    
		/* Botón de Agregar*/
		boton1=new JButton("Agregar");
		boton1.setBounds(260,240,100,30);
		boton1.getHorizontalAlignment();
		add(boton1);
		boton1.addActionListener(this);
		
		/* Muestro el JFrame */
		setVisible(true);  
	  }
	  
	  /* Definimos variables. */
	  private JTextField campo_nombre;
	  private JTextField campo_autor;
	  private JTextField campo_editorial;
	  private JTextField campo_cantidad;
	  private JTextField campo_precioUnidad;
	  private JTextField campo_area;
	  private JTextField campo_introduccion;
	  private JTextField campo_numero_revista;
	  private JTextField campo_tipo_publico;
	  private JTextField campo_numero_capitulos;
	  private JLabel campo_fecha;
	  private JLabel titulo;
	  private JLabel tipo;
	  private JLabel nombre;
	  private JLabel cantidad;
	  private JLabel autor;
	  private JLabel editorial;
	  private JLabel precioUnidad;
	  private JLabel area;
	  private JLabel introduccion;
	  private JLabel numero_revista;
	  private JLabel tipo_publico;
	  private JLabel numero_capitulos;
	  private JLabel fecha;
	  Date fechaActual = new Date();
	  private JButton boton1;
	  private JComboBox<String> tipos;
		  
}