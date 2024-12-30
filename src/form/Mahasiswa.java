
package form;

import config.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Mahasiswa extends javax.swing.JFrame {
    
    private Connection conn;
    /**
     * Creates new form Mahasiswa
     */
    public Mahasiswa() {
        initComponents();
        conn = koneksi.getConnection();
        getData();
    }
    private void getData() {
        DefaultTableModel model=(DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "select * From mahasiswa";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()){
                int id          = rs.getInt("id");
                String nama     = rs.getString("nama");
                String telepon  = rs.getString("telepon");
                String alamat   = rs.getString("Alamat");
                
                Object[] rowData = {id,nama,telepon,alamat};
                model.addRow(rowData);  
            }
            
            rs.close();
            st.close();
        }catch (Exception e){
            Logger.getLogger(FormMahasiswa.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        lbl_nama = new javax.swing.JLabel();
        t_Nama = new javax.swing.JTextField();
        lbl_Telepon = new javax.swing.JLabel();
        t_telepon = new javax.swing.JTextField();
        lbl_Alamat = new javax.swing.JLabel();
        t_Alamat = new javax.swing.JTextField();
        t_cari = new javax.swing.JTextField();
        but_tambah = new javax.swing.JButton();
        but_perbarui = new javax.swing.JButton();
        but_batal = new javax.swing.JButton();
        but_hapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_data.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tbl_data.setForeground(new java.awt.Color(102, 102, 102));
        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Telepon", "Alamat"
            }
        ));
        tbl_data.setGridColor(new java.awt.Color(204, 204, 204));
        tbl_data.setRowHeight(30);
        jScrollPane1.setViewportView(tbl_data);

        lbl_nama.setText("Nama");

        t_Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_NamaActionPerformed(evt);
            }
        });

        lbl_Telepon.setText("Telepon");

        lbl_Alamat.setText("Alamat ");

        t_cari.setText("Pencarian");
        t_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_cariActionPerformed(evt);
            }
        });

        but_tambah.setText("TAMBAH");
        but_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_tambahActionPerformed(evt);
            }
        });

        but_perbarui.setText("PERBARUI");

        but_batal.setText("BATAL");

        but_hapus.setText("HAPUS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_Nama, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addComponent(t_telepon)
                    .addComponent(t_Alamat)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(but_tambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but_perbarui)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but_batal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but_hapus)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_cari, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_nama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Telepon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Alamat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(but_tambah)
                            .addComponent(but_perbarui)
                            .addComponent(but_batal)
                            .addComponent(but_hapus)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_cariActionPerformed
    
    private void but_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_tambahActionPerformed
        String nama = t_Nama.getText();
        String telepon = t_telepon.getText();
        String alamat = t_Alamat.getText();
        
        if(nama.isEmpty()|| telepon.isEmpty()||alamat.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Semua kolom harus diisi", "Validasi", JOptionPane.ERROR);
            return;
        }
        try {
            String sql = "INSERT INTO mahasiswa (nama,telpon,alamat) VALUES (?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nama);
            st.setString(2, telepon);
            st.setString(3, alamat);
            
            int rowInserted = st.executeUpdate();
            if(rowInserted > 0 ){
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan");
                resetForm ();
                getData();
            }
            st.close();
        } catch (Exception e) {
            Logger.getLogger(FormMahasiswa.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_but_tambahActionPerformed

    private void t_NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_NamaActionPerformed

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but_batal;
    private javax.swing.JButton but_hapus;
    private javax.swing.JButton but_perbarui;
    private javax.swing.JButton but_tambah;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Alamat;
    private javax.swing.JLabel lbl_Telepon;
    private javax.swing.JLabel lbl_nama;
    private javax.swing.JTextField t_Alamat;
    private javax.swing.JTextField t_Nama;
    private javax.swing.JTextField t_cari;
    private javax.swing.JTextField t_telepon;
    private javax.swing.JTable tbl_data;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        t_Nama.setText("");
        t_telepon.setText("");
        t_Alamat.setText("");
    } 

    
}
