/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

import java.util.*;

/**
 *
 * @author Winsido
 */
public class ajoutermateriel extends javax.swing.JFrame {
SeConnecter c=new SeConnecter();

ResultSet rs;
Statement st;
String n,p;
int t;
    /**
     * Creates new form ajoutermateriel
     */
    public ajoutermateriel(String n,String p,int t) {
        initComponents();
        this.setSize(523, 681);
        this.setResizable(false);
        this.n=n;
        this.p=p;
        this.t=t;
        
     
        this.setLocationRelativeTo(null);
          try {
            st=c.obtenirCon().createStatement();
            rs=st.executeQuery("select* from materiel");
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur Séléction","Erreur",JOptionPane.ERROR_MESSAGE);
        }
    }

    private ajoutermateriel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        c2 = new javax.swing.JComboBox<>();
        c1 = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        d2 = new com.toedter.calendar.JDateChooser();
        d1 = new com.toedter.calendar.JDateChooser();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sia/edubase.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 30, 360, 140);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Endroit de stockage ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 490, 230, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("ID materiel");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 170, 190, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("nom Materiel");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 240, 190, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Date d'achat");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 300, 190, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Date fin de garantie");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 370, 230, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("type de materiel ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 430, 230, 40);

        t2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(t2);
        t2.setBounds(290, 240, 190, 30);

        t1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(t1);
        t1.setBounds(290, 170, 190, 30);

        c2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bureau d'etude", "secraitaria", "magasin", "scolarité" }));
        c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                c2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c2MouseExited(evt);
            }
        });
        jPanel1.add(c2);
        c2.setBounds(290, 500, 140, 40);

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pc portable", "pc fixe", "datashow" }));
        c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                c1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c1MouseExited(evt);
            }
        });
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        jPanel1.add(c1);
        c1.setBounds(290, 430, 140, 40);

        jButton10.setBackground(new java.awt.Color(0, 94, 166));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Ajouter");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(350, 550, 110, 50);

        jButton1.setBackground(new java.awt.Color(0, 94, 166));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(430, 620, 79, 25);
        jPanel1.add(d2);
        d2.setBounds(290, 370, 200, 30);
        jPanel1.add(d1);
        d1.setBounds(290, 300, 200, 30);

        jMenu2.setText("Log out");

        jMenuItem2.setText("Déconnexion");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Quitté");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar2.add(jMenu2);

        jMenu3.setText("page Menu");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenu3);

        jMenu1.setText("Page Precedent ");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void c1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1MouseEntered
c1.showPopup();        // TODO add your handling code here:
    }//GEN-LAST:event_c1MouseEntered

    private void c2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2MouseEntered
c2.showPopup();        // TODO add your handling code here:
    }//GEN-LAST:event_c2MouseEntered

    private void c1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1MouseExited
c1.hidePopup();       // TODO add your handling code here:
    }//GEN-LAST:event_c1MouseExited

    private void c2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2MouseExited
