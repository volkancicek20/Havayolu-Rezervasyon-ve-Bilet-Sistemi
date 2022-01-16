
public class UcakAnimasyon extends javax.swing.JFrame {


    public UcakAnimasyon() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        airplane_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        airplane_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/airplane.png"))); // NOI18N
        jPanel1.add(airplane_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 230, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/sky.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Thread animation = new Thread(new Runnable() {
            @Override
            public void run() {
                int x = 50;
                int y = 375;
                boolean kontrol = true;
                while (true) {
                    if (kontrol) {
                        airplane_label.setLocation(x, y);
                        x += 7;
                        y -= 5;
                    }
                    if(x>800)
                    {
                        UcakAnimasyon2 ucakAnimasyon2 = new UcakAnimasyon2();
                        ucakAnimasyon2.setVisible(true);
                        setVisible(false);
                        ucakAnimasyon2.setVisible(true);
                        break;
                    }
                    try {
                        Thread.sleep(17);   
                    } catch (Exception e) {

                    }
                }
            }
        });
        animation.start();
        
    }//GEN-LAST:event_formWindowOpened


    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UcakAnimasyon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airplane_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
