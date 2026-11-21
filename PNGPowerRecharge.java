
package DARIUS_project;
import java.sql.*;

public class PNGPowerRecharge extends javax.swing.JFrame {

    public PNGPowerRecharge() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        bt_mainFrame = new java.awt.Button();
        label2 = new java.awt.Label();
        tf_meterNumber = new java.awt.TextField();
        label3 = new java.awt.Label();
        lb_kwh = new java.awt.Label();
        tf_amount = new java.awt.TextField();
        bt_recharge = new java.awt.Button();
        ta_output = new java.awt.TextArea();
        bt_clear = new java.awt.Button();
        lb_unit = new java.awt.Label();
        label4 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PNG POWER RECHARGE");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panel1.setBackground(java.awt.Color.lightGray);
        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel1.setName(""); // NOI18N

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(102, 102, 255));
        label1.setText("PNG POWER");

        bt_mainFrame.setBackground(new java.awt.Color(102, 102, 102));
        bt_mainFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_mainFrame.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bt_mainFrame.setForeground(new java.awt.Color(255, 255, 255));
        bt_mainFrame.setLabel("Main Menu");
        bt_mainFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mainFrameActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(102, 102, 102));
        label2.setText("Meter Number:");

        tf_meterNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_meterNumberActionPerformed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(102, 102, 102));
        label3.setText("Amount: K");

        lb_kwh.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        lb_kwh.setForeground(new java.awt.Color(0, 102, 0));
        lb_kwh.setText("1 kilowatt-hour = 0.8 Kina");

        bt_recharge.setBackground(new java.awt.Color(102, 102, 255));
        bt_recharge.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_recharge.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bt_recharge.setForeground(new java.awt.Color(255, 255, 255));
        bt_recharge.setLabel("Recharge");
        bt_recharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_rechargeActionPerformed(evt);
            }
        });

        ta_output.setBackground(new java.awt.Color(0, 0, 0));
        ta_output.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        ta_output.setForeground(new java.awt.Color(0, 255, 0));

        bt_clear.setBackground(new java.awt.Color(255, 102, 102));
        bt_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_clear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bt_clear.setForeground(new java.awt.Color(255, 255, 255));
        bt_clear.setLabel("Clear");
        bt_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_clearActionPerformed(evt);
            }
        });

        lb_unit.setBackground(java.awt.Color.gray);

        label4.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        label4.setForeground(new java.awt.Color(51, 51, 255));
        label4.setText("Unit Purchased");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(bt_mainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_recharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_meterNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_unit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lb_kwh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ta_output, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_mainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(tf_meterNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(bt_recharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(ta_output, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_kwh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_rechargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_rechargeActionPerformed
        String meterText = tf_meterNumber.getText().trim();
        String amountText = tf_amount.getText().trim();
        if (meterText.isEmpty() || amountText.isEmpty()) {
            ta_output.setText("Please enter both Meter Number and Amount.");
            return;
        }
        int meterNo;
        double amount;
        try {
            meterNo = Integer.parseInt(meterText);
            amount = Double.parseDouble(amountText);
            if (meterNo <= 0 || amount <= 0) {
                ta_output.setText("Please enter a positive Meter Number and Amount.");
                return;
            }
        } catch (NumberFormatException ex) {
            ta_output.setText("Invalid input. Meter Number must be whole number and Amount must be a number.");
            return;
        }
        double unit = amount / 0.8;
        String path = "easyPay.mdb"; // FIXED: relative path
        String url = "jdbc:ucanaccess://" + path;
        java.sql.Timestamp timestamp = new java.sql.Timestamp(System.currentTimeMillis());
        try {
            Connection con = DriverManager.getConnection(url);
            String sql = "INSERT INTO Recharge(meterNo,rechargeAmount,unitPurchased,rechargeTime)VALUES(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, meterNo);
            ps.setDouble(2, amount);
            ps.setDouble(3, unit);
            ps.setTimestamp(4, timestamp);
            ps.executeUpdate();
            ps.close();
            con.close();
            lb_unit.setText("" + unit);
            ta_output.setText("\nRecharge Successful!\n" + "**********************************\n" + "Meter Number: " + meterNo + "\n" + "Recharge Amount: K" + String.format("%.2f", amount) + "\n" + "Units Purchased: " + String.format("%.2f", unit) + "\n" + "Recharge Time: " + timestamp.toString() + "\n" + "---------------------------------------");
        } catch (SQLException e) {
            ta_output.setText("Database error: " + e.getMessage() + "\nMake sure easyPay.mdb is in the project folder and UCanAccess JARs are added.");
            System.out.print(e.getMessage());
        }
    }

    private void bt_mainFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mainFrameActionPerformed
        // TODO add your handling code here:
        MainMenu mf =new MainMenu();
        mf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_mainFrameActionPerformed

    private void bt_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_clearActionPerformed
        // TODO add your handling code here:
        tf_meterNumber.setText("");
        tf_amount.setText("");
        ta_output.setText("");
        lb_unit.setText("");
        
    }//GEN-LAST:event_bt_clearActionPerformed

    private void tf_meterNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_meterNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_meterNumberActionPerformed

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
            java.util.logging.Logger.getLogger(PNGPowerRecharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PNGPowerRecharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PNGPowerRecharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PNGPowerRecharge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new PNGPowerRecharge().setVisible(true);
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button bt_clear;
    private java.awt.Button bt_mainFrame;
    private java.awt.Button bt_recharge;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label lb_kwh;
    private java.awt.Label lb_unit;
    private java.awt.Panel panel1;
    private java.awt.TextArea ta_output;
    private java.awt.TextField tf_amount;
    private java.awt.TextField tf_meterNumber;
    // End of variables declaration//GEN-END:variables
}
