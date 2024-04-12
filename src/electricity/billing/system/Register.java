package electricity.billing.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Register extends JFrame implements ActionListener{
    
    JButton button1,button2;
    
    Register(){
         setTitle("Register");
         setSize(650,630);
         setLocation(430,90);
   
//       --------1st Image background----------

         ImageIcon background=new ImageIcon(ClassLoader.getSystemResource("icons/reg.jpg") );
         Image set1=background.getImage().getScaledInstance(750, 600, Image.SCALE_DEFAULT);
         ImageIcon i1=new ImageIcon(set1);
         JLabel image1=new JLabel(i1);
         add(image1);
         
//         --------2nd image logo with name--------------

         ImageIcon icon=new ImageIcon(ClassLoader.getSystemResource("icons/idea.png"));
         Image set2=icon.getImage().getScaledInstance(54, 54,Image.SCALE_DEFAULT);
         ImageIcon i2=new ImageIcon(set2);
         JLabel image2=new JLabel(i2);
         image2.setBounds(10, 11, 50, 50);
         image1.add(image2);
         JLabel headline=new JLabel("FBS");
         headline.setBounds(62, 14, 80, 40);
         headline.setFont(new Font("SAN SERIF",Font.BOLD,23));
         headline.setForeground(Color.white);
         image1.add(headline);
         
//         ---------------JLabel-----------------

         JLabel head=new JLabel("⚡ Register ⚡ :-");
         head.setBounds(90, 80, 500, 40);
         image1.add(head);
         head.setFont(new Font("SAN SERIF",Font.BOLD,29));
         head.setForeground(Color.BLACK);
            
//         --------------Text + Textfield-------------------

         JLabel label1=new JLabel("Create Account as:");
         label1.setBounds(90, 157, 150, 16);
         image1.add(label1);
         label1.setFont(new Font("SAN SERIF",Font.BOLD,16));
         label1.setForeground(Color.DARK_GRAY);
         
         Choice reg =new Choice();
         reg.add("Customer");
         reg.add("Admin");
         image1.add(reg);
         reg.setBounds(280, 155, 200, 21);
         reg.setBackground(Color.orange);
         
         JLabel label2=new JLabel("Meter No:");
         label2.setBounds(90, 228, 150, 16);
         image1.add(label2);
         label2.setFont(new Font("SAN SERIF",Font.BOLD,16));
         label2.setForeground(Color.DARK_GRAY);
         JTextField text1=new JTextField();
         image1.add(text1);
         text1.setBounds(280,227,199,20);
         text1.setBorder(null);
         
         JLabel label3=new JLabel("Username:");
         label3.setBounds(90, 298, 150, 16);
         image1.add(label3);
         label3.setFont(new Font("SAN SERIF",Font.BOLD,16));
         label3.setForeground(Color.DARK_GRAY);
         JTextField text2=new JTextField();
         image1.add(text2);
         text2.setBounds(280,297,199,20);
         text2.setBorder(null);
         
         JLabel label4=new JLabel("Name:");
         label4.setBounds(90, 365, 150, 16);
         image1.add(label4);
         label4.setFont(new Font("SAN SERIF",Font.BOLD,16));
         label4.setForeground(Color.DARK_GRAY);
         JTextField text3=new JTextField();
         image1.add(text3);
         text3.setBounds(280,364,199,20);
         text3.setBorder(null);
         
         JLabel label5=new JLabel("Password:");
         label5.setBounds(90, 425, 150, 16);
         image1.add(label5);
         label5.setFont(new Font("SAN SERIF",Font.BOLD,16));
         label5.setForeground(Color.DARK_GRAY);
         JPasswordField text4=new JPasswordField();
         image1.add(text4);
         text4.setBounds(280,424,199,20);
         text4.setBorder(null);
         
//         --------------Buttons-----------------

         button1=new JButton("Back");
         button1.setBounds(155, 504, 120, 25);
         button1.setBackground(Color.GRAY);
         button1.setForeground(Color.WHITE);
         button1.setFont(new Font("SAN SERIF",Font.BOLD,16));
         button1.addActionListener(this);
         button1.setBorder(null);
         image1.add(button1);
         
         button2=new JButton("Next");
         button2.setBounds(295, 504, 120, 25);
         button2.setBackground(Color.orange);
         button2.setForeground(Color.DARK_GRAY);
         button2.setFont(new Font("SAN SERIF",Font.BOLD,16));
         button2.addActionListener(this);
         button2.setBorder(null);
         image1.add(button2);  
         setVisible(true);
         setLayout(null);
            
         }
  
         public static void main(String args []){
         new Register();
         }

         @Override
         public void actionPerformed(ActionEvent e) {
  
         if(e.getSource()==button1){
         setVisible(false);
         new Login().setVisible(true);
         }
         else {
         setVisible(false);
         
         }
    
     }
 
}
