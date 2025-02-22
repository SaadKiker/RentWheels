/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.saad.AdminComponents;

import static com.saad.AdminComponents.AdminClientsTable.populateReservationTable;
import com.saad.Classes.Car;
import com.saad.Classes.DBConnection;
import com.saad.ClientComponents.*;
import com.saad.swing.ScrollBar;
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
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author saadk
 */
public final class AdminReservationTable extends javax.swing.JPanel {

    public AdminReservationTable() {
        initComponents();
        setOpaque(false);
        jsp.setVerticalScrollBar(new ScrollBar());
       jsp2.setVerticalScrollBar(new ScrollBar());
        populateResReqTable();
        populateResTable();
         res.getTableHeader().setDefaultRenderer(new TableDarkHeader());
         res.getTableHeader().setPreferredSize(new Dimension(0, 35));
         res.setDefaultRenderer(Object.class, new TableDarkCell());
         res.setRowHeight(30);
         resreq.getTableHeader().setDefaultRenderer(new TableDarkHeader());
         resreq.getTableHeader().setPreferredSize(new Dimension(0, 35));
         resreq.setDefaultRenderer(Object.class, new TableDarkCell2());
         resreq.setRowHeight(30);
         fixTable(jsp);
         fixTable(jsp2);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clientCarCard2 = new com.saad.ClientComponents.ClientCarCard();
        jPanel1 = new javax.swing.JPanel();
        jsp = new javax.swing.JScrollPane();
        res = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jsp2 = new javax.swing.JScrollPane();
        resreq = new javax.swing.JTable();
        AcceptRequest = new javax.swing.JButton();
        R = new javax.swing.JButton();
        AcceptRequest1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(226, 226, 226));
        setMaximumSize(new java.awt.Dimension(1310, 768));
        setMinimumSize(new java.awt.Dimension(1310, 768));