c2.hidePopup();        // TODO add your handling code here:
    }//GEN-LAST:event_c2MouseExited

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
                String x=c1.getSelectedItem().toString();
                int i=0,d=1;
                if(x.equals("pc portable")){i=1;}
                else {if(x.equals("pc fixe")) { i=3;}
                else { if(x.equals("datashow")){i=2;} }
                }
                 String y=c2.getSelectedItem().toString();
                int j=0;
                //Bureau d'etude, secraitaria, magasin, scolarité
                if(y.equals("Bureau d'etude")){j=1;}
                else {if(y.equals("secraitaria")) { j=2;}
                else { if(y.equals("magasin")){j=3;}
                else {if(y.equals("scolarité")){j=4;}}}
                }
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                    String datea=sdf.format(d1.getDate());
                    String datef=sdf.format(d2.getDate());
                    String mmm=t2.getText();
                    int k =Integer.parseInt(t1.getText());
                    
                    
                    
                     String y1="",y2="",m1="",m2="",j1="",j2="";
                    for(int m=0;m<4;m++){
                        y1=y1+datea.charAt(m);
                        y2=y2+datef.charAt(m); }
                    for(int m=5;m<7;m++){
                        m1=m1+datea.charAt(m);
                        m2=m2+datef.charAt(m); }
                    for(int m=8;m<10;m++){
                        j1=j1+datea.charAt(m);
                        j2=j2+datef.charAt(m); }
                    
                    System.out.println(""+y1);
                    System.out.println(""+y2);
                    System.out.println(""+m1);
                    System.out.println(""+m2);
                     System.out.println(""+j1);
                    System.out.println(""+j2);
                       int yy1 = Integer.parseInt(y1);
                       int yy2 = Integer.parseInt(y2);
                       int mm1 = Integer.parseInt(m1);
                       int mm2 = Integer.parseInt(m2);
                       int jj1 = Integer.parseInt(j1);
                       int jj2 = Integer.parseInt(j2);
                       System.out.println("0");
                       if(yy1>yy2){JOptionPane.showMessageDialog(null, "Erreur : date fin de garantie doit etre suppérieur à la date d'achat de produit","Erruer",JOptionPane.ERROR_MESSAGE);
                           
                       }
                       /*
                       INSERT INTO `materiel`(`idmateriel`, `nommateriel`, `dateAchat`, `dateFingarantie`, `idtypemateriel`, `idbureau`, `dispo`) VALUES (999,"test","2020-12-25","2020-12-25",1,1,1)
                       
                    st.executrUpdate("INSERT INTO materiel VALUES("+k+" , '"+mmm+"' , '"+datea+"' , '"+datef+"' , "+i+" , "+j+" , "+d+" )");
                       
                       */
                       else {
                       if(yy1==yy2){
                           if(mm1==mm2){
                           if(jj1>jj2){JOptionPane.showMessageDialog(null, "Erreur : date fin de garantie doit etre suppérieur à la date d'achat de produit","Erruer",JOptionPane.ERROR_MESSAGE);
                           System.out.println("2");
                           }
                           else {//rs=st.executeQuery("insert into materiel values ("+k+",'"+t2.getText()+"','"+datea+"','"+datef+"',"+i+" ,"+j+" , "+d+" )");
                      st.executeUpdate("INSERT INTO materiel VALUES("+k+" , '"+mmm+"' , '"+datea+"' , '"+datef+"' , "+i+" , "+j+" , "+d+" )");
                               JOptionPane.showMessageDialog(null, "materiel  ajouté","information",JOptionPane.INFORMATION_MESSAGE);
                           System.out.println("3");}
                           
                           
                           
                           } else
                           { if(mm1>mm2){JOptionPane.showMessageDialog(null, "Erreur : date fin de garantie doit etre suppérieur à la date d'achat de produit","Erruer",JOptionPane.ERROR_MESSAGE);}
                           else 
                           {//rs=st.executeQuery("insert into materiel values ("+k+",'"+t2.getText()+"','"+datea+"','"+datef+"',"+i+","+j+" , "+d+")");
                       st.executeUpdate("INSERT INTO materiel VALUES("+k+" , '"+mmm+"' , '"+datea+"' , '"+datef+"' , "+i+" , "+j+" , "+d+" )");
                           System.out.println("4");
                       JOptionPane.showMessageDialog(null, "materiel  ajouté","information",JOptionPane.INFORMATION_MESSAGE);
                           
                           }}
                       } else {
                       if(mm1>mm2) 
                       {JOptionPane.showMessageDialog(null, "Erreur : date fin de garantie doit etre suppérieur à la date d'achat de produit","Erruer",JOptionPane.ERROR_MESSAGE);}
                       
                       
                       else {
                //       rs=st.executeQuery("insert into materiel values ("+k+",'"+t2.getText()+"','"+datea+"','"+datef+"',"+i+","+j+" , "+d+")");
                 st.executeUpdate("INSERT INTO materiel VALUES("+k+" , '"+mmm+"' , '"+datea+"' , '"+datef+"' , "+i+" , "+j+" , "+d+" )");       
                System.out.println("5");
                       JOptionPane.showMessageDialog(null, "materiel  ajouté","information",JOptionPane.INFORMATION_MESSAGE);
                       }
                       
                       
                       }
                    
                       }
                    /*else {st.executeUpdate("insert into materiel values ("+k+",'"+t2.getText()+"','"+datea+"','"+datef+"',"+i+","+j+")");
                       JOptionPane.showMessageDialog(null, "materiel  ajouté","information",JOptionPane.INFORMATION_MESSAGE);}*/
              
                   
                  /*  
                  st.executeUpdate("insert into materiel values ("+k+",'"+t2.getText()+"','"+datea+"','"+datef+"',"+i+","+j+")");  
                    
                
           
          JOptionPane.showMessageDialog(null, "materiel ajouté ajouté","information",JOptionPane.INFORMATION_MESSAGE);*/

        } catch (Exception e) {JOptionPane.showMessageDialog(null, "Erreur hna","Erruer",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
gerermateriel m = new gerermateriel(this.n,this.p,this.t);
this.dispose();
m.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        LOGIN s=new LOGIN();
        this.dispose();
        s.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        WindowEvent wc=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wc);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        MENU m;        // TODO add your handling code here:
        m = new MENU(this.n,this.p,this.t);
        this.dispose();
        m.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
gerermateriel m;       // TODO add your handling code here:
        m = new gerermateriel(this.n,this.p,this.t);
        this.dispose();
        m.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
gerermateriel m;       // TODO add your handling code here:
        m = new gerermateriel(this.n,this.p,this.t);
        this.dispose();
        m.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ajoutermateriel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ajoutermateriel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ajoutermateriel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ajoutermateriel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ajoutermateriel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c2;
    private com.toedter.calendar.JDateChooser d1;
    private com.toedter.calendar.JDateChooser d2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
