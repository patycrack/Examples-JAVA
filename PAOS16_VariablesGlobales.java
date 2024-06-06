/*
	@Program: VariablesGlobales.java
	@Descrption: Implementacion de variables globales
	@Author: Osuna Sarmiento Patricia Amahirany
	@Version: /10/2022
*/


//package



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;


//CLase Principal
public class PAOS16_VariablesGlobales extends javax.swing.JFrame {

    JLabel etiCoches = new JLabel("0");
    JLabel etiqueta = new JLabel( "Coches en el parking:" );
    JButton btnEntro = new JButton("Entro");
    JButton btnSalio = new JButton("Salio");
    JButton btnReiniciar = new JButton("Reiniciar");
    
    int coches;

     
   //Constructor
   public PAOS16_VariablesGlobales() {
      
      super("Variables Globales");  
         metodo();
         coches = 0;
    
   }//Fin Construcor



   //Contenido del Diseño
   public void metodo() {
        
      //Detalles de la ventana
   
      this.setLayout(null);
          
      //Creacion de la etiqueta contadora de coches
      etiCoches.setBounds( 200, 200, 100, 25 );
      etiCoches.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      etiCoches.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        
      //Crecion Etiqueta
      etiqueta.setBounds( 10, 200, 200, 25 );
      this.getContentPane().add( etiqueta );
        
      //Crecion de Botones      

      btnEntro.setBounds( 10, 20, 100, 25 );
      btnSalio.setBounds( 10, 60, 100, 25 );
      btnReiniciar.setBounds( 10, 100, 100, 25 );
      
      add( etiCoches );
      add( btnEntro );
      add( btnSalio );
      add( btnReiniciar );
        
     
      btnEntro.addActionListener( new ActionListener(){
      
         public void actionPerformed( ActionEvent evt ){ 
            
            btnEntroActionPerformed( evt );
            
         }//Fin ActionPerformed
         
      });//Fin Parametros ActionListener



      btnSalio.addActionListener( new ActionListener() {
            
         public void actionPerformed( ActionEvent evt ){
         
                btnSalioActionPerformed( evt );
                
         }//Fin ActionPerformed
         
      });//Fin Parametros ActionListener
    
    
    
      //Asignacion de evento al boton "Entro"
      btnReiniciar.addActionListener( new ActionListener() {
      
         public void actionPerformed( ActionEvent evt){
      
                btnReiniciarActionPerformed(evt);
                
         }//Fin ActionPerformed
         
      });//Fin Parametros ActionListener
            
   }//Fin Metodo

    
    
   public void btnEntroActionPerformed(ActionEvent evt){
   
      coches=coches+1;
      etiCoches.setText(""+coches);
      
   }//Fin ActionPerformed
        

   public void btnSalioActionPerformed(ActionEvent evt){
    
      if (coches > 0) {
      
         coches=coches-1;
         etiCoches.setText(""+coches);
            
      }//Fin Ciclo If
            
   }//Fin ActionPerformed
    


   public void btnReiniciarActionPerformed(ActionEvent evt){
    
      coches = 0;
      etiCoches.setText("0");
      
   }//Fin ActionPerformed
    
    
   
   public static void main(String args[]) {
    
    PAOS16_VariablesGlobales ventana = new PAOS16_VariablesGlobales();

    ventana.show();
    ventana.setSize( 400, 350 );
    ventana.setDefaultCloseOperation( ventana.EXIT_ON_CLOSE );     
    ventana.setVisible(true);
       
   }//Fin Main

}//Fin Class
