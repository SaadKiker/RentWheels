/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.saad.AdminComponents;

import static com.saad.AdminComponents.AdminReservationTable.populateResTable;
import static com.saad.AdminComponents.AdminReservationTable.refreshResReqTable;
import com.saad.Classes.Car;
import com.saad.Classes.Comment;
import static com.saad.Classes.Comment.deleteComment;
import com.saad.Classes.DBConnection;
import com.saad.ClientComponents.*;
import com.saad.swing.ScrollBar;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author saadk
 */
public final class AdminClientsTable extends javax.swing.JPanel {

    public AdminClientsTable() {
        initComponents();
        setOpaque(false);
        jsp.setVerticalScrollBar(new ScrollBar());
        jsp2.setVerticalScrollBar(new ScrollBar());
        populateReservationTable();
        populateAccountDeletionTable();
        jt1.getTableHeader().setDefaultRenderer(new TableDarkHeader());
         jt1.getTableHeader().setPreferredSize(new Dimension(0, 35));
         jt1.setDefaultRenderer(Object.class, new TableDarkCell());
         jt1.setRowHeight(30);
         jt2.getTableHeader().setDefaultRenderer(new TableDarkHeader());
         jt2.getTableHeader().setPreferredSize(new Dimension(0, 35));
         jt2.setDefaultRenderer(Object.class, new TableDarkCell2());
         jt2.setRowHeight(30);
         fixTable(jsp);
         fixTable(jsp2);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientCarCard2 = new com.saad.ClientComponents.ClientCarCard();
        jPanel1 = new javax.swing.JPanel();
        jsp = new javax.swing.JScrollPane();
        jt1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jsp2 = new javax.swing.JScrollPane();
        jt2 = new javax.swing.JTable();
        DeleteAccount = new javax.swing.JButton();
        denyRequest = new javax.swing.JButton();

        setBackground(new java.awt.Color(226, 226, 226));
        setMaximumSize(new java.awt.Dimension(1310, 762));
        setMinimumSize(new java.awt.Dimension(1310, 762));

        jPanel1.setBackground(new java.awt.Color(211, 211, 211));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(0, 1, 30, 30));

