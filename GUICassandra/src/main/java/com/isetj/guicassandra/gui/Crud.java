
package com.isetj.guicassandra.gui;

import swingcrud.*;
import swingcrud.model.Region;
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
import javax.swing.table.TableModel;
import swingcrud.dao.ConnectionMySQL;
import swingcrud.jpa.RegionEntity;
import swingcrud.jpa.nosql.RegionEntityNoSQL;

/**
 *
 * @author arij
 */
public class Crud extends javax.swing.JFrame {
   public static ConnectionMySQL ConnexionMySQL;
    Connection con;
    Statement st;
    ArrayList<Region> students = new ArrayList<>();

    public Crud() throws SQLException {
        ConnexionMySQL= new ConnectionMySQL("localhost","root","");
        initComponents();
        fetch();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFname = new javax.swing.JTextField();
        txtLongitude = new javax.swing.JTextField();
        txtLatitude = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudents = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPop = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtConfirmes = new javax.swing.JSpinner();
        txtMorts = new javax.swing.JSpinner();
        txtLid = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD");
        setResizable(false);

        txtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnameActionPerformed(evt);
            }
        });

        tblStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "City ID", "City Name", "Longitude", "Latitude", "Population", "Confirmes", "Morts"
            }
        ));
        tblStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStudents);

        btnSave.setText("Add");
        btnSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.setIconTextGap(0);
        btnSave.setInheritsPopupMenu(true);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete1.setText("Delete");
        btnDelete1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("COVID-19");

        jButton1.setText("Courbe");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("City name");

        jLabel6.setText("Longitude");

        jLabel7.setText("Latitude");

        jLabel8.setText("City ID");

        jLabel9.setText("Population");

        jLabel1.setText("Nbr cas confirmés");

        jLabel2.setText("Nbr cas morts");

        jLabel3.setText("Operations:");

        jLabel10.setText("City Infos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6))
                                    .addGap(44, 44, 44))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(47, 47, 47)))
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPop, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                    .addComponent(txtConfirmes)
                                    .addComponent(txtLatitude)
                                    .addComponent(txtLongitude)
                                    .addComponent(txtFname)
                                    .addComponent(txtLid)
                                    .addComponent(txtMorts))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(49, 49, 49))))
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(5, 5, 5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtLid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtLongitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLatitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtPop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtConfirmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtMorts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String fname = txtFname.getText().trim();
        int lid = (int) txtLid.getValue();
        String longitude = txtLongitude.getText().trim();
        String latitude = txtLatitude.getText().trim();
        int pop = (int) txtPop.getValue();
        int confirmes = (int) txtConfirmes.getValue();
        int morts = (int) txtMorts.getValue();

        System.out.println(pop);
        if (!fname.isEmpty() && !longitude.isEmpty() && !latitude.isEmpty()) {
             
               
            try {
                ResultSet rs = RegionEntity.selectRegionbyID(lid);
                //si resultat est null
                if (!rs.first()) {
                    RegionEntity.saveRegion(lid, fname, longitude, latitude, pop, confirmes, morts);
                   
                } else {
                    alert("Please provide a different id number", "Similar id found");
                }
                 rs = RegionEntity.selectAllRegion();
                 while(rs.next()){
                 DefaultTableModel model = (DefaultTableModel) tblStudents.getModel();
                    String[] row = new String[7];
                    row[0] = rs.getString("id");
                    row[1] = rs.getString("name");
                    row[2] = rs.getString("longitude");
                    row[3] =  rs.getString("latitude");
                    row[4] =  rs.getString("pop");
                    row[5] =  rs.getString("confirmes");
                    row[6] =  rs.getString("morts");
                    model.addRow(row);
                   }
                 JOptionPane.showConfirmDialog(this, "Save with success", "Save with success", JOptionPane.INFORMATION_MESSAGE);
            } //        else if (!id.matches("^[0-9]{8}$")) {
            catch (SQLException ex) {
                Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
            }

                
 
        }
        //            alert("please provide a valid id number", "Wrong id");
        //        }
        else {
            alert("please fill in all the details");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        int id = (int) txtLid.getValue();
        String fname = txtFname.getText().trim();
        String longitude = txtLongitude.getText().trim();
        String latitude = txtLatitude.getText().trim();
        int pop = (int) txtPop.getValue();
        int confirmes = (int) txtConfirmes.getValue();
        int morts = (int) txtMorts.getValue();

         
                
  try {
                ResultSet rs = RegionEntity.selectRegionbyID(id);
                //si resultat est null
                if (rs.first()) {
                    RegionEntity.updateRegion(id, fname, longitude, latitude, pop, confirmes, morts);
                   
                } else {
                    alert("Please provide a existent id number", "Similar id found");
                }
                 rs = RegionEntity.selectAllRegion();
                 while(rs.next()){
                 DefaultTableModel model = (DefaultTableModel) tblStudents.getModel();
                    String[] row = new String[7];
                    row[0] = rs.getString("id");
                    row[1] = rs.getString("name");
                    row[2] = rs.getString("longitude");
                    row[3] =  rs.getString("latitude");
                    row[4] =  rs.getString("pop");
                    row[5] =  rs.getString("confirmes");
                    row[6] =  rs.getString("morts");
                    model.addRow(row);
                   }
                 JOptionPane.showConfirmDialog(this, "Save with success", "Save with success", JOptionPane.INFORMATION_MESSAGE);
            } //        else if (!id.matches("^[0-9]{8}$")) {
            catch (SQLException ex) {
                Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_btnUpdateActionPerformed
  private void btSaveNoSQL(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        String fname = txtFname.getText().trim();
        int lid = (int) txtLid.getValue();
        String longitude = txtLongitude.getText().trim();
        String latitude = txtLatitude.getText().trim();
        int pop = (int) txtPop.getValue();
        int confirmes = (int) txtConfirmes.getValue();
        int morts = (int) txtMorts.getValue();

        System.out.println(pop);
        if (!fname.isEmpty() && !longitude.isEmpty() && !latitude.isEmpty()) {
             
             
                com.datastax.driver.core.ResultSet rs = RegionEntityNoSQL.selectRegionbyID(lid);
                //si resultat est null
                if (!rs.wasApplied()) {
                    RegionEntityNoSQL.saveRegion(lid, fname, longitude, latitude, pop, confirmes, morts);
                   
                } else {
                    JOptionPane.showConfirmDialog(this,"Please provide a different id number","Save with success", JOptionPane.INFORMATION_MESSAGE);
                }
                 rs = RegionEntityNoSQL.selectAllRegion();
                  DefaultTableModel model = (DefaultTableModel) tblStudents.getModel();
                  
                 rs.forEach(r -> {
                  String[] row = new String[7];
                    row[0] = r.getString("id");
                    row[1] = r.getString("name");
                    row[2] = r.getString("longitude");
                    row[3] =  r.getString("latitude");
                    row[4] =  r.getString("pop");
                    row[5] =  r.getString("confirmes");
                    row[6] =  r.getString("morts");
                    model.addRow(row);
                   });
                 JOptionPane.showConfirmDialog(this, "Save with success", "Save with success", JOptionPane.INFORMATION_MESSAGE);
            } //        else if (!id.matches("^[0-9]{8}$")) {
            

                
 
         
         
    }                                       

    //set the values of a row to the textfields
    private void tblStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudentsMouseClicked
        // TODO add your handling code here:
        int i = tblStudents.getSelectedRow();
        TableModel model = tblStudents.getModel();
        txtLid.setValue(model.getValueAt(i, 0));
        txtFname.setText(model.getValueAt(i, 1).toString());
        txtLatitude.setText(model.getValueAt(i, 2).toString());
        txtLongitude.setText(model.getValueAt(i, 3).toString());
        txtPop.setValue(model.getValueAt(i, 4));
        txtConfirmes.setValue(model.getValueAt(i, 5));
        txtMorts.setValue(model.getValueAt(i, 6));
    }//GEN-LAST:event_tblStudentsMouseClicked

    //handles delete button action
    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // TODO add your handling code here:
        int i = tblStudents.getSelectedRow();
        if (i >= 0) {
            int option = JOptionPane.showConfirmDialog(rootPane,
                    "Are you sure you want to Delete?", "Delete confirmation", JOptionPane.YES_NO_OPTION);
            if (option == 0) {
                TableModel model = tblStudents.getModel();

                String id = model.getValueAt(i, 0).toString();
                if (tblStudents.getSelectedRows().length == 1) {
                    delete(id);
                    DefaultTableModel model1 = (DefaultTableModel) tblStudents.getModel();
                    model1.setRowCount(0);
                    fetch();
                    clear();
                }
            }
        } else {
            alert("Please select a row to delete");
        }
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        graphe frame = new graphe();
        frame.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFnameActionPerformed

    //method to show an info alert
    public void alert(String msg) {
        JOptionPane.showMessageDialog(rootPane, msg);
    }

    //method to show an error alert
    public void alert(String msg, String title) {
        JOptionPane.showMessageDialog(rootPane, msg, title, JOptionPane.ERROR_MESSAGE);
    }

    //method to save region to the db
    public void saveRegion(int id, String fname, String longitude, String latitude, int pop, int confirmes, int morts) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/covid", "root", "");
            String sql = "INSERT INTO `regions`"
                    + "VALUES ('" + id + "','" + fname + "','" + longitude + "','" + latitude + "'," + pop + ",'" + confirmes + "','" + morts + "')";
            st = con.createStatement();
            st.execute(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }
//        fetch();
//        fetch();
    }

    //update the db
    public void update(int id, String fname, String longitude, String latitude, int pop, int conf, int morts) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/covid", "root", "");
            String sql = "UPDATE `regions`SET name='" + fname + "',longitude='" + longitude +
                    "',latitude='" + latitude + "',population='" + pop + "',confirmes='" + conf + "',morts='" + morts
                    + "'WHERE id='" + id + "'";
            st = con.createStatement();
            st.execute(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }
//        fetch();
//        fetch();
    }

    //delete details in the db
    public void delete(String id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/covid", "root", "");
            String sql = "DELETE FROM `regions` WHERE id='" + id + "'";
            st = con.createStatement();
            st.execute(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }
//        fetch();
//        fetch();
    }

    //method to clear the txt fields
    private void clear() {
        txtLid.setValue(0);
        txtFname.setText("");
        txtLatitude.setText("");
        txtLongitude.setText("");
        txtConfirmes.setValue(0);
        txtMorts.setValue(0);
        txtPop.setValue(0);
    }

    //fetch
    private void fetch() {
        students.clear();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/covid", "root", "");
            String sql = "select * from regions";
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Region region = new Region(rs.getInt("id"), rs.getString("name"), rs.getString("longitude"), rs.getString("latitude"), rs.getInt("population"), rs.getInt("confirmes"), rs.getInt("morts"));
                students.add(region);
            }
            DefaultTableModel model = (DefaultTableModel) tblStudents.getModel();
            for (Region region : students) {

                Object[] row = new Object[7];
                row[0] = region.getId();
                row[1] = region.getName();
                row[2] = region.getLongitude();
                row[3] = region.getLatitude();
                row[4] = region.getPop();
                row[5] = region.getConfirmes();
                row[6] = region.getMorts();

                model.addRow(row);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Crud().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Crud.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStudents;
    private javax.swing.JSpinner txtConfirmes;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLatitude;
    private javax.swing.JSpinner txtLid;
    private javax.swing.JTextField txtLongitude;
    private javax.swing.JSpinner txtMorts;
    private javax.swing.JSpinner txtPop;
    // End of variables declaration//GEN-END:variables
}
