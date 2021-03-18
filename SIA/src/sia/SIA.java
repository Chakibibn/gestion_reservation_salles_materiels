/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Winsido
 */
public class SIA {
ResultSet rs;
static Statement st ;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        LOGIN l=new LOGIN();
        l.setVisible(true);
       
        
    }
    
}
