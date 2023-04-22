package AdminPages;

import javax.swing.*;
import java.awt.*;

public class AdminHomeRunner extends JPanel {
    public AdminHomeRunner(){
        setBounds(270,50,1190,994);
        setBackground(Color.decode("#8C2121"));
        setLayout(null);
        //****************CENTER LABEL********************
        JLabel centerLabel= new JLabel("Amount Of Blood");
        centerLabel.setForeground(Color.WHITE);
        centerLabel.setFont(new Font("",Font.PLAIN,25));
        centerLabel.setBounds(445,50,528,79);

        //*************** Blood Amount Panels **********************
        JPanel AB_plusPanel =new JPanel();                // Panel for AB_Plus
        JLabel AB_plusLabel=new JLabel("AB+");                            //Label for AB_Plus
        JLabel label1 =new JLabel("0");
        AB_plusPanel.setBounds(200,150,100,100);
//        AB_plusLabel.setBounds(10,10, 40,40);
//
        JPanel AB_minusPanel =new JPanel();            // Panel for AB_minus
        JLabel AB_minusLabel=new JLabel("AB-");                            //Label for AB_minus
        JLabel label2 =new JLabel("0");
        AB_minusPanel.setBounds(400,150,100,100);

        JPanel A_plusPanel =new JPanel();                // Panel for A_Plus
        JLabel A_plusLabel=new JLabel("A+");                            //Label for A_Plus
        JLabel label3 =new JLabel("0");
        A_plusPanel.setBounds(600,150,100,100);

        JPanel A_minusPanel =new JPanel();                // Panel for A_minus
        JLabel A_minusLabel=new JLabel("A-");                            //Label for A_minus
        JLabel label4 =new JLabel("0");
        A_minusPanel.setBounds(800,150,100,100);


        JPanel B_plusPanel =new JPanel();                // Panel for B_Plus
        JLabel B_plusLabel=new JLabel("B+");                            //Label for B_Plus
        JLabel label5 =new JLabel("0");
        B_plusPanel.setBounds(200,350,100,100);


        JPanel B_minusPanel =new JPanel();                // Panel for B_minus
        JLabel B_minusLabel=new JLabel("B-");                            //Label for B_minus
        JLabel label6 =new JLabel("0");
        B_minusPanel.setBounds(400,350,100,100);


        JPanel O_plusPanel =new JPanel();                // Panel for O_Plus
        JLabel O_plusLabel=new JLabel("O+");                            //Label for O_Plus
        JLabel label7 =new JLabel("0");
        O_plusPanel.setBounds(600,350,100,100);


        JPanel O_minusPanel =new JPanel();                // Panel for O_minus
        JLabel O_minusLabel=new JLabel("O-");                            //Label for O_minus
        JLabel label8 =new JLabel("0");
        O_minusPanel.setBounds(800,350,100,100);


        //******************* UPDATE BUTTON**************
        JButton updateButton =new JButton("Update");
        updateButton.setBackground(Color.decode("#DBC137"));
        updateButton.setBounds(500,500,100,50);

        add(centerLabel);

        add(AB_plusPanel);
        add(AB_minusPanel);
        add(A_plusPanel);
        add(A_minusPanel);
        add(B_plusPanel);
        add(B_minusPanel);
        add(O_plusPanel);
        add(O_minusPanel);
        add(updateButton);
        AB_plusPanel.add(AB_plusLabel);
        AB_minusPanel.add(AB_minusLabel);
        A_plusPanel.add(A_plusLabel);
        A_minusPanel.add(A_minusLabel);
        B_plusPanel.add(B_plusLabel);
        B_minusPanel.add(B_minusLabel);
        O_plusPanel.add(O_plusLabel);
        O_minusPanel.add(O_minusLabel);

        AB_plusPanel.add(label1);
        AB_minusPanel.add(label2);
        A_plusPanel.add(label3);
        A_minusPanel.add(label4);
        B_plusPanel.add(label5);
        B_minusPanel.add(label6);
        O_plusPanel.add(label7);
        O_minusPanel.add(label8);

    }
}
