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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WahyudinAK
 */
public class Transaksi_Dialog extends javax.swing.JDialog {

  /**
   * Creates new form User_Dialog
   */
  perbajuan.koneksiProgram kon = new perbajuan.koneksiProgram();
  DefaultTableModel dtm;
  
  
  public Transaksi_Dialog() {
    initComponents();
    String[] colHeader = {"ID", "NO TRANSAKSI", "NAMA PELANGGAN", "MEREK BAJU", "JENIS BAJU", "UKURAN", "WARNA", "HARGA", "BANYAKNYA", "TOTAL"};
    dtm = new DefaultTableModel(colHeader,0);
    tableUser.setModel(dtm);
    tampilTabel();
    this.setLocationRelativeTo(this);
    txtID2.setVisible(false);
  }

  public JTextField getTxtIDPelanggan() {
    return txtIDPelanggan;
  }

  public JTextField getTxtUkuran() {
    return txtUkuran;
  }

  public JTextField getTxtHarga() {
    return txtHarga;
  }

  public JTextField getTxtJenis() {
    return txtJenis;
  }
  
  public JTextField getTxtMerek() {
    return txtMerek;
  }

  public void tampilTabel(){
    int row= tableUser.getRowCount();
    for(int a=0;a<row;a++){
      dtm.removeRow(0);
    }
    try {
      Connection con = kon.openconn();
      
      ResultSet res = con.createStatement().executeQuery("SELECT * FROM transaksi");
      while(res.next()){
        String[] dataTampil={
          res.getString(1),
          res.getString(2),
          res.getString(3),
          res.getString(4),
          res.getString(5),
          res.getString(6),
          res.getString(7),
          res.getString(8),
          res.getString(9),
          res.getString(10)
        };
        dtm.addRow(dataTampil);
      }
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, "Tidak Dapat Menampilkan Tabel\n"+e);
    }
  }
  
  public void reset(){
    txtID.setText("");
    txtUkuran.setText("");
    txtMerek.setText("");
    txtJenis.setText("");
    txtWarna.setText("");
    txtHarga.setText("");
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
    jLabel5 = new javax.swing.JLabel();
    txtID = new javax.swing.JTextField();
    txtUkuran = new javax.swing.JTextField();
    txtWarna = new javax.swing.JTextField();
    btnSimpan = new javax.swing.JButton();
    btnUbah = new javax.swing.JButton();
    btnHapus = new javax.swing.JButton();
    btnReset = new javax.swing.JButton();
    txtID2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    txtMerek = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    txtHarga = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    txtJenis = new javax.swing.JTextField();
    jButton1 = new javax.swing.JButton();
    jLabel6 = new javax.swing.JLabel();
    txtIDPelanggan = new javax.swing.JTextField();
    jButton2 = new javax.swing.JButton();
    jLabel8 = new javax.swing.JLabel();
    txtBanyaknya = new javax.swing.JTextField();
    jLabel9 = new javax.swing.JLabel();
    txtTotal = new javax.swing.JTextField();

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

    jLabel1.setText("ID Transaksi");

    jLabel2.setText("Ukuran");

    jLabel5.setText("Warna");

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

    txtMerek.setEditable(false);

    jLabel7.setText("Harga");

    txtHarga.setEditable(false);
    txtHarga.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtHargaActionPerformed(evt);
      }
    });

    jLabel4.setText("Jenis Baju");

    txtJenis.setEditable(false);

    jButton1.setText("CEK ");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jLabel6.setText("Nama Pelanggan");

    txtIDPelanggan.setEditable(false);

    jButton2.setText("CEK ");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    jLabel8.setText("Banyaknya");

    txtBanyaknya.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        txtBanyaknyaKeyPressed(evt);
      }
    });

    jLabel9.setText("Total");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(txtID2)
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel1)
                  .addComponent(jLabel2)
                  .addComponent(jLabel5)
                  .addComponent(jLabel4)
                  .addComponent(jLabel3)
                  .addComponent(jLabel7))
                .addGap(67, 67, 67))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(46, 46, 46))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(73, 73, 73))
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(102, 102, 102)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(txtTotal)
              .addComponent(txtBanyaknya, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtWarna, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtUkuran)
              .addComponent(txtJenis)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtMerek, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                .addComponent(txtIDPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              .addComponent(txtID, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtHarga, javax.swing.GroupLayout.Alignment.LEADING))
            .addGap(1, 1, 1))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(27, 27, 27)
            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
          .addComponent(jLabel6)
          .addComponent(txtIDPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton2))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(txtMerek, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton1))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(txtJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(txtUkuran, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(txtWarna, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7)
          .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel8)
          .addComponent(txtBanyaknya, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel9))
        .addGap(18, 30, Short.MAX_VALUE)
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
  String id_transaksi = txtID.getText();
  String id_pelanggan = txtIDPelanggan.getText();
  String merek = txtMerek.getText();
  String jenis = txtJenis.getText();
  String ukuran = txtUkuran.getText();
  String warna = txtWarna.getText();
  String harga = txtHarga.getText();
  String banyak = txtBanyaknya.getText();
  String total = txtHarga.getText();
    try {
      Connection con = kon.openconn();
      Statement sta = con.createStatement();
      ResultSet res = sta.executeQuery("SELECT * FROM transaksi WHERE no_transaksi='"+txtID.getText()+"'");
      if(res.next()){
        JOptionPane.showMessageDialog(this, "No ini sudah terdaftar");
        txtID.requestFocus();
      } else{
        String sql = "INSERT INTO transaksi VALUES(null,"
                + "'"+id_transaksi+"', "
                + "'"+id_pelanggan+"', "
                + "'"+merek+"', "
                + "'"+jenis+"', "
                + "'"+ukuran+"', "
                + "'"+warna+"', "
                + "'"+harga+"', "
                + "'"+banyak+"', "
                + "'"+total+"')";
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
      String id_transaksi = txtID.getText();
      String id_pel = txtIDPelanggan.getText();
      String merek = txtMerek.getText();
      String jenis = txtJenis.getText();
      String ukuran = txtUkuran.getText();
      String warna = txtWarna.getText();
      String harga = txtHarga.getText();
      String banyak = txtBanyaknya.getText();
      String total = txtHarga.getText();
    try {
      String sql = "UPDATE `transaksi` SET `no_transaksi`='"+id_transaksi+"',`nama_pelanggan`='"+id_pel+"',`merek_baju`='"+merek+"',`jenis_baju`='"+jenis+"',`ukuran`='"+ukuran+"',`warna`='"+warna+"',`harga`='"+harga+"',`banyaknya`='"+banyak+"',`total`='"+total+"' WHERE `id`='"+id+"'";
      Connection con = kon.openconn();
      con.createStatement().executeUpdate(sql);
      JOptionPane.showMessageDialog(this, "Data Berhasil Diubah");
      tampilTabel();
      reset();
    } catch (HeadlessException e) {
      JOptionPane.showMessageDialog(this, "Data Gagal Disimpan\n"+e);
    } catch (ClassNotFoundException ex) {
      Logger.getLogger(Transaksi_Dialog.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
      Logger.getLogger(Transaksi_Dialog.class.getName()).log(Level.SEVERE, null, ex);
    }
  }//GEN-LAST:event_btnUbahActionPerformed

  private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Yakin Ingin Menghapus Data Ini?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if (ok==0){
          try {
            String sql = "DELETE FROM transaksi WHERE id='"+txtID2.getText()+"'";
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
        txtIDPelanggan.setText(tableUser.getValueAt(row, 2).toString());
        txtMerek.setText(tableUser.getValueAt(row, 3).toString());
        txtJenis.setText(tableUser.getValueAt(row, 4).toString());
        txtUkuran.setText(tableUser.getValueAt(row, 5).toString());
        txtWarna.setText(tableUser.getValueAt(row, 6).toString());
        txtHarga.setText(tableUser.getValueAt(row, 7).toString());
        txtBanyaknya.setText(tableUser.getValueAt(row, 8).toString());
        txtTotal.setText(tableUser.getValueAt(row, 9).toString());
      }
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, "Gagal Mengambil Data\n"+e);
    }
  }//GEN-LAST:event_tableUserMouseClicked

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    new List_Barang(this).setVisible(true);
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    new List_Pelanggan(this).setVisible(true);
  }//GEN-LAST:event_jButton2ActionPerformed

  private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtHargaActionPerformed

  private void txtBanyaknyaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBanyaknyaKeyPressed
    String total;
    int a=0, b=0, c=0;
    try {
      a = Integer.valueOf(txtHarga.getText());
      b = Integer.valueOf(txtBanyaknya.getText());
      c = a*b;
      total = String.valueOf(c);
      txtTotal.setText(total);
    } catch(NumberFormatException e){
      
    }
  }//GEN-LAST:event_txtBanyaknyaKeyPressed

  

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnHapus;
  private javax.swing.JButton btnReset;
  private javax.swing.JButton btnSimpan;
  private javax.swing.JButton btnUbah;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tableUser;
  private javax.swing.JTextField txtBanyaknya;
  private javax.swing.JTextField txtHarga;
  private javax.swing.JTextField txtID;
  private javax.swing.JLabel txtID2;
  private javax.swing.JTextField txtIDPelanggan;
  private javax.swing.JTextField txtJenis;
  private javax.swing.JTextField txtMerek;
  private javax.swing.JTextField txtTotal;
  private javax.swing.JTextField txtUkuran;
  private javax.swing.JTextField txtWarna;
  // End of variables declaration//GEN-END:variables
}
