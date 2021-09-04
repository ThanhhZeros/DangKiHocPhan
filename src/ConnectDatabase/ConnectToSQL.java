/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectDatabase;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class ConnectToSQL {
    public static void main(String[] args) {
        
    
    String server="DESKTOP-423JB1C\\SQLEXPRESS";
    String user="sa";
    String password="123456";
    String db="Java_Nhom9";
    int port=1433;
    SQLServerDataSource ds =new SQLServerDataSource();

    ds.setUser(user);
    ds.setPassword(password);
    ds.setDatabaseName(db);
    ds.setServerName(server);
    ds.setPortNumber(port);
    try (Connection conn=ds.getConnection()){
        System.out.println("Kết nối thành công");
        System.out.println(conn.getCatalog());
    }catch(SQLException ex){
        ex.printStackTrace();
    }
}
}