        jt1.setBackground(new java.awt.Color(204, 204, 204));
        jt1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jt1.setForeground(new java.awt.Color(51, 51, 51));
        jt1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First name", "Last name", "email", "Total amount"
            }
        ));
        jt1.setOpaque(false);
        jt1.setPreferredSize(new java.awt.Dimension(213312, 3100));
        jsp.setViewportView(jt1);

        jPanel1.add(jsp);

        jLabel1.setBackground(new java.awt.Color(255, 153, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Clients :");

        jLabel2.setBackground(new java.awt.Color(255, 153, 204));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText(" Client Account Deletion Requests :");

        jt2.setBackground(new java.awt.Color(204, 204, 204));
        jt2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jt2.setForeground(new java.awt.Color(51, 51, 51));
        jt2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First_name", "Last_name", "Email"
            }
        ));
        jt2.setOpaque(false);
        jt2.setPreferredSize(new java.awt.Dimension(587, 611));
        jsp2.setViewportView(jt2);

        DeleteAccount.setBackground(new java.awt.Color(236, 95, 95));
        DeleteAccount.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        DeleteAccount.setForeground(new java.awt.Color(0, 0, 0));
        DeleteAccount.setText("Delete Account");
        DeleteAccount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        DeleteAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteAccountMouseExited(evt);
            }
        });

        denyRequest.setBackground(new java.awt.Color(255, 204, 51));
        denyRequest.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        denyRequest.setForeground(new java.awt.Color(0, 0, 0));
        denyRequest.setText("Deny Request");
        denyRequest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        denyRequest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        denyRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                denyRequestMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                denyRequestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                denyRequestMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1244, Short.MAX_VALUE)
                    .addComponent(jsp2)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(denyRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(DeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsp2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(denyRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

       public void fixTable(JScrollPane scroll) {
        scroll.setVerticalScrollBar(new ScrollBar());
        JPanel panel = new JPanel();
        panel.setBackground(new Color(51,51,51));
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panel);
        scroll.getViewport().setBackground(new Color(51,51,51));
        scroll.setBorder(BorderFactory.createLineBorder(new Color(30,30,30), 2));
    }

    
        private class TableDarkHeader extends DefaultTableCellRenderer {

        private Map<Integer, Integer> alignment = new HashMap<>();

        public void setAlignment(int column, int align) {
            alignment.put(column, align);
        }

        @Override
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
            Component com = super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);
            com.setBackground(new Color(30,30,30));
            com.setForeground(new Color(200, 200, 200));
            com.setFont(com.getFont().deriveFont(Font.BOLD, 12));
            if (alignment.containsKey(i1)) {
                setHorizontalAlignment(alignment.get(i1));
            } else {
                setHorizontalAlignment(JLabel.LEFT);
            }
            return com;
        }
    }
        
         private class TableDarkCell extends DefaultTableCellRenderer {

        private Map<Integer, Integer> alignment = new HashMap<>();

        public void setAlignment(int column, int align) {
            alignment.put(column, align);
        }

        @Override
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int row, int column) {
            Component com = super.getTableCellRendererComponent(jtable, o, bln, bln1, row, column);
            if (isCellSelected(row, column)) {
                if (row % 2 == 0) {
                    com.setBackground(new Color(33, 103, 153));
                } else {
                    com.setBackground(new Color(29, 86, 127));
                }
            } else {
                if (row % 2 == 0) {
                    com.setBackground(new Color(102,102,102));
                } else {
                    com.setBackground(new Color(51,51,51));
                }
            }
            com.setForeground(new Color(200, 200, 200));
            setBorder(new EmptyBorder(0, 5, 0, 5));
            if (alignment.containsKey(column)) {
                setHorizontalAlignment(alignment.get(column));
            } else {
                setHorizontalAlignment(JLabel.LEFT);
            }
            return com;
        }
    }
             public boolean isCellSelected(int row, int column) {
    return jt1.isCellSelected(row, column);  
}    
        
    public boolean isCellSelected2(int row, int column) {
    return jt2.isCellSelected(row, column);  
}    
       private class TableDarkCell2 extends DefaultTableCellRenderer {

        private Map<Integer, Integer> alignment = new HashMap<>();

        public void setAlignment(int column, int align) {
            alignment.put(column, align);
        }

        @Override
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int row, int column) {
            Component com = super.getTableCellRendererComponent(jtable, o, bln, bln1, row, column);
            if (isCellSelected2(row, column)) {
                if (row % 2 == 0) {
                    com.setBackground(new Color(33, 103, 153));
                } else {
                    com.setBackground(new Color(29, 86, 127));
                }
            } else {
                if (row % 2 == 0) {
                    com.setBackground(new Color(102,102,102));
                } else {
                    com.setBackground(new Color(51,51,51));
                }
            }
            com.setForeground(new Color(200, 200, 200));
            setBorder(new EmptyBorder(0, 5, 0, 5));
            if (alignment.containsKey(column)) {
                setHorizontalAlignment(alignment.get(column));
            } else {
                setHorizontalAlignment(JLabel.LEFT);
            }
            return com;
        }
    }
    
    private void DeleteAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteAccountMouseEntered
        DeleteAccount.setBackground(new Color(231,58,58));
    }//GEN-LAST:event_DeleteAccountMouseEntered

    private void DeleteAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteAccountMouseExited
        DeleteAccount.setBackground(new Color(236,95,95));
    }//GEN-LAST:event_DeleteAccountMouseExited

    private void DeleteAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteAccountMouseClicked
    
int selectedRow = -1;
JTable selectedTable = null;

// Check if a row is selected in jt1
if (jt1.getSelectedRow() >= 0) {
    selectedRow = jt1.getSelectedRow();
    selectedTable = jt1;
}
// Check if a row is selected in jt2
else if (jt2.getSelectedRow() >= 0) {
    selectedRow = jt2.getSelectedRow();
    selectedTable = jt2;
}

