import AdminPages.AdminBloodRequest;
import AdminPages.AdminDonationRequest;
import AdminPages.AdminHomeRunner;
import DBConnect.DoConnection;
import DonorPages.DonorHomeRunner;
import DonorPages.DonorUpdateYourself;
import DonorPages.DonorViewDonorRunner;
import DonorPages.DonorViewReceiverRunner;
import MyFrame.Myframe;
import ReceiverPages.ReceiverHomeRunner;
import ReceiverPages.ReceiverUpdateYourself;
import ReceiverPages.ReceiverViewDonorRunner;
import ReceiverPages.ReceiverViewReceiverRunner;
import Reusable.AdminNavigationBar;
import Reusable.DonorNavigationBar;
import Reusable.ReceiverNavigationBar;
import Reusable.TopPanel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
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
        DonorHomeRunner donorHome = new DonorHomeRunner();
        DonorViewReceiverRunner donorViewReceiver = new DonorViewReceiverRunner();
        DonorViewDonorRunner donorViewDonor = new DonorViewDonorRunner();
        DonorUpdateYourself donorUpdateYourself = new DonorUpdateYourself();

        //Receiver Pages
        ReceiverHomeRunner receiverHome = new ReceiverHomeRunner();
        ReceiverViewDonorRunner receiverViewDonor = new ReceiverViewDonorRunner();
        ReceiverViewReceiverRunner receiverViewReceiver = new ReceiverViewReceiverRunner();
        ReceiverUpdateYourself receiverUpdateYourself = new ReceiverUpdateYourself();

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

        //importing the content of receiverNavigation bar for clicking
        JLabel clickYourDetailsReceiver = receiverNavbar.getYourDetail();
        JLabel clickViewDonorReceiver = receiverNavbar.getViewDonor();
        JLabel clickViewReceiverReceiver = receiverNavbar.getViewReceiver();
        JLabel clickLogoutReceiver = receiverNavbar.getLogout();

        //these are the components of login panel
        JTextField login_username = login.getUserTextfield();
        JPasswordField login_password = login.getPasswordfield();
        JButton login_loginButton = login.getLoginButton();
        JButton login_resetButton = login.getResetButton();

        //importing from the donor home
        JLabel usernameDetailDonor = donorHome.getUsernameDetail();
        JLabel contactDetailDonor = donorHome.getContactDetail();
        JLabel emailDetailDonor = donorHome.getEmailDetail();
        JLabel bloodGroupDetailDonor = donorHome.getBloodGroupDetail();
        JLabel addressDetailDonor = donorHome.getAddressDetail();
        JButton editButtonDonor = donorHome.getEditBtn();

        //importing from the receiver home
        JLabel usernameDetailReceiver = receiverHome.getUsernameDetail();
        JLabel contactDetailReceiver = receiverHome.getContactDetail();
        JLabel emailDetailReceiver = receiverHome.getEmailDetail();
        JLabel bloodGroupDetailReceiver = receiverHome.getBloodGroupDetail();
        JLabel addressDetailReceiver = receiverHome.getAddressDetail();
        JButton editButtonReceiver = receiverHome.getEditBtn();


        //importing from the donor update yourself

        JLabel donorUsernameField = donorUpdateYourself.getUsernameField();
        JTextField donorContactField = donorUpdateYourself.getContactField();
        JTextField donorEmailField = donorUpdateYourself.getEmailField();
        JTextField donorAddressField = donorUpdateYourself.getAddressField();
        JComboBox<String> donorBloodGroupField = donorUpdateYourself.getBloodGroup();
        JButton donorUpdateDeleteButton = donorUpdateYourself.getDeleteButton();
        JButton donorUpdateSaveButton = donorUpdateYourself.getSaveButton();

        //importing from the receiver update yourself

        JLabel receiverUsernameField = receiverUpdateYourself.getUsernameField();
        JTextField receiverContactField = receiverUpdateYourself.getContactField();
        JTextField receiverEmailField = receiverUpdateYourself.getEmailField();
        JTextField receiverAddressField = receiverUpdateYourself.getAddressField();
        JComboBox<String> receiverBloodGroupField = receiverUpdateYourself.getCombo();
        JButton receiverUpdateDeleteButton = receiverUpdateYourself.getDeleteButton();
        JButton receiverUpdateSaveButton = receiverUpdateYourself.getSaveButton();


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

        //importing from the Donor View Receiver
        DefaultTableModel tableModelDonorViewReceiver = donorViewReceiver.getTableModel();
        JTable tableDonorViewReceiver = donorViewReceiver.getTable();
        try {
            String sqlDonorViewReceiver = "SELECT * FROM receiver";
            Statement statementDonorViewReceiver = conn.createStatement();
            ResultSet resultDonorViewReceiver = statementDonorViewReceiver.executeQuery(sqlDonorViewReceiver);
            while (resultDonorViewReceiver.next()) {
                String username = resultDonorViewReceiver.getString("username");
                String email = resultDonorViewReceiver.getString("Email");
                String bloodGroup = resultDonorViewReceiver.getString("BloodGroup");
                String contact = resultDonorViewReceiver.getString("Contact");
                String address = resultDonorViewReceiver.getString("Address");
                String[] dataOfReceiver = {username, email, bloodGroup, contact, address};
                tableModelDonorViewReceiver.addRow(dataOfReceiver);
            }
            resultDonorViewReceiver.close();
            statementDonorViewReceiver.close();
        } catch (SQLException error) {
            throw new RuntimeException(error);
        }

        //importing from the Donor View Donor
        DefaultTableModel tableModelDonorViewDonor = donorViewReceiver.getTableModel();
        JTable tableDonorViewDonor = donorViewReceiver.getTable();
        try {
            String sqlDonorViewDonor = "SELECT * FROM receiver";
            Statement statementDonorViewDonor = conn.createStatement();
            ResultSet resultDonorViewDonor = statementDonorViewDonor.executeQuery(sqlDonorViewDonor);
            while (resultDonorViewDonor.next()) {
                String username = resultDonorViewDonor.getString("username");
                String email = resultDonorViewDonor.getString("Email");
                String bloodGroup = resultDonorViewDonor.getString("BloodGroup");
                String contact = resultDonorViewDonor.getString("Contact");
                String address = resultDonorViewDonor.getString("Address");
                String[] dataOfReceiver = {username, email, bloodGroup, contact, address};
                tableModelDonorViewDonor.addRow(dataOfReceiver);
            }
            resultDonorViewDonor.close();
            statementDonorViewDonor.close();
        } catch (SQLException error) {
            throw new RuntimeException(error);
        }

        //importing from the Receiver View Receiver
        DefaultTableModel tableModelReceiverViewReceiver = receiverViewReceiver.getTableModel();
        JTable tableReceiverViewReceiver = receiverViewReceiver.getTable();
        try {
            String sqlReceiverViewReceiver = "SELECT * FROM receiver";
            Statement statementReceiverViewReceiver = conn.createStatement();
            ResultSet resultReceiverViewReceiver = statementReceiverViewReceiver.executeQuery(sqlReceiverViewReceiver);
            while (resultReceiverViewReceiver.next()) {
                String username = resultReceiverViewReceiver.getString("username");
                String email = resultReceiverViewReceiver.getString("Email");
                String bloodGroup = resultReceiverViewReceiver.getString("BloodGroup");
                String contact = resultReceiverViewReceiver.getString("Contact");
                String address = resultReceiverViewReceiver.getString("Address");
                String[] dataOfReceiver = {username, email, bloodGroup, contact, address};
                tableModelReceiverViewReceiver.addRow(dataOfReceiver);
            }
            resultReceiverViewReceiver.close();
            statementReceiverViewReceiver.close();
        } catch (SQLException error) {
            throw new RuntimeException(error);
        }

        //importing from the Receiver View Donor
        DefaultTableModel tableModelReceiverViewDonor = receiverViewReceiver.getTableModel();
        JTable tableReceiverViewDonor = receiverViewReceiver.getTable();
        try {
            String sqlReceiverViewDonor = "SELECT * FROM receiver";
            Statement statementReceiverViewDonor = conn.createStatement();
            ResultSet resultReceiverViewDonor = statementReceiverViewDonor.executeQuery(sqlReceiverViewDonor);
            while (resultReceiverViewDonor.next()) {
                String username = resultReceiverViewDonor.getString("username");
                String email = resultReceiverViewDonor.getString("Email");
                String bloodGroup = resultReceiverViewDonor.getString("BloodGroup");
                String contact = resultReceiverViewDonor.getString("Contact");
                String address = resultReceiverViewDonor.getString("Address");
                String[] dataOfReceiver = {username, email, bloodGroup, contact, address};
                tableModelReceiverViewDonor.addRow(dataOfReceiver);
            }
            resultReceiverViewDonor.close();
            statementReceiverViewDonor.close();
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

                        System.out.println(username_value);
                        usernameDetailDonor.setText(username_value);
                        contactDetailDonor.setText(contact_value);
                        emailDetailDonor.setText(email_value);
                        bloodGroupDetailDonor.setText(bloodGroup_value);
                        addressDetailDonor.setText(address_value);
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
                        usernameDetailReceiver.setText(username_value);
                        contactDetailReceiver.setText(contact_value);
                        emailDetailReceiver.setText(email_value);
                        bloodGroupDetailReceiver.setText(bloodGroup_value);
                        addressDetailReceiver.setText(address_value);
                        frame.getContentPane().removeAll();
                        frame.getContentPane().add(receiverNavbar);
                        frame.getContentPane().add(top);
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
                                    usernameDetailDonor.setText(username_value);
                                    contactDetailDonor.setText(contact_value);
                                    emailDetailDonor.setText(email_value);
                                    bloodGroupDetailDonor.setText(bloodGroup_value);
                                    addressDetailDonor.setText(address_value);
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
                                    usernameDetailReceiver.setText(username_value);
                                    contactDetailReceiver.setText(contact_value);
                                    emailDetailReceiver.setText(email_value);
                                    bloodGroupDetailReceiver.setText(bloodGroup_value);
                                    addressDetailReceiver.setText(address_value);
                                    frame.getContentPane().removeAll();
                                    frame.getContentPane().add(receiverNavbar);
                                    frame.getContentPane().add(top);
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

        //clicking the admin navigation bar
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

        //transfering the data from home to update yourself
        editButtonDonor.addActionListener(e->{
           donorUsernameField.setText(usernameDetailDonor.getText());
            donorEmailField.setText(emailDetailDonor.getText());
            donorContactField.setText(contactDetailDonor.getText());
            donorBloodGroupField.setSelectedItem(bloodGroupDetailDonor.getText());
            donorAddressField.setText(addressDetailDonor.getText());
            frame.getContentPane().removeAll();
            frame.getContentPane().add(donorNavbar);
            frame.getContentPane().add(top);
            frame.getContentPane().add(donorUpdateYourself);
            frame.getContentPane().revalidate();
            frame.getContentPane().repaint();
        });
        editButtonReceiver.addActionListener(e->{
            receiverUsernameField.setText(usernameDetailReceiver.getText());
            receiverEmailField.setText(emailDetailReceiver.getText());
            receiverContactField.setText(contactDetailReceiver.getText());
            receiverBloodGroupField.setSelectedItem(bloodGroupDetailReceiver.getText());
            receiverAddressField.setText(addressDetailReceiver.getText());
            frame.getContentPane().removeAll();
            frame.getContentPane().add(receiverNavbar);
            frame.getContentPane().add(top);
            frame.getContentPane().add(receiverUpdateYourself);
            frame.getContentPane().revalidate();
            frame.getContentPane().repaint();
        });

        //updating the data in update yourself panel
        donorUpdateSaveButton.addActionListener(e->{
            try{
                String SQLUpdateDonorUserTableDetail = "UPDATE user SET BloodGroup=?,Email=?,ContactNumber=?,Address=? WHERE Username=? ";
                PreparedStatement preparedStatementUserTable = conn.prepareStatement(SQLUpdateDonorUserTableDetail);
                preparedStatementUserTable.setString(1, (String) donorBloodGroupField.getSelectedItem());
                preparedStatementUserTable.setString(2, donorEmailField.getText());
                preparedStatementUserTable.setString(3, donorContactField.getText());
                preparedStatementUserTable.setString(4,donorAddressField.getText());
                preparedStatementUserTable.setString(5, donorUsernameField.getText());
                int rowsAffected1 = preparedStatementUserTable.executeUpdate();

                String SQLUpdateDonorTableDetail = "UPDATE donor SET BloodGroup=?,Email=?,Contact=?,Address=? WHERE Username=?";
                PreparedStatement preparedStatementDonorTable = conn.prepareStatement(SQLUpdateDonorTableDetail);
                preparedStatementDonorTable.setString(1, (String) donorBloodGroupField.getSelectedItem());
                preparedStatementDonorTable.setString(2, donorEmailField.getText());
                preparedStatementDonorTable.setString(3, donorContactField.getText());
                preparedStatementDonorTable.setString(4,donorAddressField.getText());
                preparedStatementDonorTable.setString(5, donorUsernameField.getText());
                int rowsAffected2 = preparedStatementDonorTable.executeUpdate();

                if(rowsAffected1 > 0 && rowsAffected1 > 0){
                    JOptionPane.showMessageDialog(frame,"Updated Successfully");
                }else{
                    JOptionPane.showMessageDialog(frame,"Couldnot Update Successfully");
                }

            }catch(SQLException error){
                throw new RuntimeException(error);
            }
        });

        receiverUpdateSaveButton.addActionListener(e-> {
            try {
                String SQLUpdateReceiverUserTableDetail = "UPDATE user SET BloodGroup=?,Email=?,ContactNumber=?,Address=? WHERE Username=? ";
                PreparedStatement preparedStatementUserTable = conn.prepareStatement(SQLUpdateReceiverUserTableDetail);
                preparedStatementUserTable.setString(1, (String) receiverBloodGroupField.getSelectedItem());
                preparedStatementUserTable.setString(2, receiverEmailField.getText());
                preparedStatementUserTable.setString(3, receiverContactField.getText());
                preparedStatementUserTable.setString(4, receiverAddressField.getText());
                preparedStatementUserTable.setString(5, receiverUsernameField.getText());
                int rowsAffected1 = preparedStatementUserTable.executeUpdate();

                String SQLUpdateReceiverTableDetail = "UPDATE receiver SET BloodGroup=?,Email=?,Contact=?,Address=? WHERE Username=?";
                PreparedStatement preparedStatementReceiverTable = conn.prepareStatement(SQLUpdateReceiverTableDetail);
                preparedStatementReceiverTable.setString(1, (String) receiverBloodGroupField.getSelectedItem());
                preparedStatementReceiverTable.setString(2, receiverEmailField.getText());
                preparedStatementReceiverTable.setString(3, receiverContactField.getText());
                preparedStatementReceiverTable.setString(4, receiverAddressField.getText());
                preparedStatementReceiverTable.setString(5, receiverUsernameField.getText());
                int rowsAffected2 = preparedStatementReceiverTable.executeUpdate();

                if(rowsAffected1 > 0 && rowsAffected2 > 0){
                    JOptionPane.showMessageDialog(frame,"Updated Successfully");
                }else{
                    JOptionPane.showMessageDialog(frame,"Couldnot Update Successfully");
                }

            } catch (SQLException error) {
                throw new RuntimeException(error);
            }
        });
        //clicking the donor navigation bar
        clickYourDetails.addMouseListener(new MouseAdapter() {
                                              @Override
                                              public void mouseClicked(MouseEvent e) {
                                                  frame.getContentPane().removeAll();
                                                  frame.getContentPane().add(donorNavbar);
                                                  frame.getContentPane().add(top);
                                                  frame.getContentPane().add(donorHome);
                                                  frame.getContentPane().repaint();
                                                  frame.getContentPane().revalidate();
                                              }
                                          }
        );
        clickViewDonor.addMouseListener(new MouseAdapter() {
                                            @Override
                                            public void mouseClicked(MouseEvent e) {
                                                frame.getContentPane().removeAll();
                                                frame.getContentPane().add(donorNavbar);
                                                frame.getContentPane().add(top);
                                                frame.getContentPane().add(donorViewDonor);
                                                frame.getContentPane().repaint();
                                                frame.getContentPane().revalidate();
                                            }
                                        }
        );
        clickViewReceiver.addMouseListener(new MouseAdapter() {
                                               @Override
                                               public void mouseClicked(MouseEvent e) {
                                                   frame.getContentPane().removeAll();
                                                   frame.getContentPane().add(donorNavbar);
                                                   frame.getContentPane().add(top);
                                                   frame.getContentPane().add(donorViewReceiver);
                                                   frame.getContentPane().repaint();
                                                   frame.getContentPane().revalidate();
                                               }
                                           }
        );
        clickLogoutDonor.addMouseListener(new MouseAdapter() {
                                              @Override
                                              public void mouseClicked(MouseEvent e) {
                                                  frame.getContentPane().removeAll();
                                                  frame.getContentPane().add(login);
                                                  frame.getContentPane().repaint();
                                                  frame.getContentPane().revalidate();
                                              }
                                          }
        );


        //clicking the receiver navigation bar
        clickYourDetailsReceiver.addMouseListener(new MouseAdapter() {
                                              @Override
                                              public void mouseClicked(MouseEvent e) {
                                                  frame.getContentPane().removeAll();
                                                  frame.getContentPane().add(receiverNavbar);
                                                  frame.getContentPane().add(top);
                                                  frame.getContentPane().add(receiverHome);
                                                  frame.getContentPane().repaint();
                                                  frame.getContentPane().revalidate();
                                              }
                                          }
        );
        clickViewReceiverReceiver.addMouseListener(new MouseAdapter() {
                                            @Override
                                            public void mouseClicked(MouseEvent e) {
                                                frame.getContentPane().removeAll();
                                                frame.getContentPane().add(receiverNavbar);
                                                frame.getContentPane().add(top);
                                                frame.getContentPane().add(receiverViewDonor);
                                                frame.getContentPane().repaint();
                                                frame.getContentPane().revalidate();
                                            }
                                        }
        );
        clickViewDonorReceiver.addMouseListener(new MouseAdapter() {
                                               @Override
                                               public void mouseClicked(MouseEvent e) {
                                                   frame.getContentPane().removeAll();
                                                   frame.getContentPane().add(receiverNavbar);
                                                   frame.getContentPane().add(top);
                                                   frame.getContentPane().add(receiverViewReceiver);
                                                   frame.getContentPane().repaint();
                                                   frame.getContentPane().revalidate();
                                               }
                                           }
        );
        clickLogoutReceiver.addMouseListener(new MouseAdapter() {
                                              @Override
                                              public void mouseClicked(MouseEvent e) {
                                                  frame.getContentPane().removeAll();
                                                  frame.getContentPane().add(login);
                                                  frame.getContentPane().repaint();
                                                  frame.getContentPane().revalidate();
                                              }
                                          }
        );

        //delete Button in update yourself

        donorUpdateDeleteButton.addActionListener(e->{
            try {
                String SQLUserTableDelete = "DELETE FROM user WHERE Username =? ";
                PreparedStatement preparedStatementUserTable = conn.prepareStatement(SQLUserTableDelete);
                preparedStatementUserTable.setString(1, donorUsernameField.getText());
                int rowsAffected1 = preparedStatementUserTable.executeUpdate();
                String SQLDonorTableDelete = "DELETE FROM donor WHERE Username = ?";
                PreparedStatement preparedStatementDonorTable = conn.prepareStatement(SQLDonorTableDelete);
                preparedStatementDonorTable.setString(1,donorUsernameField.getText());
                int rowsAffected2 = preparedStatementDonorTable.executeUpdate();
                if(rowsAffected1 > 0 && rowsAffected2 > 0){
                    JOptionPane.showMessageDialog(frame,"Deleted Successfully.");
                    frame.getContentPane().removeAll();
                    frame.getContentPane().add(login);
                    frame.getContentPane().revalidate();
                    frame.getContentPane().repaint();
                }
                else{
                    JOptionPane.showMessageDialog(frame, "Couldnot Delete Successfully.");
                }
            }catch(SQLException error){
                throw new RuntimeException(error);
            }
        });

        receiverUpdateDeleteButton.addActionListener(e->{
            try {
                String SQLUserTableDelete = "DELETE FROM user WHERE Username =? ";
                PreparedStatement preparedStatementUserTable = conn.prepareStatement(SQLUserTableDelete);
                preparedStatementUserTable.setString(1, receiverUsernameField.getText());
                int rowsAffected1 = preparedStatementUserTable.executeUpdate();
                String SQLReceiverTableDelete = "DELETE FROM receiver WHERE Username = ?";
                PreparedStatement preparedStatementReceiverTable = conn.prepareStatement(SQLReceiverTableDelete);
                preparedStatementReceiverTable.setString(1,receiverUsernameField.getText());
                int rowsAffected2 = preparedStatementReceiverTable.executeUpdate();
                if(rowsAffected1 > 0 && rowsAffected2 > 0){
                    JOptionPane.showMessageDialog(frame,"Deleted Successfully.");
                    frame.getContentPane().removeAll();
                    frame.getContentPane().add(login);
                    frame.getContentPane().revalidate();
                    frame.getContentPane().repaint();
                }
                else{
                    JOptionPane.showMessageDialog(frame, "Couldnot Delete Successfully.");
                }
            }catch(SQLException error){
                throw new RuntimeException(error);
            }
        });



        frame.setVisible(true);
    }
}