/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll;
import java.sql.*;
import javax.swing.*;


/**
 *
 * @author avina
 */
public class db {
    Connection conn=null;

    public static  Connection java_db()
    {
        try{
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_payroll","root","root");
             return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
}
