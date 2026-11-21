
package DARIUS_project;

public class PizzaOrder extends javax.swing.JFrame {

    public PizzaOrder() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        panel1 = new java.awt.Panel();
        bt_Porder = new java.awt.Button();
        bt_clear = new java.awt.Button();
        chk_mushroom = new java.awt.Checkbox();
        chk_chicken = new java.awt.Checkbox();
        label1 = new java.awt.Label();
        lab_size = new java.awt.Label();
        lab_qty = new java.awt.Label();
        li_size = new java.awt.List();
        ta_output = new java.awt.TextArea();
        tf_qty = new java.awt.TextField();
        label4 = new java.awt.Label();
        chk_cheese = new java.awt.Checkbox();
        bt_mainFrame = new java.awt.Button();
        chk_onion = new java.awt.Checkbox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PIZZA ORDER");
        setBackground(new java.awt.Color(255, 255, 255));

        panel1.setBackground(java.awt.Color.lightGray);

        bt_Porder.setBackground(new java.awt.Color(51, 153, 255));
        bt_Porder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_Porder.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bt_Porder.setForeground(new java.awt.Color(255, 255, 255));
        bt_Porder.setLabel("Place Order");
        bt_Porder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_PorderActionPerformed(evt);
            }
        });

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

        chk_mushroom.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chk_mushroom.setForeground(new java.awt.Color(51, 51, 51));
        chk_mushroom.setLabel("Mushroom");

        chk_chicken.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chk_chicken.setForeground(new java.awt.Color(51, 51, 51));
        chk_chicken.setLabel("Chicken");

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(102, 102, 255));
        label1.setText("PIZZA ORDER");

        lab_size.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lab_size.setForeground(new java.awt.Color(51, 102, 255));
        lab_size.setText("Size");

        lab_qty.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lab_qty.setForeground(new java.awt.Color(51, 102, 255));
        lab_qty.setText("Quantity");

        li_size.add("Small");
        li_size.add("Medium");
        li_size.add("Large");
        li_size.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        li_size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                li_sizeActionPerformed(evt);
            }
        });

        ta_output.setBackground(new java.awt.Color(0, 0, 0));
        ta_output.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ta_output.setForeground(new java.awt.Color(0, 255, 0));

        tf_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_qtyActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(51, 102, 255));
        label4.setText("Toppings");

        chk_cheese.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chk_cheese.setForeground(new java.awt.Color(51, 51, 51));
        chk_cheese.setLabel("Cheese");

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

        chk_onion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chk_onion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        chk_onion.setForeground(new java.awt.Color(51, 51, 51));
        chk_onion.setLabel("Onion");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(li_size, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tf_qty, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lab_qty, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lab_size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chk_chicken, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk_onion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk_cheese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chk_mushroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(bt_Porder, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(bt_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)))
                .addComponent(ta_output, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel1Layout.createSequentialGroup()
                    .addGap(229, 229, 229)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(136, 136, 136)
                    .addComponent(bt_mainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(89, Short.MAX_VALUE)))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(ta_output, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk_onion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk_cheese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk_mushroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk_chicken, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lab_size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(li_size, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lab_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt_Porder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bt_mainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(306, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_qtyActionPerformed

    private void li_sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_li_sizeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_li_sizeActionPerformed

    private void bt_PorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_PorderActionPerformed
        // TODO add your handling code here:
        int qty;
    try {
        qty = Integer.parseInt(tf_qty.getText().trim());
        if (qty <= 0) {
            ta_output.setText("please enter a valid positive quantity.");
            return;
        }
    } catch (NumberFormatException ex) {
        ta_output.setText("Invalid input. Please enter a numeric quantity.");
        return;
    }

    double price = 0.0;
       
        //Size Selection - FIXED: handle no size selected (was NullPointerException)
        String size = li_size.getSelectedItem();
        if ("Small".equals(size)) price += 6.00;
        else if ("Medium".equals(size)) price += 15.00;
        else if ("Large".equals(size)) price += 20.00;
        else {
            ta_output.setText("Please select a pizza size.");
            return;
        }
        
        //Toppings check all
       String toppings = null;
        if(chk_onion.getState()==true && chk_cheese.getState()==true && chk_mushroom.getState()==true && chk_chicken.getState()==true){
            toppings="Onion, Cheese, Mushroom, chicken";
            price+=4.00;
        }
         //check three toppings
        else if(chk_onion.getState()==true && chk_cheese.getState()==true && chk_mushroom.getState()==true){
            toppings="Onion, Cheese, Mushroom";
            price+=3.00;
        }
        else if(chk_onion.getState()==true && chk_cheese.getState()==true && chk_chicken.getState()==true){
            toppings=" Onion, Cheese, Chicken";
            price+=3.00;
        }
        else if(chk_onion.getState()==true && chk_mushroom.getState()==true && chk_chicken.getState()==true){
            toppings=" Onion, Mushroom, Chicken";
            price+=3.00;
        }
        else if(chk_cheese.getState()==true && chk_mushroom.getState()==true && chk_chicken.getState()==true){
            toppings="Cheese, Mushroom, Chicken";
            price+=3.00;
        }
        //checked two toppings
        else if(chk_onion.getState()==true && chk_cheese.getState()==true){
            toppings="Onion, Cheese";
            price+=2.00;
        }
        else if(chk_onion.getState()==true && chk_mushroom.getState()==true){
            toppings="Onion, Mushroom";
            price+=2.00;
        }
        else if(chk_onion.getState()==true && chk_chicken.getState()==true){
            toppings="Onion, Chicken";
            price+=2.00;
        }
        else if(chk_cheese.getState()==true && chk_mushroom.getState()==true){
            toppings="Cheese, Mushroom";
            price+=2.00;
        }
        else if(chk_cheese.getState()==true && chk_chicken.getState()==true){
            toppings="Cheese,Chicken";
            price+=2.00;
        }
        else if(chk_mushroom.getState()==true && chk_chicken.getState()==true){
            toppings="Mushroom, Chicken";
            price+=2.00;
            
        }
        
        //check one toppings
        else if(chk_onion.getState()==true){
            toppings="Onion";
            price+=1;
        }
        else if(chk_cheese.getState()==true){
            toppings="Cheese";
            price+=1;
        }
        else if(chk_mushroom.getState()==true){
            toppings="Mushroom";
            price+=1;
        }
        else if(chk_chicken.getState()==true){
            toppings="Chicken";
            price+=1;
        }
        
        else{
            toppings="No Toppings";
        }
        
        //calculate price
        double total=price*qty;

       // Display output
    StringBuilder receipt = new StringBuilder();
    receipt.append("\nOrder Summary\n")
           .append("**********************************\n")
           .append("Size: ").append(size).append("\n")
           .append("Quantity: ").append(qty).append("\n")
           .append("Toppings: \n").append(toppings).append("\n")
           .append("---------------------------------------\n")
           .append(String.format("Total: K%.2f\n", total))
           .append("---------------------------------------");

    ta_output.setText(receipt.toString());
    }//GEN-LAST:event_bt_PorderActionPerformed

    private void bt_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_clearActionPerformed
        // TODO add your handling code here:
        li_size.select(0);
        ta_output.setText("");
        tf_qty.setText("");
        chk_onion.setState(false);
        chk_cheese.setState(false);
        chk_mushroom.setState(false);
        chk_chicken.setState(false);
    }//GEN-LAST:event_bt_clearActionPerformed

    private void bt_mainFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mainFrameActionPerformed
        // TODO add your handling code here:
        MainMenu mf =new MainMenu();
        mf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_mainFrameActionPerformed

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
            java.util.logging.Logger.getLogger(PizzaOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PizzaOrder().setVisible(true);
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button bt_Porder;
    private java.awt.Button bt_clear;
    private java.awt.Button bt_mainFrame;
    private java.awt.Canvas canvas1;
    private java.awt.Checkbox chk_cheese;
    private java.awt.Checkbox chk_chicken;
    private java.awt.Checkbox chk_mushroom;
    private java.awt.Checkbox chk_onion;
    private java.awt.Label lab_qty;
    private java.awt.Label lab_size;
    private java.awt.Label label1;
    private java.awt.Label label4;
    private java.awt.List li_size;
    private java.awt.Panel panel1;
    private java.awt.TextArea ta_output;
    private java.awt.TextField tf_qty;
    // End of variables declaration//GEN-END:variables
}
