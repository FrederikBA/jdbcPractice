package Connector;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class DBConnectorTest {

    @org.junit.jupiter.api.Test
    void getMyConnection() {
        DBConnector dbc = new DBConnector();
        Connection connection = dbc.getMyConnection();
        assertNotNull(connection);
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}