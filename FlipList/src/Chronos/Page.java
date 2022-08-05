package Chronos;

import org.jdesktop.swingx.JXDatePicker;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.table.*;

public class Page extends JFrame {

    private JButton jButton2;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton9;
    private JButton jButton11;
    private JLabel jLabel1;
    private JLabel jLabel2;
    public JLabel jLabel3;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JPanel jPanel1;
    private JScrollPane jScrollPane2;
    private JTextField jTextField2;
    private JButton listButton;
    private JXDatePicker listDate;
    private JTextArea listDescription;
    public JTable listTable;
    private JTextField listTitle;
    private JButton userLogout;

    public Page() {
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        listTitle = new HintTextField("List Title");
        listDescription = new HintTextArea("List Description");
        listButton = new JButton();
        jTextField2 = new HintTextField("Search List");
        jButton2 = new JButton();
        jLabel3 = new JLabel();
        listDate = new JXDatePicker();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jButton9 = new JButton();
        jButton11 = new JButton();
        userLogout = new JButton();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jScrollPane2 = new JScrollPane();
        listTable = new JTable();
        jLabel1 = new JLabel();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Your Activity");
        setMaximumSize(new Dimension(800, 600));
        setMinimumSize(new Dimension(800, 600));
        setResizable(false);
        setLocationRelativeTo(null);

        jPanel1.setLayout(null);

        jLabel2.setFont(new Font("Tahoma", 1, 14));
        jLabel2.setForeground(new Color(255, 255, 102));
        jLabel2.setText("Create New List >>");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 80, 150, 17);


        jPanel1.add(listTitle);
        listTitle.setBounds(20, 100, 250, 30);

        listDescription.setColumns(20);
        listDescription.setRows(5);

        listDescription.setBounds(20, 140, 250, 100);
        jPanel1.add(listDescription);


