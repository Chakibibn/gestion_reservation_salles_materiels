/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Winsido
 */
public class gerermateriel extends javax.swing.JFrame {
SeConnecter c=new SeConnecter();
DefaultTableModel model=new DefaultTableModel();
DefaultTableModel model1=new DefaultTableModel();
DefaultTableModel model2=new DefaultTableModel();
ResultSet rs,rs1,rs2;
Statement st;
String id,nss,dateA,dateFG,n,p;
modifiermateriel modi;

int t;

    /**
     * Creates new form gerermateriel
     */
    public gerermateriel(String n,String p,int t) {
        initComponents();
        this.setSize(1340, 820);
        this.setResizable(false);
        this.n=n;
        this.p=p;
        this.t=t;
     p2.setVisible(false);
     model1.addColumn("Materiel");
        model1.addColumn("Nom");
        model1.addColumn("Prenom");
        model1.addColumn("DATE DEBUT");
        model1.addColumn("DATE FIN");
        jTable2.setModel(model1);
        model2.addColumn("id Materiel");
        model2.addColumn("le motif");
        
        this.setLocationRelativeTo(null);
        model.addColumn("idmateriel");
        model.addColumn("nom materiel");
        model.addColumn("date Achat");
        model.addColumn("date Fin garantie");
        model.addColumn("code type materiel");
        model.addColumn("code bureau");
        try {
            st=c.obtenirCon().createStatement();
            rs=st.executeQuery("SELECT*from materiel" );

              
            while(rs.next()){model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});}
            jTable1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur S??l??ction","Erreur",JOptionPane.ERROR_MESSAGE);
        }
        
    }

    private gerermateriel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void Actualiser(){
    model.setRowCount(0);
    try {
            
            rs=st.executeQuery("SELECT m.idmateriel,m.nommateriel,m.dateAchat,m.dateFingarantie,t.typemateriel,b.NomBuerau from materiel m ,  typemateriel t ,bureau b WHERE m.idmateriel=t.idtypemateriel and m.idbureau=b.IDBuerau");
            while(rs.next()){model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});}
            jTable1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreyr S??l??ction","Erreur",JOptionPane.ERROR_MESSAGE);}
    
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
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ajouter = new javax.swing.JLabel();
        modifier = new javax.swing.JLabel();
        supprimer = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        p2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        c1 = new javax.swing.JComboBox<>();
        ptf = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        pdate = new javax.swing.JPanel();
        d1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 94, 166));
        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Impact", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("         Gerer materiel");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 230, 220, 40);

        ajouter.setFont(new java.awt.Font("Impact", 2, 18)); // NOI18N
        ajouter.setForeground(new java.awt.Color(255, 255, 255));
        ajouter.setText("                  Ajouter  materiel");
        ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ajouterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ajouterMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ajouterMousePressed(evt);
            }
        });
        jPanel2.add(ajouter);
        ajouter.setBounds(0, 300, 220, 40);

        modifier.setFont(new java.awt.Font("Impact", 2, 18)); // NOI18N
        modifier.setForeground(new java.awt.Color(255, 255, 255));
        modifier.setText("                Modifier materiel");
        modifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modifierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modifierMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                modifierMousePressed(evt);
            }
        });
        jPanel2.add(modifier);
        modifier.setBounds(0, 370, 220, 40);

        supprimer.setFont(new java.awt.Font("Impact", 2, 18)); // NOI18N
        supprimer.setForeground(new java.awt.Color(255, 255, 255));
        supprimer.setText("                 Supperimer materiel");
        supprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                supprimerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                supprimerMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                supprimerMousePressed(evt);
            }
        });
        jPanel2.add(supprimer);
        supprimer.setBounds(0, 460, 220, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 220, 820);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sia/edubase.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(540, 0, 390, 110);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(320, 280, 770, 260);

        p2.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel1.add(p2);
        p2.setBounds(370, 550, 700, 230);

        jButton5.setBackground(new java.awt.Color(0, 94, 166));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Chercher");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(1150, 180, 120, 40);

        c1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V??rifier diponibilt?? a une date", "Derrenier perssone a utilis?? le materiel", "liste materiel d??ja utilis??", "etait emprent?? par et  pour", "localisation du materiel" }));
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
        c1.setBounds(230, 180, 290, 40);

        ptf.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Code materiel");

        t1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout ptfLayout = new javax.swing.GroupLayout(ptf);
        ptf.setLayout(ptfLayout);
        ptfLayout.setHorizontalGroup(
            ptfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ptfLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ptfLayout.setVerticalGroup(
            ptfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ptfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ptfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(ptf);
        ptf.setBounds(520, 170, 340, 70);

        pdate.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pdateLayout = new javax.swing.GroupLayout(pdate);
        pdate.setLayout(pdateLayout);
        pdateLayout.setHorizontalGroup(
            pdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pdateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pdateLayout.setVerticalGroup(
            pdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pdateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pdate);
        pdate.setBounds(870, 170, 260, 60);

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 94, 166));
        jLabel3.setText("GESTION DES MATERIAUX");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(570, 120, 310, 50);

        jMenu1.setText("Log out");

        jMenuItem1.setText("D??connexion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Quitt??");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("page Menu");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MousePressed

    private void ajouterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMouseEntered
        Border border = BorderFactory.createEtchedBorder(Color.white, Color.white);
        ajouter.setBorder(border);// TODO add your handling code here:
    }//GEN-LAST:event_ajouterMouseEntered

    private void ajouterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMouseExited
        Border border = BorderFactory.createEmptyBorder();
        ajouter.setBorder(border);
        // TODO add your handling code here:
    }//GEN-LAST:event_ajouterMouseExited

    private void ajouterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajouterMousePressed
