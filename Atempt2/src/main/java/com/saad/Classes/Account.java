package com.saad.Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;


public class Account {
    
    public int Id ;
    public String FirstName, LastName, Email, Password ;


    public Account(int Id, String FirstName, String LastName, String Email, String Password) {
        this.Id = Id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Password = Password;
    }

    public Account() {
    }
    
public static Account Login(String email, String password) {
    
    Account account = null;
    String query = "SELECT * FROM account WHERE email=? AND password=?";
    Connection connection = DBConnection.getConnection();
    try {
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, email);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            int id = rs.getInt(1);
            String firstName = rs.getString(2);
            String LastName = rs.getString(3);
            
            account = new Account(id, firstName, LastName, email,password);
        }
        
    } catch (SQLException ex) {
        System.out.println("Error while logging in: " + ex.getMessage());
    }
    return account;
}
    
    public static boolean LoginAdmin(String email, String password) {
        
        boolean result = false;

        if (email.equals("saadkiker@gmail.com") && password.equals("0000")) {
            result = true;
        } else {  result = false;  }

            return result;
    }
    
    public static Account Signup(String Firstname, String Lastname,String email, String password){
        
     String request = "insert into account(Id_account,First_name,Last_name,email,password) values(null,?,?,?,?)";
    Connection connection = DBConnection.getConnection();

    try {
        PreparedStatement ps = connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);

        ps.setString(1, Firstname);
        ps.setString(2, Lastname);
        ps.setString(3, email);
        ps.setString(4, password);

        int result = ps.executeUpdate();

        if (result == 1) {
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                Account account = new Account(id, Firstname, Lastname, email,password);
                return account;
            }
        }

    } catch (SQLException ex) {
        System.out.println("Erreur lors de l'enregistrement: " + ex.getMessage());
        ex.printStackTrace();
    }
    return null;
    }
    
    public static LinkedList<Account> ListAccounts() throws SQLException{
            
            LinkedList<Account> AccountList = new LinkedList<Account>();
            java.sql.Connection connection = DBConnection.getConnection();
            String req = "SELECT * From account";
            
        try {

                Statement s = connection.createStatement();
                ResultSet result = s.executeQuery(req);
                
                Account acc = null;
                
                while(result.next()){
                    
                    int id = result.getInt(1);
                    String First_name = result.getString(2);
                    String Last_name = result.getString(3);
                    String email = result.getString(4);
                    String password = result.getString(5);
                    
                    acc = new Account(id, First_name, Last_name, email,password);
                    AccountList.add(acc);
                }
        }
        catch(SQLException e){
                System.out.println("Probleme lors de la recuperation de la liste.");
        }
         return AccountList;  
    }

    public static Account findAccount(int id) {
    Account account = null;
    try {
        Connection connection = DBConnection.getConnection();
        String req = "SELECT * FROM account WHERE Id_account = ?";
        PreparedStatement ps = connection.prepareStatement(req);
        ps.setInt(1, id);
        ResultSet result = ps.executeQuery();
        if (result.next()) {
            String first_name = result.getString("First_name");
            String last_name = result.getString("Last_name");
            String email = result.getString("Email");
            String password = result.getString("Password");
            account = new Account(id, first_name, last_name, email, password);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return account;
}

    
}