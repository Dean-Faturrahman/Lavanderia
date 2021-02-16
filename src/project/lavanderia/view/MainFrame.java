/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.lavanderia.view;

import java.awt.Color;
import project.lavanderia.error.pelangganException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ryzen
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuPanel = new javax.swing.JPanel();
        AmbilBtn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        TerambilBtn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        TambahBtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        LogoUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        HomeBtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        BGPanel = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        homeView1 = new project.lavanderia.view.HomeView();
        TambahPesananPanel = new javax.swing.JPanel();
        tambahAntrianView2 = new project.lavanderia.view.TambahAntrianView();
        AmbilPesananPanel = new javax.swing.JPanel();
        ambilPesananView1 = new project.lavanderia.view.AmbilPesananView();
        PesananTerambilPanel = new javax.swing.JPanel();
        dataTerambilView1 = new project.lavanderia.view.DataTerambilView();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lavanderia");
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        MenuPanel.setBackground(new java.awt.Color(121, 122, 240));
        MenuPanel.setName("Lavanderia"); // NOI18N
        MenuPanel.setPreferredSize(new java.awt.Dimension(256, 720));

        AmbilBtn.setBackground(new java.awt.Color(255, 206, 217));
        AmbilBtn.setPreferredSize(new java.awt.Dimension(169, 41));
        AmbilBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AmbilBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AmbilBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AmbilBtnMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Ambil Pesanan");

        javax.swing.GroupLayout AmbilBtnLayout = new javax.swing.GroupLayout(AmbilBtn);
        AmbilBtn.setLayout(AmbilBtnLayout);
        AmbilBtnLayout.setHorizontalGroup(
            AmbilBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AmbilBtnLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(37, 37, 37))
        );
        AmbilBtnLayout.setVerticalGroup(
            AmbilBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AmbilBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        TerambilBtn.setBackground(new java.awt.Color(255, 206, 217));
        TerambilBtn.setPreferredSize(new java.awt.Dimension(169, 41));
        TerambilBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TerambilBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TerambilBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TerambilBtnMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Data Terambil");

        javax.swing.GroupLayout TerambilBtnLayout = new javax.swing.GroupLayout(TerambilBtn);
        TerambilBtn.setLayout(TerambilBtnLayout);
        TerambilBtnLayout.setHorizontalGroup(
            TerambilBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TerambilBtnLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel6)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        TerambilBtnLayout.setVerticalGroup(
            TerambilBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TerambilBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        TambahBtn.setBackground(new java.awt.Color(255, 206, 217));
        TambahBtn.setPreferredSize(new java.awt.Dimension(169, 41));
        TambahBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TambahBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TambahBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TambahBtnMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Data Pesanan");

        javax.swing.GroupLayout TambahBtnLayout = new javax.swing.GroupLayout(TambahBtn);
        TambahBtn.setLayout(TambahBtnLayout);
        TambahBtnLayout.setHorizontalGroup(
            TambahBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TambahBtnLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(37, 37, 37))
        );
        TambahBtnLayout.setVerticalGroup(
            TambahBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TambahBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/lavanderia/view/logouser.png"))); // NOI18N

        BackBtn.setBackground(new java.awt.Color(255, 51, 51));
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackBtnMousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("←");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        javax.swing.GroupLayout BackBtnLayout = new javax.swing.GroupLayout(BackBtn);
        BackBtn.setLayout(BackBtnLayout);
        BackBtnLayout.setHorizontalGroup(
            BackBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackBtnLayout.setVerticalGroup(
            BackBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        HomeBtn.setBackground(new java.awt.Color(255, 206, 217));
        HomeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HomeBtnMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 53, 228));
        jLabel4.setText("Home");

        javax.swing.GroupLayout HomeBtnLayout = new javax.swing.GroupLayout(HomeBtn);
        HomeBtn.setLayout(HomeBtnLayout);
        HomeBtnLayout.setHorizontalGroup(
            HomeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomeBtnLayout.setVerticalGroup(
            HomeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(LogoUser)))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanelLayout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TambahBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AmbilBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TerambilBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(LogoUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(107, 107, 107)
                .addComponent(TambahBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(AmbilBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(TerambilBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HomeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BackBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        BGPanel.setBackground(new java.awt.Color(250, 251, 255));
        BGPanel.setLayout(new java.awt.CardLayout());

        HomePanel.setBackground(new java.awt.Color(250, 251, 255));

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeView1, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeView1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        BGPanel.add(HomePanel, "card2");

        TambahPesananPanel.setBackground(new java.awt.Color(250, 251, 255));

        javax.swing.GroupLayout TambahPesananPanelLayout = new javax.swing.GroupLayout(TambahPesananPanel);
        TambahPesananPanel.setLayout(TambahPesananPanelLayout);
        TambahPesananPanelLayout.setHorizontalGroup(
            TambahPesananPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TambahPesananPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tambahAntrianView2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TambahPesananPanelLayout.setVerticalGroup(
            TambahPesananPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TambahPesananPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tambahAntrianView2, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        BGPanel.add(TambahPesananPanel, "card3");

        AmbilPesananPanel.setBackground(new java.awt.Color(181, 174, 236));

        javax.swing.GroupLayout AmbilPesananPanelLayout = new javax.swing.GroupLayout(AmbilPesananPanel);
        AmbilPesananPanel.setLayout(AmbilPesananPanelLayout);
        AmbilPesananPanelLayout.setHorizontalGroup(
            AmbilPesananPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AmbilPesananPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(ambilPesananView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        AmbilPesananPanelLayout.setVerticalGroup(
            AmbilPesananPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AmbilPesananPanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(ambilPesananView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BGPanel.add(AmbilPesananPanel, "card5");

        PesananTerambilPanel.setBackground(new java.awt.Color(250, 251, 255));

        javax.swing.GroupLayout PesananTerambilPanelLayout = new javax.swing.GroupLayout(PesananTerambilPanel);
        PesananTerambilPanel.setLayout(PesananTerambilPanelLayout);
        PesananTerambilPanelLayout.setHorizontalGroup(
            PesananTerambilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PesananTerambilPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(dataTerambilView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        PesananTerambilPanelLayout.setVerticalGroup(
            PesananTerambilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PesananTerambilPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(dataTerambilView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        BGPanel.add(PesananTerambilPanel, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BGPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TambahBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TambahBtnMouseClicked
        BGPanel.removeAll();
        BGPanel.repaint();
        BGPanel.revalidate();
        
        BGPanel.add(TambahPesananPanel);
        BGPanel.repaint();
        BGPanel.revalidate();
    }//GEN-LAST:event_TambahBtnMouseClicked

    private void AmbilBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmbilBtnMouseClicked
        BGPanel.removeAll();
        BGPanel.repaint();
        BGPanel.revalidate();
        
        BGPanel.add(AmbilPesananPanel);
        BGPanel.repaint();
        BGPanel.revalidate();
    }//GEN-LAST:event_AmbilBtnMouseClicked

    private void TerambilBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TerambilBtnMouseClicked
        BGPanel.removeAll();
        BGPanel.repaint();
        BGPanel.revalidate();
        
        BGPanel.add(PesananTerambilPanel);
        BGPanel.repaint();
        BGPanel.revalidate();
    }//GEN-LAST:event_TerambilBtnMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if (JOptionPane.showConfirmDialog(this, "Anda Yakin")==JOptionPane.OK_OPTION) {
        new LogInFrame().show();
        this.dispose();
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void BackBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMousePressed
        
        if (JOptionPane.showConfirmDialog(this, "Anda Yakin")==JOptionPane.OK_OPTION) {
        new LogInFrame().show();
        this.dispose();
        }
    }//GEN-LAST:event_BackBtnMousePressed

    private void HomeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMousePressed
        
        BGPanel.removeAll();
        BGPanel.repaint();
        BGPanel.revalidate();
        
        BGPanel.add(HomePanel);
        BGPanel.repaint();
        BGPanel.revalidate();
    }//GEN-LAST:event_HomeBtnMousePressed

    private void TambahBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TambahBtnMouseEntered
        TambahBtn.setBackground(new Color(230 ,181 ,192));
    }//GEN-LAST:event_TambahBtnMouseEntered

    private void TambahBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TambahBtnMouseExited
        TambahBtn.setBackground(new Color(255,206,217));
    }//GEN-LAST:event_TambahBtnMouseExited

    private void AmbilBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmbilBtnMouseEntered
        AmbilBtn.setBackground(new Color(230 ,181 ,192));
    }//GEN-LAST:event_AmbilBtnMouseEntered

    private void AmbilBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmbilBtnMouseExited
        AmbilBtn.setBackground(new Color(255,206,217));
    }//GEN-LAST:event_AmbilBtnMouseExited

    private void TerambilBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TerambilBtnMouseEntered
        TerambilBtn.setBackground(new Color(230 ,181 ,192));
    }//GEN-LAST:event_TerambilBtnMouseEntered

    private void TerambilBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TerambilBtnMouseExited
        TerambilBtn.setBackground(new Color(255,206,217));
    }//GEN-LAST:event_TerambilBtnMouseExited

    private void BackBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseEntered
        BackBtn.setBackground(new Color(230 ,26, 26));
    }//GEN-LAST:event_BackBtnMouseEntered

    private void BackBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseExited
        BackBtn.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_BackBtnMouseExited

    private void HomeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseEntered
       HomeBtn.setBackground(new Color(230 ,181 ,192));
    }//GEN-LAST:event_HomeBtnMouseEntered

    private void HomeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseExited
        HomeBtn.setBackground(new Color(255,206,217));
    }//GEN-LAST:event_HomeBtnMouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        BackBtn.setBackground(new Color(230 ,26, 26));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
         BackBtn.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_jLabel7MouseExited

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AmbilBtn;
    private javax.swing.JPanel AmbilPesananPanel;
    private javax.swing.JPanel BGPanel;
    private javax.swing.JPanel BackBtn;
    private javax.swing.JPanel HomeBtn;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JLabel LogoUser;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPanel PesananTerambilPanel;
    private javax.swing.JPanel TambahBtn;
    private javax.swing.JPanel TambahPesananPanel;
    private javax.swing.JPanel TerambilBtn;
    private project.lavanderia.view.AmbilPesananView ambilPesananView1;
    private project.lavanderia.view.DataTerambilView dataTerambilView1;
    private project.lavanderia.view.HomeView homeView1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private project.lavanderia.view.TambahAntrianView tambahAntrianView2;
    // End of variables declaration//GEN-END:variables
}
