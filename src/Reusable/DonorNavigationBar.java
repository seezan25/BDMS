package Reusable;


import javax.swing.*;
import java.awt.*;

public class DonorNavigationBar extends JMenuBar {
    private JPanel left1,left2,left3,left4;
    private JLabel yourDetail,viewDonor,viewReceiver,logout;

    public DonorNavigationBar() {
        setLayout(null);
        setBounds(0, 0, 270, 1400);
        setBackground(Color.decode("#DBC137"));

        // Giant Panel
        JPanel giantPanel = new JPanel();
        giantPanel.setBounds(0, 270, 270, 160);
        giantPanel.setLayout(new GridLayout(4, 1));

        left1 = new JPanel();                          //Left Panel1
        left1.setSize(270, 20);
        left1.setBackground(Color.decode("#B4E3AC"));
        yourDetail = new JLabel("Your Detail");              //volume of blood Label
        yourDetail.setFont(new Font("", Font.BOLD, 15));
        left2 = new JPanel();                          //Left Panel2
        left2.setSize(270, 20);
        left2.setBackground(Color.decode("#D9D9D9"));
        viewDonor = new JLabel("View Donor");           //Donation Request Label
        viewDonor.setFont(new Font("", Font.BOLD, 15));
        left3 = new JPanel();                          //Left Panel3
        left3.setSize(270, 20);
        left3.setBackground(Color.decode("#B4E3AC"));
        viewReceiver = new JLabel("View Receiver");                  //Blood Request Label
        viewReceiver.setFont(new Font("", Font.BOLD, 15));
        left4 = new JPanel();                          //Left Panel4
        left4.setSize(270, 20);
        left4.setBackground(Color.decode("#D9D9D9"));
        logout = new JLabel("Logout");                               //Logout Label
        logout.setFont(new Font("", Font.BOLD, 15));


        add(giantPanel);
        giantPanel.add(left1);
        giantPanel.add(left2);
        giantPanel.add(left3);
        giantPanel.add(left4);
        left1.add(yourDetail);
        left2.add(viewDonor);
        left3.add(viewReceiver);
        left4.add(logout);
    }
    public JLabel getYourDetail(){
        return  yourDetail;
    }
    public JLabel getViewDonor(){
        return viewDonor;
    }
    public JLabel getViewReceiver(){
        return  viewReceiver;
    }
    public JLabel getLogout(){
        return logout;
    }


}