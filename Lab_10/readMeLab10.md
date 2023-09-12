# Laboratory Exercises #10

[All Exercises](../README.md)

[<< Laboratory Exercise 09](../Lab_09/readMeLab09.md)
## Objective

- Introducing Java database programming using JDBC

## Preparation Tasks

- In order to be successful in this lab session having a basic knowledge of database is a must. So, students are
required to read about the basics of database concepts before attending the laboratory classes.

## Activities

#### a. JDBC overview The JDBC (Java Database Connectivity) API defines interfaces and classes for writing database applications. Using JDBC any SQL, PL/SQL statements can be sent to almost any relational database. JDBC is a Java API for executing SQL statements and supports basic structured query language(SQL) functionality. It provides access to relational database management system by allowing the feature to embed SQL inside Java code. By using JDBC API, it is possible to create a table, insert values into a table, query the table, retrieve results, update the table and perform other related tasks with DBMS. In order to process SQL using JDBC you shall use the following steps:

- Establishing a connection.
- Create a statement.
- Execute the query.
- Process the ResultSet object.
- Close the connection


#### b. Step by Step Example to Connect MySQL Database Using JDBC
- (a) Load the JDBC driver
> ```{Class.forName(”com.mysql.jdbc.Driver”);}```
  
- (b) Specify the name and location of the database being used and connect to the database 
  
> ```{ Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/databaseName", "MySQLServerUserName","MySQLServerPassword");}```

- (c) Create a statement which is used to submit your query 
> ```{ Statement statement = connection.createStatement();}```

- (d) Execute a SQL query using a Statement object 

```Java
{
  String sql=“SELECT * FROM department;”
  ResultSet resultset = statement.executeQuery(sql);}
```

- (e) Get the results in a ResultSet object 

```Java 
while(resultset.next())
  {
  String departmentName = resultset.getString(“departmentName”);
  double budget = resultset.getDouble(“budget”);
  String building = resultset.getString(“building”);
  /* do the processing staff here :) */
  }
```

> Note:For inserting, updating, and deleting data from a table, just create sql string, let’s say it is named as sql’ and just execute
this: statement.executeUpdate(sql);

> The School System database will is a sample database which is created for this lab and it be provided while conducting the lab.
The department table is found in that sample database.

#### (f) Finish by closing the ResultSet , Statement and Connection objects
> ```{ resultset.close(); , statement.close(); , connection.close(); }``` 


#### c. Practical Exercises
- Using the school system database and the data in the school system database do the following exercises using Java programming language and JDBC API:

>Select all the data in the department table and display them to the console screen.Insert the following data into the department table.

```
department name = CSE,
country = Ethiopia,
building = Amist-Kilo,
budget = 50,000,000,
```

- Update the budget of CSE department to be 60,000,000 and building to be SAMSUNG. delete all the record from the department table where department name is CSE.

[Solution File](./LAB10C/ConnectMySql.java)
> Solutin Code 

```Java
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
```
---

<center>

### Feel free to report any typos or bugs on [dododoyo](https://github.com/dododoyo)

<img alt='Happy-Coding' src="https://readme-typing-svg.herokuapp.com?font=Architects+Daughter&amp;color=red&amp;size=20&amp;lines=Happy+Coding+!+🧑‍💻+ 👨‍💻" style="width: 100%;margin-left:25%"></img>

## Made With 🖤 By  [🐬](https://github.com/dododoyo)

</center>

---
