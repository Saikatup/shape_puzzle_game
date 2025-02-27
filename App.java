import javax.swing.*;
//import javax.swing.text.AttributeSet.ColorAttribute;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App{
    JFrame f;
    JLabel messageLabel_1;
    JLabel messageLabel_2;

    App(){  
    f=new JFrame();//creating instance of JFrame  

    messageLabel_2=new JLabel("");   //welcome message 
    messageLabel_2.setBounds(100,0,300,50);
    messageLabel_2.setText("WELCOME TO OUR PROJECT");

    JButton b=new JButton("     ");//creating instance of JButton  
    b.setBounds(10,50,100, 40); 
    b.setBackground(Color.YELLOW); 
    b.setForeground(Color.WHITE);
    b.setOpaque(false);
    b.setContentAreaFilled(false);
    b.setBorderPainted(false);
    
    
    ImageIcon icon1 =new ImageIcon("image.png");

    JButton c=new JButton("Button 2",icon1);
    c.setBounds(10,90,400,400);
    c.setBackground(Color.WHITE);
    

    messageLabel_1 = new JLabel("");
    messageLabel_1.setBounds(120, 50, 200, 40);

    c.addActionListener(new ActionListener() {
        //@Override
        public void actionPerformed(ActionEvent e) {
            showMessage();
            
        }
        });


    b.addActionListener(new ActionListener() {
        //@Override
        public void actionPerformed(ActionEvent e) {
            showMessage();
            
        }
        });

    f.add(messageLabel_2);      
    f.add(b);//adding button in JFrame 
    f.add(c);
    f.add(messageLabel_1);
            
    f.setSize(600,500);//400 width and 500 height  
    f.setLayout(null);//using no layout managers  
    f.setVisible(true);//making the frame visible  
    }  

   private void showMessage() {
        messageLabel_1.setText("Hi, how are you?");
    }



    public static void main(String args[]){
        System.out.println("Hello world");
       new  App();
    }
}