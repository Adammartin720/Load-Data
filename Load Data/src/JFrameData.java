import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.FileReader;    
import java.io.BufferedReader;   
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 182500
 */
public class JFrameData extends javax.swing.JFrame {

    /**
     * Creates new form JFrameData
     */
    public JFrameData() {
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

        btnViewCustomer = new javax.swing.JButton();
        btnViewProduct = new javax.swing.JButton();
        btnViewSalesRep = new javax.swing.JButton();
        btnViewOrder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnViewCustomer.setText("Customer");
        btnViewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustomerActionPerformed(evt);
            }
        });

        btnViewProduct.setText("Product");
        btnViewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProductActionPerformed(evt);
            }
        });

        btnViewSalesRep.setText("Sales Rep");
        btnViewSalesRep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSalesRepActionPerformed(evt);
            }
        });

        btnViewOrder.setText("Order");
        btnViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrderActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("To load the data please select the");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("corresponding buttons below ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewSalesRep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(115, 115, 115)
                        .addComponent(btnViewCustomer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewProduct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewSalesRep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewOrder))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    
    
    private void btnViewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustomerActionPerformed
// DISPLAYING THE RECORDS
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        model.setColumnCount(0);
        model.setRowCount(0);
        
        model.addColumn("Customer ID");
        model.addColumn("Forename");
        model.addColumn("Surname");
        model.addColumn("Address");
        model.addColumn("City");
        model.addColumn("ZIP");
        
        model.setRowCount(201);
        
        //reading the text file into the program
        java.io.File customerfile = new java.io.File("customer.dat");
        
        try {
            Scanner input = new Scanner(customerfile);
            while (input.hasNext()){
                for (int row = 0; row < jTable1.getRowCount(); row++)   {
                    for (int column = 0; column < jTable1.getColumnCount(); column++){
                        String num = input.nextLine();
                        jTable1.setValueAt(num, row, column);  
       }
       }
            }
        }
        catch (FileNotFoundException e) {
            System.err.format("File does not exist");
        }
    }//GEN-LAST:event_btnViewCustomerActionPerformed

    private void btnViewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProductActionPerformed
        // TODO add your handling code here:
        
        // DISPLAYING THE RECORDS
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        model.setColumnCount(0);
        model.setRowCount(0);
        
        model.addColumn("Product ID");
        model.addColumn("Description");
        model.addColumn("Price");
        
        model.setRowCount(67);
        
        //reading the text file into the program
        java.io.File productfile = new java.io.File("product.dat");
        
        try {
            Scanner input = new Scanner(productfile);
            while (input.hasNext()){
                for (int row = 0; row < jTable1.getRowCount(); row++)   {
                    for (int column = 0; column < jTable1.getColumnCount(); column++){
                        String num = input.nextLine();
                        jTable1.setValueAt(num, row, column);  
       }
       }
            }
        }
        catch (FileNotFoundException e) {
            System.err.format("File does not exist");
        }
    }//GEN-LAST:event_btnViewProductActionPerformed

    private void btnViewSalesRepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSalesRepActionPerformed
        // TODO add your handling code here:
        
        // DISPLAYING THE RECORDS
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        model.setColumnCount(0);
        model.setRowCount(0);
        
        model.addColumn("Sales Rep ID");
        model.addColumn("Forename");
        model.addColumn("Surname");
        model.addColumn("Address");
        model.addColumn("City");
        model.addColumn("ZIP");
        model.addColumn("Title");
        model.addColumn("Joined");
        
        model.setRowCount(10);
        
        //reading the text file into the program
        java.io.File salesrepfile = new java.io.File("salesrep.dat");
        
        try {
            Scanner input = new Scanner(salesrepfile);
            while (input.hasNext()){
                for (int row = 0; row < jTable1.getRowCount(); row++)   {
                    for (int column = 0; column < jTable1.getColumnCount(); column++){
                        String num = input.nextLine();
                        jTable1.setValueAt(num, row, column);  
       }
       }
            }
        }
        catch (FileNotFoundException e) {
            System.err.format("File does not exist");
        }
    }//GEN-LAST:event_btnViewSalesRepActionPerformed

    private void btnViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrderActionPerformed
        // TODO add your handling code here:
                // DISPLAYING THE RECORDS
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        model.setColumnCount(0);
        model.setRowCount(0);
        
        model.addColumn("Order ID");
        model.addColumn("Order Date");
        model.addColumn("Customer ID");
        model.addColumn("Product ID");
        model.addColumn("Sales Rep ID");

        
        model.setRowCount(958);
        
        //reading the text file into the program
        java.io.File orderfile = new java.io.File("order.dat");
        
        try {
            Scanner input = new Scanner(orderfile);
            while (input.hasNext()){
                for (int row = 0; row < jTable1.getRowCount(); row++)   {
                    for (int column = 0; column < jTable1.getColumnCount(); column++){
                        String num = input.nextLine();
                        jTable1.setValueAt(num, row, column);  
       }
       }
            }
        }
        catch (FileNotFoundException e) {
            System.err.format("File does not exist");
        }
    }//GEN-LAST:event_btnViewOrderActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        
        
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewCustomer;
    private javax.swing.JButton btnViewOrder;
    private javax.swing.JButton btnViewProduct;
    private javax.swing.JButton btnViewSalesRep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
