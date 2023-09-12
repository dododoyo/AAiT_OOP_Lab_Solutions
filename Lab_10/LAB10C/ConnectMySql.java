import java.sql.*;

public class ConnectMySql {
  public static void main(String[] args) {

    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/school_system", "MySQLServerUserName",
"MySQLServerPassword ");

      // Select all the data in the department table and display them to the console screen.
      Statement statement = connection.createStatement();
      String selectQuery = "SELECT * FROM department";
      ResultSet resultSet = statement.executeQuery(selectQuery);
      while (resultSet.next()) {
        String departmentName = resultSet.getString("departmentName");
        double budget = resultSet.getDouble("budget");
        String building = resultSet.getString("building");
        System.out.println(departmentName + " " + budget + " " + building);
      }

      // Insert the following data into the department table.
      String insertQuery = "INSERT INTO department (departmentName, budget, building, country) VALUES (?, ?, ?, ?)";
      PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
      preparedStatement.setString(1, "Killo");
      preparedStatement.setDouble(2, 50000000);
      preparedStatement.setString(3, "Amist");
      preparedStatement.setString(4, "Ethiopia");
      preparedStatement.executeUpdate();

      // Update the budget of CSE department to be 60,000,000 and building to be SAMSUNG.
      String updateQuery = "UPDATE department SET budget = ?, building = ? WHERE departmentName = ?";
      PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
      updateStatement.setDouble(1, 60000000);
      updateStatement.setString(2, "SAMSUNG");
      updateStatement.setString(3, "CSE");
      updateStatement.executeUpdate();

      // Delete all the record from the department table where department name is CSE.
      String deleteQuery = "DELETE FROM department WHERE departmentName = ?";
      PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
      deleteStatement.setString(1, "CSE");
      deleteStatement.executeUpdate();

      // Finish by closing the ResultSet, Statement and Connection objects.
      resultSet.close();
      statement.close();
      preparedStatement.close();
      updateStatement.close();
      deleteStatement.close();
      connection.close();
    } 
    catch (SQLException | ClassNotFoundException e) {
      System.out.println("Failed to connect to database.");
      e.printStackTrace();
    }
  }
}