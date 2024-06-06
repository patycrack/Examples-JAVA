/**
 * @(#)Centralizar Vectores.java
 * @Description: Crear Vectores
 * @author: Osuna Sarmiento Patricia Amahirany
 * @version 1.00 2022/10/18
 */
   
   
//package 



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;  



//Class-Diseño Vectores
public class PAOS25_Vectores extends JFrame {

   JCheckBox vCuadros[];
   JButton btnAceptar;
   
     
   //Constructor
   public PAOS25_Vectores() {
      
      setLocationRelativeTo(null);
      metodo();
       
   }//Fin Constructor
   
   
   
   //Diseño Ventana
   public void metodo(){
        
      //Caracteristicas de la ventana
      this.setTitle( " Vectores " );
      this.setSize( 300, 600 );
      this.setLocation( 500, 50);
      this.setLayout(null);
        
      //Constructor del vector (10 elementos)
      vCuadros = new JCheckBox[ 10 ];
       
      //construcción de cada cuadro de verificación del vector
  
      String vtextos[] = { " rojo ", " verde ", 
                           " azul ", " rosa ", " celeste ", 
                           " morado ", " amarillo ", " marrón ", 
                           " naranja ", " blanco "};
      
         int i;
        
            for ( i = 0; i < vCuadros.length; i++ ){
            
               vCuadros[ i ] = new JCheckBox(); //Se construyo cada cuadro
               vCuadros[ i ].setText( vtextos[ i ] ); //Se le da un texto del vector de texto
               vCuadros[ i ].setBounds(10,10 + 30 * i, 100, 20); //Posición y tamaño
               
               this.getContentPane().add(vCuadros[ i ]);
           
            }//Fin Ciclo For
        
         btnAceptar = new JButton();
         btnAceptar.setText( "Aceptar" );
         btnAceptar.setBounds( 10, 360, 100, 30);
         
         this.getContentPane().add(btnAceptar);
        
     
         btnAceptar.addActionListener( new ActionListener() {
        
            public void actionPerformed( ActionEvent evt) {
            
               btnAceptarActionPerformed(evt);
               
            }//Fin ActionPerformed
            
        });//Fin Parametros Action Listener

    }//Fin Creacion Ventana

    public void btnAceptarActionPerformed( ActionEvent evt ){
      
      int i;
      int cont = 0;
         
         for ( i = 0; i < vCuadros.length; i++ ){
         
             if ( vCuadros[ i ].isSelected()){
                 cont++;
                 
             }//Fin Ciclo If
             
         }//Fin Ciclo For
         
         JOptionPane.showMessageDialog( null, " Hay " + cont + " cuadrados seleccionados" );
         
     }//Fin ActionPerformed
      
    
    
   public static void main(String args[]) {
    
      PAOS25_Vectores ventana = new PAOS25_Vectores();
    
      ventana.setVisible(true);
       
   }//Fin Main
   
}//Fin Class