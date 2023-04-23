import AdminPages.AdminBloodRequest;
import AdminPages.AdminDonationRequest;
import AdminPages.AdminHomeRunner;
import DBConnect.DoConnection;
import DonorPages.DonorDonateRunner;
import DonorPages.DonorHomeRunner;
import DonorPages.DonorViewDonorRunner;
import DonorPages.DonorViewReceiverRunner;
import MyFrame.Myframe;
import ReceiverPages.ReceiverBloodRequestRunner;
import ReceiverPages.ReceiverHomeRunner;
import ReceiverPages.ReceiverViewDonorRunner;
import ReceiverPages.ReceiverViewReceiverRunner;
import Reusable.AdminNavigationBar;
import Reusable.DonorNavigationBar;
import Reusable.ReceiverNavigationBar;
import Reusable.TopPanel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Myframe frame = new Myframe();

        //admin pages
        AdminHomeRunner adminHome = new AdminHomeRunner();
        AdminDonationRequest adminDonationRequest = new AdminDonationRequest();
        AdminBloodRequest adminBloodRequest = new AdminBloodRequest();

        //Donor Pages
        DonorDonateRunner donorDonate = new DonorDonateRunner();
        DonorHomeRunner donorHome = new DonorHomeRunner();
        DonorViewReceiverRunner donorViewReceiver = new DonorViewReceiverRunner();
        DonorViewDonorRunner donorViewDonor = new DonorViewDonorRunner();

        //Receiver Pages
        ReceiverBloodRequestRunner receiverBloodRequest = new ReceiverBloodRequestRunner();
        ReceiverHomeRunner receiverHome = new ReceiverHomeRunner();
        ReceiverViewDonorRunner receiverViewDonor = new ReceiverViewDonorRunner();
        ReceiverViewReceiverRunner receiverViewReceiver = new ReceiverViewReceiverRunner();

        //login window
        LoginWindow login = new LoginWindow();
        RegisterPage registerPage = new RegisterPage();
        frame.add(login);

        //importing the contents of the register page
        JTextField registernameField = registerPage.getNameField();
        JTextField registeraddressField = registerPage.getAddressField();
        JTextField registercontatctField = registerPage.getContactField();
        JTextField registeremailField = registerPage.getEmailField();
        JButton registersubmitBtn = registerPage.getSubmitButton();
        JButton registerbackBtn = registerPage.getBackButton();
        JComboBox<String> registerBloodGroupComboBox = registerPage.getBloodGroupComboBox();
        JComboBox<String> registerUserType = registerPage.getuserType();
        JCheckBox registerHealthyCheckBox = registerPage.getHealthyCheckBox();
        JPasswordField registerPasswordField = registerPage.getPasswordField();
        JPasswordField registerConfirmPasswordField = registerPage.getConfirmPasswordField();

        //these are the reusable components
        AdminNavigationBar adminNavbar = new AdminNavigationBar();
        DonorNavigationBar donorNavbar = new DonorNavigationBar();
        ReceiverNavigationBar receiverNavbar = new ReceiverNavigationBar();
        TopPanel top = new TopPanel();


        //importing the content of adminNavigation bar for clicking
        JLabel clickVolumeofBlood = adminNavbar.getVolumeofBlood();
        JLabel clickDonationRequest = adminNavbar.getDonationRequest();
        JLabel clickBloodRequest = adminNavbar.getBloodRequest();
        JLabel clickLogout = adminNavbar.getLogout();

        //importing the content of donorNavigation bar for clicking
        JLabel clickYourDetails = donorNavbar.getYourDetail();
        JLabel clickViewDonor = donorNavbar.getViewDonor();
        JLabel clickViewReceiver = donorNavbar.getViewReceiver();
        JLabel clickLogoutDonor = donorNavbar.getLogout();


        //these are the components of login panel
        JTextField login_username = login.getUserTextfield();
        JPasswordField login_password = login.getPasswordfield();
        JButton login_loginButton = login.getLoginButton();
        JButton login_resetButton = login.getResetButton();

        //connection component
        DoConnection connect = new DoConnection();
        Connection conn = connect.getConnection();


        //importing from donationRequest
        DefaultTableModel tableModelAdminDonationRequest = adminDonationRequest.getTableModel();
        JTable tableDonationRequest = adminDonationRequest.getTable();
        try {
            String sqlDonationRequest = "SELECT * FROM donor";
            Statement statementDonationRequest = conn.createStatement();
            ResultSet resultDonationRequest = statementDonationRequest.executeQuery(sqlDonationRequest);
            while (resultDonationRequest.next()) {
                String username = resultDonationRequest.getString("username");
                String email = resultDonationRequest.getString("Email");
                String bloodGroup = resultDonationRequest.getString("BloodGroup");
                String contact = resultDonationRequest.getString("Contact");
                String address = resultDonationRequest.getString("Address");
                String[] dataOfReceiver = {username, email, bloodGroup, contact, address};
                tableModelAdminDonationRequest.addRow(dataOfReceiver);
            }
            resultDonationRequest.close();
            statementDonationRequest.close();
        } catch (SQLException error) {
            throw new RuntimeException(error);
        }

        //importing from the blood request
        DefaultTableModel tableModelAdminBloodRequest = adminBloodRequest.getTableModel();
        JTable tableBloodRequest = adminBloodRequest.getTable();
        try {
            String sqlBloodRequest = "SELECT * FROM receiver";
            Statement statementBloodRequest = conn.createStatement();
            ResultSet resultBloodRequest = statementBloodRequest.executeQuery(sqlBloodRequest);
            while (resultBloodRequest.next()) {
                String username = resultBloodRequest.getString("username");
                String email = resultBloodRequest.getString("Email");
                String bloodGroup = resultBloodRequest.getString("BloodGroup");
                String contact = resultBloodRequest.getString("Contact");
                String address = resultBloodRequest.getString("Address");
                String[] dataOfReceiver = {username, email, bloodGroup, contact, address};
                tableModelAdminBloodRequest.addRow(dataOfReceiver);
            }
            resultBloodRequest.close();
            statementBloodRequest.close();
        } catch (SQLException error) {
            throw new RuntimeException(error);
        }


        //While Clicking on Login Button
        //actionlistener on clicking the login button
        login_loginButton.addActionListener(e -> {
            try {
                String sql = "SELECT * FROM user";
                System.out.println("Hello");
                Statement stmt = conn.createStatement();
                ResultSet result = stmt.executeQuery(sql);
                int id_value = 0;
                String username_value = null;
                String password_value = null;
                String bloodGroup_value = null;
                String email_value = null;
                String contact_value = null;
                String address_value = null;
                String userType_value = null;
                boolean foundMatch = false;
                while (result.next()) {
                    id_value = Integer.parseInt(result.getString("ID"));
                    username_value = result.getString("Username");
                    password_value = result.getString("Password");
                    userType_value = result.getString("UserType");
                    bloodGroup_value = result.getString("BloodGroup");
                    email_value = result.getString("Email");
                    contact_value = result.getString("ContactNumber");
                    address_value = result.getString("Address");
                    String username = login_username.getText();
                    String Password = new String(login_password.getPassword());
                    if (Objects.equals(username_value, username) && Objects.equals(password_value, Password) && Objects.equals(userType_value, "admin")) {

                        frame.getContentPane().removeAll();
                        frame.getContentPane().add(adminNavbar);
                        frame.getContentPane().add(top);
                        frame.getContentPane().add(adminHome);
                        frame.getContentPane().revalidate();
                        frame.getContentPane().repaint();
                        foundMatch = true;

                    } else if (Objects.equals(username_value, username) && Objects.equals(password_value, Password) && Objects.equals(userType_value, "donor")) {
                        login_username.setText("");
                        login_password.setText("");

                        frame.getContentPane().removeAll();
                        frame.getContentPane().add(donorNavbar, BorderLayout.NORTH);
                        frame.getContentPane().add(donorHome, BorderLayout.CENTER);
                        frame.getContentPane().revalidate();
                        frame.getContentPane().repaint();
                        foundMatch = true;

                    } else if (Objects.equals(username_value, username) && Objects.equals(password_value, Password) && Objects.equals(userType_value, "receiver")) {
                        login_username.setText("");
                        login_password.setText("");
                        frame.getContentPane().removeAll();
                        frame.getContentPane().add(donorNavbar, BorderLayout.NORTH);
                        frame.getContentPane().add(receiverHome, BorderLayout.CENTER);
                        frame.getContentPane().revalidate();
                        frame.getContentPane().repaint();
                        foundMatch = true;
                    }
                }
                if (!foundMatch) {
                    login_username.setText("");
                    login_password.setText("");
                    JOptionPane.showMessageDialog(frame, "Username or password incorrect", "Error Message", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        });

        //clicking the reset button in  login panel
        login_resetButton.addActionListener(e -> {
            frame.getContentPane().removeAll();
            // Add the panel to a scroll pane
            frame.getContentPane().add(registerPage);
            frame.getContentPane().revalidate();
            frame.getContentPane().repaint();
        });

        //event on entering the enter button in login window
        login_username.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    login_password.requestFocus();
                }
            }
        });

        login_password.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (login_username.getText().trim().isEmpty()) {
                        login_username.requestFocus();
                    } else {

                        try {
                            String sql = "SELECT * FROM user";
                            Statement stmt = conn.createStatement();
                            ResultSet result = stmt.executeQuery(sql);
                            int id_value = 0;
                            String name_value = null;
                            String username_value = null;
                            String password_value = null;
                            String bloodGroup_value = null;
                            String email_value = null;
                            String contact_value = null;
                            String address_value = null;
                            String userType_value = null;
                            boolean foundMatch = false;
                            while (result.next()) {
                                id_value = Integer.parseInt(result.getString("ID"));
                                username_value = result.getString("Username");
                                password_value = result.getString("Password");
                                userType_value = result.getString("UserType");
                                bloodGroup_value = result.getString("BloodGroup");
                                email_value = result.getString("Email");
                                contact_value = result.getString("ContactNumber");
                                address_value = result.getString("Address");
                                String username = login_username.getText();
                                String Password = new String(login_password.getPassword());
                                if (Objects.equals(username_value, username) && Objects.equals(password_value, Password) && Objects.equals(userType_value, "admin")) {
                                    login_username.setText("");
                                    login_password.setText("");
                                    frame.getContentPane().removeAll();
                                    frame.getContentPane().add(adminNavbar);
                                    frame.getContentPane().add(top);
                                    frame.getContentPane().add(adminHome);
                                    frame.getContentPane().revalidate();
                                    frame.getContentPane().repaint();
                                    foundMatch = true;

                                } else if (Objects.equals(username_value, username) && Objects.equals(password_value, Password) && Objects.equals(userType_value, "donor")) {
                                    login_username.setText("");
                                    login_password.setText("");
                                    frame.getContentPane().removeAll();
                                    frame.getContentPane().add(donorNavbar);
                                    frame.getContentPane().add(top);
                                    frame.getContentPane().add(donorHome);
                                    frame.getContentPane().revalidate();
                                    frame.getContentPane().repaint();
                                    foundMatch = true;

                                } else if (Objects.equals(username_value, username) && Objects.equals(password_value, Password) && Objects.equals(userType_value, "receiver")) {
                                    login_username.setText("");
                                    login_password.setText("");
                                    frame.getContentPane().removeAll();
                                    frame.getContentPane().add(donorNavbar);
                                    frame.getContentPane().add(receiverHome);
                                    frame.getContentPane().revalidate();
                                    frame.getContentPane().repaint();
                                    foundMatch = true;
                                }
                            }
                            if (!foundMatch) {
                                login_username.setText("");
                                login_password.setText("");
                                JOptionPane.showMessageDialog(frame, "Username or password incorrect", "Error Message", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (SQLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                }
            }
        });

        //insert into the database
        registersubmitBtn.addActionListener(e -> {
            // Get values from components
            String name = registernameField.getText();
            String address = registeraddressField.getText();
            String contact = registercontatctField.getText();
            String email = registeremailField.getText();
            String bloodGroup = (String) registerBloodGroupComboBox.getSelectedItem();
            String userType = (String) registerUserType.getSelectedItem();
            boolean healthy = registerHealthyCheckBox.isSelected();
            String password = new String(registerPasswordField.getPassword());
            String confirmPassword = new String(registerConfirmPasswordField.getPassword());

            // Validation checks
            boolean matcher = Objects.equals(password, confirmPassword);
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter your name");
            } else if (address.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter your address");
            } else if (contact.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter your contact number");
            } else if (bloodGroup.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter bloodGroup .");
            } else if (!healthy) {
                JOptionPane.showMessageDialog(null, "Health status not selected.");
            } else if (email.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter your email");
            } else if (password.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter your password");
            } else if (!matcher) {
                JOptionPane.showMessageDialog(null, "Passwords do not match");
            } else {
                matcher = true;
            }

            if (matcher) {
                try {
                    String sql = "INSERT INTO user(Username,Address,ContactNumber,BloodGroup,Email,Password,UserType) VALUES(?,?,?,?,?,?,?)";
                    PreparedStatement preparedStatementRegister = conn.prepareStatement(sql);
                    preparedStatementRegister.setString(1, name);
                    preparedStatementRegister.setString(2, address);
                    preparedStatementRegister.setString(3, contact);
                    preparedStatementRegister.setString(4, bloodGroup);
                    preparedStatementRegister.setString(5, email);
                    preparedStatementRegister.setString(6, password);
                    preparedStatementRegister.setString(7, userType);
                    int rowsAffected1 = preparedStatementRegister.executeUpdate();
                    int rowsAffected2 = 0;
                    if (userType == "donor") {
                        String sqlDonorRegister = "INSERT INTO donor(username,Address, Contact,BloodGroup,Email) VALUES(?,?,?,?,?)";
                        PreparedStatement preparedStatementRegisterDonor = conn.prepareStatement(sqlDonorRegister);
                        preparedStatementRegisterDonor.setString(1, name);
                        preparedStatementRegisterDonor.setString(2, address);
                        preparedStatementRegisterDonor.setString(3, contact);
                        preparedStatementRegisterDonor.setString(4, bloodGroup);
                        preparedStatementRegisterDonor.setString(5, email);
                        rowsAffected2 = preparedStatementRegisterDonor.executeUpdate();
                    } else {
                        String sqlReceiverRegister = "INSERT INTO receiver(username,Address,Contact,BloodGroup,Email) VALUES(?,?,?,?,?)";
                        PreparedStatement preparedStatementRegisterReceiver = conn.prepareStatement(sqlReceiverRegister);
                        preparedStatementRegisterReceiver.setString(1, name);
                        preparedStatementRegisterReceiver.setString(2, address);
                        preparedStatementRegisterReceiver.setString(3, contact);
                        preparedStatementRegisterReceiver.setString(4, bloodGroup);
                        preparedStatementRegisterReceiver.setString(5, email);
                        rowsAffected2 = preparedStatementRegisterReceiver.executeUpdate();

                        if (rowsAffected1 > 0 && rowsAffected2 > 0) {
                            JOptionPane.showMessageDialog(null, "Registration successful");
                            frame.getContentPane().removeAll();
                            frame.getContentPane().add(login);
                            frame.getContentPane().revalidate();
                            frame.getContentPane().repaint();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error inserting");
                        }
                    }
                } catch (SQLException err) {
                    JOptionPane.showMessageDialog(null, "Database Error Found");
                }
            }
        });

        //clicking back button in register
        registerbackBtn.addActionListener(e -> {
            frame.getContentPane().removeAll();
            frame.getContentPane().add(login);
            frame.getContentPane().revalidate();
            frame.getContentPane().repaint();

        });

        clickVolumeofBlood.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(adminNavbar);
                frame.getContentPane().add(top);
                frame.getContentPane().add(adminHome);
                frame.getContentPane().revalidate();
                frame.getContentPane().repaint();
            }
        });
        clickBloodRequest.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(adminNavbar);
                frame.getContentPane().add(top);
                frame.getContentPane().add(adminBloodRequest);
                frame.getContentPane().revalidate();
                frame.getContentPane().repaint();
            }
        });
        clickDonationRequest.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(adminNavbar);
                frame.getContentPane().add(top);
                frame.getContentPane().add(adminDonationRequest);
                frame.getContentPane().revalidate();
                frame.getContentPane().repaint();
            }
        });

        clickLogout.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(login);
                frame.getContentPane().revalidate();
                frame.getContentPane().repaint();
            }
        });

        clickYourDetails.addMouseListener(new MouseAdapter() {
                                              @Override
                                              public void mouseClicked(MouseEvent e) {

                                              }
                                          }
        );
        clickViewDonor.addMouseListener(new MouseAdapter() {
                                              @Override
                                              public void mouseClicked(MouseEvent e) {

                                              }
                                          }
        );
        clickViewReceiver.addMouseListener(new MouseAdapter() {
                                              @Override
                                              public void mouseClicked(MouseEvent e) {

                                              }
                                          }
        );
        clickLogout.addMouseListener(new MouseAdapter() {
                                              @Override
                                              public void mouseClicked(MouseEvent e) {

                                              }
                                          }
        );

        frame.setVisible(true);
    }
}