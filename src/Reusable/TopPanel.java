package Reusable;

import javax.swing.*;
import java.awt.*;

public class TopPanel extends JPanel {
    public TopPanel(){
        setLayout(null);
        setBounds(270,0,1190,50);
        setBackground(Color.decode("#B4E3AC"));
        JLabel topLabel = new JLabel("Blood Donation Management System");   //Top Label
        topLabel.setFont(new Font("",Font.BOLD,25));
        topLabel.setBounds(330,10,500,30);
        add(topLabel);

    }
}
