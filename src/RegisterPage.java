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
    private JComboBox<String> bloodGroupComboBox;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JCheckBox healthyCheckBox;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JButton submitButton;
    private Image img1;

    public RegisterPage() {


        img1 = new ImageIcon("src/images/register_bg.jpg").getImage();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Layout
        setBounds(0,0,(int)screenSize.getWidth(),(int)screenSize.getHeight());
        setLayout(new GridLayout(13, 2, 10, 10));

        // Components initialization
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel addressLabel = new JLabel("Address:");
        addressField = new JTextField();
        JLabel contactLabel = new JLabel("Contact Number:");
        contactField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        JLabel bloodGroupLabel = new JLabel("Blood Group:");
        bloodGroupComboBox = new JComboBox<String>(new String[]{"A+","A-","B+","B-", "AB+","AB-", "O+","O-"});
        JLabel healthLabel = new JLabel("Health Status:");
        healthyCheckBox = new JCheckBox("Healthy");
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        confirmPasswordField = new JPasswordField();
        submitButton = new JButton("Submit");


        // Add components to the frame
        setLayout(new GridLayout(10, 2, 10, 10));
        add(nameLabel);
        add(nameField);
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
//        add(background1);


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw the image onto the panel
        g.drawImage(img1, 0, 0, getWidth(), getHeight(), this);
    }
}
