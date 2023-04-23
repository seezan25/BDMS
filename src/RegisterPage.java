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
    private Image img1;

    public RegisterPage() {

        JPanel panel = new JPanel();

        img1 = new ImageIcon("src/images/register_bg.jpg").getImage();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Layout
        setBounds(0, 0, (int) screenSize.getWidth(), (int) screenSize.getHeight());
        setLayout(null);

        // Components initialization
        JLabel nameLabel = new JLabel("Username:");
        nameField = new JTextField();
        nameLabel.setBounds(360, 50, 100, 40);
        nameField.setBounds(460, 50, 100, 40);
        JLabel addressLabel = new JLabel("Address:");
        addressField = new JTextField();
        addressLabel.setBounds(800, 50, 100, 40);
        addressField.setBounds(870, 50, 100, 40);
        JLabel contactLabel = new JLabel("Contact Number:");
        contactField = new JTextField();
        contactLabel.setBounds(360, 100, 100, 40);
        contactField.setBounds(460, 100, 100, 40);
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        emailLabel.setBounds(800, 150, 100, 40);
        emailField.setBounds(870, 150, 100, 40);
        JLabel bloodGroupLabel = new JLabel("Blood Group:");
        bloodGroupComboBox = new JComboBox<String>(new String[]{"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"});
        bloodGroupLabel.setBounds(360, 200, 100, 40);
        bloodGroupComboBox.setBounds(460, 200, 100, 40);
        JLabel userTypelabel = new JLabel("userType");
        userType = new JComboBox<String>(new String[]{"donor", "receiver"});
        userTypelabel.setBounds(800, 250, 100, 40);
        userType.setBounds(870, 250, 100, 40);
        JLabel healthLabel = new JLabel("Health Status:");
        healthyCheckBox = new JCheckBox("Healthy");
        healthLabel.setBounds(360, 300, 100, 40);
        healthyCheckBox.setBounds(460, 300, 100, 40);
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        passwordLabel.setBounds(800, 350, 100, 40);
        passwordField.setBounds(870, 350, 100, 40);
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordField = new JPasswordField();
        confirmPasswordLabel.setBounds(0, 400, 100, 40);
        confirmPasswordField.setBounds(110, 400, 100, 40);
        submitButton = new JButton("Submit");
        submitButton.setBounds(0, 450, 100, 40);
        backButton = new JButton("Back");
        backButton.setBounds(110,450,100,40);



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

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the image onto the panel
        g.drawImage(img1, 0, 0, getWidth(), getHeight(), this);
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
