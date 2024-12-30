package example;

import java.sql.*;
import java.util.Arrays;
import java.util.List;

public class JdbcApp {

    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) {
        try{
            connect();
            createTableEx();
            addColumnEx();
            readEx();
            psBatchEx();
            transactionEx();
            readEx();
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }

    private static void connect() throws SQLException {
        System.out.println("Открывается соединение с БД");
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","4785");
        statement = connection.createStatement();
    }

    private static void disconnect() {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Соединение закрыто");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTableEx() throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS students (\n" +
                " id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,\n" +
                " name VARCHAR(50),\n" +
                " score INT\n" +
                " );");
    }

    private static void addColumnEx() throws SQLException {
        statement.executeUpdate("ALTER TABLE students ADD COLUMN age INT;");
    }

    private static void dropTableEx() throws SQLException {
        statement.executeUpdate("DROP TABLE IF EXISTS students;");
    }

    private static void readEx() throws SQLException {
        try (ResultSet rs = statement.executeQuery("SELECT * FROM students;")) {
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString("name") + " " +
                        rs.getInt(3) + " " + rs.getInt(4));
            }
        }
    }

    private static void clearTableEx() throws SQLException {
        statement.executeUpdate("DELETE FROM students;");
    }

    private static void deleteEx() throws SQLException {
        statement.executeUpdate("DELETE FROM students WHERE name = 'Bob4';");
    }

    private static void insertEx() throws SQLException {
        statement.executeUpdate("INSERT INTO students (name,score, age) VALUES ('Bob4', 60, 22);");
        statement.executeUpdate("INSERT INTO students (name,score, age) VALUES ('Jane4', 50, 20);");
        statement.executeUpdate("INSERT INTO students (name,score, age) VALUES ('Ira4', 30, 21);");
        statement.executeUpdate("INSERT INTO students (name,score, age) VALUES ('Petr4', 20, 21);");
    }

    private static void psBatchEx() {
        try (PreparedStatement prepInsert = connection.prepareStatement("INSERT INTO students(name,score, age) VALUES(?,?,?)")) {
            List<Integer> age = Arrays.asList(18,19,20,21,22);
            for (int i = 1; i <= 10; i++) {
                prepInsert.setString(1, "Bob" + i);
                prepInsert.setInt(2, i * 10 % 100);
                int randomIndex = (int)(Math.random() * age.size());
                prepInsert.setInt(3, age.get(randomIndex));
                prepInsert.addBatch();
            }
            int[] result = prepInsert.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void transactionEx() throws SQLException {
        connection.setAutoCommit(false);
        try {
            statement.execute("INSERT INTO students (name, score, age) values ('Walentin', 56, 20)");
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            connection.rollback();
        }
    }
}
