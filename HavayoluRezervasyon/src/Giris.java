
import java.awt.Color;
import javax.swing.JOptionPane;


public class Giris extends javax.swing.JFrame {
    Musteri yolcu;
    İslemler islemler = new İslemler();
    public Giris() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kullanici_adi_label = new javax.swing.JLabel();
        kullanici_adi_textfield = new javax.swing.JTextField();
        sifre_label = new javax.swing.JLabel();
        giris_yap_button = new javax.swing.JButton();
        kayit_ol_button = new javax.swing.JButton();
        sifre_passwordfield = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hava Yolu Rezervasyon");
        setAutoRequestFocus(false);
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                windowsOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kullanici_adi_label.setFont(new java.awt.Font("Lucida Bright", 1, 15)); // NOI18N
        kullanici_adi_label.setText("Kullanici Adi");
        getContentPane().add(kullanici_adi_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 130, 33));

        kullanici_adi_textfield.setBackground(java.awt.Color.lightGray);
        kullanici_adi_textfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Giris.this.focusLost(evt);
            }
        });
        kullanici_adi_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanici_adi_textfieldActionPerformed(evt);
            }
        });
        getContentPane().add(kullanici_adi_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 215, 33));

        sifre_label.setFont(new java.awt.Font("Lucida Bright", 1, 15)); // NOI18N
        sifre_label.setText("Şifre");
        getContentPane().add(sifre_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 130, 33));

        giris_yap_button.setBackground(java.awt.Color.lightGray);
        giris_yap_button.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        giris_yap_button.setText("Giriş Yap");
        giris_yap_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giris_yap_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(giris_yap_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 100, 38));

        kayit_ol_button.setBackground(java.awt.Color.lightGray);
        kayit_ol_button.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        kayit_ol_button.setText("Kayıt Ol");
        kayit_ol_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayit_ol_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(kayit_ol_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 97, 38));

        sifre_passwordfield.setBackground(java.awt.Color.lightGray);
        getContentPane().add(sifre_passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 215, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/login1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kullanici_adi_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanici_adi_textfieldActionPerformed

    }//GEN-LAST:event_kullanici_adi_textfieldActionPerformed

    private void kayit_ol_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayit_ol_buttonActionPerformed

        String kullanici_adi = kullanici_adi_textfield.getText();
        String sifre = new String(sifre_passwordfield.getPassword());
        
        int kontrol = islemler.kayitOl(kullanici_adi, sifre);
        if(kontrol == 1)
        {
            JOptionPane.showMessageDialog(this, "Kayıt Başarılı! Giriş Yapabilirsiniz");
        }
        else if(kontrol == -2)
        {
            JOptionPane.showMessageDialog(this, "Farklı kullanici adi deneyiniz!!!");
            kullanici_adi_textfield.setText("");
            sifre_passwordfield.setText("");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Kayıt Başarısız!");
        }
    }//GEN-LAST:event_kayit_ol_buttonActionPerformed

    private void giris_yap_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giris_yap_buttonActionPerformed
       
        String kullanici_adi = kullanici_adi_textfield.getText();
        String sifre = new String(sifre_passwordfield.getPassword());
        boolean adminGirisKontrol = islemler.admin_girisYap(kullanici_adi, sifre);
        if(adminGirisKontrol)
        {
            AdminPanel adminPanel = new AdminPanel();
            setVisible(false);
            adminPanel.setVisible(true);
            
        }
        else
        {
            boolean girisKontrol = islemler.girisYap(kullanici_adi, sifre);
            if(girisKontrol)
            {
                KullaniciPanel kullaniciPanel = new KullaniciPanel();
                setVisible(false);
                kullaniciPanel.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Giriş Başarısız!");
            }
        }
        
    }//GEN-LAST:event_giris_yap_buttonActionPerformed

    private void focusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusLost

        String kullanici_adi = kullanici_adi_textfield.getText();
        int kontrol = islemler.kayitOl(kullanici_adi);
        if(kontrol == -2)
        {
            kullanici_adi_textfield.setForeground(Color.red);
            
        }
        else
        {
            kullanici_adi_textfield.setForeground(Color.black);

        }
    }//GEN-LAST:event_focusLost

    private void windowsOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_windowsOpened

    }//GEN-LAST:event_windowsOpened

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton giris_yap_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kayit_ol_button;
    private javax.swing.JLabel kullanici_adi_label;
    private javax.swing.JTextField kullanici_adi_textfield;
    private javax.swing.JLabel sifre_label;
    private javax.swing.JPasswordField sifre_passwordfield;
    // End of variables declaration//GEN-END:variables
}
