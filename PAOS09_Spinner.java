/**
 * @(#)Spinner.java
 * @Description: Incrementa Spinner
 * @author: Osuna Sarmiento Patricia Amahirany
 * @version 1.00 2022/10/17
 */
   
   
//package 



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Locale;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



//Class Diseño Spinner
public class PAOS09_Spinner extends JFrame {
   
   JSpinner spiValor = new JSpinner();
   JLabel etiValor = new JLabel();
   
   
   //Constructor
	PAOS09_Spinner() {
		
		super("Spinner");
		   metodo();
      
  	} //Fin Constructor
   
   
   
   // Contenido del diseño 
   void metodo (){
 
      this.setLayout(null);
	      
		etiValor.setBounds( 30, 210, 100, 20 );
      etiValor.setBorder( BorderFactory.createLineBorder( Color.black ) );
      spiValor.setBounds( 30, 100, 100, 20 );
      	
		add(etiValor);
		add(spiValor);
		
      
      //Creacion de botones
      ChangeListener listener = new ChangeListener() {
      
      
         public void stateChanged(ChangeEvent e) {
            etiValor.setText("El valor es: "+spiValor.getValue().toString());
            
         }//Fin StateChanged
         
      };//Fin Parametros ChangeListener

      spiValor.addChangeListener(listener);
      
   }//Fin Metodo
   
   
   
   public static void main(String args[]) {
		
		PAOS09_Spinner ventana = new PAOS09_Spinner();
		
		ventana.show();
		ventana.setBackground(java.awt.Color.blue);
		ventana.setSize(400,300);
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
	}//Fin Main
   
}//Fin Class