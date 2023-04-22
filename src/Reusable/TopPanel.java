package Reusable;

import javax.swing.*;
import java.awt.*;

public class TopPanel extends JPanel {
    public TopPanel(){
        setBounds(250,0,1190,50);
        setBackground(Color.decode("#B4E3AC"));
        JLabel topLabel = new JLabel("Blood Donation Management System");   //Top Label

        add(topLabel);

    }
}
