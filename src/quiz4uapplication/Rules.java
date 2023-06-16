package quiz4uapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    
    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Wise Minds");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. Be a programmer not a narrator, be concise" + "<br><br>" +
                "2. Smile at the problem maybe you will figure it out" + "<br><br>" +
                "3. There will be no option of not to solve one question, you are not in restaurant" + "<br><br>" +
                "4. Crying is prohibited but you can scream" + "<br><br>" +
                "5. Be wise otherwise you're life would be like dice" + "<br><br>" +
                "6. Don't panic, there is no use of it here" + "<br><br>" +
                "7. Embrace you, this quiz is not for the weak" + "<br><br>" +
                "8. May you know more than Elon Musk, Good Luck" + "<br><br>" +
            "<html>"

        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
    
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
    
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
}
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}