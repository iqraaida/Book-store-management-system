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
public class Order extends javax.swing.JInternalFrame {

   codes1 co= new codes1();
   String id="";
public void display(){
    co.viewTable("select * from orderr", jTable1);
    
    
}
    public Order() {
        
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rSLabelTextIcon1 = new RSMaterialComponent.RSLabelTextIcon();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt1 = new RSMaterialComponent.RSTextFieldMaterial();
        txt2 = new RSMaterialComponent.RSTextFieldMaterial();
        txt3 = new RSMaterialComponent.RSTextFieldMaterial();
        rSButtonMaterialIconOne2 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne3 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne1 = new RSMaterialComponent.RSButtonMaterialIconOne();
        rSButtonMaterialIconOne4 = new RSMaterialComponent.RSButtonMaterialIconOne();
        jLabel6 = new javax.swing.JLabel();
        txt4 = new RSMaterialComponent.RSTextFieldMaterial();
        rSButtonMaterialIconOne5 = new RSMaterialComponent.RSButtonMaterialIconOne();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelTextIcon1.setBackground(new java.awt.Color(153, 153, 153));
        rSLabelTextIcon1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 153, 153)));
        rSLabelTextIcon1.setForeground(new java.awt.Color(153, 153, 153));
        rSLabelTextIcon1.setText("Order Books");
        rSLabelTextIcon1.setFont(new java.awt.Font("Roboto Bold", 1, 36)); // NOI18N
        rSLabelTextIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.BOOK);
        rSLabelTextIcon1.setName(""); // NOI18N
        jPanel2.add(rSLabelTextIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 520, 90));

        jLabel3.setText("Order ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel4.setText("Order Items");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel5.setText("Employee ID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        txt1.setForeground(new java.awt.Color(153, 153, 153));
        txt1.setToolTipText("");
        txt1.setPlaceholder("Enter Order ID");
        jPanel2.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        txt2.setForeground(new java.awt.Color(153, 153, 153));
        txt2.setToolTipText("");
        txt2.setPlaceholder("Enter Order Itmes");
        jPanel2.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        txt3.setForeground(new java.awt.Color(153, 153, 153));
        txt3.setToolTipText("");
        txt3.setPlaceholder("Enter Customer ID");
        jPanel2.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

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
        jPanel2.add(rSButtonMaterialIconOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 110, -1));

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
        jPanel2.add(rSButtonMaterialIconOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 110, -1));

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
        jPanel2.add(rSButtonMaterialIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 110, -1));

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

        jLabel6.setText("Customer ID");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        txt4.setForeground(new java.awt.Color(153, 153, 153));
        txt4.setToolTipText("");
        txt4.setPlaceholder("Enter Employee ID");
        jPanel2.add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, -1, -1));

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
        jPanel2.add(rSButtonMaterialIconOne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 640, 110, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 640, 770));

        jTable1.setBackground(new java.awt.Color(0, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Order ID", "Order Items", "Customer ID"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 550, 770));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMaterialIconOne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne3ActionPerformed
        // TODO add your handling code here:
           String sql= "update orderr set orderitems='"+txt2.getText()+"',customerid='"+txt3.getText()+"',employeeid='"+txt4.getText()+"' where id='"+txt1.getText()+"'   ";
        co.setSQL(sql);
        display();
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
      
    }//GEN-LAST:event_rSButtonMaterialIconOne3ActionPerformed

    private void rSButtonMaterialIconOne2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne2ActionPerformed
        // TODO add your handling code here:
         String sql= "insert into orderr values('"+txt1.getText()+"','"+txt2.getText()+"','"+txt3.getText()+"','"+txt4.getText()+"')";
        co.setSQL(sql);
        display();
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
        
    }//GEN-LAST:event_rSButtonMaterialIconOne2ActionPerformed

    private void rSButtonMaterialIconOne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne4ActionPerformed
        // TODO add your handling code here:
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
    }//GEN-LAST:event_rSButtonMaterialIconOne4ActionPerformed

    private void rSButtonMaterialIconOne5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne5ActionPerformed
        // TODO add your handling code here:
           String sql="select * from orderr where id='"+txt1.getText()+"' or orderitems='"+txt2.getText()+"' or customerid='"+txt3.getText()+"'or employeeid='"+txt4.getText()+"' ";
        co.search(sql);
        try{
            if(co.rs.next()){
                id=co.rs.getString("id");
                txt1.setText(co.rs.getString("id"));
                txt2.setText(co.rs.getString("orderitems"));
                txt3.setText(co.rs.getString("customerid"));
                 txt4.setText(co.rs.getString("employeeid"));
               
                
            }
            else
                JOptionPane.showMessageDialog(null, "record not found");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
            
        }
    }//GEN-LAST:event_rSButtonMaterialIconOne5ActionPerformed

    private void rSButtonMaterialIconOne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconOne1ActionPerformed
        // TODO add your handling code here:
         String sql="delete from orderr where id='"+txt1.getText()+"' ";
          co.setSQL(sql);
        display();
         txt1.setText("");
        txt2.setText("");
        txt3.setText("");
        txt4.setText("");
       
    }//GEN-LAST:event_rSButtonMaterialIconOne1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
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
    // End of variables declaration//GEN-END:variables
}