        jPanel1.setBackground(new java.awt.Color(211, 211, 211));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(0, 1, 30, 30));

        res.setBackground(new java.awt.Color(204, 204, 204));
        res.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        res.setForeground(new java.awt.Color(51, 51, 51));
        res.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CIN", "Last name", "First name", "Email", "Car name", "Start Date", "End Date", "Amount"
            }
        ));
        res.setMaximumSize(new java.awt.Dimension(5235, 131313));
        res.setMinimumSize(new java.awt.Dimension(525, 0));
        res.setName(""); // NOI18N
        res.setOpaque(false);
        res.setPreferredSize(new java.awt.Dimension(213312, 3100));
        jsp.setViewportView(res);

        jPanel1.add(jsp);

        jLabel1.setBackground(new java.awt.Color(255, 153, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Reservations :");

        jLabel2.setBackground(new java.awt.Color(255, 153, 204));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText(" Client Reservations Requests :");

        resreq.setBackground(new java.awt.Color(204, 204, 204));
        resreq.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        resreq.setForeground(new java.awt.Color(51, 51, 51));
        resreq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CIN", "First name", "Last name", "Email", "Car name", "start Date", "End Date", "Amount"
            }
        ));
        resreq.setMaximumSize(new java.awt.Dimension(22222, 3123213));
        resreq.setMinimumSize(new java.awt.Dimension(525, 0));
        resreq.setOpaque(false);
        resreq.setPreferredSize(new java.awt.Dimension(587, 611));
        jsp2.setViewportView(resreq);

        AcceptRequest.setBackground(new java.awt.Color(255, 204, 51));
        AcceptRequest.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        AcceptRequest.setForeground(new java.awt.Color(0, 0, 0));
        AcceptRequest.setText("Accept Request");
        AcceptRequest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        AcceptRequest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AcceptRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AcceptRequestMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AcceptRequestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AcceptRequestMouseExited(evt);
            }
        });

        R.setBackground(new java.awt.Color(51, 51, 51));
        R.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        R.setForeground(new java.awt.Color(255, 204, 51));
        R.setText("R");
        R.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        R.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        R.setVisible(false);
        R.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RMouseExited(evt);
            }
        });

        AcceptRequest1.setBackground(new java.awt.Color(236, 95, 95));
        AcceptRequest1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        AcceptRequest1.setForeground(new java.awt.Color(0, 0, 0));
        AcceptRequest1.setText("Deny Request");
        AcceptRequest1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        AcceptRequest1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AcceptRequest1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AcceptRequest1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AcceptRequest1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AcceptRequest1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 885, Short.MAX_VALUE))
                    .addComponent(jsp2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AcceptRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(AcceptRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsp2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AcceptRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AcceptRequest1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
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
    return res.isCellSelected(row, column);  
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
    
    public boolean isCellSelected2(int row, int column) {
    return resreq.isCellSelected(row, column);
}
       
public static void populateResReqTable() {
    Connection connection =DBConnection.getConnection();
    try {
          String query = "SELECT c.CIN, a.first_name, a.last_name, a.email, car.model, r.start_date, r.end_date, r.payment " +
            "FROM client c " +
            "INNER JOIN account a ON c.id_account = a.Id_account " +
            "INNER JOIN resrequest r ON c.id_account = r.id_account " +
            "INNER JOIN car ON r.id_car = car.registration_number ";

            PreparedStatement statement = connection.prepareStatement(query);
                ResultSet rs = statement.executeQuery();
        // Clear existing data from the table
        DefaultTableModel model = (DefaultTableModel) resreq.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            String cin = rs.getString(1) ;
            String firstName = rs.getString(2);
            String lastName = rs.getString(3);
            String email = rs.getString(4);
            String carModel = rs.getString(5);
            String startDate = rs.getString(6);
            String endDate = rs.getString(7);
            double payment = rs.getDouble(8);

            Object[] rowData = {cin, firstName, lastName, email, carModel, startDate, endDate,payment};
            model.addRow(rowData);
        }
    } catch (SQLException ex) {
        System.out.println("Error while retrieving reservation data: " + ex.getMessage());
        ex.printStackTrace();
    }
}

    
    private void AcceptRequestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcceptRequestMouseEntered
            AcceptRequest.setBackground(new Color(193, 145, 0));                                           
    }//GEN-LAST:event_AcceptRequestMouseEntered

    private void AcceptRequestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcceptRequestMouseExited
            AcceptRequest.setBackground(new Color(255,204,51));                                             
    }//GEN-LAST:event_AcceptRequestMouseExited

    private void AcceptRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcceptRequestMouseClicked
        try {
            
            acceptRequest();
            populateReservationTable();
            
            LinkedList<Car> cars = Car.listCars();
            
            if (cars != null) {
                AdminCarFrame.CarCardGrid.removeAll();
                for (Car car : cars) {                    
                    AdminCarCard carCard = new AdminCarCard(car);
                    AdminCarFrame.CarCardGrid.add(carCard);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminReservationTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AcceptRequestMouseClicked

    private void AcceptRequest1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcceptRequest1MouseClicked

        denyRequest();

    }//GEN-LAST:event_AcceptRequest1MouseClicked

    private void AcceptRequest1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcceptRequest1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AcceptRequest1MouseEntered

    private void AcceptRequest1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcceptRequest1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AcceptRequest1MouseExited

    private void RMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMouseExited
        R.setBackground(new Color(51,51,51));
        R.setForeground(new Color(255,204,51));
    }//GEN-LAST:event_RMouseExited

    private void RMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMouseEntered
        R.setBackground(new Color(193, 145, 0));
        R.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_RMouseEntered

    private void RMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMouseClicked

        refreshResReqTable();
        populateResTable();
    }//GEN-LAST:event_RMouseClicked


          private void denyRequest() {
        int selectedRow = resreq.getSelectedRow();
        if (selectedRow == -1) {
            // No row selected
            return;
        }
        else { resreq.clearSelection();}

        try {
            String cin = resreq.getValueAt(selectedRow, 0).toString();
            String carName = resreq.getValueAt(selectedRow, 4).toString();

            // Delete the row from the "resrequest" table
            deleteFromResRequest(cin,carName);

            // Refresh the "resreq" table
            refreshResReqTable();

            // Populate the "res" table with data from the "reservation" table
            populateResTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
          
      private void acceptRequest() {
        int selectedRow = resreq.getSelectedRow();
        if (selectedRow == -1) {
            // No row selected
            return;
        }
        else { resreq.clearSelection();}

        try {
            String cin = resreq.getValueAt(selectedRow, 0).toString();
            String firstName = resreq.getValueAt(selectedRow, 1).toString();
            String lastName = resreq.getValueAt(selectedRow, 2).toString();
            String email = resreq.getValueAt(selectedRow, 3).toString();
            String carName = resreq.getValueAt(selectedRow, 4).toString();
            String startDate = resreq.getValueAt(selectedRow, 5).toString();
            String endDate = resreq.getValueAt(selectedRow, 6).toString();
            double payment = (double) resreq.getValueAt(selectedRow, 7);
            
            
            // Delete the row from the "resrequest" table
            deleteFromResRequest(cin,carName);

            // Insert the data into the "reservation" table
            insertIntoReservation(cin,firstName, lastName, email, carName, startDate, endDate, payment);

            // Refresh the "resreq" table
            refreshResReqTable();

            // Populate the "res" table with data from the "reservation" table
            populateResTable();
            
            int acc_id = getIdAccountByCIN(cin);
            int id = getReservationId(acc_id,startDate,endDate);
            makeNotfi(acc_id,id,carName,endDate);
            //Store a new notification related to this reservation
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
      
private int getReservationId(int Id_account, String start_date, String end_date) throws SQLException {
    Connection connection = DBConnection.getConnection();
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    int reservationId = -1;

    String query = "SELECT id_reservation FROM reservation WHERE Id_account = ? AND start_date = ? AND end_date = ?";

    try {
        statement = connection.prepareStatement(query);
        statement.setInt(1, Id_account);
        statement.setString(2, start_date);
        statement.setString(3, end_date);
        resultSet = statement.executeQuery();

        if (resultSet.next()) {
            reservationId = resultSet.getInt("id_reservation");
        }
    } catch (SQLException ex) {
        System.out.println("Error while retrieving reservation ID: " + ex.getMessage());
        ex.printStackTrace();
    }
    return reservationId;
}

private void makeNotfi(int Id_account, int id, String Car_name, String End_Date) throws SQLException {
    Connection connection = DBConnection.getConnection();
    PreparedStatement statement = null;

    String query = "INSERT INTO notification (Id_account, Id_reservation, message , seen) VALUES (?, ?, ?, ?)";

    try {
        statement = connection.prepareStatement(query);
        statement.setInt(1, Id_account);
        statement.setInt(2, id);
        statement.setString(3, "Reservation accepted successfully! The end date for returning "+ Car_name + " is : " + End_Date);
        statement.setString(4, "no");
        statement.executeUpdate();
    } catch (SQLException ex) {
        System.out.println("Error while inserting notification: " + ex.getMessage());
        ex.printStackTrace();
    }
}


     private int getIdAccountByCIN(String cin) throws SQLException {
    Connection connection = DBConnection.getConnection();
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    int idAccount = -1;

    String query = "SELECT Id_account FROM client WHERE CIN = ?";

    try {
        statement = connection.prepareStatement(query);
        statement.setString(1, cin);
        resultSet = statement.executeQuery();

        if (resultSet.next()) {
            idAccount = resultSet.getInt("Id_account");
        }
    } catch (SQLException ex) {
        System.out.println("Error while retrieving Id_account: " + ex.getMessage());
        ex.printStackTrace();
    } 
    return idAccount;
}



      
private void deleteFromResRequest(String cin, String carName) throws SQLException {
    Connection connection = DBConnection.getConnection();

    PreparedStatement statement = null;

    try {
        String query = "DELETE FROM resrequest WHERE id_account IN " +
                "(SELECT id_account FROM client WHERE CIN = ?) AND " +
                "id_car IN (SELECT registration_number FROM car WHERE model = ?)";
        statement = connection.prepareStatement(query);
        statement.setString(1, cin);
        statement.setString(2, carName);
        statement.executeUpdate();
    } catch (SQLException ex) {
        System.out.println("Error while deleting from resrequest table: " + ex.getMessage());
        ex.printStackTrace();
    } 
}


      
private void insertIntoReservation(String cin, String firstName, String lastName, String email,
        String carName, String startDate, String endDate, double payment) throws SQLException {
    Connection connection = DBConnection.getConnection();
    PreparedStatement reservationStatement = null;
    PreparedStatement updateStatement = null;

    String reservationQuery = "INSERT INTO reservation (id_account, id_car, start_date, end_date, payment) " +
            "SELECT c.id_account, car.registration_number, ?, ?, ? " +
            "FROM client c " +
            "INNER JOIN car ON car.model = ? " +
            "WHERE c.CIN = ?";

    String updateQuery = "UPDATE car SET availability = 'Occupied' WHERE registration_number = " +
            "(SELECT id_car FROM reservation WHERE id_reservation = ?)";

    try {
        // Insert into reservation
        reservationStatement = connection.prepareStatement(reservationQuery);
        reservationStatement.setString(1, startDate);
        reservationStatement.setString(2, endDate);
        reservationStatement.setDouble(3, payment);
        reservationStatement.setString(4, carName);
        reservationStatement.setString(5, cin);
        reservationStatement.executeUpdate();

        // Update car availability
        int reservationId = getReservationId(cin, carName);
        updateStatement = connection.prepareStatement(updateQuery);
        updateStatement.setInt(1, reservationId);
        updateStatement.executeUpdate();
    } catch (SQLException ex) {
        System.out.println("Error while inserting into reservation and updating car availability: " + ex.getMessage());
        ex.printStackTrace();
    } 
}

private int getReservationId(String cin, String carName) throws SQLException {
    Connection connection = DBConnection.getConnection();
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    int reservationId = -1;

    String query = "SELECT id_reservation FROM reservation WHERE id_account = " +
            "(SELECT c.id_account FROM client c WHERE c.CIN = ?) AND " +
            "id_car = (SELECT car.registration_number FROM car WHERE car.model = ?)";

    try {
        statement = connection.prepareStatement(query);
        statement.setString(1, cin);
        statement.setString(2, carName);
        resultSet = statement.executeQuery();

        if (resultSet.next()) {
            reservationId = resultSet.getInt("id_reservation");
        }
    } catch (SQLException ex) {
        System.out.println("Error while retrieving reservation ID: " + ex.getMessage());
        ex.printStackTrace();
    } 

    return reservationId;
}




public static void refreshResReqTable() {
    DefaultTableModel model = (DefaultTableModel) resreq.getModel();
    model.setRowCount(0); // Clear existing data

    // Repopulate the "resreq" table with data from the "resrequest" table
    populateResReqTable();
}

public static void populateResTable() {
    Connection connection = DBConnection.getConnection();
    PreparedStatement statement = null;
    ResultSet rs = null;
    String query = "SELECT c.CIN, a.first_name, a.last_name, a.email, car.model, r.start_date, r.end_date,r.payment " +
            "FROM reservation r " +
            "INNER JOIN client c ON c.id_account = r.id_account " +
            "INNER JOIN account a ON a.Id_account = c.id_account " +
            "INNER JOIN car ON car.registration_number = r.id_car ";

    try {
        
        statement = connection.prepareStatement(query);
        rs = statement.executeQuery();

        DefaultTableModel model;
        model = (DefaultTableModel) res.getModel();
        model.setRowCount(0); // Clear existing data

        while (rs.next()) {
            String cin = rs.getString(1);
            String firstName = rs.getString(2);
            String lastName = rs.getString(3);
            String email = rs.getString(4);
            String carName = rs.getString(5);
            String startDate = rs.getString(6);
            String endDate = rs.getString(7);
            double payment = rs.getDouble(8);

            Object[] rowData = {cin, firstName, lastName, email, carName, startDate, endDate,payment};
            model.addRow(rowData);
        }
    } catch (SQLException ex) {
        System.out.println("Error while retrieving reservation data: " + ex.getMessage());
        ex.printStackTrace();
    }

}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptRequest;
    private javax.swing.JButton AcceptRequest1;
    private javax.swing.JButton R;
    private com.saad.ClientComponents.ClientCarCard clientCarCard2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jsp;
    private javax.swing.JScrollPane jsp2;
    public static javax.swing.JTable res;
    public static javax.swing.JTable resreq;
    // End of variables declaration//GEN-END:variables
}
