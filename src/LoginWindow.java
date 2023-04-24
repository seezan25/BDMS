import javax.swing.*;
import java.awt.*;

public class LoginWindow extends JPanel {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private JLabel userLabel, passwordLabel;
    private JTextField userTextfield;
    private JPasswordField passwordfield;
    private JButton loginButton, resetButton;

    public LoginWindow(){
        setBackground(Color.decode("#8C2121"));
        setLayout(null);
        setBounds(0,0,(int)screenSize.getWidth(),(int)screenSize.getHeight());
        userLabel=new JLabel("USERNAME:");
        passwordLabel=new JLabel("PASSWORD:");
        userTextfield=new JTextField();
        passwordfield=new JPasswordField();
        loginButton=new JButton("LOGIN");

        resetButton=new JButton("Create User");

        // set color of user label and passrord label
        userLabel.setForeground(Color.white);
        passwordLabel.setForeground(Color.white);

        add(userLabel);
        add(passwordLabel);
        add(userTextfield);
        add(passwordfield);
        add(loginButton);
        add(resetButton);


        userLabel.setBounds(565,220,100,30);
        passwordLabel.setBounds(565,290,100,30);
        userTextfield.setBounds(660,220,150,30);
        passwordfield.setBounds(660,290,150,30);
        loginButton.setBounds(560,380,120,30);
        resetButton.setBounds(700,380,120,30);
    }
    public JTextField getUserTextfield(){
        return userTextfield;
    }
    public JPasswordField getPasswordfield(){
        return passwordfield;
    }

    public JButton getLoginButton(){
        return loginButton;
    }

    public JButton getResetButton(){
        return resetButton;
    }

}