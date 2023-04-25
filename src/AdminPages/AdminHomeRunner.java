package AdminPages;

import javax.swing.*;
import java.awt.*;

public class AdminHomeRunner extends JPanel {
    public AdminHomeRunner(){
        setBounds(270,50,1190,994);
        setBackground(Color.decode("#8C2121"));
        setLayout(null);
        //****************CENTER LABEL********************
        JLabel centerLabel= new JLabel("Blood Types");
        centerLabel.setForeground(Color.WHITE);
        centerLabel.setFont(new Font("",Font.BOLD,25));
        centerLabel.setBounds(470,50,528,79);

        //*************** Blood Amount Panels **********************
        JPanel AB_plusPanel =new JPanel();                // Panel for AB_Plus
        AB_plusPanel.setLayout(null);
        AB_plusPanel.setBounds(200,150,100,100);
        JLabel AB_plusLabel=new JLabel("AB+");                            //Label for AB_Plus
        AB_plusLabel.setBounds(40,30,25,25);

        JPanel AB_minusPanel =new JPanel();            // Panel for AB_minus
        AB_minusPanel.setLayout(null);
        AB_minusPanel.setBounds(400,150,100,100);
        JLabel AB_minusLabel=new JLabel("AB-");                            //Label for AB_minus
        AB_minusLabel.setBounds(40,30,25,25);

        JPanel A_plusPanel =new JPanel();                // Panel for A_Plus
        A_plusPanel.setLayout(null);
        A_plusPanel.setBounds(600,150,100,100);
        JLabel A_plusLabel=new JLabel("A+");                            //Label for A_Plus
        A_plusLabel.setBounds(40,30,25,25);

        JPanel A_minusPanel =new JPanel();                // Panel for A_minus
        A_minusPanel.setLayout(null);
        A_minusPanel.setBounds(800,150,100,100);
        JLabel A_minusLabel=new JLabel("A-");                            //Label for A_minus
        A_minusLabel.setBounds(40,30,25,25);


        JPanel B_plusPanel =new JPanel();                // Panel for B_Plus
        B_plusPanel.setLayout(null);
        B_plusPanel.setBounds(200,350,100,100);
        JLabel B_plusLabel=new JLabel("B+");                            //Label for B_Plus
        B_plusLabel.setBounds(40,30,25,25);


        JPanel B_minusPanel =new JPanel();                // Panel for B_minus
        B_minusPanel.setLayout(null);
        B_minusPanel.setBounds(400,350,100,100);
        JLabel B_minusLabel=new JLabel("B-");                            //Label for B_minus
        B_minusLabel.setBounds(40,30,25,25);

        JPanel O_plusPanel =new JPanel();                // Panel for O_Plus
        O_plusPanel.setLayout(null);
        O_plusPanel.setBounds(600,350,100,100);
        JLabel O_plusLabel=new JLabel("O+");                            //Label for O_Plus
        O_plusLabel.setBounds(40,30,25,25);


        JPanel O_minusPanel =new JPanel();                // Panel for O_minus
        O_minusPanel.setLayout(null);
        O_minusPanel.setBounds(800,350,100,100);
        JLabel O_minusLabel=new JLabel("O-");                            //Label for O_minus
        O_minusLabel.setBounds(40,30,25,25);



        add(centerLabel);

        add(AB_plusPanel);
        add(AB_minusPanel);
        add(A_plusPanel);
        add(A_minusPanel);
        add(B_plusPanel);
        add(B_minusPanel);
        add(O_plusPanel);
        add(O_minusPanel);
        AB_plusPanel.add(AB_plusLabel);
        AB_minusPanel.add(AB_minusLabel);
        A_plusPanel.add(A_plusLabel);
        A_minusPanel.add(A_minusLabel);
        B_plusPanel.add(B_plusLabel);
        B_minusPanel.add(B_minusLabel);
        O_plusPanel.add(O_plusLabel);
        O_minusPanel.add(O_minusLabel);

    }
}
