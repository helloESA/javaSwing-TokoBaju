/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perbajuan;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WahyudinAK
 */
public class List_Kategori extends javax.swing.JDialog {

  /**
   * Creates new form List_Barang
   */
  perbajuan.koneksiProgram kon = new perbajuan.koneksiProgram();
  DefaultTableModel dtm;
  Barang_Dialog aView;
  
  public List_Kategori(Barang_Dialog aView) {
    initComponents();
    this.aView=aView;
    String[] colHeader = {"ID", "KODE KATEGORI", "MEREK BAJU", "JENIS BAJU", "DISTRIBUTOR"};
    dtm = new DefaultTableModel(colHeader,0);
    tableUser.setModel(dtm);
    tampilTabel();
    this.setLocationRelativeTo(this);
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
  
  public void cariTabel(){
    int row= tableUser.getRowCount();
    for(int a=0;a<row;a++){
      dtm.removeRow(0);
    }
    try {
      Connection con = kon.openconn();
      
      ResultSet res = con.createStatement().executeQuery("SELECT * FROM kategori WHERE merek_baju LIKE '%"+jTextField1.getText()+"%'");
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
    jTextField1 = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();

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

    jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        jTextField1KeyPressed(evt);
      }
    });

    jLabel1.setText("Cari");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel1))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

  private void tableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMouseClicked
    int row = tableUser.getSelectedRow();
    try {
      if(row != -1){
        aView.getTxtMerek().setText(tableUser.getValueAt(row, 2).toString());
        aView.getTxtJenis().setText(tableUser.getValueAt(row, 3).toString());
        this.dispose();
      }
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this, "Gagal Mengambil Data\n"+e);
    }
  }//GEN-LAST:event_tableUserMouseClicked

  private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
    cariTabel();
  }//GEN-LAST:event_jTextField1KeyPressed

  

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextField jTextField1;
  private javax.swing.JTable tableUser;
  // End of variables declaration//GEN-END:variables
}
