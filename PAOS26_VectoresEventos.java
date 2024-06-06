/**
 * @(#)Centralizar VectoresEventos.java
 * @Description: Crear Vectores y Eventos
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



//Class-Diseño de Vectores
public class PAOS26_VectoresEventos extends JFrame {
   
    JButton vBotones[];
    
    
   //Constructor
   PAOS26_VectoresEventos(){
   
         setLocationRelativeTo(null);
         metodo();

   }//Fin Constructor
   
   
 
   //Diseño Ventana
   public void metodo(){
 
      this.setTitle( " Vectores & Eventos " );
      this.setSize( 600, 200 );
      this.setLocation( 100, 100 );
      this.setLayout(null);
        
   //Texto para los botones
      String txtBotones[] = { "Aceptar", "Cancelar", " Aplicar", "Cerrar", "Salir"  };
        
   //Creacion de los botones
      vBotones = new JButton[ 5 ]; //Vector de 5 botones
      
         int i;
         
         for ( i = 0; i < vBotones.length; i++){
         
            vBotones[ i ] = new JButton();
            vBotones[ i ].setText(txtBotones[ i ]);
            vBotones[ i ].setBounds( 10 + i * 100, 100, 90, 20);
               
            this.getContentPane().add(vBotones[ i ]);
            
               
        }//Fin Ciclo For
        
         for ( i = 0; i < vBotones.length; i++){
         
            vBotones[ i ].addActionListener( new ActionListener() {
            
                public void actionPerformed( ActionEvent evt){
                
                    botonesActionPerformed(evt);
                    
                }//fin ActionPerformed
                
            });//Fin Parametrso  ActionListener
            
        }//Fin Ciclo For
        
   }//Fin CreacionVentana
    
    
    
   public void botonesActionPerformed( ActionEvent evt ){
    
      JOptionPane.showMessageDialog( null, "Has pulsado el uno botones " );
        
   }//Fin ActionPerformed
    
    
            
   public static void main(String args[]) {
    
      PAOS26_VectoresEventos ventana = new PAOS26_VectoresEventos();
    
      ventana.setVisible(true);
       
   }//Fin Main
   
}//Fin Class