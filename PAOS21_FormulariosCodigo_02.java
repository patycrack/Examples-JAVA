/**
 * @(#)Centralizar FormulariosCodigo_02.java
 * @Description: Crear Formulario desde Codigo #02
 * @author: Osuna Sarmiento Patricia Amahirany
 * @version 1.00 2022/10/18
 */
   
   
//package 



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;



//Class-Diseño de FormulariosCodigo_02
public class PAOS21_FormulariosCodigo_02 extends JFrame {

   JLabel etiNum1;
   JLabel etiNum2;
   JTextField txtNum1;
   JTextField txtNum2;
   JButton btnSumar;
   JButton btnRestar;

  
   //Constructor
   PAOS21_FormulariosCodigo_02(){
   
      super("Formularios Desde Codigo #02");
         
         metodo();
         setLocationRelativeTo(null);

   }//Fin Constructor
   
   
   //Diseño de Ventanas
   void metodo(){
      
      this.setLayout(null);
     
      this.setTitle("Diseño de Formularios desde Código");
      this.setSize(280,250);
      this.setLocation(100,100);
      this.setLayout(null);
       
      etiNum1 = new JLabel();
      etiNum1.setText("Número 1:");
      etiNum1.setBounds(10, 20, 100, 25);
      this.getContentPane().add(etiNum1);
        
      etiNum2 = new JLabel();
      etiNum2.setText("Número 2:");
      etiNum2.setBounds(10, 65, 100, 25);
      this.getContentPane().add(etiNum2);
        
      txtNum1 = new JTextField();
      txtNum1.setText("0");
      txtNum1.setBounds(110, 20, 100, 25);
      this.getContentPane().add(txtNum1);
        
      txtNum2 = new JTextField();
      txtNum2.setText("0");
      txtNum2.setBounds(110, 65, 100, 25);
      this.getContentPane().add(txtNum2);
        
      btnSumar = new JButton();
      btnSumar.setText("Sumar");
      btnSumar.setBounds(10, 120, 100, 25);
      this.getContentPane().add(btnSumar);
        
      btnRestar = new JButton();
      btnRestar.setText("Restar");
      btnRestar.setBounds(150, 120, 100, 25);
      this.getContentPane().add(btnRestar);
   
   }//Fin Metodo
   
   

   public static void main(String args[]) {

       PAOS21_FormulariosCodigo_02 ventana = new  PAOS21_FormulariosCodigo_02();   
       
       ventana.setVisible(true);
  
	} //Fin Main 

}//Fin Class