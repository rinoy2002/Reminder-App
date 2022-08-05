
package Chronos;

import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class WelcomeForm extends  JFrame {

    // Creates new form WelcomeForm

    private  JTextField account_email;
    private  JTextField account_fullname;
    private  JPasswordField account_password;
    private  JTextField account_username;
    private  JLabel jLabel1;
    private  JLabel jLabel10;
    private  JLabel jLabel2;
    private  JLabel jLabel3;
    private  JLabel jLabel4;
    private  JLabel jLabel5;
    private  JLabel jLabel6;
    private  JLabel jLabel7;
    private  JLabel jLabel8;
    private  JLabel jLabel9;
    private  JPanel jPanel1;
    private  JButton login_btn;
    private  JLabel login_error;
    private  JPasswordField login_password;
    private  JTextField login_username;
    private  JButton newAccountButton;
    private  JLabel newAccountStatus;

    public WelcomeForm() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new JPanel();
        newAccountButton = new  JButton();
        jLabel2 = new  JLabel();
        jLabel5 = new  JLabel();
        account_fullname = new  JTextField();
        jLabel3 = new  JLabel();
        account_password = new  JPasswordField();
        jLabel4 = new  JLabel();
        jLabel6 = new  JLabel();
        account_username = new  JTextField();
        jLabel7 = new  JLabel();
        account_email = new  JTextField();
        jLabel8 = new  JLabel();
        login_password = new  JPasswordField();
        jLabel9 = new  JLabel();
        login_username = new  JTextField();
        login_btn = new  JButton();
        jLabel10 = new  JLabel();
        login_error = new  JLabel();
        newAccountStatus = new  JLabel();
        jLabel1 = new  JLabel();

        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        setTitle("Welcome to Chronos");
        setMaximumSize(new   Dimension(800, 600));
        setMinimumSize(new   Dimension(800, 600));
        setResizable(false);
        setLocationRelativeTo(null);

        jPanel1.setLayout(null);

        newAccountButton.setText("Sign Up");

        newAccountButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                newAccountButtonClicked(ae);
                account_email.setText("");
                account_fullname.setText("");
                account_username.setText("");
                account_password.setText("");
            }
        });

        jPanel1.add(newAccountButton);
        newAccountButton.setBounds(430, 500, 190, 30);

        jLabel2.setFont(new   Font("Tahoma", 1, 20));
        jLabel2.setForeground(new   Color(255, 255, 0));
        jLabel2.setText("Create New Account");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(320, 330, 240, 30);

        jLabel5.setFont(new   Font("Tahoma", 1, 20));
        jLabel5.setForeground(new   Color(255, 255, 153));
        jLabel5.setText("or");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(270, 440, 30, 30);

        jPanel1.add(account_fullname);
        account_fullname.setBounds(320, 400, 190, 30);

        jLabel3.setForeground(new   Color(255, 255, 255));
        jLabel3.setText("Full Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(320, 380, 70, 14);
        jPanel1.add(account_password);
        account_password.setBounds(320, 460, 190, 30);

        jLabel4.setForeground(new   Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 440, 80, 14);

        jLabel6.setForeground(new   Color(255, 255, 255));
        jLabel6.setText("Username");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(540, 380, 70, 14);

        jPanel1.add(account_username);
        account_username.setBounds(540, 400, 190, 30);

        jLabel7.setForeground(new   Color(255, 255, 255));
        jLabel7.setText("Password");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(320, 440, 70, 14);

        jPanel1.add(account_email);
        account_email.setBounds(540, 460, 190, 30);

        jLabel8.setForeground(new   Color(255, 255, 255));
        jLabel8.setText("Email Address");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(540, 440, 110, 14);
        jPanel1.add(login_password);
        login_password.setBounds(60, 460, 190, 30);

        jLabel9.setForeground(new   Color(255, 255, 255));
        jLabel9.setText("Username");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 380, 70, 14);

        jPanel1.add(login_username);
        login_username.setBounds(60, 400, 190, 30);

        login_btn.setText("Log In");

        login_btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                loginButtonClicked(ae);
            }
        });

        jPanel1.add(login_btn);
        login_btn.setBounds(110, 500, 90, 30);

        jLabel10.setFont(new   Font("Tahoma", 1, 20));
        jLabel10.setForeground(new   Color(255, 255, 0));
        jLabel10.setText("Login");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 330, 90, 30);

        login_error.setFont(new   Font("Tahoma", 1, 14));
        login_error.setForeground(new   Color(102, 255, 255));
        jPanel1.add(login_error);
        login_error.setBounds(60, 360, 240, 20);

        newAccountStatus.setFont(new   Font("Tahoma", 1, 12));
        newAccountStatus.setForeground(new   Color(255, 255, 51));
        jPanel1.add(newAccountStatus);
        newAccountStatus.setBounds(320, 360, 410, 20);

        jLabel1.setIcon(new  ImageIcon(getClass().getResource("/Chronos/background.jpg")));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 600);

        GroupLayout layout = new  GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1,  GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1,  GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }

    private void loginButtonClicked(ActionEvent ae) {
        // get user submitted data
        String username = login_username.getText();
        String password = String.valueOf(login_password.getPassword());

        // fetch data from database.
        Connection c;
        Statement st;
        if(username.isEmpty()||password.isEmpty()) {
            this.login_error.setText("Password or Username Incorrect");
        }else{
            try {
                Class.forName("org.sqlite.JDBC");
                c = DriverManager.getConnection("jdbc:sqlite:chronos.db");

                st = c.createStatement();
                ResultSet rs = st.executeQuery("select * from user where `username` = '" + username + "' and `password` = '" + password + "' limit 1");
                while (rs.next()) {
                    String user = rs.getString("username");
                    String pass = rs.getString("password");
                    String fullname = rs.getString("fullname");

                    if (username.equals(user) && password.equals(pass)) {
                        // create new instance of page.
                        Page mainPage = new Page();
                        mainPage.setVisible(true);
                        mainPage.jLabel3.setText("Welcome " + fullname);
                        mainPage.jLabel3.setFont(new Font("Tahoma", Font.BOLD , 16));
                        mainPage.AllListsClicked(ae);
                        // hide the welcome page.
                        this.setVisible(false);
                    } else {
                        this.login_error.setText("Password or Username Incorrect");
                    }
                }
                this.login_error.setText("Password or Username Incorrect");
                rs.close();
                st.close();
                c.close();
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println(e.getClass().getName() + ": " + e.getMessage());
                System.exit(0);
            }
        }
    }

    private void newAccountButtonClicked( ActionEvent ae) {
        String fullname = account_fullname.getText();
        String username = account_username.getText();
        String password = String.valueOf(account_password.getPassword());
        String email = account_email.getText();
        Connection con;
        Statement st;
        if(fullname.isEmpty()||username.isEmpty()||password.isEmpty()||email.isEmpty()) {
            this.newAccountStatus.setText("Account Creation Failed : Invalid Input");
        }else{

            try {
                Class.forName("org.sqlite.JDBC");
                con = DriverManager.getConnection("jdbc:sqlite:chronos.db");
                st = con.createStatement();
                st.executeUpdate("INSERT INTO user (fullname, username, password, email) VALUES ('" + fullname + "', '" + username + "','" + password + "','" + email + "')");
                st.close();
                con.commit();
                con.close();

            } catch (ClassNotFoundException | SQLException e) {
                String msg = e.getMessage();
                this.newAccountStatus.setText("Account Creation Failed : " + msg);
            } finally {
                this.newAccountStatus.setText("Your Account has Created, Please Login.");
            }
        }
    }
}