ajoutermateriel a=new ajoutermateriel(this.n,this.p,this.t);
this.dispose();
a.setVisible(true);
    }//GEN-LAST:event_ajouterMousePressed

    private void modifierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierMouseEntered
        Border border = BorderFactory.createEtchedBorder(Color.white, Color.white);
        modifier.setBorder(border);        // TODO add your handling code here:
    }//GEN-LAST:event_modifierMouseEntered

    private void modifierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierMouseExited
        Border border = BorderFactory.createEmptyBorder();
        modifier.setBorder(border);        // TODO add your handling code here:
    }//GEN-LAST:event_modifierMouseExited

    private void modifierMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierMousePressed
modi = new modifiermateriel(id, nss,this.n,this.p,this.t);
this.dispose();
modi.setVisible(true);
    }//GEN-LAST:event_modifierMousePressed

    private void supprimerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerMouseEntered
        Border border = BorderFactory.createEtchedBorder(Color.white, Color.white);
        supprimer.setBorder(border);        // TODO add your handling code here:
    }//GEN-LAST:event_supprimerMouseEntered

    private void supprimerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerMouseExited
        Border border = BorderFactory.createEmptyBorder();
        supprimer.setBorder(border);        // TODO add your handling code here:
    }//GEN-LAST:event_supprimerMouseExited

    private void supprimerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supprimerMousePressed
supprimermateriell s = new supprimermateriell(this.n,this.p,this.t);
this.dispose();
s.setVisible(true);
    }//GEN-LAST:event_supprimerMousePressed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        int i=0;
      String x=c1.getSelectedItem().toString();
         if(x.equals("V??rifier diponibilt?? a une date")){i=1;}
                else {if(x.equals("Derrenier perssone a utilis?? le materiel")) { i=2;}
                else { if(x.equals("liste materiel d??ja utilis??")){i=3;}//etait emprent?? par et  pour
                else {if(x.equals("etait emprent?? par et  pour")) {i=4;}//liste materiel d??ja utilis??
                else {if (x.equals("localisation du materiel")){i=5;}}}}
                }
         if(i==1){
         ptf.setVisible(true);
         pdate.setVisible(true);
         }
         if(i==2){ ptf.setVisible(true);
             pdate.setVisible(false);}
         if(i==3){ptf.setVisible(false);
                  pdate.setVisible(false);}
         if(i==4){ptf.setVisible(true);
             pdate.setVisible(false);}
         if(i==5){ ptf.setVisible(true);
             pdate.setVisible(false);}
    }//GEN-LAST:event_c1ActionPerformed

    private void c1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1MouseEntered
