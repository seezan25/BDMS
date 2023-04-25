package Reusable;


import javax.swing.*;
import java.awt.*;

public class AdminNavigationBar extends JMenuBar {
    private JPanel left1,left2,left3,left4;
    private JLabel volumeOfBlood,donationRequest,bloodRequest,logout;
    public AdminNavigationBar() {
        setLayout(null);
        setBounds(0, 0, 270, 1400);
        setBackground(Color.decode("#DBC137"));

        // Giant Panel
        JPanel giantPanel = new JPanel();
        giantPanel.setBounds(0, 270, 270, 200);
        giantPanel.setLayout(new GridLayout(4, 1));

        left1 = new JPanel();                          //Left Panel1
        left1.setSize(270, 20);
        left1.setBackground(Color.decode("#B4E3AC"));
        volumeOfBlood = new JLabel("Home");              //Home Label
        volumeOfBlood.setFont(new Font("", Font.BOLD, 15));

        left2 = new JPanel();                          //Left Panel2
        left2.setSize(270, 20);
        left2.setBackground(Color.decode("#D9D9D9"));
        donationRequest = new JLabel("View Donation");           //Donation Request Label
        donationRequest.setFont(new Font("", Font.BOLD, 15));

        left3 = new JPanel();                          //Left Panel3
        left3.setSize(270, 20);
        left3.setBackground(Color.decode("#B4E3AC"));
        bloodRequest = new JLabel("View Receiver");                  //Blood Request Label
        bloodRequest.setFont(new Font("", Font.BOLD, 15));

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
        left1.add(volumeOfBlood);
        left2.add(donationRequest);
        left3.add(bloodRequest);
        left4.add(logout);
    }
    public JLabel getVolumeofBlood(){
        return  volumeOfBlood;
    }
    public JLabel getDonationRequest(){
        return donationRequest;
    }
    public JLabel getBloodRequest(){
        return bloodRequest;
    }
    public JLabel getLogout(){
        return logout;
    }

}
