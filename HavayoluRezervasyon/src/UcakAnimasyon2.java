public class UcakAnimasyon2 extends javax.swing.JFrame {

    public UcakAnimasyon2() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        airplane2_label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                WindowsOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        airplane2_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/airplane2.png"))); // NOI18N
        getContentPane().add(airplane2_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/sky2.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 810, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WindowsOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_WindowsOpened
        Thread animation = new Thread(new Runnable() {
            @Override
            public void run() {
                int x = 50;
                int y = 0;
                boolean kontrol = true;
                while (true) {
                    if (kontrol) {
                        airplane2_label.setLocation(x, y);
                        x += 7;
                        y += 5;
                    }
                    if(x>800)
                    {
                        BilgiMesaji bilgiMesaji = new BilgiMesaji();
                        bilgiMesaji.setVisible(true);
                        setVisible(false);
                        bilgiMesaji.setVisible(true);
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
        
    }//GEN-LAST:event_WindowsOpened

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UcakAnimasyon2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airplane2_label;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
