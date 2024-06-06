/**
 * @(#)ComboModelo.java
 * @Description: 
 * @author: Osuna Sarmiento Patricia Amahirany
 * @version 1.00 18/10/2022
 */
 
 
 //package
 
 
 
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.ImageIcon;
 import javax.swing.JButton;
 import javax.swing.JLabel;
 
 
 
 //Class Diseño ComboModelo
 public class PAOS06_ComboModelo extends JFrame {
 
   JComboBox cboNumeros = new JComboBox<>();
   JLabel etiResultado = new JLabel();
   JButton btnPares = new JButton( "Pares" );
   JButton btnImpares = new JButton( "Impares" );
   JButton btnVaciar = new JButton( "Vaciar" );
   JButton btnCerrar = new JButton( "Cerrar" );
   
   
   //Constructor
   PAOS06_ComboModelo() {
   
      super( "Modelos De Cuadro De Lista" );
      
         metodo();

      
   }//Fin Constructor
   
   
   //Contenido del Diseño
   public void metodo(){
      
      getContentPane().setLayout( null );
      
      getContentPane().add( cboNumeros );
         cboNumeros.setBounds( 20, 10, 90, 20 );
                                                      
      getContentPane().add(etiResultado);
         etiResultado.setBounds( 20, 170, 340, 70 );
         etiResultado.setBorder( javax.swing.BorderFactory.createTitledBorder(null, "Opcion Seleccionada", 
            javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
				javax.swing.border.TitledBorder.DEFAULT_POSITION,
			   new java.awt.Font(" ", 0, 12),
				new java.awt.Color(0, 0, 0))); // NOI18N  
            
      //Diseño de Botones    
      getContentPane().add( btnPares ); 
         btnPares.setBounds( 270, 50, 90, 20 );
      
      getContentPane().add( btnImpares ); 
         btnImpares.setBounds( 270, 90, 90, 20 ); 
      
      getContentPane().add( btnVaciar ); 
         btnVaciar.setBounds( 270, 130, 90, 20 );  
      
      getContentPane().add( btnCerrar ); 
         btnCerrar.setBounds( 155, 270, 90, 20 );
         
                  
      
      //Action Events Botton
      btnPares.addActionListener( new ActionListener() {
                        
         public void actionPerformed( ActionEvent evt ) {
                        
            int i;
                           
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                           
               for( i = 0; i < 10; i += 2 ){
                  modelo.addElement( "Nº " + i );
            
               }// Fin Ciclo For
                           
            cboNumeros.setModel(modelo);
            
         }//Fin Action Performed
      
      });//Fin Action Parametros ActionListener    
            
            
      //Action Events Botton            
      btnImpares.addActionListener( new ActionListener() {
                           
         public void actionPerformed( ActionEvent evt ){
                              
            int i;
                              
               DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                            
                  for( i = 1; i < 10; i += 2 ){
                     modelo.addElement( "N. " + i );
                  
                  }// Fin Ciclo For
                           
                 cboNumeros.setModel(modelo);
                 
         }//Fin Action Performed
      
      });//Fin Action Parametros ActionListener    
          
      
      //Action Events Botton               
      btnVaciar.addActionListener( new ActionListener() {
                           
         public void actionPerformed( ActionEvent evt ){
                           
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
                  modelo.addElement(null);
                  cboNumeros.setModel(modelo);
                  etiResultado.setText(null);     
                   
         }//Fin Action Performed
      
      });//Fin Action Parametros ActionListener    
                   
      
      
      //Action Events Botton
      btnCerrar.addActionListener( new ActionListener() {
                           
         public void actionPerformed( ActionEvent evt ){
                              
            System.exit(0);
                          
         }//Fin Action Performed
      
      });//Fin Action Parametros ActionListener    
      
      
      //Action Events Botton    
      cboNumeros.addActionListener( new ActionListener() {
                        
         public void actionPerformed( ActionEvent evt ){
              
            String mensaje = "Haz seleccionado el ";
            mensaje = mensaje + cboNumeros.getSelectedItem().toString();
            etiResultado.setText( mensaje );
            
         }//Fin Action Performed
      
      });//Fin Action Parametros ActionListener    
            
   }//Fin Metodo
 
 
 
   public static void main(String args[]) {

      PAOS06_ComboModelo ventana = new PAOS06_ComboModelo();
      
      ventana.show();
      ventana.setBackground(java.awt.Color.blue);
      ventana.setSize(400,350);
      ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
      ventana.setVisible(true);
        
	}//Fin Main
   
 }//Fin Class
 