// Check if a row is selected
if (selectedRow >= 0 && selectedTable != null) {
    // Get the first name, last name, and email from the selected row
    String firstName = (String) selectedTable.getValueAt(selectedRow, 0); // Assuming first name is stored in the first column
    String lastName = (String) selectedTable.getValueAt(selectedRow, 1); // Assuming last name is stored in the second column
    String email = (String) selectedTable.getValueAt(selectedRow, 2); // Assuming email is stored in the third column

    // Find the account ID based on first name, last name, and email
    String accountID = findAccountID(firstName, lastName, email);

    if (accountID != null) {
        try {
            // Delete the account based on the found account ID
            
            updateCarAvailability(Integer.parseInt(accountID));
            
            deleteCommentsByAccount(Integer.parseInt(accountID));
            
            AdminCommentFrame.CarCardGrid.removeAll();
             LinkedList<Comment> cmtlist = Comment.getComments();
            
             if (cmtlist != null) {
                  for (Comment cmt : cmtlist) {
                      AdminCommentCard commentCard = new AdminCommentCard(cmt);
                      AdminCommentFrame.CarCardGrid.add(commentCard);
                  }
             }
            
            deleteAccount(Integer.parseInt(accountID));
 
            // Delete the corresponding row from the "accountdeletion" table
            deleteAccountDeletion(Integer.parseInt(accountID));
            
            deleteReservation(Integer.parseInt(accountID));
            
            deleteResRequest(Integer.parseInt(accountID));
            
            deleteClient(Integer.parseInt(accountID));
            
            
            // Refresh the tables to reflect the changes
            populateReservationTable();
            populateAccountDeletionTable();
             refreshResReqTable();
            populateResTable();
            LinkedList<Car> cars = Car.listCars();
            
            if (cars != null) {
                AdminCarFrame.CarCardGrid.removeAll();
                for (Car car : cars) {                    
                    AdminCarCard carCard = new AdminCarCard(car);
                    AdminCarFrame.CarCardGrid.add(carCard);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminClientsTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        System.out.println("Account not found for the given details.");
    }
}


    }//GEN-LAST:event_DeleteAccountMouseClicked

    private void denyRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_denyRequestMouseClicked

        int selectedRow = -1;
JTable selectedTable = null;


// Check if a row is selected in jt2
if(jt2.getSelectedRow() >= 0) {
    selectedRow = jt2.getSelectedRow();
    selectedTable = jt2;
}

// Check if a row is selected
if (selectedRow >= 0 && selectedTable != null) {
    // Get the first name, last name, and email from the selected row
    String firstName = (String) selectedTable.getValueAt(selectedRow, 0); // Assuming first name is stored in the first column
    String lastName = (String) selectedTable.getValueAt(selectedRow, 1); // Assuming last name is stored in the second column
    String email = (String) selectedTable.getValueAt(selectedRow, 2); // Assuming email is stored in the third column

    // Find the account ID based on first name, last name, and email
    String accountID = findAccountID(firstName, lastName, email);

    if (accountID != null) {
        // Delete the corresponding row from the "accountdeletion" table
        deleteAccountDeletion(Integer.parseInt(accountID));

        // Refresh the tables to reflect the changes
        populateReservationTable();
        populateAccountDeletionTable();
    } else {
        System.out.println("Account not found for the given details.");
    }
}

    }//GEN-LAST:event_denyRequestMouseClicked

    private void deleteCommentsByAccount(int accountID) {
    try {
        Connection connection = DBConnection.getConnection();
        String query = "DELETE FROM comments WHERE Id_account = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, accountID);
        statement.executeUpdate();
    } catch (SQLException e) {
        System.err.println("Error deleting comments by account: " + e.getMessage());
    }
}
    
    private void updateCarAvailability(int accountID) {
    Connection connection = DBConnection.getConnection();
String query = "UPDATE car SET availability = 'Available' WHERE registration_number IN " +
               "(SELECT id_car FROM reservation WHERE id_account = ?)";

    try (PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setInt(1, accountID);
        statement.executeUpdate();
    } catch (SQLException e) {
        System.err.println("Error updating car availability: " + e.getMessage());
    }
}

    private void denyRequestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_denyRequestMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_denyRequestMouseEntered

    private void denyRequestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_denyRequestMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_denyRequestMouseExited
private String findAccountID(String firstName, String lastName, String email) {
    Connection connection = DBConnection.getConnection();
    String query = "SELECT ID_account FROM account WHERE First_name = ? AND Last_name = ? AND Email = ?";
    try (PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setString(1, firstName);
        statement.setString(2, lastName);
        statement.setString(3, email);

        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            return resultSet.getString("ID_account");
        }
    } catch (SQLException e) {
        System.err.println("Error finding account ID: " + e.getMessage());
    }
    return null;
}

public void deleteReservation(int accountID) {
    Connection connection = DBConnection.getConnection();
    String query = "DELETE FROM reservation WHERE Id_account  = ?";

    try (
         PreparedStatement statement = connection.prepareStatement(query)) {
        // Set the account ID parameter in the prepared statement
        statement.setInt(1, accountID);
        
        // Execute the query to delete the reservation
        int rowsAffected = statement.executeUpdate();
        
     
    } catch (SQLException e) {
        System.err.println("Error deleting reservation: " + e.getMessage());
    }
}

