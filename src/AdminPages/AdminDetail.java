package AdminPages;

import javax.swing.*;
import java.awt.*;

public class AdminDetail extends JPanel {
    public AdminDetail(){
        //-----------------------------CENTER PANEL--------------------------
        setBounds(270,50,1190,994);
        setBackground(Color.decode("#8C2121"));
        setLayout(null);

        //****************CENTER LABEL********************
        JLabel centerLabel= new JLabel("Your Information");
        centerLabel.setForeground(Color.WHITE);
        centerLabel.setFont(new Font("",Font.PLAIN,25));
        centerLabel.setBounds(445,50,528,79);
//
//        //**************** Table*********************
//        String column[]={"Full Name","Email","Contact no","Address","Blood Group"};
//        String row[][]={{"name,email,contact,address,bloodGroup"}};
//        JTable table=new JTable(row,column);
//        table.setBounds(500,500,200,300);
//        JScrollPane sc=new JScrollPane(table);

    }
}
