import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.sun.tools.jconsole.JConsoleContext;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RegisterPage extends JPanel {

    private JTextField nameField;
    private JTextField addressField;
    private JTextField contactField;
    private JTextField emailField;
    private JComboBox<String> bloodGroupComboBox, userType;
    private JCheckBox healthyCheckBox;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JButton submitButton,backButton;

    public RegisterPage() {


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBackground(Color.decode("#8C2121"));
//        panel.setSize(1440,1400);

        // Layout
        setBounds(0, 0, (int) screenSize.getWidth(), (int) screenSize.getHeight());
        setLayout(null);

        // Components initialization
        JLabel nameLabel = new JLabel("Username:");
        nameField = new JTextField();
        nameLabel.setForeground(Color.white);
        nameLabel.setBounds(360, 50, 100, 40);
        nameField.setBounds(460, 50, 100, 40);
        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setForeground(Color.white);
        addressField = new JTextField();
        addressLabel.setBounds(800, 50, 100, 40);
        addressField.setBounds(870, 50, 100, 40);
        JLabel contactLabel = new JLabel("Contact Number:");
        contactLabel.setForeground(Color.white);
        contactField = new JTextField();
        contactLabel.setBounds(360, 150, 100, 40);
        contactField.setBounds(460, 150, 100, 40);
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setForeground(Color.white);
        emailField = new JTextField();
        emailLabel.setBounds(800, 150, 100, 40);
        emailField.setBounds(870, 150, 100, 40);
        JLabel bloodGroupLabel = new JLabel("Blood Group:");
        bloodGroupLabel.setForeground(Color.white);
        bloodGroupComboBox = new JComboBox<String>(new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"});
        bloodGroupLabel.setBounds(360, 250, 100, 40);
        bloodGroupComboBox.setBounds(460, 250, 100, 40);
        JLabel userTypelabel = new JLabel("userType");
        userTypelabel.setForeground(Color.white);
        userType = new JComboBox<String>(new String[]{"donor", "receiver"});
        userTypelabel.setBounds(800, 250, 100, 40);
        userType.setBounds(870, 250, 100, 40);
        JLabel healthLabel = new JLabel("Health Status:");
        healthLabel.setForeground(Color.white);
        healthyCheckBox = new JCheckBox("Healthy");
        healthLabel.setBounds(360, 350, 100, 40);
        healthyCheckBox.setBounds(460, 350, 100, 40);
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setForeground(Color.white);
        passwordField = new JPasswordField();
        passwordLabel.setBounds(800, 350, 100, 40);
        passwordField.setBounds(870, 350, 100, 40);
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordLabel.setForeground(Color.white);
        confirmPasswordField = new JPasswordField();
        confirmPasswordLabel.setBounds(565, 420, 110, 40);
        confirmPasswordField.setBounds(690, 420, 100, 40);
        submitButton = new JButton("Submit");
        submitButton.setBounds(565, 500, 100, 40);
        backButton = new JButton("Back");
        backButton.setBounds(690,500,100,40);



        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(userTypelabel);
        add(userType);
        add(addressLabel);
        add(addressField);
        add(contactLabel);
        add(contactField);
        add(emailLabel);
        add(emailField);
        add(bloodGroupLabel);
        add(bloodGroupComboBox);
        add(healthLabel);
        add(healthyCheckBox);
        add(passwordLabel);
        add(passwordField);
        add(confirmPasswordLabel);
        add(confirmPasswordField);
        add(submitButton);
        add(backButton);
//        add(background1);


    }


    public JTextField getNameField() {
        return nameField;
    }

    public JTextField getAddressField() {
        return addressField;
    }

    public JTextField getContactField() {
        return contactField;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }
    public JButton getBackButton(){
        return backButton;
    }

    public JTextField getEmailField() {
        return emailField;
    }


    public JComboBox<String> getBloodGroupComboBox() {
        return bloodGroupComboBox;
    }

    public JComboBox<String> getuserType() {
        return userType;
    }

    public JCheckBox getHealthyCheckBox() {
        return healthyCheckBox;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JPasswordField getConfirmPasswordField() {
        return getPasswordField();
    }
}
