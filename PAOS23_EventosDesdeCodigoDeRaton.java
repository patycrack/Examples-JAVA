 /**
 * @(#)Centralizar E23_EventosDesdeCodigoDeRaton.java
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



//Class-Diseño EventosRaton
public class  PAOS23_EventosDesdeCodigoDeRaton extends JFrame {

   JLabel etiText;
   JLabel etiZona;
   
   
   
   //Constructor
   public PAOS23_EventosDesdeCodigoDeRaton() {
   
      setLocationRelativeTo(null);
      metodo();
      
   }//Fin Constructor   
    
    
    
   //Diseño de Ventanas
   public void metodo(){
        
      this.setTitle( "Eventos Desde Codigo Eventos De Raton" );
      this.setSize( 400, 400 );
      this.setLocation( 100, 100 );
      this.setLayout(null);
        
      etiText = new JLabel();
      etiText.setBounds( 50, 10, 300, 20 );
      etiText.setText( " --- " );    
      this.getContentPane().add( etiText );
         
      etiZona = new JLabel();
      etiZona.setBounds( 50, 50, 300, 250 );
      etiZona.setText( "" );
      etiZona.setOpaque( true );
      etiZona.setBackground( Color.RED );
      this.getContentPane().add( etiZona );
      
            
      
      etiZona.addMouseListener(new MouseAdapter(){
      
         public void mouseEntered( MouseEvent evt ){
         
            etiZonaMouseEntered( evt );
                
         }//Fin MouseEntered
            
            
         public void mouseExited( MouseEvent evt ){
         
            etiZonaMouseExited( evt );
                
         }//fin MouseExited
         
            
         public void mousePressed( MouseEvent evt ){
         
            etiZonaMousePressed( evt );
            
            }//Fin MousePressed
            
      });//Fin MouseListener
        
   }//Fin Parametros CreacionVentana
   
   
    
    public void etiZonaMouseEntered( MouseEvent evt ){
    
      etiText.setText( " El ratón acaba de entrar en la etiqueta " );
        
    }//Fin ZonaMouseEntered



    public void etiZonaMouseExited( MouseEvent evt ){
    
      etiText.setText( " El ratón acaba de salir de la etiqueta " );
        
    }//Fin ZonaMouseExited
    
    
    public void etiZonaMousePressed( MouseEvent evt ){
    
      if ( evt.getButton() == MouseEvent.BUTTON1){
      
         etiText.setText( " Se acaba de pulsar el botón izquierdo del ratón" );
        
      }//Fin Ciclo If
        
      else if ( evt.getButton() == MouseEvent.BUTTON2 ){
            
         etiText.setText( " Se acaba de pulsar el botón central del ratón" );
            
      }//Fin Else If
      
      else if( evt.getButton() == MouseEvent.BUTTON3 ){
      
         etiText.setText( " Se acaba de pulsar el botón derecho del ratón" );
            
      }//Fin Else If
      
   }//Fin Parametros MousePrssed
    
  
   public static void main(String args[]) {
    
     PAOS23_EventosDesdeCodigoDeRaton ventana = new PAOS23_EventosDesdeCodigoDeRaton();
    
     ventana.setVisible(true);
       
   }//Fin Main
   
}//Fin Class