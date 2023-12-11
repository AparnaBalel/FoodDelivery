package com.solvd.foodDelivery.connection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.solvd.foodDelivery.connection.ConnectionPool.connectionPool;

public class Client {
    private static final Logger LOGGER = LogManager.getLogger(Client.class);

    public static void main(String[] args) {


            ConnectionPool connectionPool = ConnectionPool.getInstance();
            Connection connection1 = connectionPool.getConnection();
            connectionPool.releaseConnection(connection1);

            Connection connection2 = connectionPool.getConnection();

       connectionPool.releaseConnection(connection1);
        connectionPool.releaseConnection(connection2);
        connectionPool.releaseConnection(connection1);



    }
}
