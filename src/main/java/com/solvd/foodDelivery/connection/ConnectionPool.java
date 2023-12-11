package com.solvd.foodDelivery.connection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private static final Logger LOGGER = LogManager.getLogger(ConnectionPool.class);
    private static ConnectionPool instance;
    volatile static ConnectionPool connectionPool = null;
    private List<Connection> connections = new ArrayList<>();
    private ConnectionPool() {
        for (int i = 1; i <= 3; i++) {
            Connection connection = new Connection();
            connections.add(connection);
            LOGGER.info(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    static ConnectionPool getInstance() {
        if (instance == null) {

            instance = new ConnectionPool();
        }
        return instance;
    }
    public synchronized Connection getConnection(){
        if ( connections.isEmpty()) {
            return connections.remove(0);
        } else {
            return new Connection();
        }
    }

    public synchronized void releaseConnection(Connection connection){
        if (connections == null) {
            connections = new ArrayList<>();
        }
        connections.add(connection);
    }
}
