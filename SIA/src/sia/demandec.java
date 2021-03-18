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
public class demandec {
       SeConnecter c=new SeConnecter();
   ResultSet rs,rs2;
Statement st;
    int iddem,numsalle,nbrdata,nbrpc,idind,etat;
    String datedebs,datefins,datedebm,datefinm,email,dis;

    public demandec( int iddem,int numsalle, int nbrdata, int nbrpc, int idind, int etat, String datedebs, String datefins, String datedebm, String datefinm, String email, String dis) throws SQLException {
        this.iddem = iddem;
        this.numsalle = numsalle;
        this.nbrdata = nbrdata;
        this.nbrpc = nbrpc;
        this.idind = idind;
        this.etat = etat;
        this.datedebs = datedebs;
        this.datefins = datefins;
        this.datedebm = datedebm;
        this.datefinm = datefinm;
        this.email = email;
        this.dis = dis;
        st=c.obtenirCon().createStatement();
    }
     public void create(){
        
        try {
         if(!((this.datedebs).equals("null")) ){
         if((this.datedebm).equals("null")){
         st.executeUpdate("insert into demande VALUES ("+this.iddem+" , "+this.numsalle+" , '"+this.datedebs+"' , '"+this.datefins+"',"+null+" , "+null+","+null+","+null+","+this.idind+" ,'"+this.email+"','"+this.dis+"' ,"+this.etat+")");
         
         }
         else{
         st.executeUpdate("insert into demande VALUES ("+this.iddem+" , "+this.numsalle+" , '"+this.datedebs+"' , '"+this.datefins+"',"+this.nbrdata+" , "+this.nbrpc+",'"+this.datedebm+"','"+this.datefinm+"',"+this.idind+" ,'"+this.email+"','"+this.dis+"' ,"+this.etat+")");
         }
          }
         else {
         if(!((this.datedebm).equals("null")) ){
         if((this.datedebs).equals("null")){
         st.executeUpdate("insert into demande VALUES ("+this.iddem+" , "+null+" , "+null+" , "+null+","+this.nbrdata+" , "+this.nbrpc+",'"+this.datedebm+"','"+this.datefinm+"',"+this.idind+" ,'"+this.email+"','"+this.dis+"' ,"+this.etat+")");
         }
         
          }
         }
        } catch (Exception e) {
            System.out.println("Erreur de selection " );
        }
    
    }
    
    public void READ(){
        try {
           String nss="",datds="",datfs="",datdm="",datfm="",nbbbp="",nbbbc="",iddev="",em="",pour="",nomin="",prenomin="";
            
            rs=st.executeQuery("select * from demande where iddem="+this.iddem);
            while(rs.next()){
            nss=rs.getString(2);
            datds=rs.getString(3);
            datfs=rs.getString(4);
            datdm=rs.getString(7);
            datfm=rs.getString(8);
            nbbbp=rs.getString(5);
            nbbbc=rs.getString(6);
            iddev=rs.getString(9);
            em=rs.getString(10);
            pour=rs.getString(11);
            }
            rs2=st.executeQuery("select nomind,prenomind from individu where idindividu="+Integer.parseInt(iddev));
            while (rs.next()) {
                nomin=rs2.getString(1);
                prenomin=rs2.getString(2);
                
            }
            if(!((this.datedebs).equals("null")) ){
         if((this.datedebm).equals("null")){
             System.out.println(""+nomin+" "+prenomin+" a reservé la salle "+nss+" pour "+pour+" date debut "+datds+" date fin "+datfs );
         }
         else{
                      System.out.println(""+nomin+" "+prenomin+" a reservé la salle "+nss+" pour "+pour+" date debut "+datds+" date fin "+datfs+" et "+nbbbp+" pc  plus "+nbbbc+" védio projecteur pour "+datdm+" fin"+datfm );
   
         }
          }
         else {
         if(!((this.datedebm).equals("null")) ){
         if((this.datedebs).equals("null")){
           System.out.println(""+nomin+" "+prenomin+" a reservé  "+nbbbp+" pc  plus "+nbbbc+" védio projecteur pour "+datdm+" fin"+datfm );
   
         }
         
          }
         }
           
           
        } catch (Exception e) {
            System.out.println("Erreur de selection");
        }
    
    }
     
    public void DELETE(){
        try {
            st.executeUpdate("delete from demande where iddem="+this.iddem);
            
        } catch (Exception e) {
            System.out.println("erreur de selection");
        }
    }
    
    public void UPDATE(int numsalle,String datds,String datfs,int nbd,int nbp,String datdm,String datfm,String em,String des){
        try {
            
            st.executeUpdate("update demande set nummsalle="+numsalle+" and datedebs='"+datds+" and datefins='"+datfs+"' and nbrdata="+nbd+" and nbrpc="+nbp+" and datedebm='"+datdm+"' and datefinm='"+datfm+"' and email='"+em+"' and dis='"+des+"' wehere iddme="+this.iddem);
        } catch (Exception e) {
            System.out.println("Erruer de selection ");
        }
    
    }
    
    
}
