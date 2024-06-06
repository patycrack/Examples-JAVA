/**
 * @(#)TogglesButtons.java
 * @Description: 
 * @author: Osuna Sarmiento Patricia Amahirany
 * @version 1.00 18/10/2022
 */
 
 
 //package
 
 
 
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.ImageIcon;
 import javax.swing.JPanel;
 import javax.swing.JButton;
 import javax.swing.JLabel;
 import javax.swing.JToggleButton;
 
 
 //Class Diseño ToggleButtons
 public class PAOS07_ToggleButtons extends JFrame {
   
   JLabel etiTitle = new JLabel("Precio Base");
   JLabel etiTotal = new JLabel();
   JTextField txtPrecioBase = new JTextField();
   JButton btnCalcular = new JButton( "Calcular" );
   JButton btnLimpiar = new JButton( "Limpiar" );
   JButton btnCerrar = new JButton( "Cerrar" );
   JToggleButton tbtnInstalacion = new JToggleButton( "Instalacion" );
   JToggleButton tbtnFormacion = new JToggleButton( "Formacion" );
   JToggleButton tbtnAlimentacionBD = new JToggleButton( "Alimentacion BD" );
   
   
   //Constructor
   PAOS07_ToggleButtons() {
   
      super( "Toggles Buttons" );
         metodo();
         tbtnInstalacion.setSelected( true );
      
   }//Fin Constructor
   
   
   
   //Contenido del Diseño
   public void metodo() {
   
      getContentPane().setLayout( null ); 
      
      getContentPane().add( etiTitle );
         etiTitle.setBounds( 20, 10, 90, 50);    

      getContentPane().add( etiTotal );
         etiTotal.setBounds( 20, 180, 260, 60 );
         etiTotal.setBorder( javax.swing.BorderFactory.createTitledBorder(null, "Resultado de la Operacion",
            javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
			   javax.swing.border.TitledBorder.DEFAULT_POSITION,
			   new java.awt.Font(" ", 0, 12),
				new java.awt.Color(0, 0, 0))); // NOI18N  
       
      //Diseño TextField    
      getContentPane().add( txtPrecioBase );
         txtPrecioBase.setBounds( 20, 45, 90, 30 );
      
      //Diseño Boton
      getContentPane().add( btnCalcular );
         btnCalcular.setBounds( 295, 200, 90, 20 );
      
      //Boton Calcular   
      btnCalcular.addActionListener( new ActionListener() {
      
      
         //Action Performed   
         public void actionPerformed( ActionEvent evt ) {
                                    
            double precio_base; //Precio Base
            double precio_instal; //Precio Instalacion
            double precio_formacion; //Precio Formacion
            double precio_alimen; //Precio Alimentacion BD
                                       
            precio_base = Double.parseDouble( txtPrecioBase.getText() );
               precio_instal = 40;
               precio_formacion = 200;
               precio_alimen = 200;
                                       
            double precio_total;                             
            precio_total = precio_base;
                                       
               if( tbtnInstalacion.isSelected() ){
                                          
                  precio_total = precio_total + precio_instal;
                  
               }//Fin Ciclo If
                              
                                       
               if( tbtnFormacion.isSelected() ){
                                       
                  precio_total = precio_total + precio_formacion;
                                          
               }//Fin Ciclo If
                                       
                                       
               if( tbtnAlimentacionBD.isSelected() ){
                                         
                  precio_total = precio_total + precio_alimen;
              
               }//Fin Ciclo If
                                       
            etiTotal.setText( precio_total + "$");
            
         }//Fin Action Performed
            
      });//Fin ACtion Listener
      
      getContentPane().add( btnLimpiar );
      btnLimpiar.setBounds( 110, 270, 90, 20 );
      
      
      btnLimpiar.addActionListener( new ActionListener() {
         
         public void actionPerformed( ActionEvent evt ) {
                            
            txtPrecioBase.setText( null );
            etiTotal.setText( null );
            
         }//Fin Action performed
                              
      });//Fin Action Parametros ActionListener
      
      
      getContentPane().add( btnCerrar );
      btnCerrar.setBounds( 210, 270, 90, 20 );
        
        
      btnCerrar.addActionListener( new ActionListener() {
            
         public void actionPerformed( ActionEvent evt ) {
                              
                  System.exit(0);
                  
         }//Fin Action performed
                              
      });//Fin Action Parametros ActionListener
            
         
      getContentPane().add( tbtnInstalacion );
         tbtnInstalacion.setBounds( 270, 30, 120, 20 );
      
      getContentPane().add( tbtnFormacion );
         tbtnFormacion.setBounds( 270, 75, 120, 20 );
      
      getContentPane().add( tbtnAlimentacionBD );
         tbtnAlimentacionBD.setBounds( 270, 120, 120, 20 );
       
   }//Fin Metodo
   
   public static void main( String args[] ){
  
      PAOS07_ToggleButtons ventana = new PAOS07_ToggleButtons();
   
      ventana.show();
      ventana.setBackground(java.awt.Color.RED);
      ventana.setSize( 430, 350 );
      ventana.setDefaultCloseOperation( ventana.EXIT_ON_CLOSE);
      ventana.setVisible(true);
      
   }//Fin Main      
   
}//Fin Class