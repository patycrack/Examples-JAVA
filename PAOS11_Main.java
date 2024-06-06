/**
 * @(#)Main.java
 * @Description: Muestra Menu
 * @author: Osuna Sarmiento Patricia Amahirany
 * @version 1.00 2022/10/18
 */
   
   
//package 



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;



//Class-Diseño de Main
public class PAOS11_Main extends JFrame {

   JMenuBar barraMenu = new JMenuBar();
   JMenu menuArchivo = new JMenu("Archivo");
   JMenuItem menuItemAbrir = new JMenuItem("Abrir");
   JMenuItem menuItemGuardar = new JMenuItem("Guardar");
   JPopupMenu.Separator jSeparator1 = new JPopupMenu.Separator();
   JMenuItem menuItemSalir = new JMenuItem("Salir");
   JMenu menuEdicion = new JMenu("Edicion");
   JMenu menuColores = new JMenu("Colores");
   JMenuItem menuItemRojo = new JMenuItem("Rojo");
   JMenuItem menuItemVerde = new JMenuItem("Verde");
   JMenuItem menuItemAzul = new JMenuItem("Azul");
   JMenu menuInsertar = new JMenu("Insertar");
   
   
   //Constructor
   PAOS11_Main(){
		
		super("Main");
		   metodo();
      
  	}//Fin Constructor
   
   
   
   // Contenido del diseño 
	void metodo(){
	     
		this.setLayout(null);
     
      barraMenu.setBounds(0,0,1000,20);
               
      add(barraMenu);
      barraMenu.add(menuArchivo);
      menuArchivo.add(menuItemAbrir);
      menuArchivo.add(menuItemGuardar);
      menuArchivo.add(jSeparator1);  
      menuArchivo.add(menuItemSalir);
      
      barraMenu.add(menuEdicion);
      menuEdicion.add(menuColores);
      menuColores.add(menuItemRojo);
      menuColores.add(menuItemVerde);
      menuColores.add(menuItemAzul);
      
      barraMenu.add(menuInsertar);
      
      
      
      menuItemRojo.addActionListener( new ActionListener() {
       
       
         public void actionPerformed(ActionEvent e) {
            getContentPane().setBackground(new Color(255,0,0));
            
         }//Fin actionPerformend
           
      });//Fin Parametros ActionListener
      
      
      
      menuItemVerde.addActionListener( new ActionListener() {
       
       
         public void actionPerformed(ActionEvent e) {
            getContentPane().setBackground(new Color(0,255,0));
            
         }//Fin actionPerformend
           
      });//Fin Parametros ActionListener
 
 

      menuItemAzul.addActionListener( new ActionListener() {
       
       
         public void actionPerformed(ActionEvent e) {
            getContentPane().setBackground(new Color(0,0,255));
            
         }//Fin actionPerformend
           
      });//Fin Parametros ActionListener      
      
      
      
      menuItemSalir.addActionListener( new ActionListener() {
       
       
         public void actionPerformed(ActionEvent e) {
         
            System.exit(0);
            
         }//Fin actionPerformend
           
      });//Fin Parametros ActionListener      

   }//Fin Metodo 
   
       
       
   public static void main(String args[]) {
		
      PAOS11_Main ventana = new PAOS11_Main();
      
  		ventana.show();
 		ventana.setSize(450,200);
  		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
  		ventana.setVisible(true);
         
	} //Fin Main 
                       
}//Fin Class
