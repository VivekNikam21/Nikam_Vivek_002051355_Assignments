/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AccountManager;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Address;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author nikam
 */
public class ViewPersonJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    private Person person;
    /**
     * Creates new form ViewPersonJPanel
     */
    public ViewPersonJPanel(JPanel container, PersonDirectory directory, Person person) {
        initComponents();
        this.userProcessContainer = container;
        this.person = person;
        
        refreshTextFields();
        setViewMode();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblFName = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        lblLName = new javax.swing.JLabel();
        txtLName = new javax.swing.JTextField();
        lblSsn = new javax.swing.JLabel();
        txtSsn = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtHCity = new javax.swing.JTextField();
        lblHCity = new javax.swing.JLabel();
        lblHStAdd = new javax.swing.JLabel();
        txtHStAdd = new javax.swing.JTextField();
        txtHZip = new javax.swing.JTextField();
        lblHZip = new javax.swing.JLabel();
        lblHUnit = new javax.swing.JLabel();
        txtHUnit = new javax.swing.JTextField();
        txtHState = new javax.swing.JTextField();
        lblHState = new javax.swing.JLabel();
        lblHPhone = new javax.swing.JLabel();
        txtHPhone = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtWCity = new javax.swing.JTextField();
        lblWCity = new javax.swing.JLabel();
        lblWStAdd = new javax.swing.JLabel();
        txtWStAdd = new javax.swing.JTextField();
        txtWZip = new javax.swing.JTextField();
        lblWZip = new javax.swing.JLabel();
        lblWUnit = new javax.swing.JLabel();
        txtWUnit = new javax.swing.JTextField();
        txtWState = new javax.swing.JTextField();
        lblWState = new javax.swing.JLabel();
        lblWPhone = new javax.swing.JLabel();
        txtWPhone = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        lblTitle.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 153));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Person");

        btnBack.setBackground(new java.awt.Color(0, 0, 153));
        btnBack.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblFName.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        lblFName.setText("First Name");

        lblLName.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        lblLName.setText("Last Name");

        lblSsn.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        lblSsn.setText("Social Security");

        lblAge.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        lblAge.setText("Age");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 153), null), javax.swing.BorderFactory.createTitledBorder(null, "Home Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell", 0, 14), new java.awt.Color(0, 0, 102)))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        lblHCity.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        lblHCity.setText("City");

        lblHStAdd.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        lblHStAdd.setText("Street Address");

        lblHZip.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        lblHZip.setText("Zip Code");

        lblHUnit.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        lblHUnit.setText("Unit Number");

        lblHState.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        lblHState.setText("State");

        lblHPhone.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        lblHPhone.setText("Phone Number");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHCity)
                    .addComponent(lblHStAdd)
                    .addComponent(lblHZip)
                    .addComponent(txtHCity, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(txtHStAdd)
                    .addComponent(txtHZip))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHState)
                    .addComponent(lblHUnit)
                    .addComponent(lblHPhone)
                    .addComponent(txtHState)
                    .addComponent(txtHUnit)
                    .addComponent(txtHPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHUnit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblHState)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblHPhone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHStAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHStAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblHCity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblHZip)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 0, 153), null), javax.swing.BorderFactory.createTitledBorder(null, "Work Address\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell", 0, 14), new java.awt.Color(0, 0, 102)))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 0, 153));
        jPanel3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        lblWCity.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        lblWCity.setText("City");

        lblWStAdd.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        lblWStAdd.setText("Street Address");

        lblWZip.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        lblWZip.setText("Zip Code");

        lblWUnit.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        lblWUnit.setText("Unit Number");

        lblWState.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        lblWState.setText("State");

        lblWPhone.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        lblWPhone.setText("Phone Number");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblWCity)
                    .addComponent(lblWStAdd)
                    .addComponent(lblWZip)
                    .addComponent(txtWCity, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(txtWStAdd)
                    .addComponent(txtWZip))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblWState)
                    .addComponent(lblWUnit)
                    .addComponent(lblWPhone)
                    .addComponent(txtWState)
                    .addComponent(txtWUnit)
                    .addComponent(txtWPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblWUnit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtWUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblWState)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtWState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblWPhone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtWPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblWStAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtWStAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblWCity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtWCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblWZip)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtWZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        btnSave.setBackground(new java.awt.Color(0, 51, 153));
        btnSave.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 51, 153));
        btnUpdate.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnBack)
                .addGap(89, 89, 89)
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(113, 113, 113))
            .addGroup(layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge)
                    .addComponent(lblLName)
                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSsn, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(lblFName)
                    .addComponent(txtFName)
                    .addComponent(lblSsn))
                .addGap(110, 110, 110)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 336, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(849, 849, 849))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblLName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSsn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAge)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(104, 104, 104)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(423, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        
        Component[] panelStack = userProcessContainer.getComponents();
        JPanel lastPanel = (JPanel) panelStack[panelStack.length -1];
        ManagePersonJPanel managePersonJPanel = (ManagePersonJPanel) lastPanel;
        managePersonJPanel.populateTable();
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String fname = txtFName.getText();
        String lname = txtLName.getText();
        Long ssn = Long.parseLong(txtSsn.getText());
        int age = Integer.parseInt(txtAge.getText());
        String hstreetadd = txtHStAdd.getText();
        String hunitno = txtHUnit.getText();
        String hcity = txtHCity.getText();
        String hstate = txtHState.getText();
        Long hzip = Long.parseLong(txtHZip.getText());
        Double hphone = Double.parseDouble(txtHPhone.getText());
        String wstreetadd = txtWStAdd.getText();
        String wunitno = txtWUnit.getText();
        String wcity = txtWCity.getText();
        String wstate = txtWState.getText();
        Long wzip = Long.parseLong(txtWZip.getText());
        Double wphone = Double.parseDouble(txtWPhone.getText());
        
        if(fname.isBlank() || lname.isBlank() || hstreetadd.isBlank() || hunitno.isBlank() || hcity.isBlank() || hstate.isBlank() || wstreetadd.isBlank() || wunitno.isBlank() || wcity.isBlank() || wstate.isBlank()){
        JOptionPane.showMessageDialog(this, "All fields are mandatory", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        
        person.setFname(fname);
        person.setLname(lname);
        person.setSsn(ssn);
        person.setAge(age);
        person.setAddress(hstreetadd, hunitno, hcity, hstate, hzip, hphone, wstreetadd, wunitno, wcity, wstate, wzip, wphone);
        
        JOptionPane.showMessageDialog(null, "Profile Successfully Updated", "Information", JOptionPane.INFORMATION_MESSAGE);
        setViewMode();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        setEditMode();
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblHCity;
    private javax.swing.JLabel lblHPhone;
    private javax.swing.JLabel lblHStAdd;
    private javax.swing.JLabel lblHState;
    private javax.swing.JLabel lblHUnit;
    private javax.swing.JLabel lblHZip;
    private javax.swing.JLabel lblLName;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWCity;
    private javax.swing.JLabel lblWPhone;
    private javax.swing.JLabel lblWStAdd;
    private javax.swing.JLabel lblWState;
    private javax.swing.JLabel lblWUnit;
    private javax.swing.JLabel lblWZip;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtHCity;
    private javax.swing.JTextField txtHPhone;
    private javax.swing.JTextField txtHStAdd;
    private javax.swing.JTextField txtHState;
    private javax.swing.JTextField txtHUnit;
    private javax.swing.JTextField txtHZip;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtSsn;
    private javax.swing.JTextField txtWCity;
    private javax.swing.JTextField txtWPhone;
    private javax.swing.JTextField txtWStAdd;
    private javax.swing.JTextField txtWState;
    private javax.swing.JTextField txtWUnit;
    private javax.swing.JTextField txtWZip;
    // End of variables declaration//GEN-END:variables

  private void refreshTextFields(){
        txtFName.setText(person.getFname());
        txtLName.setText(person.getLname());
        txtSsn.setText(String.valueOf(person.getSsn()));
        txtAge.setText(String.valueOf(person.getAge()));
        
        Address add = person.getAddress();
        txtHStAdd.setText(add.getHstreetadd());
        txtHUnit.setText(add.getHunitno());
        txtHCity.setText(add.getHcity());
        txtHState.setText(add.getHstate());
        txtHZip.setText(String.valueOf(add.getHzip()));
        txtHPhone.setText(String.valueOf(add.getHphone()));
        
        txtWStAdd.setText(add.getWstreetadd());
        txtWUnit.setText(add.getWunitno());
        txtWCity.setText(add.getWcity());
        txtWState.setText(add.getWstate());
        txtWZip.setText(String.valueOf(add.getWzip()));
        txtWPhone.setText(String.valueOf(add.getWphone()));
    }
    
    private void setViewMode(){
        
        txtFName.setEnabled(false);
        txtLName.setEnabled(false);
        txtSsn.setEnabled(false);
        txtAge.setEnabled(false);
        
        txtHStAdd.setEnabled(false);
        txtHUnit.setEnabled(false);
        txtHCity.setEnabled(false);
        txtHState.setEnabled(false);
        txtHZip.setEnabled(false);
        txtHPhone.setEnabled(false);
        
        txtWStAdd.setEnabled(false);
        txtWUnit.setEnabled(false);
        txtWCity.setEnabled(false);
        txtWState.setEnabled(false);
        txtWZip.setEnabled(false);
        txtWPhone.setEnabled(false);
        
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);

    }
    
    private void setEditMode(){
        txtFName.setEnabled(true);
        txtLName.setEnabled(true);
        txtSsn.setEnabled(true);
        txtAge.setEnabled(true);
        
        txtHStAdd.setEnabled(true);
        txtHUnit.setEnabled(true);
        txtHCity.setEnabled(true);
        txtHState.setEnabled(true);
        txtHZip.setEnabled(true);
        txtHPhone.setEnabled(true);
        
        txtWStAdd.setEnabled(true);
        txtWUnit.setEnabled(true);
        txtWCity.setEnabled(true);
        txtWState.setEnabled(true);
        txtWZip.setEnabled(true);
        txtWPhone.setEnabled(true);
        
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }

}
