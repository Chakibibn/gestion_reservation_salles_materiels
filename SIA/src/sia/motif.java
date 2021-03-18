/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Winsido
 */
public class motif {
    SeConnecter c=new SeConnecter();

ResultSet rs;
Statement st;
    int idconf;
    String desc;
    public motif(int idconf,String desc) throws SQLException{
    this.idconf=idconf;
    this.desc=desc;
    st=c.obtenirCon().createStatement();}
    public void create(){
        try {
            st.executeUpdate("insert into salle VALUES ("+this.idconf+" , '"+this.desc+"' )");
        } catch (Exception e) {
            System.out.println("Erreur de selection");
        }
}
 
    public void READ(){
        try {
            String des="";
            
            rs=st.executeQuery("select * from motif where codemotif="+this.idconf);
            while(rs.next()){
            des=rs.getString(2);
            
            }
           
            System.out.println(""+des);
        } catch (Exception e) {
            System.out.println("Erreur de selection");
        }
    
    }
    public void DELETE(){
        try {
            st.executeUpdate("delete from motif where codemotif="+this.idconf);
            
        } catch (Exception e) {
            System.out.println("erreur de selection");
        }
    }
    
    public void UPDATE(String libelle){
        try {
            
            st.executeUpdate("update motif set LibelleMotif ='"+libelle+"' where numsalle="+this.idconf);
        } catch (Exception e) {
            System.out.println("Erruer de selection ");
        }
    }}

