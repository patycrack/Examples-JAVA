/**
 * @(#)Sliders.java
 * @Description: Desliza Barra
 * @author: Osuna Sarmiento Patricia Amahirany
 * @version 1.00 2022/10/18
 */
   
   
//package 



import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.*;
import java.awt.*;



// class-Dise%o Sliders 
public class PAOS08_Sliders extends JFrame {
   
   JSlider slDeslizador = new JSlider ();
   JLabel etiValor = new JLabel();
   
   //Constructor
	PAOS08_Sliders() {
		
		super("Combo modelo");
		   metodo();
      
  	} //Fin Constructor
   
   
   
   // Contenido del diseño
   void metodo (){
    
      this.setLayout(null);
	      
		etiValor.setBounds(75,150,200,20);
      etiValor.setBorder(BorderFactory.createLineBorder( Color.black ) );

		slDeslizador.setBounds(25,75,300,50);
      slDeslizador.setMajorTickSpacing(50);
      slDeslizador.setMaximum( 500 );
      slDeslizador.setMinimum( 100 );
      slDeslizador.setPaintLabels( true );
      slDeslizador.setPaintTicks( true );
      
      
		add(etiValor);
		add(slDeslizador);
      
      //Creacion Botones
      ChangeListener listener = new ChangeListener() {
      
      
         public void stateChanged(ChangeEvent e) {
            etiValor.setText("El valor es: "+slDeslizador.getValue());
         }
         
      };//Fin ChangeListener

      slDeslizador.addChangeListener(listener);
      
	}//Fin Metodo
   
   
      
   public static void main(String args[]) {
		
		PAOS08_Sliders ventana = new PAOS08_Sliders();
		
		ventana.show();
		ventana.setBackground(java.awt.Color.blue);
		ventana.setSize(400,300);
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
	}//Fin Main
   
}//Fin Class