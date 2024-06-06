/*
   @Program: E22_EventosDesdeCodigo.java
   @Description: Eventos con Codigo
   @Author: Osuna Sarmiento Patricia Amahirany
   @Version: 1.00 18/10/2022
*/


//packge



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.*;


//Class Diseño EventosDesdeCodigo
public class PAOS22_EventosDesdeCodigo extends JFrame{

   JLabel etiNum1;
   JLabel etiNum2;
   JTextField txtNum1;
   JTextField txtNum2;
   JButton btnSumar;
   JButton btnRestar;
   
   
   //Constructor
   public PAOS22_EventosDesdeCodigo() {
       
        metodo();
        setLocationRelativeTo(null);
    
    }//Fin Construcotr
    

   //Diseño de Ventanas
   public void metodo() {
        
      this.setTitle( "Diseño de Formularios desde Código" );
      this.setSize( 400, 200 );
      this.setLocation( 100, 100 );
      this.setLayout(null);
         
      etiNum1 = new JLabel();
      etiNum1.setText( "Número 1:" );
      etiNum1.setBounds( 10, 20, 100, 25 );
      this.getContentPane().add( etiNum1 );
        
      etiNum2 = new JLabel();
      etiNum2.setText( "Número 2:" );
      etiNum2.setBounds( 10, 65, 100, 25 );
      this.getContentPane().add( etiNum2 );
        
      txtNum1 = new JTextField();
      txtNum1.setText( " 0 " );
      txtNum1.setBounds( 110, 20, 100, 25 );
      this.getContentPane().add( txtNum1 );
        
      txtNum2 = new JTextField();
      txtNum2.setText( " 0 " );
      txtNum2.setBounds( 110, 65, 100, 25 );
      this.getContentPane().add( txtNum2 );
       
      btnSumar = new JButton();
      btnSumar.setText( "Sumar" );
      btnSumar.setBounds( 10, 120, 100, 25 );
      this.getContentPane().add( btnSumar );
        
      btnRestar = new JButton();
      btnRestar.setText( "Restar" );
      btnRestar.setBounds( 150, 120, 100, 25 );
      this.getContentPane().add(btnRestar);
       
             
      btnSumar.addActionListener( new ActionListener(){
      
         public void actionPerformed(ActionEvent evt){ 
      
            btnSumarActionPerformed(evt);
                   
         }//Fin ActionPerformed
            
      });//Fin Parametros ActionListener
      
      
        
      btnRestar.addActionListener( new ActionListener() {
      
         public void actionPerformed( ActionEvent evt){
      
            btnRestarActionPerformed(evt);
      
         }//Fin ActionPerformed
      
      });//Fin ActionListener
      
    }//Fin Metodo
    
    
    
    public void btnSumarActionPerformed(ActionEvent evt){
            
      double a, b, s;
      
      a = Double.parseDouble( txtNum1.getText() );
      b =  Double.parseDouble( txtNum2.getText() );
      s = a + b;

      JOptionPane.showMessageDialog( null,"La suma total es de: " + s);
      
    }//Fin ActionPerformed
    
    
    
    public void btnRestarActionPerformed(ActionEvent evt){
       
      double a, b, r;
        
      a = Double.parseDouble( txtNum1.getText() );
      b = Double.parseDouble( txtNum2.getText() );
      r = a - b;
    
      JOptionPane.showMessageDialog( null,"La resultado de la resta es de: " + r );
    
    }//Fin ActionPerformed
    
    
    
    public void btnSalirActionPerformed(ActionEvent evt){
      
      System.exit(0);
    
    }//Fin ActionPerformed
    
       
    
   public static void main(String args[]) {
    
      PAOS22_EventosDesdeCodigo ventana = new PAOS22_EventosDesdeCodigo();
    
      ventana.setVisible(true);
       
   }//Fin Main
   
}//Fin Class
