package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection{

    private static final String URL="";
    private static final String USER="root";
    private static final String PASSWORD="YOUR_password";

    public static Connection getConnection(){
        Connection conn =null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(URL,USER,PASSWORD);
        } catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}