//Sedano Acosta Martha Elizabeth   N°/C: 19290949     4A
import javax.swing.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {
    
   private JButton btnsuma, btnresta, btnmulti, btndiv, btnlimpiar, btnsalir;
   private JTextField valor1,valor2,camporesultado;
   JLabel label1,label2;
  
   public void Controles(){
      this.getContentPane().setBackground(Color.gray);
      Container contenedor = getContentPane();
      contenedor.setLayout( new FlowLayout());
      label1 = new JLabel("Digito 1: ");
      contenedor.add(label1);
      valor1 = new JTextField(10);
      contenedor.add(valor1);
      
      label2 = new JLabel("Digito 2: ");
      contenedor.add(label2);
      valor2 = new JTextField(10);
      contenedor.add(valor2);
      
      btnsuma = new JButton("+");
      contenedor.add(btnsuma);
      btnsuma.setBackground(Color.pink);
      btnsuma.addActionListener(this);
      
      btnresta = new JButton("-");
      contenedor.add(btnresta);
      btnresta.setBackground(Color.pink);
      btnresta.addActionListener(this);
      
      btnmulti = new JButton("x");
      contenedor.add(btnmulti);
      btnmulti.setBackground(Color.pink);
      btnmulti.addActionListener(this);
      
      btndiv = new JButton("÷");
      btndiv.addActionListener(this);
      btndiv.setBackground(Color.pink);
      contenedor.add(btndiv);
      
      camporesultado = new JTextField(10);
      contenedor.add(camporesultado);
      btnlimpiar = new JButton("Borrar");
      contenedor.add(btnlimpiar);
      
      btnlimpiar.addActionListener(this);
      btnsalir = new JButton("Salir");
      btnsalir.setBackground(Color.red);
      contenedor.add(btnsalir);
      btnsalir.addActionListener(this);
   }
  
   public Calculadora()
   {
      super("Calculadora");
      Controles();
      setSize(370,150);
      setLocationRelativeTo(null);
      setVisible(true);
   }
  
   public void actionPerformed(ActionEvent e) {
      double  num1,num2,resu;
      String resultado;
         if (e.getSource()==btnsuma) {
         if(valor1.getText().equals("") || valor2.getText().equals(""))
         {
            JOptionPane.showMessageDialog(null, "Favor de ingresar el dato faltante",
            "Error",JOptionPane.WARNING_MESSAGE); 
         }
         else
         {
            num1=Double.parseDouble(valor1.getText());
            num2=Double.parseDouble(valor2.getText());
            resu=num1+num2;
            resultado=String.valueOf(resu);
            camporesultado.setText(resultado);
         }          
        }
        if (e.getSource()==btnresta) 
        {
         if(valor1.getText().equals("") || valor2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Favor de ingresar el dato faltante",
            "Error",JOptionPane.ERROR_MESSAGE); 
         }
         else{
            num1=Double.parseDouble(valor1.getText());
            num2=Double.parseDouble(valor2.getText());
            resu=num1-num2;
            resultado=String.valueOf(resu);
            camporesultado.setText(resultado);
         }          
        } 
        if (e.getSource()==btnmulti) 
        {
            if(valor1.getText().equals("") || valor2.getText().equals(""))
            {
               JOptionPane.showMessageDialog(null, "Favor de ingresar el dato faltante",
               "Error",JOptionPane.ERROR_MESSAGE); 
            }
            else{
               num1=Double.parseDouble(valor1.getText());
               num2=Double.parseDouble(valor2.getText());
               resu=num1*num2;
               resultado=String.valueOf(resu);
               camporesultado.setText(resultado);
            }          
        }
        if (e.getSource()==btndiv) 
        {
            if(valor1.getText().equals("") || valor2.getText().equals(""))
            {
               JOptionPane.showMessageDialog(null, "Favor de ingresar el dato faltante",
               "Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
               num1=Double.parseDouble(valor1.getText());
               num2=Double.parseDouble(valor2.getText());
            try
            {
               resu=num1/num2;
               resultado=String.valueOf(resu);
               camporesultado.setText(resultado);
            }
            catch(ArithmeticException ex){
            JOptionPane.showMessageDialog(null, "No es posible dividir entre 0",
            "Error",JOptionPane.ERROR_MESSAGE);
            }
           
            }  
        }
        
        if (e.getSource()==btnlimpiar)
        {
            valor1.setText("");
            valor2.setText("");
            camporesultado.setText("");
        } 
        if(e.getSource()==btnsalir)
        {
         System.exit(0);   
        }
    }
     
    public static void main(String[] args) {
      JFrame.setDefaultLookAndFeelDecorated(true);
      Calculadora calcu = new Calculadora();
      calcu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}