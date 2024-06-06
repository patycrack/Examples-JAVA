/**
 * @(#)Centralizar FormulariosCodigo_01.java
 * @Description: Crear Formulario desde Codigo #01
 * @author: Osuna Sarmiento Patricia Amahirany
 * @version 1.00 2022/10/18
 */
   
   
//package 



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;



//Class-Diseño de FormulariosCodigo_01
public class PAOS21_FormulariosCodigo_01 extends JFrame {

   JButton btnBoton = new JButton("Aceptar");
   JLabel etiEtiqueta = new JLabel("Esto es una Etiqueta");
   JTextField txtCuadroTexto = new JTextField("Y esto es un Cuadro de Texto");
   
   
   //Constructor
   PAOS21_FormulariosCodigo_01(){
   
      super("Formularios Desde Codigo #01");
         metodo();

   }//Fin Constructor
   
   
   void metodo(){
      
      this.setLayout(null);
     
      btnBoton.setBounds(15,30,180,20);    
      etiEtiqueta.setBounds(15,60,180,20);
      txtCuadroTexto.setBounds(15,90,180,20);
      
      add(btnBoton);
      add(etiEtiqueta);
      add(txtCuadroTexto);

   
   }//Fin Metodo

   public static void main(String args[]) {
   
       PAOS21_FormulariosCodigo_01 ventana = new  PAOS21_FormulariosCodigo_01();
 	   
      ventana.show();
      ventana.setSize(450,400);
   	ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
   	ventana.setVisible(true);
         
	} //Fin Main 

}//Fin Class