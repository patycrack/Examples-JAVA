/**
 * @(#)JScrollPane_02.java
 * @Description: Scroll con Texto
 * @author: Osuna Sarmiento Patricia Amahirany
 * @version 1.00 2022/10/18
 */
   
   
//package 



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



//Class-JScrollPane
public class PAOS15_JScrollPane_02 extends JFrame {
   
    JLabel jLabel1 = new JLabel();
    JScrollPane scpDatos = new JScrollPane();
    JPanel panelDatos = new JPanel();
    JLabel jLabel2 = new JLabel( "Panel de Datos");
    JLabel jLabel3 = new JLabel( "Lunes" );
    JLabel jLabel4 = new JLabel( "Martes" );
    JLabel jLabel5 = new JLabel( "Miércoles" );
    JLabel jLabel6 = new JLabel( "Jueves" );
    JLabel jLabel7 = new JLabel( "Viernes" );
    JLabel jLabel8 = new JLabel( "Sábado" );
    JLabel jLabel9 = new JLabel( "Domingo" );
    JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JTextField jTextField3 = new JTextField();
    JTextField jTextField4 = new JTextField();
    JTextField jTextField5 = new JTextField();
    JTextField jTextField6 = new JTextField();
    JTextField jTextField7 = new JTextField();
       
       
    //Constructor    
    PAOS15_JScrollPane_02() {
    
      super( "Scroll Desplazamiento" );
        
         metodo();
         setLocationRelativeTo(null);
        
    }//Fin-Constructor
                    
                    
                    
    //Contenido del Diseño                     
    private void metodo() {
                                         
      GroupLayout panelDatosLayout = ( new GroupLayout(panelDatos) );
      panelDatos.setLayout( panelDatosLayout );
        
      panelDatosLayout.setHorizontalGroup( panelDatosLayout.createParallelGroup( GroupLayout.Alignment.LEADING ).addGroup( panelDatosLayout.createSequentialGroup()
         .addContainerGap().addGroup(panelDatosLayout.createParallelGroup( GroupLayout.Alignment.LEADING ).addComponent( jLabel2 ).addGroup( panelDatosLayout.createParallelGroup( GroupLayout.Alignment.TRAILING, false )
         .addGroup( GroupLayout.Alignment.LEADING, panelDatosLayout.createSequentialGroup().addComponent( jLabel9 ).addPreferredGap( LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
            .addComponent( jTextField7, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE ) ).addGroup( GroupLayout.Alignment.LEADING, panelDatosLayout.createSequentialGroup()
            .addComponent( jLabel8 ).addPreferredGap( LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ).addComponent( jTextField6, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
         .addGroup( GroupLayout.Alignment.LEADING, panelDatosLayout.createSequentialGroup().addComponent( jLabel7 ).addPreferredGap( LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
            .addComponent( jTextField5, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE ) ).addGroup( GroupLayout.Alignment.LEADING, panelDatosLayout.createSequentialGroup().addComponent( jLabel6 )
            .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ).addComponent( jTextField4, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE ) )
         .addGroup( GroupLayout.Alignment.LEADING, panelDatosLayout.createSequentialGroup().addComponent( jLabel5 ).addPreferredGap( LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
            .addComponent( jTextField3, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE ) ).addGroup( GroupLayout.Alignment.LEADING, panelDatosLayout.createSequentialGroup().addComponent( jLabel4 )
            .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ).addComponent( jTextField2, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE ) )
         .addGroup( GroupLayout.Alignment.LEADING, panelDatosLayout.createSequentialGroup().addComponent( jLabel3 ).addGap( 47, 47, 47 ).addComponent( jTextField1, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE) ) ) )
        
         .addContainerGap( 111, Short.MAX_VALUE ) ) );
        
      panelDatosLayout.setVerticalGroup( panelDatosLayout.createParallelGroup( GroupLayout.Alignment.LEADING ).addGroup( panelDatosLayout.createSequentialGroup().addContainerGap().addComponent( jLabel2 ).addGap( 18, 18, 18 )
         .addGroup(panelDatosLayout.createParallelGroup( GroupLayout.Alignment.BASELINE ).addComponent( jLabel3 ).addComponent( jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE ) )
         .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED ).addGroup( panelDatosLayout.createParallelGroup( GroupLayout.Alignment.BASELINE ).addComponent( jLabel4 ).addComponent( jTextField2,GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE ) )
         .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED ).addGroup( panelDatosLayout.createParallelGroup( GroupLayout.Alignment.BASELINE ).addComponent( jLabel5).addComponent( jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE ) )
         .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED ).addGroup( panelDatosLayout.createParallelGroup( GroupLayout.Alignment.BASELINE ).addComponent( jLabel6).addComponent( jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE ) )
         .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED ).addGroup( panelDatosLayout.createParallelGroup( GroupLayout.Alignment.BASELINE ).addComponent( jLabel7).addComponent( jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE ) )
         .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED ).addGroup( panelDatosLayout.createParallelGroup( GroupLayout.Alignment.BASELINE ).addComponent( jLabel8).addComponent( jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE ) )
         .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED ).addGroup( panelDatosLayout.createParallelGroup( GroupLayout.Alignment.BASELINE ).addComponent( jLabel9).addComponent( jTextField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE ) )
         
         .addContainerGap( 104, Short.MAX_VALUE ) ) );

      scpDatos.setViewportView( panelDatos );

      GroupLayout layout = new GroupLayout( getContentPane() );
         getContentPane().setLayout( layout );
        
         layout.setHorizontalGroup( layout.createParallelGroup( GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addComponent( jLabel1 )
         .addGap( 0, 0, Short.MAX_VALUE ) ).addComponent( scpDatos, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE ) ).addContainerGap() ) );
        
         layout.setVerticalGroup( layout.createParallelGroup( GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addContainerGap().addComponent( jLabel1 ).addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED).addComponent(scpDatos, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE )
         .addContainerGap() ) );
        
    }//Fin Metodo                     



   public static void main(String args[]) {
    
      PAOS15_JScrollPane_02 ventana = new PAOS15_JScrollPane_02();
      
      ventana.show();
      ventana.setBackground( java.awt.Color.BLUE );
      ventana.setSize( 300, 300 );
      ventana.setDefaultCloseOperation( ventana.EXIT_ON_CLOSE );
      ventana.setVisible( true );
      
   }//Fin-Main   
    
}//Fin-class E15JScrollPa