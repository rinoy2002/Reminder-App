package Chronos;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class TableHelper {

    public void fillTable(JTable table) {
        Connection c;
        Statement st;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:chronos.db");
            st = c.createStatement();
            ResultSet rs = st.executeQuery("select * from lists  ");
            //To remove previously added rows
            while (table.getRowCount() > 0) {
                ((DefaultTableModel) table.getModel()).removeRow(0);
            }
            int columns = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                ((DefaultTableModel) table.getModel()).insertRow(rs.getRow() - 1, row);
            }

            rs.close();
            st.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void searchTitleTable(JTable table, String title) {
        Connection c;
        Statement st;
        if (title.equals("Search List")) {
            JOptionPane.showMessageDialog(null, "Invalid Input");
        } else {
            try {
                Class.forName("org.sqlite.JDBC");
                c = DriverManager.getConnection("jdbc:sqlite:chronos.db");
                st = c.createStatement();
                ResultSet r = st.executeQuery("select * from lists where `title` = '" + title + "'");
                if (!r.next()) {
                    JOptionPane.showMessageDialog(null, " No List Found!");
                }
                ResultSet rs = st.executeQuery("select * from lists where `title` = '" + title + "'");
                while (table.getRowCount() > 0) {
                    ((DefaultTableModel) table.getModel()).removeRow(0);
                }
                int columns = rs.getMetaData().getColumnCount();
                while (rs.next()) {
                    Object[] row = new Object[columns];
                    for (int i = 1; i <= columns; i++) {
                        row[i - 1] = rs.getObject(i);
                    }
                    ((DefaultTableModel) table.getModel()).insertRow(rs.getRow() - 1, row);
                }

                rs.close();
                st.close();
                c.close();
            } catch (SQLException e) {
               e.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void searchDateTable(JTable table, String date) {
        Connection c;
        Statement st;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:chronos.db");
            st = c.createStatement();
            ResultSet r = st.executeQuery("select * from lists where `date` = '" + date + "'");
            if (!r.next()) {
                JOptionPane.showMessageDialog(null, " No List Found!");
            }
            ResultSet rs = st.executeQuery("select * from lists where `date` = '" + date + "'");
            while (table.getRowCount() > 0) {
                ((DefaultTableModel) table.getModel()).removeRow(0);
            }
            int columns = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                ((DefaultTableModel) table.getModel()).insertRow(rs.getRow() - 1, row);
            }
            rs.close();
            st.close();
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

}
