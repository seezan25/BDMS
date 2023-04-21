package AdminPages;

import javax.swing.*;
import java.awt.*;

public class AdminHomeRunner extends JPanel {
    JLabel nameDetail, usernameDetail, userTypeDetail, contactDetail, emailDetail,bloodGroupDetail,diseaseDetail,addressDetail,bloodAmountDetail;
    public AdminHomeRunner(){
        JPanel dashboardPanel=new JPanel();

        JPanel name=new JPanel();
        JPanel username=new JPanel();
        JPanel userType=new JPanel();
        JPanel contact=new JPanel();
        JPanel email=new JPanel();
        JLabel bloodGroup = new JLabel();
        JLabel disease = new JLabel();
        JPanel address = new JPanel();
        JPanel bloodAmount = new JPanel();

        JLabel nameDash=new JLabel("Name: " );
        JLabel usernameDash=new JLabel("Username: ");
        JLabel userTypeDash=new JLabel("UserType: ");
        JLabel contactDash=new JLabel("Contact: ");
        JLabel emailDash=new JLabel("Email: ");
        JLabel bloodGroupDash = new JLabel("BloodGroup:");
        JLabel diseaseDash = new JLabel("Disease:");
        JLabel addressDash = new JLabel("Address:");
        JLabel bloodAmountDash=new JLabel("Blood Amount:");


        nameDetail=new JLabel();
        usernameDetail=new JLabel();
        userTypeDetail=new JLabel();
        contactDetail=new JLabel();
        emailDetail=new JLabel();
        bloodGroupDetail=new JLabel();
        diseaseDetail = new JLabel();
        addressDetail = new JLabel();
        bloodAmountDetail= new JLabel();


        name.setLayout(new FlowLayout());
        name.add(nameDash);
        name.add(nameDetail);
        username.setLayout(new FlowLayout());
        username.add(usernameDash);
        username.add(usernameDetail);
        userType.setLayout(new FlowLayout());
        userType.add(userTypeDash);
        userType.add(userTypeDetail);
        contact.setLayout(new FlowLayout());
        contact.add(contactDash);
        contact.add(contactDetail);
        email.setLayout(new FlowLayout());
        email.add(emailDash);
        email.add(emailDetail);
        bloodGroup.setLayout(new FlowLayout());
        bloodGroup.add(bloodGroupDash);
        bloodGroup.add(bloodGroupDetail);
        disease.setLayout(new FlowLayout());
        disease.add(diseaseDash);
        disease.add(diseaseDetail);
        address.setLayout(new FlowLayout());
        address.add(addressDash);
        address.add(addressDetail);
        bloodAmount.setLayout(new FlowLayout());
        bloodAmount.add(bloodAmountDash);
        bloodAmount.add(bloodAmountDetail);

        dashboardPanel.setLayout(new GridLayout(6, 1));
        dashboardPanel.add(name);
        dashboardPanel.add(username);
        dashboardPanel.add(userType);
        dashboardPanel.add(contact);
        dashboardPanel.add(email);
        dashboardPanel.add(bloodGroup);
        dashboardPanel.add(disease);
        dashboardPanel.add(address);
        dashboardPanel.add(bloodAmount);


// Set preferred size for the dashboardPanel
        dashboardPanel.setPreferredSize(new Dimension(300, 400));

// Set background color for panels
        name.setBackground(Color.WHITE);
        username.setBackground(Color.WHITE);
        userType.setBackground(Color.WHITE);
        contact.setBackground(Color.WHITE);
        email.setBackground(Color.WHITE);
        bloodGroup.setBackground(Color.WHITE);
        disease.setBackground(Color.WHITE);
        address.setBackground(Color.WHITE);
        bloodAmount.setBackground(Color.WHITE);
        dashboardPanel.setBackground(Color.WHITE);

// Set font styles for labels
        Font labelFont = new Font("Arial", Font.BOLD, 16);
        nameDash.setFont(labelFont);
        usernameDash.setFont(labelFont);
        userTypeDash.setFont(labelFont);
        contactDash.setFont(labelFont);
        emailDash.setFont(labelFont);
        bloodGroupDash.setFont(labelFont);
        diseaseDash.setFont(labelFont);
        addressDash.setFont(labelFont);
        bloodAmountDash.setFont(labelFont);

// Set font styles for detail labels
        Font detailFont = new Font("Arial", Font.PLAIN, 16);
        nameDetail.setFont(detailFont);
        usernameDetail.setFont(detailFont);
        userTypeDetail.setFont(detailFont);
        contactDetail.setFont(detailFont);
        emailDetail.setFont(detailFont);
        bloodGroupDetail.setFont(detailFont);
        diseaseDetail.setFont(detailFont);
        addressDetail.setFont(detailFont);
        bloodAmountDetail.setFont(detailFont);

// Add the dashboardPanel to the container
        this.setBounds(0, 60, 700, 700);
        this.add(dashboardPanel);

// Set background color of the container to white
        setBackground(Color.WHITE);

    }
    public JLabel getNameDetail() {
        return nameDetail;
    }
    public JLabel getUsernameDetail(){
        return usernameDetail;
    }
    public JLabel getUserTypeDetail(){
        return userTypeDetail;
    }
    public JLabel getContactDetail(){
        return contactDetail;
    }
    public JLabel getEmailDetail(){
        return emailDetail;
    }
    public JLabel getBloodGroupDetail(){return bloodGroupDetail;}
    public JLabel getDiseaseDetail(){
        return  diseaseDetail;
    }
    public JLabel getAddressDetail(){
        return addressDetail;
    }
    public JLabel getBloodAmountDetail(){
        return bloodAmountDetail;
    }
}
