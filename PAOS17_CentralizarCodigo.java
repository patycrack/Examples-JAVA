/**
 * @(#)Centralizar CentralizarCodigo.java
 * @Description: Centralizar Codigo
 * @author: Osuna Sarmiento Patricia Amahirany
 * @version 1.00 2022/10/18
 */
   
   
//package 



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;



//Class-Diseño CentralizarCodigo
public class PAOS17_CentralizarCodigo extends JFrame {

   JMenuBar barraMenu = new JMenuBar();
   JMenu menuCalcular = new JMenu("Calcular");
   JMenuItem menuItemSuma = new JMenuItem("Suma");
   JMenuItem menuItemResta = new JMenuItem("Resta");
   JMenuItem menuItemBorrar = new JMenuItem("Borrar");
   JLabel lblLabel1 = new JLabel("Numero 1");
   JLabel lblLabel2 = new JLabel("Numero 2");
   JTextField txtNumero1 = new JTextField("0");
   JTextField txtNumero2 = new JTextField("0");
   JLabel etiResultado = new JLabel();
   JButton btnSumar = new JButton("Sumar");
   JButton btnRestar = new JButton("Restar");
   JButton btnBorrar = new JButton("Borrar");




   //Constructor
   PAOS17_CentralizarCodigo() {
   
      super("CentralizarCodigo");
         metodo();
 
   }//Fin Constructor
   


   // Contenido del diseño 
	void metodo(){
	     
		this.setLayout(null);
     
      barraMenu.setBounds(0,0,1000,20);
               
      add(barraMenu);
      barraMenu.add(menuCalcular);
      menuCalcular.add(menuItemSuma);
      menuCalcular.add(menuItemResta);
      menuCalcular.add(menuItemBorrar);
      
      lblLabel1.setBounds(15,30,150,20);
      lblLabel2.setBounds(15,60,150,20);
      
      txtNumero1.setBounds(100,30,100,20);
      txtNumero2.setBounds(100,60,100,20);
      
      etiResultado.setBounds(15,90,185,20);
     
      btnSumar.setBounds(15,120,185,20);
      btnRestar.setBounds(15,150,185,20);
      btnBorrar.setBounds(15,180,185,20);
         
      add(lblLabel1);
      add(lblLabel2);
      add(txtNumero1);
      add(txtNumero2);
      add(etiResultado);
      add(btnSumar);
      add(btnRestar);
      add(btnBorrar);
      
      //Posiciones text Label y Field
      txtNumero1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
      txtNumero1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

      txtNumero2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
      txtNumero2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

      etiResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
      etiResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
  
   
   
      btnSumar.addActionListener( new ActionListener(){
      
      
         public void actionPerformed( ActionEvent evt ){ 
           
            Sumar();
            
         }//Fin ActionPerformed
         
      });//Fin Parametros ActionListener
      
      
      
      btnRestar.addActionListener( new ActionListener(){
      
      
         public void actionPerformed( ActionEvent evt ){ 
           
            Restar();
            
         }//Fin ActionPerformed
         
      });//Fin Parametros ActionListener
      
      
      btnBorrar.addActionListener( new ActionListener(){
      
      
         public void actionPerformed( ActionEvent evt ){ 
           
            Borrar();
            
         }//Fin ActionPerformed
         
      });//Fin Parametros ActionListener
      
      
      
      menuItemSuma.addActionListener( new ActionListener() {
       
       
         public void actionPerformed(ActionEvent e) {
         
            Sumar();
            
         }//Fin actionPerformend
           
      });//Fin Parametros ActionListener
      
    
    
      menuItemResta.addActionListener( new ActionListener() {
       
       
         public void actionPerformed(ActionEvent e) {
         
            Restar();
            
         }//Fin actionPerformend
           
      });//Fin Parametros ActionListener  
      
      
      
       menuItemBorrar.addActionListener( new ActionListener() {
       
       
         public void actionPerformed(ActionEvent e) {
           
            Borrar();
            
         }//Fin actionPerformend
           
      });//Fin Parametros ActionListener
      
      
   }//Fin Metodo
   
   
   public void Sumar(){
      
         String num1, num2;
         int a, b, s;
        
         num1 = txtNumero1.getText();
         num2 = txtNumero2.getText();
         
         a = Integer.parseInt(num1);
         b = Integer.parseInt(num2);
         s = a + b;
         
         etiResultado.setText(""+s);
      
      }//Fin Sumar
    
      public void Restar(){
      
         String num1, num2;
         int a, b, r;
    
         num1 = txtNumero1.getText();
         num2 = txtNumero2.getText();
    
         a = Integer.parseInt(num1);
         b = Integer.parseInt(num2);
         r = a - b;
         
         etiResultado.setText(""+r);
      
      }//Fin Restar
    
  
      public void Borrar(){
         
         txtNumero1.setText(" ");
         txtNumero2.setText(" ");
         etiResultado.setText(null);
         
      }//Fin Borrar
 
    
   public static void main(String args[]) {
		
		PAOS17_CentralizarCodigo ventana = new PAOS17_CentralizarCodigo();
		
		ventana.show();
		ventana.setSize(400,250);
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
	}//Fin Main

}//Fin Class