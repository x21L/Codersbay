package sqlapplication;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lukas
 */
public class SingletonMain {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DatabaseSingleton singleton = DatabaseSingleton.getInstance();
        Connection connection = singleton.getConnection();

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from city limit 100");

        StringBuilder stringBuilder = new StringBuilder();
        while (resultSet.next()) {
            stringBuilder.append(resultSet.getInt(1)).append(" ");
            stringBuilder.append(resultSet.getString(2)).append(" ");
            stringBuilder.append(resultSet.getString(3)).append(" ");
            stringBuilder.append(resultSet.getString(4)).append(" ");
            stringBuilder.append(resultSet.getString(5)).append(" ").append("\n");
        }
        System.out.println(stringBuilder);
        connection.close();
    }
}
