/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myframebooksotre;

import javax.swing.JOptionPane;

/**
 *
 * @author mustaf
 */
public class Customer extends javax.swing.JInternalFrame {

    
    codes1 co= new codes1();
    String id="";
public void display(){
    co.viewTable("select * from customer", jTable1);
    
    
}
    
    public Customer() {
        initComponents();
        display();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        rSLabelTextIcon1 = new RSMaterialComponent.RSLabelTextIcon();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt5 = new RSMaterialComponent.RSTextFieldMaterial();
        txt1 = new RSMaterialComponent.RSTextFieldMaterial();
        txt2 = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel4 = new javax.swing.JLabel();
        txt3 = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel5 = new javax.swing.JLabel();
        txt4 = new RSMaterialComponent.RSTextFieldMaterial();
        rSButtonMaterialIconOne1 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne2 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne3 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne4 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne5 = new RSMaterialComponent.RSButtonMaterialIconOne();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelTextIcon1.setBackground(new java.awt.Color(153, 153, 153));
        rSLabelTextIcon1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 153, 153)));
        rSLabelTextIcon1.setForeground(new java.awt.Color(153, 153, 153));
        rSLabelTextIcon1.setText("Customer Registration");
        rSLabelTextIcon1.setFont(new java.awt.Font("Roboto Bold", 1, 36)); // NOI18N
        jPanel2.add(rSLabelTextIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 520, 90));

        jLabel1.setText("Customer Email");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jLabel2.setText("Customer Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel3.setText("Customer ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txt5.setForeground(new java.awt.Color(153, 153, 153));
        txt5.setToolTipText("");
        txt5.setPlaceholder("Enter your Email");
        txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt5ActionPerformed(evt);
            }
        });
        jPanel2.add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        txt1.setForeground(new java.awt.Color(153, 153, 153));
        txt1.setToolTipText("");
        txt1.setPlaceholder("Enter your ID");
        jPanel2.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        txt2.setForeground(new java.awt.Color(153, 153, 153));
        txt2.setToolTipText("");
        txt2.setPlaceholder("Enter your Name");
        jPanel2.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jLabel4.setText("Customer Address");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txt3.setForeground(new java.awt.Color(153, 153, 153));
        txt3.setToolTipText("");
        txt3.setPlaceholder("Enter your Address");
        jPanel2.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        jLabel5.setText("Customer phone");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        txt4.setForeground(new java.awt.Color(153, 153, 153));
        txt4.setToolTipText("");
        txt4.setPlaceholder("Enter your Phone");
        txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4ActionPerformed(evt);
            }
        });
        jPanel2.add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        rSButtonMaterialIconOne1.setBackground(new java.awt.Color(153, 153, 153));
        rSButtonMaterialIconOne1.setForeground(new java.awt.Color(0, 153, 153));
        rSButtonMaterialIconOne1.setText("Delete");
        rSButtonMaterialIconOne1.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        rSButtonMaterialIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        rSButtonMaterialIconOne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne1ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 110, -1));

        rSButtonMaterialIconOne2.setBackground(new java.awt.Color(153, 153, 153));
        rSButtonMaterialIconOne2.setForeground(new java.awt.Color(0, 153, 153));
        rSButtonMaterialIconOne2.setText("Insert");
        rSButtonMaterialIconOne2.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        rSButtonMaterialIconOne2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD);
        rSButtonMaterialIconOne2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne2ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 110, -1));

        rSButtonMaterialIconOne3.setBackground(new java.awt.Color(153, 153, 153));
        rSButtonMaterialIconOne3.setForeground(new java.awt.Color(0, 153, 153));
        rSButtonMaterialIconOne3.setText("Update");
        rSButtonMaterialIconOne3.setActionCommand("update");
        rSButtonMaterialIconOne3.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        rSButtonMaterialIconOne3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        rSButtonMaterialIconOne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne3ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 110, -1));

        rSButtonMaterialIconOne4.setBackground(new java.awt.Color(153, 153, 153));
        rSButtonMaterialIconOne4.setForeground(new java.awt.Color(0, 153, 153));
        rSButtonMaterialIconOne4.setText("clear");
        rSButtonMaterialIconOne4.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        rSButtonMaterialIconOne4.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLEAR);
        rSButtonMaterialIconOne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne4ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 110, -1));

        rSButtonMaterialIconOne5.setBackground(new java.awt.Color(153, 153, 153));
        rSButtonMaterialIconOne5.setForeground(new java.awt.Color(0, 153, 153));
        rSButtonMaterialIconOne5.setText("Search");
        rSButtonMaterialIconOne5.setFont(new java.awt.Font("Roboto Bold", 1, 18)); // NOI18N
        rSButtonMaterialIconOne5.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        rSButtonMaterialIconOne5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconOne5ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonMaterialIconOne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, 110, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 800));

        jTable1.setBackground(new java.awt.Color(0, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "Customer Name", "Customer Address", "Customer Phone", "Customer  Email"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 1, 590, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt5ActionPerformed

    private void txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4ActionPerformed

    private void rSButtonMaterialIconOne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne3ActionPerformed
        // TODO add your handling code here:
           String sql= "update customer set name='"+txt2.getText()+"',address='"+txt3.getText()+"',phone='"+txt4.getText()+"',email='"+txt5.getText()+"' where id='"+txt1.getText()+"'   ";
        co.setSQL(sql);
        display();
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
    }//GEN-LAST:event_rSButtonMaterialIconOne3ActionPerformed

    private void rSButtonMaterialIconOne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne4ActionPerformed
        // TODO add your handling code here:
         txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
    }//GEN-LAST:event_rSButtonMaterialIconOne4ActionPerformed

    private void rSButtonMaterialIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne2ActionPerformed
        // TODO add your handling code here:
         String sql= "insert into customer values('"+txt1.getText()+"','"+txt2.getText()+"','"+txt3.getText()+"','"+txt4.getText()+"','"+txt5.getText()+"')";
        co.setSQL(sql);
        display();
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
    }//GEN-LAST:event_rSButtonMaterialIconOne2ActionPerformed

    private void rSButtonMaterialIconOne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne5ActionPerformed
        // TODO add your handling code here:
           String sql="select * from customer where id='"+txt1.getText()+"' or name='"+txt2.getText()+"' or address='"+txt3.getText()+"'or phone='"+txt4.getText()+"'or email='"+txt5.getText()+"' ";
        co.search(sql);
        try{
            if(co.rs.next()){
                id=co.rs.getString("id");
                txt1.setText(co.rs.getString("id"));
                txt2.setText(co.rs.getString("name"));
                txt3.setText(co.rs.getString("address"));
                 txt4.setText(co.rs.getString("phone"));
                txt5.setText(co.rs.getString("email"));
                
            }
            else
                JOptionPane.showMessageDialog(null, "record not found");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
            
        }
    }//GEN-LAST:event_rSButtonMaterialIconOne5ActionPerformed

    private void rSButtonMaterialIconOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne1ActionPerformed
        // TODO add your handling code here:
        String sql="delete from customer where id='"+txt1.getText()+"' ";
          co.setSQL(sql);
        display();
         txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        txt5.setText("");
    }//GEN-LAST:event_rSButtonMaterialIconOne1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne1;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne2;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne3;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne4;
    private RSMaterialComponent.RSButtonMaterialIconOne rSButtonMaterialIconOne5;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon1;
    private RSMaterialComponent.RSTextFieldMaterial txt1;
    private RSMaterialComponent.RSTextFieldMaterial txt2;
    private RSMaterialComponent.RSTextFieldMaterial txt3;
    private RSMaterialComponent.RSTextFieldMaterial txt4;
    private RSMaterialComponent.RSTextFieldMaterial txt5;
    // End of variables declaration//GEN-END:variables
}