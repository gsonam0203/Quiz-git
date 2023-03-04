/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Score extends JFrame implements ActionListener {
    Score(String name , int score){
        setBounds(400 , 150, 750 , 550) ;
       setVisible(true);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png")); // set icon on frame
        Image i2 = i1.getImage().getScaledInstance(300 , 250 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel  img1 = new JLabel(i3);
        img1.setBounds(0, 200 , 300 ,250); // left top l b
        add(img1);
        
       JLabel heading = new JLabel("Thank You "+name+" for playing Simple Minds "); // qws no
       heading.setBounds(45 , 30 , 700 , 30);
       heading.setFont(new Font("Tahoma" , Font.PLAIN , 28));
        add(heading);
        
       JLabel scr = new JLabel("Your Score  Is : "+score); // qws no
      scr.setBounds(350 ,200 ,300 , 30);
      scr.setFont(new Font("Tahoma" , Font.PLAIN , 28));
        add(scr);
        
         JButton submit = new JButton("Play Again");
        submit.setBounds(380 , 270  ,120 , 30);
       // submit.setFont(new Font("Tahoma",Font.PLAIN ,22));
        submit.setBackground(new Color(30 , 144 , 250)); // new Color(30 , 45 , 78 , 30)
        submit.setForeground(Color.WHITE);
        //submit.setEnabled(false);
        submit.addActionListener(this);
        add( submit);
    
        setVisible(true);
        
    }
    public static void main(String[] args) {
        new Score("user" , 0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        setVisible(false);
        new Login();
    }
 
}
