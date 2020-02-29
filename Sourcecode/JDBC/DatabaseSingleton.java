package sqlapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lukas
 */
public class DatabaseSingleton {

    private final Connection connection;
    private static DatabaseSingleton instance;

    private DatabaseSingleton() throws ClassNotFoundException, SQLException {
        // Class.forName("com.mysql.cj.jdbc.Driver");
        this.connection = DriverManager.getConnection("jdbc:mysql://db4free"
                + ".net:3306/codersbayworld?zeroDateTimeBehavior=CONVERT_TO_NULL",
                "codersbay", "codersbay");
    }

    public Connection getConnection() {
        return connection;
    }

    public static DatabaseSingleton getInstance() throws ClassNotFoundException, SQLException {
        if (instance == null) {
            instance = new DatabaseSingleton();
        }

        return instance;
    }
}
