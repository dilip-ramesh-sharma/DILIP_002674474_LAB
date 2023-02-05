/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Application;
import Model.Medicine;
import Model.Observation;
import java.util.ArrayList;

/**
 *
 * @author 91730
 */
public class AssignJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AssignJPanel
     */
    private Application application;
    public AssignJPanel() {
        initComponents();
    }
    
    public AssignJPanel(Application application) {
        initComponents();
        
        this.application= application;
        
        populateComboBox();
    }

    public void populateComboBox(){
        ArrayList<Medicine> meds = this.application.getCatalog().getMedicineCatalog();
        ArrayList<Observation> obs = this.application.getHistory().getVitalSignHHistory();
        
        for(Observation o: obs){
            obserComboBox.addItem(o);
        }
        
        for(Medicine m: meds){
            medComboBox.addItem(m);
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

        medComboBox = new javax.swing.JComboBox();
        obserComboBox = new javax.swing.JComboBox();
        assignMedBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        medComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medComboBoxActionPerformed(evt);
            }
        });
        add(medComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 160, -1));

        obserComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                obserComboBoxItemStateChanged(evt);
            }
        });
        obserComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obserComboBoxActionPerformed(evt);
            }
        });
        add(obserComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 160, -1));

        assignMedBtn.setText("ASSIGN");
        assignMedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignMedBtnActionPerformed(evt);
            }
        });
        add(assignMedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jLabel1.setText("DisplayLabel");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void assignMedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignMedBtnActionPerformed
        // TODO add your handling code here:
        
        //assign selected med to obs
        
        Observation o = (Observation) obserComboBox.getSelectedItem();
        Medicine m = (Medicine) medComboBox.getSelectedItem();
        o.setMedication(m);
    }//GEN-LAST:event_assignMedBtnActionPerformed

    private void obserComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_obserComboBoxItemStateChanged
        // TODO add your handling code here:
        
        Observation o = (Observation) obserComboBox.getSelectedItem();
        
        if(o.getMedication() != null){
            jLabel1.setText(o.getMedication().getMedicineName());
        }
    }//GEN-LAST:event_obserComboBoxItemStateChanged

    private void medComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medComboBoxActionPerformed

    private void obserComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obserComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_obserComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignMedBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox medComboBox;
    private javax.swing.JComboBox obserComboBox;
    // End of variables declaration//GEN-END:variables
}
