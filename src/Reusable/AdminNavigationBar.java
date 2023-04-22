package Reusable;


import javax.swing.*;
import java.awt.*;

public class AdminNavigationBar extends JMenuBar {
    private JPanel left1,left2,left3,left4,left5,left6;
    private JLabel volumeOfBlood,donationRequest,bloodRequest,yourDetail,history,logout;
    public AdminNavigationBar() {
        setLayout(null);
        setBounds(0, 0, 270, 1400);
        setBackground(Color.decode("#DBC137"));

        // Giant Panel
        JPanel giantPanel = new JPanel();
        giantPanel.setBounds(0, 270, 270, 427);
        giantPanel.setLayout(new GridLayout(6, 1));

        left1 = new JPanel();                          //Left Panel1
        left1.setSize(270, 20);
        left1.setBackground(Color.decode("#B4E3AC"));
        volumeOfBlood = new JLabel("Volume OF Blood");              //volume of blood Label
        volumeOfBlood.setFont(new Font("", Font.BOLD, 15));
        left2 = new JPanel();                          //Left Panel2
        left2.setSize(270, 20);
        left2.setBackground(Color.decode("#D9D9D9"));
        donationRequest = new JLabel("Donation Request");           //Donation Request Label
        donationRequest.setFont(new Font("", Font.BOLD, 15));
        left3 = new JPanel();                          //Left Panel3
        left3.setSize(270, 20);
        left3.setBackground(Color.decode("#B4E3AC"));
        bloodRequest = new JLabel("Blood Request");                  //Blood Request Label
        bloodRequest.setFont(new Font("", Font.BOLD, 15));
        left4 = new JPanel();                          //Left Panel4
        left4.setSize(270, 20);
        left4.setBackground(Color.decode("#D9D9D9"));
        yourDetail = new JLabel("Your Detail");                      //Your Detail Label
        yourDetail.setFont(new Font("", Font.BOLD, 15));
        left5 = new JPanel();                          //Left Panel5
        left5.setSize(270, 20);
        left5.setBackground(Color.decode("#B4E3AC"));
        history = new JLabel("History");                             //History Label
        history.setFont(new Font("", Font.BOLD, 15));
        left6 = new JPanel();                          //Left Panel6
        left6.setSize(270, 20);
        left6.setBackground(Color.decode("#D9D9D9"));
        logout = new JLabel("Logout");                               //Logout Label
        logout.setFont(new Font("", Font.BOLD, 15));

        add(giantPanel);
        giantPanel.add(left1);
        giantPanel.add(left2);
        giantPanel.add(left3);
        giantPanel.add(left4);
        giantPanel.add(left5);
        giantPanel.add(left6);
        left1.add(volumeOfBlood);
        left2.add(donationRequest);
        left3.add(bloodRequest);
        left4.add(yourDetail);
        left5.add(history);
        left6.add(logout);
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
    public JLabel getDetail(){
        return yourDetail;
    }
    public JLabel getHistory(){
        return history;
    }
    public JLabel getLogout(){
        return logout;
    }

}
