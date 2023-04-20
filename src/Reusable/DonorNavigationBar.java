package Reusable;


import javax.swing.*;
import java.awt.*;

public class DonorNavigationBar extends JMenuBar {
    JMenuItem addDonor, viewDonor, addReceiver, viewReceiver;
    JMenu home, logout;

    public DonorNavigationBar() {

        home = new JMenu("Home");
        JMenu donor = new JMenu("Donor");
        JMenu receiver = new JMenu("Receiver");
        JMenu marks = new JMenu("Marks");
        logout = new JMenu("Log Out");


        viewDonor = new JMenuItem("View Donor");

        viewReceiver = new JMenuItem("View Receiver");


        donor.add(viewDonor);

        receiver.add(viewReceiver);

        this.add(home);
        this.add(donor);
        this.add(receiver);
        this.add(marks);
        this.add(logout);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBackground(Color.BLUE);
        home.setForeground(Color.white);
        donor.setForeground(Color.white);
        receiver.setForeground(Color.white);
        marks.setForeground(Color.white);
        logout.setForeground(Color.white);
        setPreferredSize(new Dimension(screenSize.width,60));
    }

    public JMenuItem getViewDonor() {
        return viewDonor;
    }


    public JMenuItem getViewReceiver() {
        return viewReceiver;
    }
    public JMenu getHome(){
        return home;
    }
    public JMenu getLogout(){
        return logout;
    }
}
