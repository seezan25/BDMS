package DBConnect;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DoConnection {
    String driver,host,user,pass;
    Connection conn;
    public DoConnection(){
        this.driver ="com.mysql.cj.jdbc.Driver";
        this.host = "jdbc:mysql://localhost:3306/dbms";
        this.user ="root";
        this.pass = "admin";
    }
    public Connection getConnection(){

        try{
            Class.forName(driver);
            conn= DriverManager.getConnection(host,user,pass);

        }catch(ClassNotFoundException error1){
            System.out.println(error1);

        }catch (SQLException error2){
            System.out.println(error2);
        }
        return  conn;
    }
}
