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
public class materiel {
    SeConnecter c=new SeConnecter();

ResultSet rs;
Statement st;
    private  String idm;
    private String nomamat;
    private int typemat;
    private boolean dispo=true;
    private int localisation;
    private String Dateachat;
    private String Datefingarantie;
  
    
    public materiel(String idm,String nommat,int typemat,int localisation,String Dateachat,String datefingarantie) throws SQLException{
       this.idm=idm;
        this.nomamat=nommat;
        this.typemat=typemat;
        this.localisation=localisation;
        this.Dateachat=Dateachat;
        this.Datefingarantie=datefingarantie;
        st=c.obtenirCon().createStatement();
    }
     public String  VerifierDispo(){
        try{
            int disponi=0;
            rs=st.executeQuery("select dispo from materiel where idmateriel="+Integer.parseInt(this.idm)+"");
            while(rs.next()){
            disponi=rs.getInt(1);
            }
    if (disponi==1) {
        
        return "le materiel est disponible";}
    else {
    return "le materiel n'est pas disponible";
    
    }
        }
        catch(Exception e ){
        return "Le materiel n'existe pas ";}
     }

    
    public void MAJdispo(){
        String idmateriel ="";
        try {
        
            rs=st.executeQuery("select * from reservation where idmateriel="+Integer.parseInt(this.idm)+"");
            while(rs.next()){
            idmateriel=rs.getString(1);
            }
           if(idmateriel.equals("")){
           this.dispo=false;
           st.executeUpdate("update materiel set dispo = 0");
           }
           else {
           this.dispo=true;
           st.executeUpdate("update materiel set dispo = 1");
           }
        }
        catch(Exception e ){
            System.out.println("le materiel n'existe pas ");
        }
    }
    public void create(){
        try {
            st.executeUpdate("insert into materiel VALUES ('"+this.idm+"' , '"+this.nomamat+"' , '"+this.Dateachat+"' , '"+this.Datefingarantie+"' , "+this.typemat+" , "+this.localisation+" , "+this.dispo+")");
        } catch (Exception e) {
            System.out.println("Erreur de selection");
        }
    
    }
    public void READ(){
        try {
            String d1="",d2="",n = "",type="",locali="";
            int t=0,lo=0;
            rs=st.executeQuery("select * from materiel where idmateriel="+Integer.parseInt(this.idm));
            while(rs.next()){
            n=rs.getString(2);   
            d1=rs.getString(3);
            d2=rs.getString(4);
            t=rs.getInt(5);
            lo=rs.getInt(6);
            }
            if(t==1){type="PC portable";}
            if(t==2){type="Vedio preojecteur";}
            if(lo==1){locali="Bureau d'etude ";}
            if(lo==2){locali="Secretaria ";}
            if(lo==3){locali="magasin ";}
            if(lo==4){locali="scolarité";}
            System.out.println("ceci c'est un "+type+" nommé "+n+" acheté le "+d1+" fin de garantie "+d2+" situé "+locali);
        } catch (Exception e) {
            System.out.println("Erreur de selection");
        }
    
    }
    public void DELETE(){
        try {
            st.executeUpdate("delete from materiel where idmaterile="+Integer.parseInt(this.idm));
            
        } catch (Exception e) {
            System.out.println("erreur de selection");
        }
    }
    
    public void UPDATE(String nom,String datea , String datef ,String type,String localisa){
        try {
            int i=0,j=0;
            if(type.equals("PC portable")){i=1;}
            if(type.equals("Vedio preojecteur")){i=2;}
            
            if(localisa.equals("Bureau d'etude ")){j=1;}
            if(localisa.equals("Secretaria ")){j=2;}
            if(localisa.equals("magasin ")){j=3;}
            if(localisa.equals("scolarité")){j=4;}
            st.executeUpdate("update set nommateriel='"+nom+"' and dateAchat = '"+datea+"' and dateFingarantie ='"+datef+"' and  idtypemateriel="+i+" and idbureau="+j+" where idmateriel="+Integer.parseInt(this.idm));
        } catch (Exception e) {
            System.out.println("Erruer de selection ");
        }
    
    }
    
    
    
}
