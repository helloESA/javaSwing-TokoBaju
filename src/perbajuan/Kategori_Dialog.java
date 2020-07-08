/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perbajuan;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WahyudinAK
 */
public class Kategori_Dialog extends javax.swing.JDialog {

  /**
   * Creates new form User_Dialog
   */
  perbajuan.koneksiProgram kon = new perbajuan.koneksiProgram();
  DefaultTableModel dtm;
  
  
  public Kategori_Dialog() {
    initComponents();
    String[] colHeader = {"ID", "KODE KATEGORI", "MEREK BAJU", "JENIS BAJU", "DISTRIBUTOR"};
    dtm = new DefaultTableModel(colHeader,0);
    tableUser.setModel(dtm);
    tampilTabel();
    this.setLocationRelativeTo(this);
    txtID2.setVisible(false);
  }

  public void tampilTabel(){
    int row= tableUser.getRowCount();
    for(int a=0;a<row;a++){
      dtm.removeRow(0);
    }
    try {
      Connection con = kon.openconn();
      
      ResultSet res = con.createStatement().executeQuery("SELECT * FROM kategori");
      while(res.next()){
        String[] dataTampil={
          res.getString(1),
          res.getString(2),
          res.getString(3),
          res.getString(4),
          res.getString(5)
        };
        dtm.addRow(dataTampil);
      }
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, "Tidak Dapat Menampilkan Tabel\n"+e);
    }
  }
  
  public void reset(){
    txtID.setText("");
    txtDistributor.setText("");
    txtMerek.setText("");
    txtJenis.setText("");
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
    jScrollPane1 = new javax.swing.JScrollPane();
    tableUser = new javax.swing.JTable();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    txtID = new javax.swing.JTextField();
    txtDistributor = new javax.swing.JTextField();
    btnSimpan = new javax.swing.JButton();
    btnUbah = new javax.swing.JButton();
    btnHapus = new javax.swing.JButton();
    btnReset = new javax.swing.JButton();
    txtID2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    txtMerek = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    txtJenis = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(39, 162, 67));

    jPanel2.setBackground(new java.awt.Color(181, 215, 242));

    tableUser.setModel(new javax.swing.table.DefaultTableModel(
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
    tableUser.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tableUserMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tableUser);

    jLabel1.setText("ID Kategori");

    jLabel2.setText("Distributor");

    btnSimpan.setBackground(new java.awt.Color(39, 162, 67));
    btnSimpan.setText("SIMPAN");
    btnSimpan.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSimpanActionPerformed(evt);
      }
    });

    btnUbah.setBackground(new java.awt.Color(255, 193, 7));
    btnUbah.setText("UBAH");
    btnUbah.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnUbahActionPerformed(evt);
      }
    });

    btnHapus.setBackground(new java.awt.Color(220, 53, 69));
    btnHapus.setText("HAPUS");
    btnHapus.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnHapusActionPerformed(evt);
      }
    });

    btnReset.setBackground(new java.awt.Color(23, 162, 184));
    btnReset.setText("RESET");
    btnReset.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnResetActionPerformed(evt);
      }
    });

    txtID2.setText("ID");

    jLabel3.setText("Merek Baju");

    jLabel4.setText("Jenis Baju");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1)
              .addComponent(jLabel2)
              .addComponent(jLabel4)
              .addComponent(jLabel3))
            .addGap(51, 51, 51)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtDistributor, javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(txtID)
              .addComponent(txtJenis)
              .addComponent(txtMerek)))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtID2)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(txtID2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(txtMerek, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(txtJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(txtDistributor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 30, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
//  String id = txtID2.getText();
  String id_kat = txtID.getText();
  String distributor = txtDistributor.getText();
  String merek = txtMerek.getText();
  String jenis = txtJenis.getText();
    try {
      Connection con = kon.openconn();
      Statement sta = con.createStatement();
      ResultSet res = sta.executeQuery("SELECT * FROM kategori WHERE no_kategori='"+txtID.getText()+"'");
      if(res.next()){
        JOptionPane.showMessageDialog(this, "No ini sudah terdaftar");
        txtID.requestFocus();
      } else{
        String sql = "INSERT INTO kategori VALUES(null,"
                + "'"+id_kat+"', "
                + "'"+merek+"', "
                + "'"+jenis+"', "
                + "'"+distributor+"')";
        sta.executeUpdate(sql);
        tampilTabel();
        reset();
        JOptionPane.showMessageDialog(this, "Data Telah Disimpan");
      }
      sta.close();
    } catch (HeadlessException | ClassNotFoundException | SQLException e) {
      JOptionPane.showMessageDialog(this, "Data Gagal Disimpan\n"+e);
    }
  }//GEN-LAST:event_btnSimpanActionPerformed

  private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
      String id = txtID2.getText();
      String id_kat = txtID.getText();
      String merek = txtMerek.getText();
      String jenis = txtJenis.getText();
      String distributor = txtDistributor.getText();
    try {
      String sql = "UPDATE `kategori` SET `no_kategori`='"+id_kat+"',`merek_baju`='"+merek+"',`jenis_baju`='"+jenis+"',`distributor`='"+distributor+"' WHERE `id`='"+id+"'";
      Connection con = kon.openconn();
      con.createStatement().executeUpdate(sql);
      JOptionPane.showMessageDialog(this, "Data Berhasil Diubah");
      tampilTabel();
      reset();
    } catch (HeadlessException e) {
      JOptionPane.showMessageDialog(this, "Data Gagal Disimpan\n"+e);
    } catch (ClassNotFoundException ex) {
      Logger.getLogger(Kategori_Dialog.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
      Logger.getLogger(Kategori_Dialog.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_btnUbahActionPerformed

  private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Yakin Ingin Menghapus Data Ini?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if (ok==0){
          try {
            String sql = "DELETE FROM kategori WHERE id='"+txtID2.getText()+"'";
            Connection con = kon.openconn();
            con.createStatement().executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
            tampilTabel();
            reset();
          } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Data Gagal Dihapus\n"+e);
          }
        }
  }//GEN-LAST:event_btnHapusActionPerformed

  private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
    reset();
  }//GEN-LAST:event_btnResetActionPerformed

  private void tableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMouseClicked
    int row = tableUser.getSelectedRow();
    try {
      if(row != -1){
        txtID2.setText(tableUser.getValueAt(row, 0).toString());
        txtID.setText(tableUser.getValueAt(row, 1).toString());
        txtMerek.setText(tableUser.getValueAt(row, 2).toString());
        txtJenis.setText(tableUser.getValueAt(row, 3).toString());
        txtDistributor.setText(tableUser.getValueAt(row, 4).toString());
      }
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, "Gagal Mengambil Data\n"+e);
    }
  }//GEN-LAST:event_tableUserMouseClicked

  

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnHapus;
  private javax.swing.JButton btnReset;
  private javax.swing.JButton btnSimpan;
  private javax.swing.JButton btnUbah;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tableUser;
  private javax.swing.JTextField txtDistributor;
  private javax.swing.JTextField txtID;
  private javax.swing.JLabel txtID2;
  private javax.swing.JTextField txtJenis;
  private javax.swing.JTextField txtMerek;
  // End of variables declaration//GEN-END:variables
}