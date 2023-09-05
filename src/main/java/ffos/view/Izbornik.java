/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ffos.view;

import com.github.javafaker.Faker;
import ffos.controller.ObradaMjesto;
import ffos.controller.ObradaOsoba;
import ffos.controller.ObradaSport;
import ffos.model.Mjesto;
import ffos.model.Sport;

/**
 *
 * @author Admin
 */
public class Izbornik extends javax.swing.JFrame {

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
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

        btn = new javax.swing.JButton();
        btnUnosSport = new javax.swing.JButton();
        btnOsoba = new javax.swing.JButton();
        btnCrudMjesto = new javax.swing.JButton();
        btnCrudSport = new javax.swing.JButton();
        btnCrudOsoba = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn.setText("Unos Mjesto");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        btnUnosSport.setText("Unos Sport");
        btnUnosSport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnosSportActionPerformed(evt);
            }
        });

        btnOsoba.setText("Unos Osoba");
        btnOsoba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOsobaActionPerformed(evt);
            }
        });

        btnCrudMjesto.setText("CRUD Mjesto");
        btnCrudMjesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrudMjestoActionPerformed(evt);
            }
        });

        btnCrudSport.setText("CRUD Sport");
        btnCrudSport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrudSportActionPerformed(evt);
            }
        });

        btnCrudOsoba.setText("CRUD Osoba");
        btnCrudOsoba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrudOsobaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn)
                    .addComponent(btnUnosSport)
                    .addComponent(btnOsoba))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrudOsoba)
                    .addComponent(btnCrudSport)
                    .addComponent(btnCrudMjesto))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn)
                    .addComponent(btnCrudMjesto))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUnosSport)
                    .addComponent(btnCrudSport))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOsoba)
                    .addComponent(btnCrudOsoba))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // TODO add your handling code here:
        ObradaMjesto om = new ObradaMjesto();
        Faker faker = new Faker();
        
        for(int i=0; i<21; i++){
            om.setNew();
            om.setPodaci(faker.country().capital());
            try{
                om.create();
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }    
    }//GEN-LAST:event_btnActionPerformed

    private void btnUnosSportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnosSportActionPerformed
        // TODO add your handling code here:
        ObradaSport os = new ObradaSport();
        Faker faker = new Faker();
        
        for(int i=0; i<43; i++){
            os.setNew();
            os.setPodaci(faker.team().name(), faker.team().sport());
            try{
                os.create();
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }                                          
    }//GEN-LAST:event_btnUnosSportActionPerformed

    private void btnCrudSportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrudSportActionPerformed
        // TODO add your handling code here:
        new FormaSport().setVisible(true);
    }//GEN-LAST:event_btnCrudSportActionPerformed

    private void btnOsobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOsobaActionPerformed
        // TODO add your handling code here:
        ObradaOsoba oo = new ObradaOsoba();
        Faker faker = new Faker();
        Mjesto mjesto;
        Sport sport;
        
        for(int i=0; i<33; i++){
            mjesto = new Mjesto();
            mjesto.setNaziv(faker.country().capital());
            sport = new Sport();
            sport.setNaziv(faker.team().sport());
            sport.setVrsta(faker.team().sport());
            oo.setNew();
            oo.setPodaci(faker.name().firstName(), faker.name().lastName(), faker.number().digits(10), mjesto, sport);
            try{
                oo.create();
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }                       
    }//GEN-LAST:event_btnOsobaActionPerformed

    private void btnCrudMjestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrudMjestoActionPerformed
        // TODO add your handling code here:
        new FormaMjesto().setVisible(true);
    }//GEN-LAST:event_btnCrudMjestoActionPerformed

    private void btnCrudOsobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrudOsobaActionPerformed
        // TODO add your handling code here:
        new FormaOsoba().setVisible(true);
    }//GEN-LAST:event_btnCrudOsobaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JButton btnCrudMjesto;
    private javax.swing.JButton btnCrudOsoba;
    private javax.swing.JButton btnCrudSport;
    private javax.swing.JButton btnOsoba;
    private javax.swing.JButton btnUnosSport;
    // End of variables declaration//GEN-END:variables
}