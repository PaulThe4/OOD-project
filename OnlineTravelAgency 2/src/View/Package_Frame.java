/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Model.Package;
import Model.In_Package;
import Model.User;
import Model.Admin;
import Model.Trip;
import Controller.SQLQueries;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author sonipriyapaul
 */
public class Package_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Package_Frame
     */
    public Package_Frame() {
        initComponents();
        Display();
        //show_Trips();
    }

    
    public void Display(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL","root","Education@2021");
            
            Statement st = conn.createStatement();
            String sql = "select * from Trips";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            /* while(rs.next()){
            
            String id = String.valueOf(rs.getInt("TripID"));
            String dest = rs.getString("Destination");
            String dur = rs.getString("Duration");
            String cos = String.valueOf((rs.getInt("Cost")));
            
            String tbData[] = {id,dest,dur,cos};
            DefaultTableModel tbl = (DefaultTableModel)jTable1.getModel();
            
            tbl.addRow(tbData);
            
            }*/
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Package_Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Package_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void show_Trips() {
         ArrayList<Trip> trips=new ArrayList<Trip>();
        
   //    trips = SQLQueries.DDL().selectAllTrip(1,"Alltrips",null,null);
         trips = SQLQueries.DDL().selectAllTrip();
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object[] col = new Object[4];
        
        //jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        for (int i = 0; i < trips.size(); i++) {
            
            col[0] = trips.get(i).getTripid();
            col[1] = trips.get(i).getDestination();
            col[2] = trips.get(i).getDuration();
            col[3] = trips.get(i).getCost();
            model.addRow(col);
            
        }
//          
//            Trip trip=SQLQueries.DDL().selectTrip( trips.get(i).gettripid());
//            row[0] = trips.get(i).getTripID();
//            row[1] = trips.get(i).getSource();
//            row[2] = trips.get(i).getDestination();
//             row[3] = trips.get(i).getTravelDate();
//            row[4] = trips.get(i).getStatus();
//            model.addRow(row);
//           }
        

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "TripID", "Destination", "Duration", "Cost"
            }
        ));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add Package to Itinerary");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Proceed to Payment");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please choose your package:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton1)
                        .addGap(81, 81, 81)
                        .addComponent(jButton2)
                        .addGap(61, 61, 61)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        HomePage hp = new HomePage();
        hp.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int q = 0;
        while(jTable1.getSelectionModel().isSelectionEmpty()){
            JOptionPane.showMessageDialog(this, "Nothing was selected!"); 
            q = 1;
            break;
        }
        if(q == 0){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL","root","Education@2021");
            DefaultTableModel tbl = (DefaultTableModel)jTable1.getModel();
            
            int row = jTable1.getSelectedRow();
            int row_count = jTable1.getSelectedRowCount();
            String cell1 = tbl.getValueAt(row, 0).toString();
            String cell2 = jTable1.getModel().getValueAt(row, 1).toString();
            String cell3 = jTable1.getModel().getValueAt(row, 2).toString();
            String cell4 = jTable1.getModel().getValueAt(row, 3).toString();
            String sql = "Insert into Itinerary values(?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
                
                pst.setString(1,cell1);
                pst.setString(2,cell2);
                pst.setString(3,cell3);
                pst.setString(4,cell4);
                
                pst.execute();
                
            
            JOptionPane.showMessageDialog(this, "Itinerary added successfully!");
            /*Payments p = new Payments();
            p.show();
            dispose();*/
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Package_Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Package_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        Payments p = new Payments();
        p.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Package_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Package_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Package_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Package_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Package_Frame().setVisible(true);
                
            }
           
         //   Package_Frame pf = new Package_Frame();
           // pf.Display();
            
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}