c1.showPopup();        // TODO add your handling code here:
    }//GEN-LAST:event_c1MouseEntered

    private void c1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1MouseExited
c1.hidePopup();        // TODO add your handling code here:
    }//GEN-LAST:event_c1MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   //V??rifier diponibilt?? a une date, Derrenier perssone a utilis?? le materiel, etait emprent?? par et  pour       
        try {
            int j=0;
      String x=c1.getSelectedItem().toString();
         if(x.equals("V??rifier diponibilt?? a une date")){j=1;}
                else {if(x.equals("Derrenier perssone a utilis?? le materiel")) { j=2;}
                else { if(x.equals("liste materiel d??ja utilis??")){j=3;}//etait emprent?? par et  pour
                else {if(x.equals("etait emprent?? par et  pour")) {j=4;}//liste materiel d??ja utilis??
                else {if(x.equals("localisation du materiel")){j=5;}}
                }}
                }
                    if(j==1){/*pour le tableau
                        rs2=st.executeQuery("SELECT*from materiel" );
                            while(rs2.next()){model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});}
                         jTable1.setModel(model);*/
                         try {
            int mmm=Integer.parseInt(t1.getText());
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String datea=sdf.format(d1.getDate());
            System.out.println("sia.gerer.jButton2ActionPerformed()");
            String test="";
     //SELECT reservation.idreservation from reservation WHERE numsalle=2 and reservation.dateDebut<="2020-04-20" and reservation.datefin>="2020-04-20"
     rs=st.executeQuery("SELECT reservation.idreservation from reservation WHERE idmateriel="+mmm+" AND reservation.dateDebut <='"+datea+"' and reservation.datefin>='"+datea+"'");
            //rs=st.executeQuery("select salle.dispo from salle where salle.numsalle NOT IN (SELECT reservation.numsalle from reservation where reservation.dateDebut<=' "+datea+ "' , reservation.datefin>=' "+datea+"' ,salle.numsalle= "+i+")"); 
          while(rs.next()){
          test=rs.getString(1);
          } 
          if(test.equals("")){
              System.out.println("le materiel est disponible le "+datea);
              JOptionPane.showMessageDialog(null, "le materiel est disponible le "+datea,"INFO",JOptionPane.INFORMATION_MESSAGE);
          }
          else {
              System.out.println("le materiel n'est disponible le "+datea);
              JOptionPane.showMessageDialog(null, "le materiel n'est pas   disponible le "+datea,"INFO",JOptionPane.INFORMATION_MESSAGE);
          
          }
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreyr S??l??ction","Erreur",JOptionPane.ERROR_MESSAGE);} 
                        
                        
                        
                        
                        
                        
                    }
                    //debut 2
          if(j==2){/*pour le tableau
                rs=st.executeQuery("SELECT*from materiel" );
                while(rs.next()){model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});}
                jTable1.setModel(model);*/
              try {
           int i = Integer.parseInt(t1.getText());
            rs=st.executeQuery("SELECT MAX(reservation.idreservation) FROM reservation , utiliser where reservation.idreservation=utiliser.idreservation and  utiliser.idmateriel="+i); 
            int z=0;
            while(rs.next()) { 
            z =rs.getInt("MAX(reservation.idreservation)");}
         
          //  System.out.println(""+z);
            rs1=st.executeQuery("SELECT individu.nomind , individu.prenomind FROM individu , reservation , utiliser WHERE individu.idindividu=reservation.idindividu and reservation.idreservation=utiliser.idreservation and utiliser.idmateriel="+i+" and reservation.idreservation ="+z);
          while(rs1.next()){
           JOptionPane.showMessageDialog(null, ""+rs1.getString(1)+" "+rs1.getString(2),"INFO",JOptionPane.INFORMATION_MESSAGE);
            }
              } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erruer S??l??ction","Erreur",JOptionPane.ERROR_MESSAGE);
                    } 
            } 
          //fin 2 
          //debut 3 
          if(j==3){
                //p2.setVisible(true);
               try {
         
       
                    rs=st.executeQuery("SELECT materiel.nommateriel ,individu.nomind , individu.prenomind, reservation.dateDebut , reservation.datefin FROM materiel , utiliser, individu, reservation WHERE materiel.idmateriel=utiliser.idmateriel and reservation.idreservation=utiliser.idreservation and reservation.idindividu=individu.idindividu");
         
                    while(rs.next()){model1.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});}
                    jTable1.setModel(model1);    
                 
         
            
            
               
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erruer S??l??ction","Erreur",JOptionPane.ERROR_MESSAGE);
                    }
          }
          //fin 3
          //debut 4 
          if(j==4){
               jTable2.setModel(model2);
                //p2.setVisible(true);
               try {
                int i = Integer.parseInt(t1.getText());
       
                rs=st.executeQuery("SELECT DISTINCT utiliser.idmateriel , motif.LibelleMotif from utiliser JOIN reservation on utiliser.idreservation=reservation.idreservation JOIN motif on reservation.codemotif=motif.codemotif WHERE utiliser.idmateriel="+i);
         
                while(rs.next()){model2.addRow(new Object[]{rs.getString(1),rs.getString(2)});}
                jTable1.setModel(model2);    
                  
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erruer S??l??ction","Erreur",JOptionPane.ERROR_MESSAGE);
            }
          }
          //fin 4 
          //debut 5 
          if(j==5){/*pour le tableau
                rs=st.executeQuery("SELECT*from materiel" );
                while(rs.next()){model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});}
                jTable1.setModel(model);*/
           try {
                String b="",n="";
                int i = Integer.parseInt(t1.getText());
                rs=st.executeQuery("SELECT bureau.NomBuerau FROM bureau JOIN materiel on materiel.idbureau=bureau.IDBuerau where materiel.idmateriel="+i);
                while(rs.next()){b=rs.getString(1);}
                 rs1=st.executeQuery("SELECT materiel.nommateriel FROM materiel WHERE materiel.idmateriel="+i);
        
                while(rs1.next()){
                n=rs1.getString(1);
                }
                JOptionPane.showMessageDialog(null, ""+n+" est dans "+b,"INFO",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erruer S??l??ction","Erreur",JOptionPane.ERROR_MESSAGE);
        }
          }
          //fin 5
                    
         } catch (Exception e ){JOptionPane.showMessageDialog(null, "Erruer S??l??ction","Erreur",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        id= (String) model.getValueAt(jTable1.getSelectedRow(),0);
             nss= (String) model.getValueAt(jTable1.getSelectedRow(),1);
             dateA= (String) model.getValueAt(jTable1.getSelectedRow(),2);
             dateFG= (String) model.getValueAt(jTable1.getSelectedRow(),2);
             System.out.println(" "+id+" "+nss+" "+dateA+" "+dateFG);
            modi=new modifiermateriel(id,nss,this.n,this.p,this.t);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        LOGIN s=new LOGIN();
        this.dispose();
        s.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        WindowEvent wc=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wc);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        MENU m;        // TODO add your handling code here:
        m = new MENU(this.n,this.p,this.t);
        this.dispose();
        m.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

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
            java.util.logging.Logger.getLogger(gerermateriel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gerermateriel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gerermateriel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gerermateriel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gerermateriel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ajouter;
    private javax.swing.JComboBox<String> c1;
    private com.toedter.calendar.JDateChooser d1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel modifier;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel pdate;
    private javax.swing.JPanel ptf;
    private javax.swing.JLabel supprimer;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
