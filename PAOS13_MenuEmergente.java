/* 
 Programa: RaizMagica.cpp
 Descripcion: Calcula la raiz magica de un numero
 Autor: Osuna Sarmiento Patricia Amahirany
 Version: 12.09.2022
*/

//package


import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JMenuItem;



//Clase Diseño Menu Emergente
public class PAOS13_MenuEmergente extends javax.swing.JFrame {

   JPopupMenu menuEmergente = new javax.swing.JPopupMenu();
   JMenuItem menuRojo = new javax.swing.JMenuItem("Rojo");
   JMenuItem menuVerde = new javax.swing.JMenuItem("Verde");
   JMenuItem menuAzul = new javax.swing.JMenuItem("Azul");
    
   
   //Constructor 
   PAOS13_MenuEmergente() {
    
      super("E13pene");
		   metodo();
    
    }// Fin Constructor
    
    
    
   //Contenido del Diseño
   void metodo(){

      menuEmergente.addMouseListener(new java.awt.event.MouseAdapter(){});
      menuEmergente.add(menuRojo);
      menuEmergente.add(menuVerde);
      menuEmergente.add(menuAzul);


         menuRojo.addActionListener(new java.awt.event.ActionListener(){
        
            public void actionPerformed(java.awt.event.ActionEvent evt){
            
               menuRojoActionPerformed(evt);
            
            }//Fin ActionPerformed
            
         });//Fin Parametos ActionListener
         
         
        
         menuVerde.addActionListener(new java.awt.event.ActionListener() {
        
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            
               menuVerdeActionPerformed(evt);
            
            }//Fin ActionPerformed
            
         });//Fin Parametros ActionListener



          menuAzul.addActionListener(new java.awt.event.ActionListener() {
        
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            
               menuAzulActionPerformed(evt);
            
            }//Fin ActionPerformed

          });//Fin Parametros ActionListener
         
        
        
         addMouseListener(new java.awt.event.MouseAdapter() {
        
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            
               formMouseClicked(evt);
            
            }// Fin MouseClicked
            
         });// Fin MouseListener
         
         

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(layout.createParallelGroup
            (javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 400, Short.MAX_VALUE));
            
        layout.setVerticalGroup(layout.createParallelGroup
            (javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 300, Short.MAX_VALUE));
        pack();
        
   }//Fin Metodo


   private void formMouseClicked(java.awt.event.MouseEvent evt) {

      if (evt.getButton()==1) {
      
         JOptionPane.showMessageDialog(null,"Pulso el izquierdo");
            
      }//Fin Ciclo If
      
      
      else if (evt.getButton()==2) {
      
         JOptionPane.showMessageDialog(null,"Pulso el central");
         
      }//Fin Ciclo If
     
      
      else if (evt.getButton()==3) {
      
         menuEmergente.show(this,evt.getX(),evt.getY());
         
      }//Fin Ciclo If

   }//Fin MouseClicked


   private void menuRojoActionPerformed(java.awt.event.ActionEvent evt) {

        this.getContentPane().setBackground(Color.red);
        
    }//Fin ActionPerformed



    private void menuAzulActionPerformed(java.awt.event.ActionEvent evt) {

        this.getContentPane().setBackground(Color.blue);
        
    }//Fin ActionPerformed



   private void menuVerdeActionPerformed(java.awt.event.ActionEvent evt) {

        this.getContentPane().setBackground(Color.green);
        
    }//Fin ActionPerformed



   public static void main(String args[]) {
		
      PAOS13_MenuEmergente ventana = new PAOS13_MenuEmergente();
      
  		ventana.show();
 		ventana.setSize(450,200);
  		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
  		ventana.setVisible(true);
         
	}//Fin Main 
                       
}//Fin Class
        
