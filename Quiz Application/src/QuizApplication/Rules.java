/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApplication;
import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Rules extends JFrame implements ActionListener{
    String name;
    JButton bac , start;
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        setSize(800,650);
        setLocation(580 , 150);
        setVisible(true);  
        
        JLabel heading = new JLabel("Welcome "+ name +" To Simple Minds"); // wheading
        heading.setBounds(50 , 20 , 700 , 30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(Color.BLUE); // new Color(30 , 45 , 78 , 30)
        add(heading); 
        
        JLabel rules = new JLabel(); // rules
        rules.setBounds(20 , 90 , 700 , 350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
       rules.setForeground(Color.BLACK); // new Color(30 , 45 , 78 , 30)
       // set rules
       rules.setText(
             "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
       
       );
        add(rules); 
        
        // buttons
        bac = new JButton("Back"); // back button
        bac.setBounds(250,500,120,30);
        bac.setBackground(new Color(30 , 144 , 254  ));
        bac.setForeground(Color.WHITE);
        bac.addActionListener(this);
        add(bac);
        
        start = new JButton("Start");  // rules button
        start.setBounds(400,500,120,30);
        start.setBackground(new Color(30 , 144 , 254  ));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
      
    }
    public static void main(String[] args) {
        new Rules("User");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==start){
            setVisible(false);
            new Quiz(name);
        }
        else{
            setVisible(false);
            new Login();
        }
    }
}
