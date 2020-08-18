/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faiq.paper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Ammad~Khan~Sardar
 */
public class connection  {
       public Connection connectdb()throws Exception
    {
        Connection con=null;
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        String url="jdbc:derby://localhost:1527/product";
        con=DriverManager.getConnection(url,"root","root");
        if(con!=null){
            System.out.println("Connect");
        }
        else{
            System.out.println("Disable");
        }
        return con;
    }



}

