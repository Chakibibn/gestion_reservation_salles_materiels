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
public class Reservation {
    SeConnecter c=new SeConnecter();
   ResultSet rs,rs2;
Statement st;
     private  int idres=0;
    private  int idr;
    private String datedeb;
    private String type;
    
    private String datefin;
   public Reservation(String datdeb,String datefin,String type) throws SQLException{
       this.idr=idr;
       this.type=type;
       this.datedeb=datedeb;
       this.datefin=datefin;
       st=c.obtenirCon().createStatement();
   }
  
   public void create() throws SQLException{
        
        try {
            String nss="",datds="",datfs="",datdm="",datfm="",nbbbp="",nbbbc="",iddev="",em="",pour="";
            int x=0,iddem=0,idm1=0,idm2=0;
            rs=st.executeQuery("select * from demande where etat=1");
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
            iddem=rs.getInt(1);
            
            }
            if(pour.equals("soutenance")){
             x=1;
             
             if(pour.equals("conerence")){
             x=2;
             }
             }
            rs2=st.executeQuery("selet * from materiel where idtypemateriel=1 and dispo=1");
             while(rs2.next()){
               idm1=rs2.getInt(1);
             }
             rs2=st.executeQuery("selet * from materiel where idtypemateriel=2 and dispo=1");
             while(rs2.next()){
               idm2=rs2.getInt(1);
             }
         if(!((this.datedeb).equals("null")) ){
         if((this.datefin).equals("null")){
             
         st.executeUpdate("insert into reservation VALUES("+this.idr+" ,'"+this.datedeb+"' , '"+this.datefin+"' , '"+x+"' , "+Integer.parseInt(nss)+" , "+Integer.parseInt(iddev)+", "+iddem+", "+null+")");
         
         }
         else{
         if(Integer.parseInt(nbbbc)!=0){
             if(Integer.parseInt(nbbbp)!=0){
             st.executeUpdate("insert into reservation VALUES("+this.idr+" ,'"+this.datedeb+"' , '"+this.datefin+"' , '"+x+"' , "+Integer.parseInt(nss)+" , "+Integer.parseInt(iddev)+", "+iddem+", "+idm1+")");
             st.executeUpdate("insert into reservation VALUES("+this.idr+" ,'"+this.datedeb+"' , '"+this.datefin+"' , '"+x+"' , "+Integer.parseInt(nss)+" , "+Integer.parseInt(iddev)+", "+iddem+", "+idm2+")");
         
         
             }else {
              st.executeUpdate("insert into reservation VALUES("+this.idr+" ,'"+this.datedeb+"' , '"+this.datefin+"' , '"+x+"' , "+Integer.parseInt(nss)+" , "+Integer.parseInt(iddev)+", "+iddem+", "+idm1+")");
            
             
             }
         }
         else {
         if(Integer.parseInt(nbbbp)!=0)
         {
              st.executeUpdate("insert into reservation VALUES("+this.idr+" ,'"+this.datedeb+"' , '"+this.datefin+"' , '"+x+"' , "+Integer.parseInt(nss)+" , "+Integer.parseInt(iddev)+", "+iddem+", "+idm2+")");
         
         }
         }
         }
          }
         else {
         if(Integer.parseInt(nbbbc)!=0){
             if(Integer.parseInt(nbbbp)!=0){
             st.executeUpdate("insert into reservation VALUES("+this.idr+" ,'"+this.datedeb+"' , '"+this.datefin+"' , '"+x+"' , "+Integer.parseInt(nss)+" , "+Integer.parseInt(iddev)+", "+iddem+", "+idm1+")");
             st.executeUpdate("insert into reservation VALUES("+this.idr+" ,'"+this.datedeb+"' , '"+this.datefin+"' , '"+x+"' , "+Integer.parseInt(nss)+" , "+Integer.parseInt(iddev)+", "+iddem+", "+idm2+")");
         
         
             }else {
              st.executeUpdate("insert into reservation VALUES("+this.idr+" ,'"+this.datedeb+"' , '"+this.datefin+"' , '"+x+"' , "+Integer.parseInt(nss)+" , "+Integer.parseInt(iddev)+", "+iddem+", "+idm1+")");
            
             
             }
         }
         else {
         if(Integer.parseInt(nbbbp)!=0)
         {
              st.executeUpdate("insert into reservation VALUES("+this.idr+" ,'"+this.datedeb+"' , '"+this.datefin+"' , '"+x+"' , "+Integer.parseInt(nss)+" , "+Integer.parseInt(iddev)+", "+iddem+", "+idm2+")");
         
         }
         }
        } 
        }catch (Exception e) {
            System.out.println("Erreur de selection");
        }
    
    }
     
    public void READ(){
        try {
            String nss="",datds="",datfs="",datdm="",datfm="",idmat="",iddem="",pour="";
          rs=st.executeQuery("select * from reservation where idresservation"+this.idr+"");
          while(rs.next()){
              nss=rs.getString(5);
          datds=rs.getString(2);
          datfs=rs.getString(3);
          pour =rs.getString(4);
          iddem=rs.getString(7);
          idmat=rs.getString(8);
          
          }
          String x="";
          if(Integer.parseInt(pour)==1){
              x="soutenance";
          }
          if(Integer.parseInt(pour)==2){
              x="conférence ";
          }
          if(!(nss.equals("0"))){
          if(idmat.equals("0")){
              System.out.println("reservatio de la salle "+nss+" pour une "+x+" debut "+datds+" fin "+datfs);
          } else 
          {
          System.out.println("reservatio de la salle "+nss+" pour une "+x+" debut "+datds+" fin "+datfs+" et le materiel "+idmat +" debut "+datds+" fin "+datfs);
          }
          }
          else {
               System.out.println("reservatio de le materiel "+idmat+" pour une "+x+" debut "+datds+" fin "+datfs);
          }
          
        } catch (Exception e) {
            System.out.println("Erreur de selection");
        }
    
    }
    
    public void DELETE(){
        try {
            st.executeUpdate("delete from reservation where idreservation="+this.idr);
            
        } catch (Exception e) {
            System.out.println("erreur de selection");
        }
    }
    
    public boolean Vérifiercaps(){
        try {
             String nss="",datds="",datfs="",datdm="",datfm="",idmat="",iddem="",pour="";
             int nbpr=0,cap=0;
          rs=st.executeQuery("select * from reservation where idresservation"+this.idr+"");
          while(rs.next()){
              nss=rs.getString(5);
          datds=rs.getString(2);
          datfs=rs.getString(3);
          pour =rs.getString(4);
          iddem=rs.getString(7);
          idmat=rs.getString(8);
          
          }
            rs=st.executeQuery("select nbrpart from demande where iddem= "+Integer.parseInt(iddem));
            while(rs.next()){
            nbpr=rs.getInt(1);
            }
            rs=st.executeQuery("select capacité from salle where numsalle= "+Integer.parseInt(nss));
            while(rs.next()){
            cap=rs.getInt(1);
            }
            if(cap>=nbpr){
            return true;
            }
            return false ;
            
        } catch (Exception e) {
            return false;
        }
    }

    
    }

