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
public class product {
    String biskects;
    String cakes;
    String milk;
    String egs;
    String coldrink;

    public String getBiskects() {
        return biskects;
    }

    public void setBiskects(String biskects) {
        this.biskects = biskects;
    }

    public String getCakes() {
        return cakes;
    }

    public void setCakes(String cakes) {
        this.cakes = cakes;
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public String getEgs() {
        return egs;
    }

    public void setEgs(String egs) {
        this.egs = egs;
    }

    public String getColdrink() {
        return coldrink;
    }

    public void setColdrink(String coldrink) {
        this.coldrink = coldrink;
    }
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
    
        public void insert() throws Exception
    {
        Connection con=connectdb();
        PreparedStatement ps;
        String sql;
       
        
        sql="insert into TBLPRODUCT values (?,?,?,?,?)";
        ps=con.prepareStatement(sql);
        ps.setString(1, biskects);
        ps.setString(2, cakes);
        ps.setString(3, milk);
        ps.setString(4,egs);
        ps.setString(5, coldrink);
      
        ps.executeUpdate();
    }
      public void deleteData() throws Exception
    {
        Connection con=connectdb();
        PreparedStatement ps;
        String sql;
        sql="delete from driverdata where row=?";
        ps=con.prepareStatement(sql);
        
        ps.executeUpdate();
    }
    
}
