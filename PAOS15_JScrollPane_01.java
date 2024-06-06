/**
 * @(#)JScrollPane_01.java
 * @Description: Scroll con imagenes
 * @author: Osuna Sarmiento Patricia Amahirany
 * @version 1.00 2022/10/18
 */
   
   
//package 



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



//Class-JScrollPane
public class PAOS15_JScrollPane_01 extends JFrame {
    
   JScrollPane scroll = new JScrollPane();
   JLabel etiqueta = new JLabel();
   
   
   
   //Constructor
   PAOS15_JScrollPane_01() {
       
      super( "Scroll Imagen" );
         
         metodo();
               
   }//Fin Construcor
       
   
   
   //Contenido del Diseño    
   public void metodo() {
        
      getContentPane().add(scroll);
      
      etiqueta.setIcon( new ImageIcon ( "Icons/video.gif" ));
        
      scroll.setViewportView(etiqueta);
        
    }//Fin Metodo
    
    
    public static void main(String[] args) {
       
      PAOS15_JScrollPane_01 ventana = new PAOS15_JScrollPane_01();
    
       ventana.show();
       ventana.setBackground( java.awt.Color.BLUE );
       ventana.setSize( 400, 400 );
       ventana.setDefaultCloseOperation( ventana.EXIT_ON_CLOSE );
       ventana.setVisible( true );
    
    }//Fin Main

}//Fin Class