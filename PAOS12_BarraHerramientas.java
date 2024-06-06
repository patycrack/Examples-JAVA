/**
 * @(#)BarraHerramientas.java
 * @Description: Muestra Iconos
 * @author: Osuna Sarmiento Patricia Amahirany
 * @version 1.00 19/10/2022
 */
 
 //package
 
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;


//Clase Diseño Barra Herramientas 
 public class PAOS12_BarraHerramientas extends JFrame {
 
   JMenuBar barraMenu = new JMenuBar();
   JMenu menuArchivo = new JMenu("Menu");
   JToolBar JTooB = new JToolBar();
   JButton btnImg1 = new JButton();
   JButton btnImg2 = new JButton();
   JButton btnImg3 = new JButton();
   JButton btnImg4 = new JButton();      
   JButton btnCerrar = new JButton(); 
   
   
   //Constructor
   PAOS12_BarraHerramientas() {
   
      super( "Barra De Herramientas" );
         metodo();
      
   }//Fin Construcor
   
   
   
   //Contenido del Diseño
   public void metodo() {
   
      getContentPane().setLayout( null );
         
      getContentPane().add( barraMenu );
         barraMenu.setBounds( 0, 0, 1900, 30 );
      barraMenu.add( menuArchivo );
      
      getContentPane().add( JTooB );
         JTooB.setBounds( 0, 30, 1000, 40);
         
      //Agregar Imagen Icon
      /* La carpeta de imagenes se crea dentro la carpeta de los archivos.*/   
      
      JTooB.add( btnImg1 );
         btnImg1.setIcon( new ImageIcon ( "Icons/hogar.png" ));
      
      JTooB.add( btnImg2 );
         btnImg2.setIcon( new ImageIcon ( "Icons/documento.png" ));
      
      JTooB.add( btnImg3 );
         btnImg3.setIcon( new ImageIcon ( "Icons/editar.png" ));
      
      JTooB.add( btnImg4 );
         btnImg4.setIcon( new ImageIcon ( "Icons/mas.png" )); 
      
      JTooB.add( btnCerrar );
          btnCerrar.setIcon( new ImageIcon ( "Icons/cruz.png" ));
      
      
      
      btnCerrar.addActionListener( new ActionListener() {
                           
         public void actionPerformed( ActionEvent evt ) {
                              
                              System.exit(0);
         }//Fin Action Performed
                           
      });//Fin Parametros ActionListener
             
   }//Fin Metodo
   
   
   
   public static void main( String args[] ){
   
   PAOS12_BarraHerramientas ventana = new PAOS12_BarraHerramientas();
   
      ventana.show();
      ventana.setBackground( java.awt.Color.BLUE );
     	ventana.setSize(450,200);
      ventana.setDefaultCloseOperation( ventana.EXIT_ON_CLOSE );
      ventana.setVisible( true );   
      
   }//Fin Main
   
 }//Fin Class