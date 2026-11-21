
package DARIUS_project;
public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        bt_pizzaOrder = new java.awt.Button();
        button2 = new java.awt.Button();
        bt_exit = new java.awt.Button();
        lb_pizzaDiscription = new java.awt.Label();
        lb_powerDiscription = new java.awt.Label();
        lb_exitDiscription = new java.awt.Label();
        lb_MainMenu = new java.awt.Label();
        lb_s3Proj = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MAIN MENU");

        panel1.setBackground(new java.awt.Color(204, 204, 204));
        panel1.setName(""); // NOI18N

        bt_pizzaOrder.setBackground(new java.awt.Color(102, 204, 255));
        bt_pizzaOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_pizzaOrder.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bt_pizzaOrder.setForeground(new java.awt.Color(255, 255, 255));
        bt_pizzaOrder.setLabel("Pizza Order");
        bt_pizzaOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pizzaOrderActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(102, 204, 255));
        button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setLabel("PNG Power Recharge");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        bt_exit.setBackground(java.awt.Color.gray);
        bt_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_exit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bt_exit.setForeground(new java.awt.Color(255, 255, 255));
        bt_exit.setLabel("Exit");
        bt_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exitActionPerformed(evt);
            }
        });

        lb_pizzaDiscription.setAlignment(java.awt.Label.CENTER);
        lb_pizzaDiscription.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        lb_pizzaDiscription.setForeground(new java.awt.Color(102, 102, 102));
        lb_pizzaDiscription.setText("Order your favorite pizza early");

        lb_powerDiscription.setAlignment(java.awt.Label.CENTER);
        lb_powerDiscription.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        lb_powerDiscription.setForeground(new java.awt.Color(102, 102, 102));
        lb_powerDiscription.setText("Recharge your power instantly");

        lb_exitDiscription.setAlignment(java.awt.Label.CENTER);
        lb_exitDiscription.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        lb_exitDiscription.setForeground(new java.awt.Color(102, 102, 102));
        lb_exitDiscription.setText("Close the application safely");

        lb_MainMenu.setAlignment(java.awt.Label.CENTER);
        lb_MainMenu.setBackground(java.awt.Color.lightGray);
        lb_MainMenu.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lb_MainMenu.setForeground(new java.awt.Color(204, 0, 51));
        lb_MainMenu.setText("MAIN MENU");

        lb_s3Proj.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        lb_s3Proj.setForeground(new java.awt.Color(102, 51, 0));
        lb_s3Proj.setText("DARIUS JR|S3 project 2026");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(lb_exitDiscription, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lb_MainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_pizzaOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(lb_pizzaDiscription, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(button2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(lb_powerDiscription, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(lb_s3Proj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lb_MainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(19, 19, 19)
                .addComponent(bt_pizzaOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lb_pizzaDiscription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lb_powerDiscription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(bt_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb_exitDiscription, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(lb_s3Proj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_pizzaOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pizzaOrderActionPerformed
        // TODO add your handling code here:
        PizzaOrder po =new PizzaOrder();
        po.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_pizzaOrderActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        PNGPowerRecharge ppr =new PNGPowerRecharge();
        ppr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_button2ActionPerformed

    private void bt_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exitActionPerformed
        // TODO add your handling code here:
        //PizzaOrderApp po =new PizzaOrder();
        // PNGPowerRecharge ppr =new PNGPowerRecharge();
        System.exit(0);
    }//GEN-LAST:event_bt_exitActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button bt_exit;
    private java.awt.Button bt_pizzaOrder;
    private java.awt.Button button2;
    private java.awt.Label lb_MainMenu;
    private java.awt.Label lb_exitDiscription;
    private java.awt.Label lb_pizzaDiscription;
    private java.awt.Label lb_powerDiscription;
    private java.awt.Label lb_s3Proj;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
