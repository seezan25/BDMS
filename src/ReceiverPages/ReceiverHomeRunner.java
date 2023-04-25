package ReceiverPages;

import javax.swing.*;
import java.awt.*;

public class ReceiverHomeRunner extends JPanel {
    JLabel  usernameDetail, contactDetail, emailDetail,bloodGroupDetail,addressDetail;
    JButton editBtn;
    public ReceiverHomeRunner(){
        // Set background size of the container and color to red
        setBounds(270,50,1190,994);
        setBackground(Color.decode("#8C2121"));
        setLayout(null);

        //****************CENTER LABEL********************
        JLabel centerLabel= new JLabel("Your Detail");
        centerLabel.setForeground(Color.WHITE);
        centerLabel.setFont(new Font("",Font.BOLD,25));
        centerLabel.setBounds(500,35,528,79);


        //************** Receiver Home **************
        JPanel dashboardPanel=new JPanel();

        JPanel username=new JPanel();
        JPanel contact=new JPanel();
        JPanel email=new JPanel();
        JLabel bloodGroup = new JLabel();
        JPanel address = new JPanel();

        JLabel usernameDash=new JLabel("Username: ");
        JLabel contactDash=new JLabel("Contact: ");
        JLabel emailDash=new JLabel("Email: ");
        JLabel bloodGroupDash = new JLabel("BloodGroup:");
        JLabel addressDash = new JLabel("Address:");


        usernameDetail=new JLabel();
        contactDetail=new JLabel();
        emailDetail=new JLabel();
        bloodGroupDetail=new JLabel();
        addressDetail = new JLabel();

        editBtn = new JButton("Edit");
        editBtn.setBackground(Color.decode("#DBC137"));

        username.setLayout(new FlowLayout());
        username.add(usernameDash);
        username.add(usernameDetail);
        contact.setLayout(new FlowLayout());
        contact.add(contactDash);
        contact.add(contactDetail);
        email.setLayout(new FlowLayout());
        email.add(emailDash);
        email.add(emailDetail);
        bloodGroup.setLayout(new FlowLayout());
        bloodGroup.add(bloodGroupDash);
        bloodGroup.add(bloodGroupDetail);
        address.setLayout(new FlowLayout());
        address.add(addressDash);
        address.add(addressDetail);

        dashboardPanel.setLayout(new GridLayout(6, 1));
        dashboardPanel.add(username);
        dashboardPanel.add(contact);
        dashboardPanel.add(email);
        dashboardPanel.add(bloodGroup);
        dashboardPanel.add(address);
        dashboardPanel.add(editBtn);


// Set preferred size for the dashboardPanel
//            dashboardPanel.setPreferredSize(new Dimension(300, 400));
        dashboardPanel.setBounds(410,100,300,390);

// Set background color for panels
        username.setBackground(Color.decode("#D9D9D9"));
        contact.setBackground(Color.decode("#D9D9D9"));
        email.setBackground(Color.decode("#D9D9D9"));
        bloodGroup.setBackground(Color.decode("#D9D9D9"));
        address.setBackground(Color.decode("#D9D9D9"));
        dashboardPanel.setBackground(Color.decode("#D9D9D9"));

// Set font styles for labels
        Font labelFont = new Font("Arial", Font.BOLD, 16);
        usernameDash.setFont(labelFont);
        contactDash.setFont(labelFont);
        emailDash.setFont(labelFont);
        bloodGroupDash.setFont(labelFont);
        addressDash.setFont(labelFont);

// Set font styles for detail labels
        Font detailFont = new Font("Arial", Font.PLAIN, 16);
        usernameDetail.setFont(detailFont);
        contactDetail.setFont(detailFont);
        emailDetail.setFont(detailFont);
        bloodGroupDetail.setFont(detailFont);
        addressDetail.setFont(detailFont);

// Add the dashboardPanel to the container
        add(centerLabel);
        add(dashboardPanel);

    }
    public JLabel getUsernameDetail(){
        return usernameDetail;
    }
    public JLabel getContactDetail(){
        return contactDetail;
    }
    public JLabel getEmailDetail(){
        return emailDetail;
    }
    public JLabel getBloodGroupDetail(){return bloodGroupDetail;}
    public JLabel getAddressDetail(){return addressDetail;}
    public JButton getEditBtn(){return editBtn;}
}

