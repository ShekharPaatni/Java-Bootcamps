import java.sql.*;

public class JdbcConnection {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbstructure", "root", "root");
            statement = connection.createStatement();
            String query = "select * from emp ORDER BY ename ASC";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2));
            }
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
