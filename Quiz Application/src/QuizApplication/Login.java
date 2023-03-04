/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApplication;
import java.awt.Color;
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton rules , back;
      JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);  // to change bg of panel from greey to white or any color
        setLayout(null); // to set your size for image icon by default it is center
        setSize(1200 , 500 );  // setSize( length , width)
        setLocation(350  , 250);   // (left , top)
        setVisible(true); // so that frame is seeen 
        
        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg")); // set icon on frame
        JLabel  img = new JLabel(ic);
        img.setBounds(0,0,600,500); // left top l b
        add(img);
       
        JLabel heading = new JLabel("Simple Minds"); // wid the hlp of JLbel we write text on frame
        heading.setBounds(750 , 60 , 300 , 45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(Color.BLUE); // new Color(30 , 45 , 78 , 30)
        add(heading);  
        
        JLabel name = new JLabel("Enter Your Name"); // wid the hlp of JLbel we write text on frame --------enter your name
        name.setBounds(810 , 150 , 300 , 20);
        name.setFont(new Font("sarif",Font.BOLD,18));
        name.setForeground(Color.BLUE); // new Color(30 , 45 , 78 , 30)
        add(name);  
        
        tfname = new JTextField(); // text field
        tfname.setBounds(750 , 200 , 300 , 25);
        tfname.setFont(new Font("Times New Roman " , Font.BOLD , 20));
        add(tfname);
        
        rules = new JButton("Rules");  // rules button
        rules.setBounds(750,270,120,25);
        rules.setBackground(new Color(30 , 144 , 254  ));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back"); // back button
        back.setBounds(925,270,120,25);
        back.setBackground(new Color(30 , 144 , 254  ));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
    
    
    }
  
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         if(ae.getSource()==rules){
               String name = tfname.getText();
                setVisible(false);
                new Rules(name);
              
            }
            else if(ae.getSource()==back){
                setVisible(false);
            }
    }

    public static void main(String[] args) {
        new Login();
    }


}
 