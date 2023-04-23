package DonorPages;

import javax.swing.*;
import java.awt.*;

public class DonorHomeRunner extends JPanel {
        JLabel usernameDetail,contactDetail, emailDetail,bloodGroupDetail,addressDetail;
        public DonorHomeRunner(){
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


// Set preferred size for the dashboardPanel
            dashboardPanel.setPreferredSize(new Dimension(300, 400));

// Set background color for panels
            username.setBackground(Color.WHITE);
            contact.setBackground(Color.WHITE);
            email.setBackground(Color.WHITE);
            bloodGroup.setBackground(Color.WHITE);
            address.setBackground(Color.WHITE);
            dashboardPanel.setBackground(Color.WHITE);

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
            setBounds(0, 60, 700, 700);
            add(dashboardPanel);

// Set background color of the container to white
            setBackground(Color.WHITE);

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

    }


