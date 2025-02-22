package com.saad.Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Client extends Account {
    public String CIN;
    
    public Client(int Id, String FirstName, String LastName, String Email, String Password, String CIN) {
        super(Id, FirstName, LastName, Email, Password);
        this.CIN = CIN;
    }
    
    public Client() {
        super();
    }
    
    
    public static void AddClient(String cin , int idacc) {
    String query = "INSERT INTO client (cin , Id_account) VALUES (?, ?)";
            Connection conn = DBConnection.getConnection();
    try{

         PreparedStatement ps = conn.prepareStatement(query);

        ps.setString(1, cin);
        ps.setInt(2, idacc);

        ps.executeUpdate();
        if (conn.isClosed()) {
        System.out.println("Connection closed");}

    } catch (SQLException ex) {
        System.out.println("Error while adding client: " + ex.getMessage());
        ex.printStackTrace();
}
    }
    
public static boolean accountExists(int id) {
    boolean exists = false;
    String query = "SELECT id_account FROM client WHERE id_account = ?";
    Connection connection = DBConnection.getConnection();
    try {
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        exists = rs.next();
    } catch (SQLException ex) {
        System.out.println("Error while checking account existence: " + ex.getMessage());
    }
    return exists;
}

public static String getCINByAccountId(int accountId) {
    String cin = null;
    String query = "SELECT cin FROM client WHERE Id_account = ?";
    Connection connection = DBConnection.getConnection();
    try {
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setInt(1, accountId);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            cin = rs.getString("cin");
        }
    } catch (SQLException ex) {
        System.out.println("Error while retrieving CIN: " + ex.getMessage());
    }
    return cin;
}
}