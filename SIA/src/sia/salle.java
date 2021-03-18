/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
/**
 *
 * @author Winsido
 */
public class salle {
    SeConnecter c=new SeConnecter();

ResultSet rs;
Statement st;
    public String nomsalle;
    public int capacité;
    public boolean dispo;
    public int id;
    public salle(int id,String nomsalle,int capcité,boolean dispo) throws SQLException{
        this.id=id;
    this.nomsalle=nomsalle;
    this.capacité=capacité;
    this.dispo=dispo;
      st=c.obtenirCon().createStatement();
    }
    public salle(int id){
        this.id=id;
    }

    salle(String string, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //pour Vérifier que la salle est diponible et on peut faire le type de retour boolean
    public String  VerifierDispo(){
        try{
            int disponi=0;
            rs=st.executeQuery("select dispo from salle where numsalle="+this.id+"");
            while(rs.next()){
            disponi=rs.getInt(1);
            }
    if (disponi==1) {
        
        return "la salle  est disponible";}
    else {
    return "la salle n'est pas disponible";
    
    }
        }
        catch(Exception e ){
        return "La salle n'existe pas ";}
     }

    
    public void MAJdispo(){
        String idsalle ="";
        try {
        
            rs=st.executeQuery("select * from reservation where numsalle="+this.id+"");
            while(rs.next()){
            idsalle=rs.getString(1);
            }
           if(idsalle.equals("")){
           this.dispo=false;
           st.executeUpdate("update salle set dispo = 0");
           }
           else {
           this.dispo=true;
           st.executeUpdate("update salle set dispo = 1");
           }
        }
        catch(Exception e ){
            System.out.println("lsalle n'existe pas ");
        }
    }
   
    public void create(){
        try {
            st.executeUpdate("insert into salle VALUES ("+this.id+" , '"+this.nomsalle+"' , "+this.capacité+" , "+this.dispo+")");
        } catch (Exception e) {
            System.out.println("Erreur de selection");
        }
    
    }
    public void READ(){
        try {
            String nom="";
            int cap=0;
            rs=st.executeQuery("select * from salle where numsalle="+this.id);
            while(rs.next()){
            nom=rs.getString(2);
            cap=rs.getInt(3);
            }
           
            System.out.println("la salle nommé "+nom+" capacité "+cap);
        } catch (Exception e) {
            System.out.println("Erreur de selection");
        }
    
    }
    public void DELETE(){
        try {
            st.executeUpdate("delete from salle where numsalle="+this.id);
            
        } catch (Exception e) {
            System.out.println("erreur de selection");
        }
    }
    
    public void UPDATE(String nom,int cap){
        try {
            
            st.executeUpdate("update salle set nomsalle='"+nom+"' and capcité="+cap+" where numsalle="+this.id);
        } catch (Exception e) {
            System.out.println("Erruer de selection ");
        }
    
    }
    
   
}
