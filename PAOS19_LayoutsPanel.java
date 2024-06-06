/*
   @Program: E19LayoutsPanel.java
   @Description: Layouts y paneles
   @Author: Osuna Sarmiento Patricia Amahirany
   @Version: 1.00 18/10/2022
*/


//package



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


//Class Diseño de LayoutsPanel
public class PAOS19_LayoutsPanel extends JFrame{
   
   JPanel panelTitulo = new JPanel();
   JPanel panelDatos = new JPanel(null);
   JPanel panelEstado = new JPanel();
   JPanel panelVerificacion = new JPanel();
   JPanel panelBotonera = new JPanel();
   JPanel panelEtiqueta1 = new JPanel();
   JPanel panelEtiqueta2 = new JPanel();
   JPanel panelCuadro1 = new JPanel();
   JPanel panelCuadro2 = new JPanel();
   JButton btn1 = new JButton("Boton 1");
   JButton btn2 = new JButton("Boton 2");
   JButton btn3 = new JButton("Boton 3");
   JButton btn4 = new JButton("Boton 4");
   JLabel lbl1 = new JLabel("Ejercicio de Distribucion de Paneles y Layout");
   JLabel lbl2 = new JLabel("Por Alfredo"); /* AQUI NOMBRE CAMBIARx  */
   JLabel lblDato1 = new JLabel("Dato 1:");
   JLabel lblDato2 = new JLabel("Dato 2:");
   JLabel jLabel2 = new JLabel("jLabel2");
   JLabel jLabel3 = new JLabel("jLabel3");
   JLabel jLabel4 = new JLabel("jLabel4");
   JTextField txtCuadro1 = new JTextField();
   JTextField txtCuadro2 = new JTextField();
   JCheckBox chk1 = new JCheckBox("CheckBox 1");
   JCheckBox chk2 = new JCheckBox("CheckBox 2");
   JCheckBox chk3 = new JCheckBox("CheckBox 3");
   JCheckBox chk4 = new JCheckBox("CheckBox 4");
   
   
   //Constructor
   PAOS19_LayoutsPanel(){
   
      super("LayoutsPanel");
         metodo();

   }//Fin Constructor
   
   
   
   //Contenido del Diseño
   void metodo(){
      
      panelDatos.setLayout(new GridLayout(2,2));
      panelCuadro1.setLayout(null);
      panelCuadro2.setLayout(null);
      panelBotonera.setLayout(null);
      panelVerificacion.setLayout(null);
      
      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(panelEstado);
      panelEstado.setLayout(layout);
        
         //SetHorizontalGroup
         layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
               .addContainerGap(315, Short.MAX_VALUE)
               
               .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               
               .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               
               .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addContainerGap())
               
         );//Fin SetHorizontallGroup
        
                
        //SetVerticalGroup
         layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                    
            .addGap(27, 27, 27))
                
         );//Fin SetVerticalGroup
      
      //Botones
      btn1.setBounds(40,40,80,20);
      btn2.setBounds(40,80,80,20);
      btn3.setBounds(40,120,80,20);
      btn4.setBounds(40,160,80,20);
      
      //chkBox
      chk1.setBounds(1200,20,120,20);
      chk2.setBounds(1200,60,120,20);
      chk3.setBounds(1200,100,120,20);
      chk4.setBounds(1200,140,120,20);
      
      //TextField
      txtCuadro1.setBounds(0,2,100,20);
      txtCuadro2.setBounds(0,2,100,20);
      
      //Panel
      panelTitulo.add(lbl1);
      panelTitulo.add(lbl2);
      
      getContentPane().add(panelBotonera.add(btn1));
      getContentPane().add(panelBotonera.add(btn2));
      getContentPane().add(panelBotonera.add(btn3));
      getContentPane().add(panelBotonera.add(btn4));
      getContentPane().add(panelVerificacion.add(chk1));
      getContentPane().add(panelVerificacion.add(chk2));
      getContentPane().add(panelVerificacion.add(chk3));
      getContentPane().add(panelVerificacion.add(chk4));

      panelDatos.add(panelEtiqueta1);
      panelEtiqueta1.add(lblDato1);
      panelDatos.add(panelCuadro1);
      panelCuadro1.add(txtCuadro1);
      panelDatos.add(panelEtiqueta2);
      panelEtiqueta2.add(lblDato2);
      panelDatos.add(panelCuadro2);
      panelCuadro2.add(txtCuadro2);
      
      getContentPane().add(panelTitulo, BorderLayout.NORTH);
      getContentPane().add(panelDatos, BorderLayout.CENTER);
      getContentPane().add(panelEstado, BorderLayout.SOUTH);
      getContentPane().add(panelBotonera, BorderLayout.WEST);
      getContentPane().add(panelVerificacion, BorderLayout.EAST);
      
   }
   
   
   public static void main(String args[]) {
		
		PAOS19_LayoutsPanel ventana = new PAOS19_LayoutsPanel();
		
		ventana.show();
		ventana.setBackground(java.awt.Color.blue);
		ventana.setSize(400,250);
		ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
	}//Fin Main

}//Fin Class