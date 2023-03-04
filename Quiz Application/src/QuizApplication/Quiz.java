/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuizApplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;


public class Quiz  extends JFrame implements ActionListener {
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    JLabel qn , q;
    JRadioButton opn1 , opn2 , opn3 , opn4;
     ButtonGroup group;
    String userans[][] = new String[10][1];
     JButton submit , next , lifeline ;
     public static int score = 0;
    public static int timer = 15;
    public static int given_ans = 0;
    public static int count=0;
    String name;
    Quiz(String name){
        this.name = name;
       setBounds(50 , 0 , 1440 , 850) ;
       setVisible(true);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg")); // set icon on frame
        JLabel  img1 = new JLabel(i1);
        img1.setBounds(0, 0 , 1440 ,352); // left top l b
        add(img1);
        
        qn = new JLabel(); // qws no
        qn.setBounds(100 , 450 , 50 , 30);
        qn.setFont(new Font("Tahoma" , Font.PLAIN , 28));
        add(qn);
        
        q = new JLabel(); // question
        q.setBounds(150 , 450 , 900 , 30);
        q.setFont(new Font("Tahoma" , Font.PLAIN , 28));
        add(q);
        
        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";
        
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";
        
       opn1 = new  JRadioButton();
        opn1.setBounds(170 , 520 , 700 , 30);
        opn1.setFont(new Font("Dialog",Font.PLAIN ,20));
        opn1.setBackground(Color.WHITE); // new Color(30 , 45 , 78 , 30)
        add(opn1);
        
      opn2 = new  JRadioButton();
        opn2.setBounds(170 , 560 , 700 , 30);
        opn2.setFont(new Font("Dialog",Font.PLAIN ,20));
        opn2.setBackground(Color.WHITE); // new Color(30 , 45 , 78 , 30)
        add(opn2);
        
          opn3 = new  JRadioButton();
        opn3.setBounds(170 , 600 , 700 , 30);
        opn3.setFont(new Font("Dialog",Font.PLAIN ,20));
        opn3.setBackground(Color.WHITE); // new Color(30 , 45 , 78 , 30)
        add(opn3);
        
        opn4 = new  JRadioButton();
        opn4.setBounds(170 , 640   , 700 , 30);
        opn4.setFont(new Font("Dialog",Font.PLAIN ,20));
        opn4.setBackground(Color.WHITE); // new Color(30 , 45 , 78 , 30)
        add(opn4);
        
        group = new   ButtonGroup();
        group.add(opn1);
        group.add(opn2);
        group.add(opn3);
        group.add(opn4);
        
         next = new JButton("NEXT");
        next.setBounds(1100 , 500 ,200 , 40);
         next .setFont(new Font("Tahoma",Font.PLAIN ,22));
        next.setBackground(new Color(30 , 144 , 250)); // new Color(30 , 45 , 78 , 30)
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
         lifeline = new JButton("50 50 LIFELINE");
        lifeline.setBounds(1100 ,580 ,200 , 40);
        lifeline.setFont(new Font("Tahoma",Font.PLAIN ,22));
        lifeline.setBackground(new Color(30 , 144 , 250)); // new Color(30 , 45 , 78 , 30)
        lifeline.setForeground(Color.WHITE);
         lifeline.addActionListener(this);
        add(lifeline);
        
         submit = new JButton("SUBMIT");
        submit.setBounds(1100 , 660 ,200 , 40);
        submit.setFont(new Font("Tahoma",Font.PLAIN ,22));
        submit.setBackground(new Color(30 , 144 , 250)); // new Color(30 , 45 , 78 , 30)
        submit.setForeground(Color.WHITE);
        submit.setEnabled(false);
        submit.addActionListener(this);
        add( submit);
        
        start(count);
        
    }
    public void paint(Graphics g){
        super.paint(g);
        
       String time = "Time left - " + timer + " seconds";
       g.setColor(Color.RED);
       g.setFont(new Font("Tahoma" , Font.BOLD , 24));
       
       if(timer > 0){
           g.drawString(time , 1100 , 500);
       }else{
           g.drawString("Times Up !" , 1100 , 500);
       }
       timer--;
       try{
           Thread.sleep(1000);
           repaint();
       }catch(Exception e){
           e.printStackTrace();
       }
       
       if(given_ans == 1){
           given_ans=0;
           timer = 15;
       }else if(timer<0){
           timer = 15;
           opn1.setEnabled(true);
           opn2.setEnabled(true);
           opn3.setEnabled(true);
           opn4.setEnabled(true);
             if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true); 
            }
             if(count==9){ // submit 
                 if(group.getSelection()==null){
                       userans[count][0] = "";
           }else{
                 userans[count][0] = group.getSelection().getActionCommand(); // gives value
           } 
            for(int i=0;i<userans.length;i++)  {
                if(userans[i][0].equals(answers[i][1])){
                    score += 10;
                }
            }         
             setVisible(false); // quiz page to hide frame is closed
              new Score(name , score );// score page
          }
             else{ // next button
                    if(group.getSelection()==null){
               userans[count][0] = "";
           }else{
                 userans[count][0] = group.getSelection().getActionCommand(); // gives value
           } 
             count++;
             start(count);
             
             }
        
       }
     
    }
    public void start(int count){
        qn.setText(""+(count+1)+". ");
        q.setText(questions[count][0]);
        opn1.setText(questions[count][1]);
           opn1.setActionCommand(questions[count][1]);
        opn2.setText(questions[count][2]);
           opn2.setActionCommand(questions[count][2]);
        opn3.setText(questions[count][3]);
           opn3.setActionCommand(questions[count][3]);
        opn4.setText(questions[count][4]);
           opn4.setActionCommand(questions[count][4]);
           
        group.clearSelection();
    }
    
    public static void main(String[] args) {
        new Quiz("user");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==next){
            repaint();
           opn1.setEnabled(true);
           opn2.setEnabled(true);
           opn3.setEnabled(true);
           opn4.setEnabled(true);
            given_ans = 1;
             if(group.getSelection()==null){
               userans[count][0] = "";
           }else{
                 userans[count][0] = group.getSelection().getActionCommand(); // gives value
           } 
            if(count==8){
                next.setEnabled(false);
                submit.setEnabled(true); 
            }
            count++;
            start(count);
        }else if(e.getSource()==lifeline){
            if(count==2 || count==4 || count==6 || count == 8 || count==9 ){
                opn2.setEnabled(false);
                opn3.setEnabled(false);
            }
            else{
                opn1.setEnabled(false);
                opn4.setEnabled(false); 
            }
            lifeline.setEnabled(false);
             
        }else if(e.getSource()==submit){
            given_ans = 1;
           if(group.getSelection()==null){
                 userans[count][0] = "";
           }else{
                 userans[count][0] = group.getSelection().getActionCommand(); // gives value
           } 
            for(int i=0;i<userans.length;i++)  {
                if(userans[i][0].equals(answers[i][1])){
                    score += 10;
                }
            }         
             setVisible(false); // quiz page to hide frame is closed
              new Score(name , score ) ;  // score page
        }
    }
    
}
