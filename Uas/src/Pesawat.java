/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */

import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;

public class Pesawat extends javax.swing.JFrame {

    private String id;
    private String tujuan;
    private String harga;
    
     private void kosongkan_form(){
        txtNama.setText(null);
        txtId.setText(null);
        txtTujuan.setText(null);
        txtHarga.setText(null);
       
        
    }
    
    private void tampilkan_data(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Nama");
        model.addColumn("Id");
        model.addColumn("Tujuan");
        model.addColumn("Harga");
        
        
        try{
            int no =1;
            String sql = "SELECT * FROM harga";
            java.sql.Connection conn = (Connection)Konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4)});
            }
            
            tabelTiket.setModel(model);
            
            
        }catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
        }
    }


    /**
     * Creates new form Pesawat
     */
    public Pesawat() {
        initComponents();
        tampilkan_data();
        kosongkan_form();
    

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
        tabelTiket = new javax.swing.JTable();
        txtNama = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        txtTujuan = new javax.swing.JLabel();
        txtHarga = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelTiket.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelTiket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelTiketMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelTiket);

        txtNama.setText("Nama");

        txtId.setText("Id");

        txtTujuan.setText("Tujuan");

        txtHarga.setText("Harga");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNama)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtId)
                                .addGap(23, 23, 23))
                            .addComponent(txtTujuan)
                            .addComponent(txtHarga))))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(txtNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtId)
                .addGap(18, 18, 18)
                .addComponent(txtTujuan)
                .addGap(18, 18, 18)
                .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelTiketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelTiketMouseClicked
        // TODO add your handling code here:
         int baris = tabelTiket.rowAtPoint(evt.getPoint());
        String nama = tabelTiket.getValueAt(baris, 1).toString();
        txtNama.setText(nama);
        
        String id = tabelTiket.getValueAt(baris, 2).toString();
        txtId.setText(id);
        
    
        String tujuan = tabelTiket.getValueAt(baris, 3).toString();
        txtTujuan.setText(tujuan);
        
        String harga = tabelTiket.getValueAt(baris, 4).toString();
        txtHarga.setText(harga);
        
        
    }//GEN-LAST:event_tabelTiketMouseClicked

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
            java.util.logging.Logger.getLogger(Pesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesawat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelTiket;
    private javax.swing.JLabel txtHarga;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtNama;
    private javax.swing.JLabel txtTujuan;
    // End of variables declaration//GEN-END:variables
}