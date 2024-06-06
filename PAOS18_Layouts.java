/*
   @Program: Layouts.java
   @Description: Pruebas de los distintos layouts
   @Author: Osuna Sarmiento Patricia Amahirany
   @Version: 1.00 18/10/2022
*/


//package



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


//Clase Diseño de Layouts
public class PAOS18_Layouts extends JFrame{
   
   JLabel lbl = new JLabel("Esta es una etiqueta");
   JButton btn = new JButton("Boton"); 
   JButton btn1 = new JButton("Boton 1");
   JButton btn2 = new JButton("Boton 2");
   JButton btn3 = new JButton("Boton 3");
   JButton btn4 = new JButton("Boton 4");
   JButton btn5 = new JButton("Boton 5");
   
   
   //Constructor
   PAOS18_Layouts(){
   
      super("Layouts");
         metodo();
   
   }//Fin-constructor
   
   
   //Contenido del Diseño
   void metodo(){
      
        
      //BorderLayout
      this.setLayout(new BorderLayout());
      
      add(btn1,BorderLayout.NORTH);
      add(btn2,BorderLayout.CENTER);
      add(btn3,BorderLayout.EAST);
      add(btn4,BorderLayout.WEST);
      add(btn5,BorderLayout.SOUTH);
      
   }//Fin Metodo
   
   
   public static void main(String args[]) {
		
		PAOS18_Layouts ventana = new PAOS18_Layouts();
		
		ventana.show();
		ventana.setBackground(java.awt.Color.blue);
		ventana.setSize(400,250);
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
   }//Fin main
   
}//Fin Class