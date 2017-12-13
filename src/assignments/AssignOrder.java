/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignments;

import assignments.Order;
import assignments.ExpandableArrayList;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Asus
 */
public class AssignOrder extends javax.swing.JFrame {
 private ExpandableArrayList<Order> OrderList;
 private int a;
    /**
     * Creates new form AssignOrder
     */
    public AssignOrder() {
        initComponents();
        hide();
        add();
    }
    public void hide(){
        ID1.setVisible(false);ID2.setVisible(false);ID3.setVisible(false);
        schedule1.setVisible(false);schedule2.setVisible(false);schedule3.setVisible(false);
        section1.setVisible(false);section2.setVisible(false);section3.setVisible(false);
        meal1.setVisible(false);meal2.setVisible(false);meal3.setVisible(false);
        price1.setVisible(false);price2.setVisible(false);price3.setVisible(false);
        dest1.setVisible(false);dest2.setVisible(false);dest3.setVisible(false);
        r1.setVisible(false);r2.setVisible(false);r3.setVisible(false);
        
        ID1.setText("S001");ID2.setText("S002");ID3.setText("S003");
        schedule1.setText("Daily\t");schedule2.setText("Weekdays");schedule3.setText("Weekends");
        section1.setText("Breakfast(9a.m.~12p.m.)");section2.setText("Dinner(6p.m.~10p.m.)");section3.setText("Dinner(6p.m.~10p.m.)");
        r1.setText("Meet Mee");r2.setText("Six Inch Cafe");r3.setText("Sushi Mentai");
        meal1.setText("Set A");meal2.setText("Set A");meal3.setText("Set C");
        price1.setText("RM10.00");price2.setText("RM10.00");price3.setText("RM10.00");
        dest1.setText("Wangsa Maju");dest2.setText("Platinum Victory(PV)");dest3.setText("Genting Klang");
    
    }
private void add(){
    
    OrderList = new ExpandableArrayList<>();
    OrderList.add(new Order(ID1.getText(),schedule1.getText(),section1.getText(),r1.getText(),meal1.getText(),price1.getText(), dest1.getText(),"\tNot Assigned"));
    OrderList.add(new Order(ID2.getText(),schedule2.getText(),section2.getText(),r2.getText(),meal2.getText(), price2.getText(), dest2.getText(),"\tNot Assigned"));
    OrderList.add(new Order(ID3.getText(),schedule3.getText(),section3.getText(),r3.getText(),meal3.getText(), price3.getText(), dest3.getText(),"\tNot Assigned"));
    sOrder.setText("Schedule Order:\n" + OrderList);
    sOrder.setEditable(false);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        assignDelivery = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sOrder = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        assignOrder = new javax.swing.JButton();
        calculatePetrol = new javax.swing.JButton();
        orderID = new javax.swing.JComboBox<>();
        delivery1 = new javax.swing.JRadioButton();
        delivery2 = new javax.swing.JRadioButton();
        delivery3 = new javax.swing.JRadioButton();
        ID1 = new javax.swing.JTextField();
        ID2 = new javax.swing.JTextField();
        ID3 = new javax.swing.JTextField();
        schedule1 = new javax.swing.JTextField();
        schedule2 = new javax.swing.JTextField();
        schedule3 = new javax.swing.JTextField();
        section1 = new javax.swing.JTextField();
        section2 = new javax.swing.JTextField();
        section3 = new javax.swing.JTextField();
        meal1 = new javax.swing.JTextField();
        meal2 = new javax.swing.JTextField();
        meal3 = new javax.swing.JTextField();
        price1 = new javax.swing.JTextField();
        price2 = new javax.swing.JTextField();
        price3 = new javax.swing.JTextField();
        dest1 = new javax.swing.JTextField();
        dest2 = new javax.swing.JTextField();
        dest3 = new javax.swing.JTextField();
        r2 = new javax.swing.JTextField();
        r1 = new javax.swing.JTextField();
        r3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Assign Order");

        sOrder.setColumns(20);
        sOrder.setRows(5);
        jScrollPane1.setViewportView(sOrder);

        jLabel2.setText("Order ID:");

        jLabel3.setText("Delivery Man:");

        assignOrder.setText("Assign Order");
        assignOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignOrderActionPerformed(evt);
            }
        });

        calculatePetrol.setText("Calculate Petrol");
        calculatePetrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatePetrolActionPerformed(evt);
            }
        });

        orderID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S001", "S002", "S003" }));

        assignDelivery.add(delivery1);
        delivery1.setText("delivery man1");

        assignDelivery.add(delivery2);
        delivery2.setText("delivery man2");

        assignDelivery.add(delivery3);
        delivery3.setText("delivery man3");

        ID1.setText("jTextField1");

        ID2.setText("jTextField2");

        ID3.setText("jTextField3");

        schedule1.setText("jTextField4");

        schedule2.setText("jTextField5");

        schedule3.setText("jTextField6");

        section1.setText("jTextField7");

        section2.setText("jTextField8");

        section3.setText("jTextField9");

        meal1.setText("jTextField10");

        meal2.setText("jTextField11");

        meal3.setText("jTextField12");

        price1.setText("jTextField13");

        price2.setText("jTextField14");

        price3.setText("jTextField15");

        dest1.setText("jTextField16");

        dest2.setText("jTextField17");

        dest3.setText("jTextField18");

        r2.setText("jTextField1");

        r1.setText("jTextField2");

        r3.setText("jTextField3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(delivery1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(delivery2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(delivery3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ID3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(schedule3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(section3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(meal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(price3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dest3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(schedule2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(section2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(meal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(price2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dest2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(26, 26, 26)
                                        .addComponent(orderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(assignOrder)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(schedule1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(section1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(meal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(price1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dest1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(calculatePetrol)))
                        .addGap(95, 95, 95))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(orderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(delivery1)
                    .addComponent(delivery2)
                    .addComponent(delivery3))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignOrder)
                    .addComponent(calculatePetrol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(schedule1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(section1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dest1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(schedule2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(section2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dest2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(schedule3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(section3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dest3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculatePetrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatePetrolActionPerformed
        new CalculatePetrol().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_calculatePetrolActionPerformed

    private void assignOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignOrderActionPerformed
        
        delivery1.setActionCommand("\tdelivery man1");
        delivery2.setActionCommand("\tdelivery man2");
        delivery3.setActionCommand("\tdelivery man3");
        int check = JOptionPane.showConfirmDialog (null, "Are you sure want to assign before calculate petrol price?");
            if(check == JOptionPane.YES_OPTION)
            {
                JOptionPane.showMessageDialog(null,"Assign Successfully",null,JOptionPane.OK_OPTION);
                if(orderID.getSelectedIndex()==0)
                {
                   Order order = new Order(ID1.getText(),schedule1.getText(),section1.getText(),r1.getText(),meal1.getText(),
                   price1.getText(),dest1.getText(),assignDelivery.getSelection().getActionCommand());
                   OrderList.replace(1,order);
                   sOrder.setText("Schedule Order:\n" + OrderList);
                }
                else if(orderID.getSelectedIndex()==1)
                {
                   Order order = new Order(ID2.getText(),schedule2.getText(),section2.getText(),r2.getText(),meal2.getText(),
                   price2.getText(),dest2.getText(),assignDelivery.getSelection().getActionCommand());
                   OrderList.replace(2,order);
                   sOrder.setText("Schedule Order:\n" + OrderList);
                 }
                else if(orderID.getSelectedIndex()==2)
                {
                   Order order = new Order(ID3.getText(),schedule3.getText(),section3.getText(),r3.getText(),meal3.getText(),
                   price3.getText(),dest3.getText(),assignDelivery.getSelection().getActionCommand());
                   OrderList.replace(3,order);
                   sOrder.setText("Schedule Order:\n" + OrderList);
        }
                
            }
            
            else if(check == JOptionPane.CANCEL_OPTION || check== JOptionPane.NO_OPTION)
                JOptionPane.showMessageDialog(null, "Assign Canceled",null,JOptionPane.OK_OPTION);
            
        
        
        
    }//GEN-LAST:event_assignOrderActionPerformed

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
            java.util.logging.Logger.getLogger(AssignOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssignOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssignOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssignOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new AssignOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID1;
    private javax.swing.JTextField ID2;
    private javax.swing.JTextField ID3;
    private javax.swing.ButtonGroup assignDelivery;
    private javax.swing.JButton assignOrder;
    private javax.swing.JButton calculatePetrol;
    private javax.swing.JRadioButton delivery1;
    private javax.swing.JRadioButton delivery2;
    private javax.swing.JRadioButton delivery3;
    private javax.swing.JTextField dest1;
    private javax.swing.JTextField dest2;
    private javax.swing.JTextField dest3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField meal1;
    private javax.swing.JTextField meal2;
    private javax.swing.JTextField meal3;
    private javax.swing.JComboBox<String> orderID;
    private javax.swing.JTextField price1;
    private javax.swing.JTextField price2;
    private javax.swing.JTextField price3;
    private javax.swing.JTextField r1;
    private javax.swing.JTextField r2;
    private javax.swing.JTextField r3;
    private javax.swing.JTextArea sOrder;
    private javax.swing.JTextField schedule1;
    private javax.swing.JTextField schedule2;
    private javax.swing.JTextField schedule3;
    private javax.swing.JTextField section1;
    private javax.swing.JTextField section2;
    private javax.swing.JTextField section3;
    // End of variables declaration//GEN-END:variables
}
