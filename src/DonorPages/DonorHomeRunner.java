package DonorPages;

import javax.swing.*;
import java.awt.*;

public class DonorHomeRunner extends JPanel {
        JLabel usernameDetail,contactDetail, emailDetail,bloodGroupDetail,addressDetail;
        JButton editBtn;
        public DonorHomeRunner(){
            // Set background color of the container to white
            setLayout(null);
            setBackground(Color.decode("#8C2121"));
            setBounds(260,50,1190,994);

            // Your detail Label
            JLabel centerLabel= new JLabel("Your Detail");
            centerLabel.setForeground(Color.WHITE);
            centerLabel.setFont(new Font("",Font.BOLD,25));
            centerLabel.setBounds(490,55,270,30);

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

            editBtn = new JButton("Edit");
            editBtn.setBackground(Color.decode("#DBC137"));


            usernameDetail=new JLabel();
            contactDetail=new JLabel();
            emailDetail=new JLabel();
            bloodGroupDetail=new JLabel();
            addressDetail = new JLabel();


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


// Set Bounds for the dashboardPanel
            dashboardPanel.setBounds(410,100,300,397);

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

// Add center label and  dashboardPanel to the container
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


