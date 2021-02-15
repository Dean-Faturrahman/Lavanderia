/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.lavanderia.view;


import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import project.lavanderia.database.LavanderiaDatabase;
import project.lavanderia.entity.Admin;
/**
 *
 * @author ryzen
 */
public class LogInFrame extends javax.swing.JFrame {

    public Connection connection;
    private String username;
    Admin admin=new Admin();
    /**
     * Creates new form LogInFrame
     */
    public LogInFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        USERNAME1 = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        RegisterBtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PASSWORD1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOG IN");
        setBackground(new java.awt.Color(121, 122, 240));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 720));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setText("Sign In.");

        USERNAME1.setBackground(new java.awt.Color(222, 222, 222));
        USERNAME1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        USERNAME1.setText("username");
        USERNAME1.setPreferredSize(new java.awt.Dimension(448, 62));
        USERNAME1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USERNAME1ActionPerformed(evt);
            }
        });

        LoginBtn.setBackground(new java.awt.Color(121, 122, 240));
        LoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoginBtnMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LOG IN");

        javax.swing.GroupLayout LoginBtnLayout = new javax.swing.GroupLayout(LoginBtn);
        LoginBtn.setLayout(LoginBtnLayout);
        LoginBtnLayout.setHorizontalGroup(
            LoginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginBtnLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(54, 54, 54))
        );
        LoginBtnLayout.setVerticalGroup(
            LoginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        RegisterBtn.setBackground(new java.awt.Color(121, 122, 240));
        RegisterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegisterBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegisterBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RegisterBtnMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("REGISTER");

        javax.swing.GroupLayout RegisterBtnLayout = new javax.swing.GroupLayout(RegisterBtn);
        RegisterBtn.setLayout(RegisterBtnLayout);
        RegisterBtnLayout.setHorizontalGroup(
            RegisterBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterBtnLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        RegisterBtnLayout.setVerticalGroup(
            RegisterBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PASSWORD1.setBackground(new java.awt.Color(222, 222, 222));
        PASSWORD1.setText("password");
        PASSWORD1.setPreferredSize(new java.awt.Dimension(448, 62));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ACER\\Downloads\\washing-machine100.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PASSWORD1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(USERNAME1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(RegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel1)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(64, 64, 64)
                .addComponent(USERNAME1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(PASSWORD1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(239, 239, 239))
        );

        jPanel2.setBackground(new java.awt.Color(121, 122, 240));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void USERNAME1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USERNAME1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USERNAME1ActionPerformed

    private void LoginBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnMousePressed
        try {
            // TODO add your handling code here:
            Statement statement = (Statement) LavanderiaDatabase.getConnection().createStatement();
            ResultSet result=statement.executeQuery("SELECT*FROM ADMIN WHERE "+"username='"+USERNAME1.getText()+"'");
            if (result.next()) {
                if (PASSWORD1.getText().equals(result.getString("password"))) {
                    new MainFrame().show();
                    this.dispose();
                    
                }else {
                    JOptionPane.showMessageDialog(rootPane,"Password Salah");
                    PASSWORD1.setText("");
                    USERNAME1.requestFocus();
                } 
                }else{
                        JOptionPane.showMessageDialog(rootPane, "user tidak ditemukan");
                        USERNAME1.setText("");
                        PASSWORD1.setText("");
                        USERNAME1.requestFocus();
                        }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "gagal");
        }
    }//GEN-LAST:event_LoginBtnMousePressed

    private void RegisterBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterBtnMousePressed
        new RegisterFrame().show();
        this.dispose();
    }//GEN-LAST:event_RegisterBtnMousePressed

    private void LoginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnMouseEntered
        LoginBtn.setBackground(new Color(108, 109, 227));
    }//GEN-LAST:event_LoginBtnMouseEntered

    private void LoginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnMouseExited
        LoginBtn.setBackground(new Color(121, 122, 240));
    }//GEN-LAST:event_LoginBtnMouseExited

    private void RegisterBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterBtnMouseEntered
        RegisterBtn.setBackground(new Color(108, 109, 227));
    }//GEN-LAST:event_RegisterBtnMouseEntered

    private void RegisterBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterBtnMouseExited
        RegisterBtn.setBackground(new Color(121, 122, 240));
    }//GEN-LAST:event_RegisterBtnMouseExited

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
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginBtn;
    private javax.swing.JPasswordField PASSWORD1;
    private javax.swing.JPanel RegisterBtn;
    private javax.swing.JTextField USERNAME1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
