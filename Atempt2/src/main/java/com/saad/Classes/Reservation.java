package com.saad.Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class Reservation {
    private int id;
    private String startDate;
    private String endDate;
    private int id_acc;
    private int id_car;
    private double payment;
    
    public Reservation() {
        // default constructor
    }
    
    public Reservation(String startDate, String endDate, int id_acc, int id_car, double payement) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.id_acc = id_acc;
        this.id_car = id_car;
        this.payment = payment;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getStartDate() {
        return startDate;
    }
    
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    
    public String getEndDate() {
        return endDate;
    }
    
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
    public int getId_acc() {
        return id_acc;
    }
    
    public void setId_acc(int id_acc) {
        this.id_acc = id_acc;
    }
    
    public int getId_car() {
        return id_car;
    }
    
    public void setId_car(int id_car) {
        this.id_car = id_car;
    }
    
   public static Reservation addReservation(String startDate, String endDate, int id_acc, int id_car,double payment) {
    Connection connection = null;
            connection = DBConnection.getConnection();
    PreparedStatement statement = null;
    ResultSet rs = null;
    String query = "INSERT INTO resrequest (id_reservation ,id_account, id_car, start_date, end_date,payment) VALUES (NULL, ?, ?, ?, ?, ?)";
    try {
        connection = DBConnection.getConnection();
        statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        statement.setInt(1, id_acc);
        statement.setInt(2, id_car);
        statement.setString(3, startDate);
        statement.setString(4, endDate);
        statement.setDouble(5,payment);

        int rowsAffected = statement.executeUpdate();

        if (rowsAffected == 1) {
            rs = statement.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                Reservation reservation = new Reservation(startDate, endDate, id_acc, id_car,payment);
                reservation.setId(id);
                return reservation;
            }
        }
    } catch (SQLException ex) {
        System.out.println("Error while inserting reservation: " + ex.getMessage());
        ex.printStackTrace();
    } 
    return null; // return null if insertion fails
}
   
       public static LinkedList<Reservation> getAllReservationRequests() {
        LinkedList<Reservation> reservations = new LinkedList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        String query = "SELECT * FROM resrequest";
        
        try {
            connection = DBConnection.getConnection();
            statement = connection.prepareStatement(query);
            rs = statement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_reservation");
                int id_acc = rs.getInt("id_account");
                int id_car = rs.getInt("id_car");
                String startDate = rs.getString("start_date");
                String endDate = rs.getString("end_date");
                double payment = rs.getDouble("payment");

                Reservation reservation = new Reservation(startDate, endDate, id_acc, id_car,payment);
                reservation.setId(id);
                reservations.add(reservation);
            }
        } catch (SQLException ex) {
            System.out.println("Error while retrieving reservations: " + ex.getMessage());
            ex.printStackTrace();
        }
         return reservations;
    }

public static int getReservationId(int accountId, int carRegistrationNumber) throws SQLException {
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    int reservationId = -1;

    try {
        connection = DBConnection.getConnection();
        String query = "SELECT id_reservation FROM reservation WHERE id_account = ? AND id_car = ?";
        statement = connection.prepareStatement(query);
        statement.setInt(1, accountId);
        statement.setInt(2, carRegistrationNumber);
        resultSet = statement.executeQuery();

        if (resultSet.next()) {
            reservationId = resultSet.getInt("id_reservation");
        }
    } catch (SQLException ex) {
        System.out.println("Error while retrieving reservation ID: " + ex.getMessage());
    }

    return reservationId;
}


public static Reservation getReservationById(int reservationId) throws SQLException {
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet rs = null;
    Reservation reservation = null;

    try {
        connection = DBConnection.getConnection();
        String query = "SELECT * FROM reservation WHERE id_reservation = ?";
        statement = connection.prepareStatement(query);
        statement.setInt(1, reservationId);
        rs = statement.executeQuery();

        if (rs.next()) {
            // Retrieve reservation details from the result set
               int id = rs.getInt("id_reservation");
                int id_acc = rs.getInt("id_account");
                int id_car = rs.getInt("id_car");
                String startDate = rs.getString("start_date");
                String endDate = rs.getString("end_date");
                double payment = rs.getDouble("payment");

                 reservation = new Reservation(startDate, endDate, id_acc, id_car,payment);
        }
    } catch (SQLException ex) {
        System.out.println("Error while retrieving reservation: " + ex.getMessage());
    } 

    return reservation;
}

    
}
