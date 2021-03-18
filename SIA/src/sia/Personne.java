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
public class Personne {
   SeConnecter c=new SeConnecter();

ResultSet rs;
Statement st; 
    private String nom,prenom;
    private int idpp,type;
    public Personne(int idpp,String nom, String prenom,int type) throws SQLException{
    this.idpp=idpp;
    this.nom=nom;
    this.prenom=prenom;
    this.type=type;
    st=c.obtenirCon().createStatement();
    }
    
    
    public void create(){
        try {
            
             
           st.executeUpdate("insert into individu VALUES("+this.idpp+" , '"+this.nom+"' , '"+this.prenom+"' , "+this.type+")");
        } catch (Exception e) {
            System.out.println("Erreur de selection");
        }
    
    }
    
    public void READ(){
        try {
            String nom="",prenom="",x="";
            int type=0;
            rs=st.executeQuery("select * from individu where idindividu="+this.idpp);
            while(rs.next()){
            nom=rs.getString(2);prenom=rs.getString(3);type=rs.getInt(4);
            }
            if(type==1){x="Etudiant ";}
            if(type==2){x="Enseignant ";}
            if(type==3){x="la secrétaire";}
            if(type==4){x="chef de departement";}
            System.out.println("je suis  "+nom+" "+prenom+" et je suis  "+x);
         } catch (Exception e) {
            System.out.println("Erreur de selection");
        }
    }
    public void DELETE(){
        try {
            st.executeUpdate("delete from individu where idindividu="+this.idpp);
         } catch (Exception e) {
            System.out.println("erreur de selection");
        }
    }
    public void UPDATE(String nom,String prenom,int type){
        try {
  st.executeUpdate("update idindividu set nomind='"+nom+"' and prenomind='"+prenom+"' and idtypeindividu ="+type+"where idindividu="+this.idpp);
        } catch (Exception e) {
            System.out.println("Erruer de selection ");
        }
    
    }
    
}
