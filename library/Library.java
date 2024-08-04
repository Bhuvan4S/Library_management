/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.library;
import javax.swing.*;
import java.sql.*;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
/**
 *
 * @author USER
 */
public class Library {

    public static void main(String[] args) {
    Connection con;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
        try{
Class.forName("oracle.jdbc.OracleDriver");
//JOptionPane.showMessageDialog(this,"Driver Loaded!");
try {
//con = DriverManager.getConnection("jdbc:oracle:thin:@10.6.4.33:1521:orcl",
//        "cse1019","ssn");
con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl03",
        "SYSTEM","Bhu5763192");
//JOptionPane.showMessageDialog(this,"Connected to Oracle database!");
}
catch (SQLException ex) {
Logger.getLogger(Login_page.class.getName()).log(Level.SEVERE,null, ex);
//JOptionPane.showMessageDialog(this,ex.getMessage());
}
}
catch(ClassNotFoundException ex){
Logger.getLogger(Login_page.class.getName()).log(Level.SEVERE,null, ex);
//JOptionPane.showMessageDialog(this,ex.getMessage());

}
        System.out.println("Hello World!");
        Login_page login = new Login_page();
        login.setVisible(true);
    }
}
