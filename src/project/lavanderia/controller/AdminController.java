/*
 * Adam
 * ada
 * ad
 */
package project.lavanderia.controller;

import javax.swing.JOptionPane;
import project.lavanderia.entity.Admin;
import project.lavanderia.model.AdminModel;
import project.lavanderia.view.RegisterFrame;

/**
 *
 * @author ryzen
 */
public class AdminController {
    private AdminModel model;

    public void setModel(AdminModel model) {
        this.model = model;
    }
     public void insertAdmin(RegisterFrame view){
        String username = view.getUsernameReg().getText();
        String password = view.getPasswordReg().getText();
        
        if (username.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Username Masih Kosong");
        } else if (username.length() > 255) {
            JOptionPane.showMessageDialog(view, "nama depan tidak boleh lebih dari 255");
        } else if(username.equals("username")){
            JOptionPane.showMessageDialog(view,"Username tidak boleh 'Username'");
        } else if(password.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Password tidak boleh kosong");
        } else if(password.length() > 255){
            JOptionPane.showMessageDialog(view, "Password tidak boleh lebih dari 255");
        } else if(password.equals("password")){
            JOptionPane.showMessageDialog(view, "Password tidak boleh 'password' ");
        } else
            model.setUsername(username);
            model.setPassword(password);
            
            try{
                model.insertAdmin();
                JOptionPane.showMessageDialog(view, "Admin berhasil ditambahkan");
                model.resetAdmin();
            } catch (Throwable e){
               JOptionPane.showMessageDialog(view, new Object[]{"Terjadi error di database dengan pesan ", e.getMessage()});  
            }
     }
     
     
}
