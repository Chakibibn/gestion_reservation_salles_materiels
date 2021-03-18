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
public class Demande {
     private static int iddem=0;
    private  int idd=0;
    private String description;
    private boolean etat=false;
    private String type;
    public Demande (String description,String type){
    idd=++iddem;
    this.description=description;
    this.type=type;
    }
    
}
