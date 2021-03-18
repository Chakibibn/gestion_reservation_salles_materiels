/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia;

/**
 *
 * @author Winsido
 */

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class SeConnecter {
    public Connection con;
     public SeConnecter() {
        try {
          Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {JOptionPane.showMessageDialog(null, "Erreur driver","Erreur",JOptionPane.ERROR_MESSAGE);
        }
        try {
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sia","root","root");
        } catch (Exception e) {JOptionPane.showMessageDialog(null, "Erreur connexion","Erreur",JOptionPane.ERROR_MESSAGE);
        }
    }
    public Connection obtenirCon(){return con;}
    
}
