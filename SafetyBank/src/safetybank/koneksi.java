/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package safetybank;
import java.sql.*;
/**
 *
 * @author WISNU
 */
public class koneksi {
    Connection conn = null;
    
    public koneksi(){
    }
    public Connection getkoneksi(){
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/bank_bca","root","");
            System.out.println ("Berhasil");
        }
        catch(Exception w){
        System.out.println ("Masih Eror");    
        }
        return conn;
    }   
}