public void deleteAccount(int accountID) {
    Connection connection = DBConnection.getConnection();
    String query = "DELETE FROM account WHERE Id_account  = ?";

    try (
         PreparedStatement statement = connection.prepareStatement(query)) {
        // Set the account ID parameter in the prepared statement
        statement.setInt(1, accountID);
        
        // Execute the query to delete the account
        int rowsAffected = statement.executeUpdate();
        
      
    } catch (SQLException e) {
        System.err.println("Error deleting account: " + e.getMessage());
    }
}

public void deleteAccountDeletion(int accountID) {
    Connection connection = DBConnection.getConnection();
    String query = "DELETE FROM accountdeletion WHERE Id_account  = ?";

    try (
         PreparedStatement statement = connection.prepareStatement(query)) {
        // Set the account ID parameter in the prepared statement
        statement.setInt(1, accountID);
        
        // Execute the query to delete the row
        int rowsAffected = statement.executeUpdate();
        
    } catch (SQLException e) {
        System.err.println("Error deleting account deletion row: " + e.getMessage());
    }
}

public void deleteResRequest(int resRequestId) {
    // Database connection and query to delete the resRequest from the table "resreq"
    Connection connection = DBConnection.getConnection();
    PreparedStatement statement = null;
    
    try {
        // Establish the database connection
      
        
        // Prepare the delete query
        String query = "DELETE FROM resrequest WHERE Id_account = ?";
        statement = connection.prepareStatement(query);
        
        // Set the parameter value
        statement.setInt(1, resRequestId);
        
        // Execute the delete query
        statement.executeUpdate();
        
        System.out.println("ResRequest with ID " + resRequestId + " has been deleted successfully.");
    } catch (SQLException e) {
        System.out.println("An error occurred while deleting the ResRequest: " + e.getMessage());
    } 
}


public void deleteClient(int clientId) {
    // Database connection and query to delete the client from the "client" table
    Connection connection = DBConnection.getConnection();
    PreparedStatement statement = null;
    
    try {
        // Establish the database connection
        
        // Prepare the delete query
        String query = "DELETE FROM client WHERE Id_account = ?";
        statement = connection.prepareStatement(query);
        
        // Set the parameter value
        statement.setInt(1, clientId);
        
        // Execute the delete query
        statement.executeUpdate();
        
    } catch (SQLException e) {
        System.out.println("An error occurred while deleting the client: " + e.getMessage());
    } 
}


public static void populateReservationTable() {
    Connection connection = DBConnection.getConnection();
    String query = "SELECT a.First_name, a.Last_name, a.Email, SUM(r.payment) AS TotalAmount " +
                   "FROM account AS a " +
                   "JOIN client AS c ON a.Id_account = c.Id_account " +
                   "JOIN reservation AS r ON c.Id_account = r.Id_account " +
                   "GROUP BY a.First_name, a.Last_name, a.Email";

    try (
         Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(query)) {
        // Clear existing data in the "jt1" table
        DefaultTableModel model = (DefaultTableModel) jt1.getModel();
        model.setRowCount(0);

        // Populate the "jt1" table with retrieved data
        while (resultSet.next()) {
            String firstName = resultSet.getString("First_name");
            String lastName = resultSet.getString("Last_name");
            String email = resultSet.getString("Email");
            double totalAmount = resultSet.getDouble("TotalAmount");

            Object[] rowData = {firstName, lastName, email, totalAmount};
            model.addRow(rowData);
        }

    } catch (SQLException e) {
        System.err.println("Error populating reservation table: " + e.getMessage());
    }
}




public void populateAccountDeletionTable() {
    Connection connection = DBConnection.getConnection();
    String query = "SELECT first_name, last_name, email FROM accountdeletion";

    try (
         Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(query)) {
        // Clear existing data in the "jt2" table
        DefaultTableModel model = (DefaultTableModel) jt2.getModel();
        model.setRowCount(0);

        // Populate the "jt2" table with retrieved data
        while (resultSet.next()) {
            String firstName = resultSet.getString(1);
            String lastName = resultSet.getString(2);
            String email = resultSet.getString(3);

            Object[] rowData = {firstName, lastName, email};
            model.addRow(rowData);
        }

    } catch (SQLException e) {
        System.err.println("Error populating account deletion table: " + e.getMessage());
    }
}

      
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteAccount;
    private com.saad.ClientComponents.ClientCarCard clientCarCard2;
    private javax.swing.JButton denyRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jsp;
    private javax.swing.JScrollPane jsp2;
    public static javax.swing.JTable jt1;
    private javax.swing.JTable jt2;
    // End of variables declaration//GEN-END:variables
}
