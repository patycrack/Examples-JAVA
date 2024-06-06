/*
   @Program: E20_Dialogos.java
   @Description: Dialogos
   @Author: Osuna Sarmiento Patricia Amahirany
   @Version: 1.00 18/10/2022
*/


//packge



import javax.swing.*;
import java.awt.event.*;


//Class Diseño Dialogos
public class PAOS20_Dialogos extends JFrame{

   JLabel etiUnidades = new JLabel();
   JLabel etiPrecio = new JLabel();
   JLabel etiEtiquetaTotal = new JLabel();
   JLabel etiTotal = new JLabel();
   JTextField txtUnidades = new JTextField();
   JTextField txtPrecio = new JTextField();
   JButton btnCalcular = new JButton();
   JButton btnConfiguracion = new JButton();
   JPanel jPanel1 = new JPanel();
   
   //Componentes JDialog
   JDialog dialogoConfiguracion = new JDialog();
   JLabel etiIva = new JLabel();
   JLabel etiDescuento = new JLabel();
   JTextField txtIva = new JTextField();
   JTextField txtDescuento = new JTextField();
   JButton btnAceptar = new JButton();
   JButton btnCancelar = new JButton();

   double iva;
   double descuento;

   
   
   //Constructor
   PAOS20_Dialogos(){
		
	   super("Dialogos");
      
         iva=0;
         descuento=0;
		   metodo();
		
   }//Fin Constructor
      
      
   //Creacion de Diseño   
	void metodo(){
      //Componentes Ventana Principal
		getContentPane().setLayout(null);
		getContentPane().add(etiUnidades);
      getContentPane().add(etiPrecio);
      getContentPane().add(etiEtiquetaTotal);
      getContentPane().add(etiTotal);
      getContentPane().add(txtUnidades);
      getContentPane().add(txtPrecio);
      getContentPane().add(btnCalcular);
      getContentPane().add(btnConfiguracion);
		etiUnidades.setBounds(20, 20, 180, 20);
      etiPrecio.setBounds(20, 50, 180, 20);
      etiEtiquetaTotal.setBounds(20, 80, 180, 20);
      etiTotal.setBounds(80, 80, 180, 20);
      txtUnidades.setBounds(80, 20, 180, 20);
      txtPrecio.setBounds(80, 50, 180, 20);
      btnCalcular.setBounds(20, 120, 90, 20);
      btnConfiguracion.setBounds(120, 120, 125, 20);
      
      etiUnidades.setText( "Unidades:" );
      etiPrecio.setText( "Precio:" );
      etiEtiquetaTotal.setText( "Total" );
      etiTotal.setText( "0" );
      btnCalcular.setText( "Calcular" );
      btnConfiguracion.setText("Configuracion..." );
      
      //Componentes JDialog
      
      dialogoConfiguracion.add(etiIva);
      dialogoConfiguracion.add(etiDescuento);
      dialogoConfiguracion.add(txtIva);
      dialogoConfiguracion.add(txtDescuento);
      dialogoConfiguracion.add(btnAceptar);
      dialogoConfiguracion.add(btnCancelar);
      
		etiIva.setBounds(10, 10, 40, 15);
      etiDescuento.setBounds(10, 40, 80, 15);
      txtIva.setBounds(100, 10, 100, 20);
      txtDescuento.setBounds(100, 40, 100, 20);
      btnAceptar.setBounds(20, 120, 90, 20);
      btnCancelar.setBounds(120, 120, 90, 20);
      
      etiIva.setText( "Iva%:" );
      etiDescuento.setText( "Descuento:" );
      btnAceptar.setText( "Aceptar" );
      btnCancelar.setText( "Cancelar" );
      
      //Componentes 
		jPanel1.setBorder( javax.swing.BorderFactory.createTitledBorder(null, "Colores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
         javax.swing.border.TitledBorder.DEFAULT_POSITION,
         
         new java.awt.Font("Tahoma", 0, 11),
         new java.awt.Color(0, 51, 204))); // NOI18N
		jPanel1.setLayout(null);
      
	
		btnConfiguracion.addActionListener( new ActionListener() {
		     						
		   public void actionPerformed(ActionEvent e) {
         
   		   dialogoConfiguracion.setLayout( null );
            dialogoConfiguracion.setSize(300,300);
            dialogoConfiguracion.setLocation(0,0);
            dialogoConfiguracion.setVisible(true);

		   } // Fin ActionPerformed
		     						
      });//Fin Parametros ActionListener
      
      
      
      btnCalcular.addActionListener( new ActionListener() {
		     						
		   public void actionPerformed(ActionEvent e) {
   		   
            double unidades;
            double precio;
            double total; //total
            double cantiva; //cantidad iva
            double cantdes; //cantidad descuento
            double totalsiniva; //total sin iva
   
            //Recojo los datos de los cuadros de textos (convirtiendolos a números)
            unidades = Double.parseDouble(txtUnidades.getText());
            precio = Double.parseDouble(txtPrecio.getText());
   
            //Calculo el total sin iva, la cantidad de iva y la cantidad de descuento
            totalsiniva=precio*unidades;
            cantiva=totalsiniva*iva/100;
            cantdes=totalsiniva*descuento/100;
   
            //Ahora calculo el precio total:
            total = totalsiniva+cantiva-cantdes;
   
            //Coloco el total en la etiqueta:
            etiTotal.setText(""+total);


		   } //Fin ActionPerformed
		     						
      });//Fin Parametros ActionListener
      
      
      
      btnCancelar.addActionListener( new ActionListener() {
		     						
		   public void actionPerformed(ActionEvent e) {
   		   
            dialogoConfiguracion.dispose();


		   } // Fin ActionPerformed
		     						
      });//Fin ActionListener
      
      
       
      btnAceptar.addActionListener( new ActionListener() {
		     						
		   public void actionPerformed(ActionEvent e) {
   		   
            iva = Double.parseDouble(txtIva.getText());
            descuento=Double.parseDouble(txtDescuento.getText());
            dialogoConfiguracion.dispose();

		   } // Fin ActionPerformed
		     						
      });//Fin Parametros ActionListener
         
   }// fin-metodo
              
      
      
	public static void main(String args[]) {
	
		PAOS20_Dialogos ventana = new PAOS20_Dialogos();
		
		ventana.show();
		ventana.setBackground(java.awt.Color.blue);
		ventana.setSize(400,300);
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
	}//Fin Main
         
}//Fin Class