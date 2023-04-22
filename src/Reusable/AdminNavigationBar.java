package Reusable;


import javax.swing.*;
import java.awt.*;

public class AdminNavigationBar extends JMenuBar {
    JMenuItem addDonor, viewDonor, addReceiver, viewReceiver;
    JMenu home, logout;

    public AdminNavigationBar() {
        setLayout(null);
        setBounds(0, 0, 270, 1400);
        setBackground(Color.decode("#DBC137"));

        // Giant Panel
        JPanel giantPanel = new JPanel();
        giantPanel.setBounds(0, 270, 270, 427);
        giantPanel.setLayout(new GridLayout(6, 1));

        JPanel left1 = new JPanel();                          //Left Panel1
        left1.setSize(270, 20);
        left1.setBackground(Color.decode("#B4E3AC"));
        JLabel volumeOfBlood = new JLabel("Volume OF Blood");              //volume of blood Label
        volumeOfBlood.setFont(new Font("", Font.BOLD, 15));
        JPanel left2 = new JPanel();                          //Left Panel2
        left2.setSize(270, 20);
        left2.setBackground(Color.decode("#D9D9D9"));
        JLabel donationRequest = new JLabel("Donation Request");           //Donation Request Label
        donationRequest.setFont(new Font("", Font.BOLD, 15));
        JPanel left3 = new JPanel();                          //Left Panel3
        left3.setSize(270, 20);
        left3.setBackground(Color.decode("#B4E3AC"));
        JLabel bloodRequest = new JLabel("Blood Request");                  //Blood Request Label
        bloodRequest.setFont(new Font("", Font.BOLD, 15));
        JPanel left4 = new JPanel();                          //Left Panel4
        left4.setSize(270, 20);
        left4.setBackground(Color.decode("#D9D9D9"));
        JLabel yourDetail = new JLabel("Your Detail");                      //Your Detail Label
        yourDetail.setFont(new Font("", Font.BOLD, 15));
        JPanel left5 = new JPanel();                          //Left Panel5
        left5.setSize(270, 20);
        left5.setBackground(Color.decode("#B4E3AC"));
        JLabel history = new JLabel("History");                             //History Label
        history.setFont(new Font("", Font.BOLD, 15));
        JPanel left6 = new JPanel();                          //Left Panel6
        left6.setSize(270, 20);
        left6.setBackground(Color.decode("#D9D9D9"));
        JLabel logout = new JLabel("Logout");                               //Logout Label
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


//        home = new JMenu("Home");
//        JMenu donor = new JMenu("Donor");
//        JMenu receiver = new JMenu("Receiver");
//        logout = new JMenu("Log Out");
//
//
//        addDonor = new JMenuItem("Add Donor");
//        viewDonor = new JMenuItem("View Donor");
//
//        addReceiver = new JMenuItem("Add Receiver");
//        viewReceiver = new JMenuItem("View Receiver");
//
//
//        donor.add(addDonor);
//        donor.add(viewDonor);
//
//        receiver.add(addReceiver);
//        receiver.add(viewReceiver);
//
//        add(home);
//        add(donor);
//        add(receiver);
//        add(logout);
//
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        setBackground(Color.BLUE);
//        home.setForeground(Color.white);
//        donor.setForeground(Color.white);
//        receiver.setForeground(Color.white);
//        logout.setForeground(Color.white);
//        setPreferredSize(new Dimension(screenSize.width,60));
    }

    public JMenuItem getAddDonor() {
        return addDonor;
    }

    public JMenuItem getViewDonor() {
        return viewDonor;
    }

    public JMenuItem getAddReceiver() {
        return addReceiver;
    }

    public JMenuItem getViewReceiver() {
        return viewReceiver;
    }

    public JMenu getHome() {
        return home;
    }

    public JMenu getLogout() {
        return logout;
    }
}