        listButton.setFont(new Font("Tahoma", 1, 12));
        listButton.setText("Save");
        listButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                listButtonClicked(ae);
                AllListsClicked(ae);
                listTitle.setText("");
                listDescription.setText("");
            }
        });
        jPanel1.add(listButton);
        listButton.setBounds(200, 250, 70, 30);


        jPanel1.add(jTextField2);
        jTextField2.setBounds(510, 30, 190, 30);

        jButton2.setText("Search");
        jPanel1.add(jButton2);
        jButton2.setBounds(710, 30, 80, 30);
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent ae) {
                listSearchClicked(ae);
            }
        });

        jLabel3.setFont(new Font("Tahoma", 0, 14));
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 18, 500, 20);


        listDate.setDate(Calendar.getInstance().getTime());
        listDate.setFormats(new SimpleDateFormat("dd-MM-yyyy"));
        listDate.setBounds(20, 250, 170, 30);
        jPanel1.add(listDate);


        jButton11.setText("Edit List");
        jPanel1.add(jButton11);
        jButton11.setBounds(20, 430, 250, 23);
        jButton11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
               EditListButtonClicked(ae);
            }
        });

        jButton6.setText("Today's Lists");
        jPanel1.add(jButton6);
        jButton6.setBounds(20, 370, 250, 23);
        jButton6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                TodayListButtonClicked(ae);
            }
        });

        jButton7.setText("Delete List");
        jPanel1.add(jButton7);
        jButton7.setBounds(20, 400, 250, 23);
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                DeleteListButtonClicked(ae);
            }
        });

        jButton9.setText("All Lists");
        jPanel1.add(jButton9);
        jButton9.setBounds(20, 340, 250, 23);
        jButton9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                  AllListsClicked(ae);
          }
        });

        userLogout.setIcon(new ImageIcon(getClass().getResource("/Chronos/logout.png")));
        userLogout.setText("LogOut");
        userLogout.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent ae) {
                userLogoutClicked(ae);
            }
        });
        jPanel1.add(userLogout);
        userLogout.setBounds(70, 460, 200, 30);

        jLabel6.setFont(new Font("Tahoma", 1, 14));
        jLabel6.setForeground(new Color(255, 255, 255));
        jLabel6.setText("Recent To Do Lists:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(300, 90, 460, 30);

        jLabel7.setFont(new Font("Tahoma", 1, 14));
        jLabel7.setForeground(new Color(255, 255, 102));
        jLabel7.setText("Explore >>");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 310, 130, 17);

        listTable.setModel(new DefaultTableModel(

                new Object [][] {
                        {"", "", ""},

                },
                new String [] {
                        "List Title", "Description", "Date"
                }
        ) {
            Class[] types = new Class [] {
                    String.class, String.class,String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(listTable);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(290, 120, 480, 460);

        jLabel1.setIcon(new ImageIcon(getClass().getResource("/Chronos/page.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 810, 600);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }

    private void userLogoutClicked(ActionEvent ae) {
        WelcomeForm wc = new WelcomeForm();
        wc.setVisible(true);
        this.setVisible(false);
    }

    private void listSearchClicked(ActionEvent ae) {
        String title = jTextField2.getText();
        TableHelper newTable = new TableHelper();
        newTable.searchTitleTable(this.listTable,title);
    }

    private void TodayListButtonClicked(ActionEvent ae) {
        SimpleDateFormat dtf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = Calendar.getInstance();
        java.util.Date dateObj = calendar.getTime();
        String date = dtf.format(dateObj);

        TableHelper newTable = new TableHelper();
        newTable.searchDateTable(this.listTable,date);
    }


    private void listButtonClicked(ActionEvent ae) {
        String title = listTitle.getText();
        SimpleDateFormat sdfr = new SimpleDateFormat("dd-MM-yyyy");
        String description = listDescription.getText();
        String date = sdfr.format(listDate.getDate());
        Connection con;
        Statement st;

        if(description.equals("List Description")){
            description =" ";
        }
        if(title.equals("List Title") || title.equals("")) {
              JOptionPane.showMessageDialog(null,"Invaild Entry" );
        }else{
            try {
                Class.forName("org.sqlite.JDBC");
                con = DriverManager.getConnection("jdbc:sqlite:chronos.db");
                st = con.createStatement();
                st.executeUpdate("INSERT INTO lists (title, description, date) VALUES ('" + title + "', '" + description + "','" + date + "')");
                st.close();
                con.commit();
                con.close();

            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(null,"List Saved Successfully" );

        }

    }
    public void EditListButtonClicked(ActionEvent ae){
        if(listTable.getSelectedRow() != -1) {

            int row = listTable.getSelectedRow();
            String title = listTable.getValueAt(row, 0).toString();
            String description = listTable.getValueAt(row, 1).toString();
            String date = listTable.getValueAt(row, 2).toString();
            EditListPage elp = new EditListPage(this.listTable);
            elp.title = title;
            elp.description= description;
            elp.date = date;
        }else{
            JOptionPane.showMessageDialog(null,"Please Select Any List" );
        }
    }

    public void AllListsClicked(ActionEvent ae){
        TableHelper newTable = new TableHelper();
        newTable.fillTable(this.listTable);
    }
    public void DeleteListButtonClicked(ActionEvent ae){
        if(listTable.getSelectedRow() != -1) {

            int row = listTable.getSelectedRow();
            String title = listTable.getModel().getValueAt(row, 0).toString();
            String description = listTable.getModel().getValueAt(row, 1).toString();
            String date = listTable.getModel().getValueAt(row, 2).toString();
            Connection con;
            Statement st;
            try {
                Class.forName("org.sqlite.JDBC");
                con = DriverManager.getConnection("jdbc:sqlite:chronos.db");
                st = con.createStatement();
                st.executeUpdate("delete from lists where title ='" + title + "' and description='" + description + "' and date ='" + date + "'");
                st.close();
                con.close();

            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
            AllListsClicked(ae);
            JOptionPane.showMessageDialog(null,"List Deleted Successfully" );
        }else{
            JOptionPane.showMessageDialog(null,"Please Select Any List" );
        }
    }
}
class HintTextField extends JTextField {

    Font gainFont = new Font("Arial", Font.PLAIN, 14);
    Font lostFont = new Font("Arial", Font.ITALIC, 14);

    public HintTextField(final String hint) {

        setText(hint);
        setFont(lostFont);
        setForeground(Color.GRAY);

        this.addFocusListener(new FocusAdapter() {

            public void focusGained(FocusEvent e) {
                if (getText().equals(hint)) {
                    setText("");
                    setFont(gainFont);
                    setForeground(Color.BLACK);
                } else {
                    setText(getText());
                    setFont(gainFont);
                }
            }

            public void focusLost(FocusEvent e) {
                if (getText().equals(hint)|| getText().length()==0) {
                    setText(hint);
                    setFont(lostFont);
                    setForeground(Color.GRAY);
                } else {
                    setText(getText());
                    setFont(gainFont);
                    setForeground(Color.BLACK);
                }
            }
        });

    }
}
class HintTextArea extends JTextArea{

    Font gainFont = new Font("Arial", Font.PLAIN, 14);
    Font lostFont = new Font("Arial", Font.ITALIC, 14);

    public HintTextArea(final String hint) {

        setText(hint);
        setFont(lostFont);
        setForeground(Color.GRAY);

        this.addFocusListener(new FocusAdapter() {

            public void focusGained(FocusEvent e) {
                if(getText().equals(hint)) {
                    setText("");
                    setFont(gainFont);
                    setForeground(Color.BLACK);
                } else {
                    setText(getText());
                    setFont(gainFont);
                }
            }

            public void focusLost(FocusEvent e) {
                if (getText().equals(hint)|| getText().length()==0) {
                    setText(hint);
                    setFont(lostFont);
                    setForeground(Color.GRAY);
                } else {
                    setText(getText());
                    setFont(gainFont);
                    setForeground(Color.BLACK);
                }
            }
        });

    }
}
class EditListPage {
    private JButton jButton;
    private JTextField jTextField1;
    private JTextArea jTextArea2;
    private JXDatePicker jTextField3;
    private JLabel jLabel;
    public String title;
    public String description;
    public String date;
    public JTable table;
    public EditListPage(JTable listTable) {
        table = listTable;
        initComponents();
    }
    private void initComponents() {
        JFrame frame = new JFrame();
        jTextField1 = new HintTextField("List Title");
        jTextArea2 = new HintTextArea("List Description");
        jTextField3 = new  JXDatePicker();
        jButton = new JButton();
        jLabel = new JLabel();

        frame.setTitle("Edit List");
        frame.setMaximumSize(new Dimension(300, 300));
        frame.setMinimumSize(new Dimension(300, 300));
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        jLabel.setFont(new Font("Tahoma", 1, 14));
        jLabel.setText("Edit List >>");
        jLabel.setBounds(20, 20, 150, 17);
        frame.add(jLabel);

        jButton.setFont(new Font("Tahoma", 1, 12));
        jButton.setText("Save");
        jButton.setBounds(200, 200, 70, 30);
        frame.add(jButton);

        jButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                EditSaveButtonClicked(ae,frame);
            }
        });

        jTextField1.setBounds(20, 50, 250, 30);
        frame.add(jTextField1);

        jTextArea2.setColumns(10);
        jTextArea2.setRows(5);
        jTextArea2.setBounds(20, 90, 250, 100);
        frame.add(jTextArea2);

        jTextField3.setDate(Calendar.getInstance().getTime());
        jTextField3.setFormats(new SimpleDateFormat("dd-MM-yyyy"));
        jTextField3.setBounds(20, 200, 170, 30);
        frame.add(jTextField3);

    }
    public void EditSaveButtonClicked(ActionEvent ae,JFrame frame){
        String etitle = jTextField1.getText();
        SimpleDateFormat sdfr = new SimpleDateFormat("dd-MM-yyyy");
        String edescription = jTextArea2.getText();
        String edate = sdfr.format(jTextField3.getDate());
        System.out.println(etitle);
        System.out.println(title);
        Connection con;
        Statement st;
        if(edescription.equals("List Description")){
            description =" ";
        }
        if(etitle.equals("List Title")) {
            JOptionPane.showMessageDialog(null,"Invaild Entry" );
        }else {
            try {
                Class.forName("org.sqlite.JDBC");
                con = DriverManager.getConnection("jdbc:sqlite:chronos.db");
                st = con.createStatement();
                st.executeUpdate("UPDATE lists SET title='"+etitle+"', description ='"+edescription+"', date = '"+edate+"' WHERE title ='" + title +"' and description='" + description +"' and date ='" + date + "'");

                st.close();
                con.close();

            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
            TableHelper newTable = new TableHelper();
            newTable.fillTable(table);
            frame.setVisible(false);
            JOptionPane.showMessageDialog(null,"List Saved Successfully" );
        }
    }

}