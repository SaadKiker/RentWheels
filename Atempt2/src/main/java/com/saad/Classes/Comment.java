package com.saad.Classes;

import static com.saad.Classes.Account.findAccount;
import static com.saad.Classes.Car.findCar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class Comment {
    private int id;
    private String text;
    private int Id_account ;
    
    public Comment() {
        // default constructor
    }
    
    public Comment(int id , String text,int Id_account) {
        this.id =id;
        this.text = text;
        this.Id_account = Id_account;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getText() {
        return text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
        public int getAccount() {
        return Id_account;
    }


    public static void AddComment(String text, int accountId) {
    // Database connection and query to add a comment to the "comment" table
    Connection connection = null;
    PreparedStatement statement = null;
    
    try {
        // Establish the database connection
        connection = DBConnection.getConnection();
        
        // Prepare the insert query
        String query = "INSERT INTO comments (Id_comment,text, id_account) VALUES (null,?, ?)";
        statement = connection.prepareStatement(query);
        
        // Set the parameter values
        statement.setString(1, text);
        statement.setInt(2, accountId);
        
        // Execute the insert query
        statement.executeUpdate();
        
    } catch (SQLException e) {
        System.out.println("An error occurred while adding the comment: " + e.getMessage());
    } 
}
    

public static LinkedList<Comment> getComments() {
    LinkedList<Comment> comments = new LinkedList<>();
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    try {
        connection = DBConnection.getConnection();
        statement = connection.createStatement();

        String query = "SELECT * FROM comments";
        resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            int id = resultSet.getInt("Id_comment");
            String text = resultSet.getString("text");
            int accountId = resultSet.getInt("Id_account");

            Comment comment = new Comment(id, text, accountId);
            comments.add(comment);
        }
    } catch (SQLException e) {
        System.out.println("An error occurred while retrieving comments: " + e.getMessage());
    } 
    return comments;
}

public static void deleteComment(int id_comment) throws SQLException {
    Connection connection = DBConnection.getConnection();
    PreparedStatement statement = null;

    String query = "DELETE FROM comments WHERE id_comment = ?";

    try {
        statement = connection.prepareStatement(query);
        statement.setInt(1, id_comment);
        statement.executeUpdate();
    } catch (SQLException ex) {
        System.out.println("Error while deleting comment: " + ex.getMessage());
        ex.printStackTrace();
    }
}

        

        
}
