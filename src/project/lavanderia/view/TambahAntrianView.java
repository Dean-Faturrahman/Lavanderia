/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.lavanderia.view;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import project.lavanderia.controller.PelangganController;
import project.lavanderia.database.LavanderiaDatabase;
import project.lavanderia.entity.Pelanggan;
import project.lavanderia.error.pelangganException;
import project.lavanderia.event.PelangganListener;
import project.lavanderia.model.PelangganModel;
import project.lavanderia.model.TabelPelangganModel;
import project.lavanderia.service.PelangganDao;

/**
 *
 * @author Dean
 */
public class TambahAntrianView extends javax.swing.JPanel implements PelangganListener,ListSelectionListener{
    public String jenis;
    public double harga;
    public String tanggal;
    private PelangganModel model;
    private PelangganController controller;
    public double total;
    public double intBerat;
    private LavanderiaDatabase db;
    private TabelPelangganModel model2;
    private Pelanggan pelanggan;
    private DefaultTableModel tabModel;

    /**
     * Creates new form TambahAntrianView
     */
    public TambahAntrianView() {
        model2 = new TabelPelangganModel();
        
        model = new PelangganModel();
        model.setListener(this);
        
        controller = new PelangganController();
        controller.setModel(model);
        
        initComponents();
        setTanggal(null);
        txtTanggal.setText(getTanggal());
        model2 = new TabelPelangganModel();
        TablePelanggan.getSelectionModel().addListSelectionListener(this);
        TablePelanggan.setModel(model2);
        getData();
    }

    
    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        Date tgl = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");        
        tanggal = s.format(tgl);
        this.tanggal = tanggal;
    }
    
    public JTable getTablePelanggan() {
        return TablePelanggan;
    }

    public JTextField getTxtAlamat() {
        return txtAlamat;
    }

    public JTextField getTxtBerat() {
        return txtBerat;
    }

    public JTextField getTxtHarga() {
        return txtHarga;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public JTextField getTxtNama() {
        return txtNama;
    }

    public JTextField getTxtTelp() {
        return txtTelp;
    }

    public JComboBox<String> getCmbJenis() {
        return cmbJenis;
    }

    public JTextField getTxtTanggal() {
        return txtTanggal;
    }

    public void setTxtTanggal(JTextField txtTanggal) {
        this.txtTanggal = txtTanggal;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    } 

    public void getData( ){
        try{
            Statement stat = LavanderiaDatabase.getConnection().createStatement();
            String sql  = "Select * from PELANGGAN";
            ResultSet res   = stat.executeQuery(sql);
            while(res.next()){
                pelanggan = new Pelanggan();
                pelanggan.setNoid(res.getInt("NOID"));
                pelanggan.setTanggal(res.getString("TANGGAL"));
                pelanggan.setNama(res.getString("NAMA"));
                pelanggan.setAlamat(res.getString("ALAMAT"));
                pelanggan.setTelp(res.getString("TELP"));
                pelanggan.setJenis(res.getString("JENIS"));
                pelanggan.setBerat(res.getDouble("BERAT"));
                pelanggan.setHarga(res.getDouble("HARGA"));

                model2.add(pelanggan);
            }
        } catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtTelp = new javax.swing.JTextField();
        txtBerat = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        cmbJenis = new javax.swing.JComboBox<>();
        btnCekHarga = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtTanggal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePelanggan = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        BtnTambah = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        UbahBtn = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 251, 255));
        setPreferredSize(new java.awt.Dimension(1024, 695));

        jLabel1.setText("No ID");

        jLabel2.setText("Nama");

        jLabel3.setText("Alamat");

        jLabel4.setText("No. Telepon");

        jLabel5.setText("Jenis Laundry");

        jLabel6.setText("Berat");

        jLabel7.setText("Harga");

        jLabel8.setText("/Kg");

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(227, 237, 246));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtAlamat.setBackground(new java.awt.Color(227, 237, 246));
        txtAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlamatActionPerformed(evt);
            }
        });

        txtNama.setBackground(new java.awt.Color(227, 237, 246));
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        txtTelp.setBackground(new java.awt.Color(227, 237, 246));
        txtTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelpActionPerformed(evt);
            }
        });

        txtBerat.setBackground(new java.awt.Color(227, 237, 246));
        txtBerat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBeratActionPerformed(evt);
            }
        });

        txtHarga.setEditable(false);
        txtHarga.setBackground(new java.awt.Color(227, 237, 246));
        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });

        cmbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----PILIH----", "Cuci Kering", "Cuci Setrika", "Setrika Saja" }));
        cmbJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJenisActionPerformed(evt);
            }
        });

        btnCekHarga.setText("Cek Harga");
        btnCekHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekHargaActionPerformed(evt);
            }
        });

        jLabel9.setText("Tanggal");

        txtTanggal.setEditable(false);
        txtTanggal.setBackground(new java.awt.Color(227, 237, 246));
        txtTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTanggalActionPerformed(evt);
            }
        });

        TablePelanggan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablePelanggan);

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(121, 122, 240));
        jLabel10.setText("DATA PESANAN");

        BtnTambah.setBackground(new java.awt.Color(10, 212, 66));
        BtnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnTambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnTambahMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnTambahMousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("TAMBAH");

        javax.swing.GroupLayout BtnTambahLayout = new javax.swing.GroupLayout(BtnTambah);
        BtnTambah.setLayout(BtnTambahLayout);
        BtnTambahLayout.setHorizontalGroup(
            BtnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnTambahLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel11)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        BtnTambahLayout.setVerticalGroup(
            BtnTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        UbahBtn.setBackground(new java.awt.Color(231, 153, 37));
        UbahBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UbahBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UbahBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UbahBtnMousePressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("UBAH");

        javax.swing.GroupLayout UbahBtnLayout = new javax.swing.GroupLayout(UbahBtn);
        UbahBtn.setLayout(UbahBtnLayout);
        UbahBtnLayout.setHorizontalGroup(
            UbahBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UbahBtnLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(32, 32, 32))
        );
        UbahBtnLayout.setVerticalGroup(
            UbahBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(UbahBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(BtnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(356, 356, 356))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(184, 184, 184)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCekHarga))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(204, 204, 204)))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel10)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(cmbJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtBerat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCekHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UbahBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelpActionPerformed

    private void txtBeratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBeratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBeratActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void cmbJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJenisActionPerformed
        jenis = (String) cmbJenis.getSelectedItem();
        if ("Cuci Setrika".equals(jenis)) {
            setHarga(5000);
        } else if ("Cuci Kering".equals(jenis)) {
            setHarga(4000);
        } else if ("Setrika Saja".equals(jenis)) {
            setHarga(3000);
        }
        txtHarga.setText(null);
    }//GEN-LAST:event_cmbJenisActionPerformed

    private void btnCekHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekHargaActionPerformed
        jenis = (String) cmbJenis.getSelectedItem();
        if ("----PILIH----".equals(jenis)){
            JOptionPane.showMessageDialog(null, "Jenis laundry belum diisi!");
        } else if (txtBerat.getText().equals("")||txtBerat.getText().equals("0.0")){
            JOptionPane.showMessageDialog(null, "Berat belum diisi!");
        } else {
        intBerat = Double.parseDouble(String.valueOf(txtBerat.getText()));        
        total = harga * intBerat;
        txtHarga.setText(String.valueOf(total));
        }
    }//GEN-LAST:event_btnCekHargaActionPerformed

    private void txtTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalActionPerformed

    private void BtnTambahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTambahMousePressed
        controller.insertPelangganView(this);
        txtHarga.setText(null);
        cmbJenis.setSelectedIndex(0);
    }//GEN-LAST:event_BtnTambahMousePressed

    private void UbahBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UbahBtnMousePressed
        controller.updatePelanggan(this);
    }//GEN-LAST:event_UbahBtnMousePressed

    private void BtnTambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTambahMouseEntered
        BtnTambah.setBackground(new Color(0 ,187 ,41));
    }//GEN-LAST:event_BtnTambahMouseEntered

    private void BtnTambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnTambahMouseExited
        BtnTambah.setBackground(new Color(10,212,66));
    }//GEN-LAST:event_BtnTambahMouseExited

    private void UbahBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UbahBtnMouseEntered
        UbahBtn.setBackground(new Color(206 ,128 ,12));
        
    }//GEN-LAST:event_UbahBtnMouseEntered

    private void UbahBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UbahBtnMouseExited
       UbahBtn.setBackground(new Color(231,153,37));
    }//GEN-LAST:event_UbahBtnMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnTambah;
    private javax.swing.JTable TablePelanggan;
    private javax.swing.JPanel UbahBtn;
    private javax.swing.JButton btnCekHarga;
    private javax.swing.JComboBox<String> cmbJenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtBerat;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtTelp;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onChange(PelangganModel model) {
        txtId.setText(model.getNoid()+"");
        txtTanggal.setText(model.getTanggal());
        txtNama.setText(model.getNama());
        txtAlamat.setText(model.getAlamat());
        txtTelp.setText(model.getTelp());
        txtBerat.setText(String.valueOf(model.getBerat()));
    }

    @Override
    public void onInsert(Pelanggan pelanggan) {
        model2.add(pelanggan);
    }

    @Override
    public void onDelete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void onUpdate(Pelanggan pelanggan) {
        int index = TablePelanggan.getSelectedRow();
        model2.set(index, pelanggan);
    }
    
    public void loadDatabase() throws SQLException, pelangganException {
        PelangganDao dao = LavanderiaDatabase.getPelangganDao();
        model2.setList(dao.selectAllPelanggan());
    }
    
    @Override
    public void valueChanged(ListSelectionEvent lse) {
        int a = 0;
        try {
            Pelanggan model = model2.get(TablePelanggan.getSelectedRow()); 
            txtId.setText(model.getNoid()+"");
            txtTanggal.setText(model.getTanggal());
            txtNama.setText(model.getNama());
            txtAlamat.setText(model.getAlamat());
            txtTelp.setText(model.getTelp());            
            
            txtBerat.setText(String.valueOf(model.getBerat()));
            txtHarga.setText(String.valueOf(model.getHarga()));
            
            model.getJenis();
            if ("Cuci Setrika".equals(model.getJenis())) {
                a = 1;
            } else if ("Cuci Kering".equals(model.getJenis())) {
                a = 2;
            } else if ("Setrika Saja".equals(model.getJenis())) {
                a = 3;
            }
            cmbJenis.setSelectedIndex(a);
            
        
    } catch (IndexOutOfBoundsException exception){
        
    }
    }
}
