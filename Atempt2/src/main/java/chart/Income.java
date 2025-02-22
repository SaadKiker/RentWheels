package chart ;

import com.saad.Classes.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Income {
    private int Ijanuary;
    private int Ifebruary;
    private int Imarch;
    private int Iapril;
    private int Imay;
    private int Ijune;
    private int Ijuly;
    private int Iaugust;
    private int Iseptember;
    private int Ioctober;
    private int Inovember;
    private int Idecember;

    public Income() {
    }

    public static int getIjanuary() {
        return calculateIncome("2023-01-01", "2023-01-31");
    }

    public static int getIfebruary() {
        return calculateIncome("2023-02-01", "2023-02-28");
    }

    public static int getImarch() {
        return calculateIncome("2023-03-01", "2023-03-31");
    }

    public static int getIapril() {
        return calculateIncome("2023-04-01", "2023-04-30");
    }

    public static int getImay() {
        return calculateIncome("2023-05-01", "2023-05-31");
    }

    public static int getIjune() {
        return calculateIncome("2023-06-01", "2023-06-30");
    }

    public static int getIjuly() {
        return calculateIncome("2023-07-01", "2023-07-31");
    }

    public static int getIaugust() {
        return calculateIncome("2023-08-01", "2023-08-31");
    }

    public static int getIseptember() {
        return calculateIncome("2023-09-01", "2023-09-30");
    }

    public static int getIoctober() {
        return calculateIncome("2023-10-01", "2023-10-31");
    }

    public static int getInovember() {
        return calculateIncome("2023-11-01", "2023-11-30");
    }

    public static int getIdecember() {
        return calculateIncome("2023-12-01", "2023-12-31");
    }

public static int calculateIncome(String startDate, String endDate) {
    int income = 0;
    Connection connection = DBConnection.getConnection();
    String query = "SELECT SUM(Payment) AS total_income FROM Reservation WHERE start_date <= ? AND end_date >= ?";

    try (PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setString(1, endDate);
        statement.setString(2, startDate);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            income = resultSet.getInt("total_income");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return income;
}

}
