/* 
 Programa: FileChooser.java
 Descripcion: Abrir archivos
 Autor: Osuna Sarmiento Patricia Amahirany
 Version: 12.09.2022
*/


//package



import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;


//Clase Diseño File Chooser
public class PAOS14_FileChooser extends javax.swing.JFrame {

   JFileChooser elegirFichero = new javax.swing.JFileChooser();
   JMenuBar jMenuBar1 = new javax.swing.JMenuBar();
   JMenu menuArchivo = new javax.swing.JMenu("Archivo");
   JMenuItem menuAbrir = new javax.swing.JMenuItem("Abrir");
   JPopupMenu.Separator jSeparator1 = new javax.swing.JPopupMenu.Separator();
   JMenuItem menuItem = new javax.swing.JMenuItem("Salir");


   //Construsctor
   PAOS14_FileChooser() {
        
      super(" File Chooser ");
         metodo();
        
   }//Fin Constructor



   //Contenido del Diseño
   private void metodo() {

   setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
   menuAbrir.addActionListener(new java.awt.event.ActionListener() {
   
      public void actionPerformed(java.awt.event.ActionEvent evt) {
      
         menuAbrirActionPerformed(evt);
                
         }// Fin ActionPerformed
            
      });// Fin Parametros ActionListener
        
      menuArchivo.add(menuAbrir);
      menuArchivo.add(jSeparator1);
      menuArchivo.add(menuItem);
      jMenuBar1.add(menuArchivo);
      setJMenuBar(jMenuBar1);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
         getContentPane().setLayout(layout);
         
         layout.setHorizontalGroup(layout.createParallelGroup
            (javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 400, Short.MAX_VALUE));
            
         layout.setVerticalGroup(layout.createParallelGroup
            (javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 277, Short.MAX_VALUE));

        pack();
    
    }//Fin Metodo



   private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt){

      int resp;
 
         resp=elegirFichero.showOpenDialog(this);
 
            if (resp==JFileChooser.APPROVE_OPTION) {
              
               JOptionPane.showMessageDialog(null,elegirFichero.getSelectedFile().toString());
              
            }//Fin Ciclo If
              
            else if (resp==JFileChooser.CANCEL_OPTION) {
            
                JOptionPane.showMessageDialog(null,"Se Pulsa Para Cancelar"); 
                 
            }//Fin Ciclo If

     }//Fin ActionPerformed
    
  
  
   public static void main(String args[]) {
		
      PAOS14_FileChooser ventana = new PAOS14_FileChooser();
      
  		ventana.show();
 		ventana.setSize(450,200);
  		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
  		ventana.setVisible(true);
         
	}//Fin Main 
                       
}//Fin Class
        