package sqlapplication;

import java.sql.*;

/**
 *
 * @author lukas
 */
public class SQLApplication {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://db4free"
                + ".net:3306/codersbayworld?zeroDateTimeBehavior=CONVERT_TO_NULL",
                "codersbay", "codersbay");
        
        Statement statement = connection.createStatement(); 
        
        ResultSet resultSet = statement.executeQuery("select * from city limit 100");
        
        StringBuilder stringBuilder = new StringBuilder();
        while(resultSet.next()) {
            stringBuilder.append(resultSet.getInt(1)).append(" ");
            stringBuilder.append(resultSet.getString(2)).append(" ");
            stringBuilder.append(resultSet.getString(3)).append(" ");
            stringBuilder.append(resultSet.getString(4)).append(" ");
            stringBuilder.append(resultSet.getString(5)).append(" ").append("\n");
        }
        System.out.println(stringBuilder);
    }        
}