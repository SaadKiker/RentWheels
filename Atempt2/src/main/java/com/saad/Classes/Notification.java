/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saad.Classes;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;


public class Notification {
    
    private int Id_account;
    private int Id_reservation;
    private String message;
    private String seen;

    public Notification(int Id_account, int Id_reservation, String message, String seen) {
        this.Id_account = Id_account;
        this.Id_reservation = Id_reservation;
        this.message = message;
        this.seen = seen;
    }



    public int getId_account() {
        return Id_account;
    }

    public void setId_account(int Id_account) {
        this.Id_account = Id_account;
    }

    public int getId_reservation() {
        return Id_reservation;
    }

    public void setId_reservation(int Id_reservation) {
        this.Id_reservation = Id_reservation;
    }

    public String getSeen() {
        return seen;
    }

    public void setSeen(String seen) {
        this.seen = seen;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
public static String checkNotificationSeenStatus(int idAccount) throws SQLException {
    Connection connection = DBConnection.getConnection();
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    String seenStatus = "yes"; // Default value

    String query = "SELECT seen FROM notification WHERE id_account = ?";

    try {
        statement = connection.prepareStatement(query);
        statement.setInt(1, idAccount);
        resultSet = statement.executeQuery();

        boolean hasSeenYes = false;

        while (resultSet.next()) {
            String seen = resultSet.getString("seen");
            if (seen.equals("no")) {
                hasSeenYes = true;
                break;
            }
        }

        if (hasSeenYes) {
            seenStatus = "no";
        }
    } catch (SQLException ex) {
        System.out.println("Error while checking notification seen status: " + ex.getMessage());
        ex.printStackTrace();
    }
    return seenStatus;
}

public static LinkedList<Notification> getNotifications() throws SQLException {
    Connection connection = DBConnection.getConnection();
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    LinkedList<Notification> notificationslist = new LinkedList<>();

    String query = "SELECT * FROM notification";

    try {
        statement = connection.prepareStatement(query);
        resultSet = statement.executeQuery();

        while (resultSet.next()) {
            int idAccount = resultSet.getInt("Id_account");
            int idReservation = resultSet.getInt("Id_reservation");
            String message = resultSet.getString("message");
            String seen = resultSet.getString("seen");

            Notification notification = new Notification(idAccount, idReservation, message, seen);
            notificationslist.add(notification);

        }
    } catch (SQLException ex) {
        System.out.println("Error while retrieving notifications: " + ex.getMessage());
        ex.printStackTrace();
    } 
    return notificationslist;
}

public static void markNotificationAsSeen(int Id_reservation) throws SQLException {
    Connection connection = DBConnection.getConnection();
    PreparedStatement statement = null;

    String query = "UPDATE notification SET seen = 'yes' WHERE Id_reservation = ?";

    try {
        statement = connection.prepareStatement(query);
        statement.setInt(1, Id_reservation);
        statement.executeUpdate();
    } catch (SQLException ex) {
        System.out.println("Error while marking notification as seen: " + ex.getMessage());
        ex.printStackTrace();
    }
}

public static void deleteNotificationReservation(int reservationId) throws SQLException {
    Connection connection = DBConnection.getConnection();
    PreparedStatement statement = null;

    String query = "DELETE FROM notification WHERE Id_reservation = ?";

    try {
        statement = connection.prepareStatement(query);
        statement.setInt(1, reservationId);
        statement.executeUpdate();
    } catch (SQLException ex) {
        System.out.println("Error while deleting reservation from notification table: " + ex.getMessage());
        ex.printStackTrace();
    }
}

    
    
}
