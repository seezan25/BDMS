import javax.swing.*;
import java.awt.*;

public class LoginWindow extends JPanel {
    private JLabel userLabel, passwordLabel;
    private JTextField userTextfield;
    private JPasswordField passwordfield;
    private JButton loginButton, resetButton;

    public LoginWindow(){
        setLayout(new GridLayout(4,2));
        userLabel=new JLabel("USERNAME:");
        passwordLabel=new JLabel("PASSWORD:");
        userTextfield=new JTextField();
        passwordfield=new JPasswordField();
        loginButton=new JButton("LOGIN");

        resetButton=new JButton("RESET");



        add(userLabel);
        add(passwordLabel);
        add(userTextfield);
        add(passwordfield);
        add(loginButton);

        add(resetButton);

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
