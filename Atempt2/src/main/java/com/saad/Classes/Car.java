package com.saad.Classes;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import javax.swing.SwingConstants;


public class Car {
    private int registrationNumber;
    private String color;
    private String model;
    private double price;
    private String availability;
    private byte[] picture;

    public Car(int registrationNumber, String color, String model, double price, String availability, byte[] picture) {
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.model = model;
        this.price = price;
        this.availability = availability;
        this.picture = picture;
    }

    public Car() {
    }
    
    

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

public String getAvailability() {
    if (availability != null) {
        return availability; // Return the availability if it has already been set in the object
    }

    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    String availability = null;

    String query = "SELECT availability FROM reservation WHERE id_car = ?";

    try {
        connection = DBConnection.getConnection();
        statement = connection.prepareStatement(query);
        statement.setInt(1, registrationNumber);
        resultSet = statement.executeQuery();

        if (resultSet.next()) {
            availability = resultSet.getString("availability");
            this.availability = availability; // Set the availability in the object for future use
        }
    } catch (SQLException ex) {
        System.out.println("Error while retrieving availability: " + ex.getMessage());
        ex.printStackTrace();
    } 
    return availability;
}



    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }


public static Car insertCar(String model, String color, double price,byte[] photo) {

    String query = "INSERT INTO car (registration_number, color, model, price, availability, picture) VALUES (null, ?, ?, ?, ?, ?)";

    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet rs = null;
    try {
        connection = DBConnection.getConnection();
        statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        statement.setString(1, color);
        statement.setString(2, model);
        statement.setDouble(3, price);
        statement.setString(4, "Available");
        statement.setBytes(5, photo); // set picture to null by default

        int rowsAffected = statement.executeUpdate();

        if (rowsAffected == 1) {
            rs = statement.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                Car car = new Car(id, color, model, price, "Available", photo);
                return car;
            }
        }
    } catch (SQLException ex) {
        System.out.println("Error while inserting car: " + ex.getMessage());
        ex.printStackTrace();
    }
    return null; // return null if insertion fails
}

public static LinkedList<Car> listCars() throws SQLException {
    LinkedList<Car> carList = new LinkedList<>();
    Connection connection = DBConnection.getConnection();
    String query = "SELECT * FROM car";

    try (Statement statement = connection.createStatement();
         ResultSet resultSet = statement.executeQuery(query)) {

        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String color = resultSet.getString(2);
            String model = resultSet.getString(3);
            double price = resultSet.getDouble(4);
            String availability = resultSet.getString(5);
            byte[] picture = resultSet.getBytes(6);
            
            Car car = new Car(id, color, model, price, availability, picture);
            carList.add(car);
            

        }

    } catch (SQLException ex) {
        System.out.println("Error while listing cars: " + ex.getMessage());
        ex.printStackTrace();
    }
    return carList;
}

public static LinkedList<Car> listResCars(Account account) throws SQLException {
    LinkedList<Car> carList = new LinkedList<>();
    Connection connection = DBConnection.getConnection();
    String query = "SELECT car.* FROM car INNER JOIN reservation ON car.registration_number  = reservation.id_car WHERE reservation.id_account = ?";

    try (PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setInt(1, account.Id);

        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String color = resultSet.getString(2);
                String model = resultSet.getString(3);
                double price = resultSet.getDouble(4);
                String availability = resultSet.getString(5);
                byte[] picture = resultSet.getBytes(6);

                Car car = new Car(id, color, model, price, availability, picture);
                carList.add(car);
            }
        }
    } catch (SQLException ex) {
        System.out.println("Error while listing reserved cars: " + ex.getMessage());
        ex.printStackTrace();
    }
    return carList;
}





public static Car findCar(int idcar) throws SQLException {
    Car car = null ;
    Connection connection = DBConnection.getConnection();
    String query = "SELECT * FROM car where registration_number = ?" ;

    try (PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setInt(1, idcar);
        try (ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                int id = resultSet.getInt(1);
                String color = resultSet.getString(2);
                String model = resultSet.getString(3);
                double price = resultSet.getDouble(4);
                String availability = resultSet.getString(5);
                byte[] picture = resultSet.getBytes(6);

                car = new Car(id, color, model, price, availability, picture);
            }
        }
    } catch (SQLException ex) {
        System.out.println("Error while getting car: " + ex.getMessage());
        ex.printStackTrace();
    }
    return car;
}

public static boolean updateCar(int id, String color, String model, double price, String availability, byte[] picture) {
    Connection connection = DBConnection.getConnection();
    String query = "UPDATE car SET color=?, model=?, price=?, picture=? WHERE registration_number=?";

    try (PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setString(1, color);
        statement.setString(2, model);
        statement.setDouble(3, price);
        statement.setBytes(4, picture);
        statement.setInt(5, id);

        int rowsAffected = statement.executeUpdate();

        return rowsAffected == 1;
    } catch (SQLException ex) {
        System.out.println("Error while updating car: " + ex.getMessage());
        ex.printStackTrace();
    }
    return false;
}


public static boolean deleteCar(int id) {
    Connection connection = null;
    PreparedStatement statement = null;
    
    try {
        connection = DBConnection.getConnection();
        
        String query = "DELETE FROM car WHERE registration_number = ?";
        statement = connection.prepareStatement(query);
        statement.setInt(1, id);
        
        int rowsAffected = statement.executeUpdate();
        
        // If the query affected any rows, return true, else return false
        return rowsAffected > 0;
        
    } catch (SQLException ex) {
        System.out.println("Error while deleting car: " + ex.getMessage());
        ex.printStackTrace();
        }
    // If the method reaches here, something went wrong, so return false
    return true;
}



}
