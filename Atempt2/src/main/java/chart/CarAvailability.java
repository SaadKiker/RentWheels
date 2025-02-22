package chart;

import com.saad.Classes.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarAvailability {
    private int numAvailable;
    private int numUnavailable;

    public CarAvailability() {
    }

    public static int getNumAvailable() {
        return calculateNumCars("available");
    }

    public static int getNumUnavailable() {
        return calculateNumCars("occupied");
    }

    public static int calculateNumCars(String availability) {
        int numCars = 0;
        Connection connection = DBConnection.getConnection();
        String query = "SELECT COUNT(*) AS count FROM car WHERE availability = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, availability);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                numCars = resultSet.getInt("count");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return numCars;
    }
}
