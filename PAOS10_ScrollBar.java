/**
 * @(#)Scrollbar.java
 * @Description: Muestra Scroll
 * @author: Osuna Sarmiento Patricia Amahirany
 * @version 1.00 2022/10/18
 */
   
   
//package 



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



//Class-Diseño de ScrollBar
public class PAOS10_ScrollBar extends JFrame {
   
   
	JLabel lblLabel = new JLabel("ScrollBar");
	JLabel etiValor = new JLabel();
   JScrollBar desValor = new JScrollBar(Adjustable.HORIZONTAL);


   //Constructor
   PAOS10_ScrollBar(){
		
		super("ScrollBar");
		   metodo();
      
  	}//Fin Constructor
   
   
   
   // Contenido del diseño 
	void metodo(){
	     
		this.setLayout(null);
	         
		lblLabel.setBounds(5,5,150,20);
		etiValor.setBounds(170,110,200,10);
		desValor.setBounds(110,80,200,20);
      
      desValor.setBlockIncrement(20);
      desValor.setMaximum(150);
      desValor.setMinimum(50);
      desValor.setUnitIncrement(2);
      desValor.setVisibleAmount(5);
					
		add(lblLabel);
		add(etiValor);
		add(desValor); 
      
      desValor.addAdjustmentListener(new AdjustmentListener() {    
      
      
         public void adjustmentValueChanged(AdjustmentEvent e) {  
        
            etiValor.setText("El valor es: " + desValor.getValue());  
         
          }//Fin adjustmentValueChanged    
          
       });// Fin Parametros AdjustmentListener
         
   }//Fin Metodo 
   
   
          
   public static void main(String args[]) {
		
      PAOS10_ScrollBar ventana = new PAOS10_ScrollBar();
   	
      ventana.show();
   	ventana.setSize(450,200);
   	ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
   	ventana.setVisible(true);
		
	} //Fin Main 
                       
}//Fin Class
