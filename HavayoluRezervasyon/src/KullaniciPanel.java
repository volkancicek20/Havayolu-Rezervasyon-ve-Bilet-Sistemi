
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class KullaniciPanel extends javax.swing.JFrame {
    Musteri yolcu;
    DefaultTableModel model;
    İslemler islemler = new İslemler();

    public KullaniciPanel() {
        initComponents();
        model = (DefaultTableModel) ucus_tablosu.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yon_label = new javax.swing.JLabel();
        yon_comboBox = new javax.swing.JComboBox<>();
        rezervasyon_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ucus_tablosu = new javax.swing.JTable();
        no_label = new javax.swing.JLabel();
        no_comboBox = new javax.swing.JComboBox<>();
        bilet_label = new javax.swing.JLabel();
        bilet_comboBox = new javax.swing.JComboBox<>();
        yer_label = new javax.swing.JLabel();
        yer_comboBox = new javax.swing.JComboBox<>();
        girise_don_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 0));
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        yon_label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        yon_label.setText("Yön");
        getContentPane().add(yon_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 415, 32, 31));

        yon_comboBox.setBackground(java.awt.Color.lightGray);
        yon_comboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yon_comboBox.setForeground(java.awt.Color.darkGray);
        yon_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sadece Gidiş", "Gidis - Gelis" }));
        getContentPane().add(yon_comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 419, 110, -1));

        rezervasyon_button.setBackground(java.awt.Color.lightGray);
        rezervasyon_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rezervasyon_button.setText("Rezervasyon Yap");
        rezervasyon_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rezervasyon_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(rezervasyon_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 537, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Standart Bilet 100 TL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 387, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("VIP Bilet 150 TL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 387, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Standart Yer 0 TL");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 423, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Cam Kenari 50 TL");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(603, 423, -1, -1));

        ucus_tablosu.setBackground(java.awt.Color.gray);
        ucus_tablosu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ucus_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "İstanbul-Ankara", "10.30", "11.15"},
                {"2", "İstanbul-İzmir", "15.45", "16.15"},
                {"3", "İzmir-Ankara", "09.45", "10.15"},
                {"4", "İzmir-İstanbul", "14.30", "15.00"},
                {"5", "Ankara-İzmir", "07.30", "08.00"},
                {"6", "Ankara-İstanbul", "18.15", "18.45"},
                {"7", "İstanbul-Balikesir", "21.45", "22.30"},
                {"8", "Balikesir-İstanbul", "23.30", "00.15"},
                {"9", "İstanbul-Trabzon", "14.50", "15.30"},
                {"10", "Trabzon-İstanbul", "00.15", "01.00"},
                {"11", "İzmir-Konya", "07.45", "08.15"},
                {"12", "Konya-İzmir", "12.00", "12.30"},
                {"13", "İstanbul-Konya", "15.40", "16.15"},
                {"14", "Konya-İstanbul", "14.25", "15.00"},
                {"15", "Ardahan-Ankara", "15.50", "16.30"},
                {"16", "Ankara-Ardahan", "18.45", "19.25"},
                {"17", "İstanbul-Kütahya", "14.40", "15.10"},
                {"18", "Bolu-İzmir", "17.55", "18.25"},
                {"19", "Edirne-Konya", "04.15", "05.00"},
                {"20", "İstanbul-Van", "19.45", "20.20"}
            },
            new String [] {
                "No", "Uçuş", "Kalkış", "Varış"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ucus_tablosu);
        if (ucus_tablosu.getColumnModel().getColumnCount() > 0) {
            ucus_tablosu.getColumnModel().getColumn(0).setResizable(false);
            ucus_tablosu.getColumnModel().getColumn(1).setResizable(false);
            ucus_tablosu.getColumnModel().getColumn(2).setResizable(false);
            ucus_tablosu.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 786, 302));

        no_label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        no_label.setText("No");
        getContentPane().add(no_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 380, 40, 31));

        no_comboBox.setBackground(java.awt.Color.lightGray);
        no_comboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        no_comboBox.setForeground(java.awt.Color.darkGray);
        no_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        getContentPane().add(no_comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 384, -1, -1));

        bilet_label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bilet_label.setText("Bilet");
        getContentPane().add(bilet_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 380, 40, 31));

        bilet_comboBox.setBackground(java.awt.Color.lightGray);
        bilet_comboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bilet_comboBox.setForeground(java.awt.Color.darkGray);
        bilet_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standart", "VIP" }));
        getContentPane().add(bilet_comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 384, 110, -1));

        yer_label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        yer_label.setText("Yer");
        getContentPane().add(yer_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 415, 32, 31));

        yer_comboBox.setBackground(java.awt.Color.lightGray);
        yer_comboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        yer_comboBox.setForeground(java.awt.Color.darkGray);
        yer_comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standart", "Cam Kenarı" }));
        getContentPane().add(yer_comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 419, 100, -1));

        girise_don_button.setBackground(java.awt.Color.lightGray);
        girise_don_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        girise_don_button.setText("Giris Menu");
        girise_don_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girise_don_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(girise_don_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 540, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/kullaniciPanel2.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -5, 820, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rezervasyon_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rezervasyon_buttonActionPerformed
        int[] tutar = new int[1];
        tutar[0] = 0;
        int no_secim = no_comboBox.getSelectedIndex();
        int bilet_secim = bilet_comboBox.getSelectedIndex();
        int yer_secim = yer_comboBox.getSelectedIndex();
        int yon_secim = yon_comboBox.getSelectedIndex();

        String no = null, bilet, yer, yon;
        switch(no_secim)
        {
            case 0:
                no = "İstanbul-Ankara";
                break;
            case 1:
                no = "İstanbul-İzmir";
                break;
            case 2:
                no = "İzmir-Ankara";
                break;
            case 3:
                no = "İzmir-İstanbul";
                break;
            case 4:
                no = "Ankara-İzmir";
                break;
            case 5:
                no = "Ankara-İstanbul";
                break;
            case 6:
                no = "İstanbul-Balikesir";
                break;
            case 7:
                no = "Balikesir-İstanbul";
                break;
            case 8:
                no = "İstanbul-Trabzon";
                break;
            case 9:
                no = "Trabzon-İstanbul";
                break;
            case 10:
                no = "İzmir-Konya";
                break;
            case 11:
                no = "Konya-İzmir";
                break;
            case 12:
                no = "İstanbul-Konya";
                break;
            case 13:
                no = "Konya-İstanbul";
                break;
            case 14:
                no = "Ardahan-Ankara";
                break;
            case 15:
                no = "Ankara-Ardahan";
                break;
            case 16:
                no = "İstanbul-Kütahya";
                break;
            case 17:
                no = "Bolu-İzmir";
                break;
            case 18:
                no = "Edirne-Konya";
                break;
            case 19:
                no = "İstanbul-Van";
                break;
            default:
                break;
        }
        /////////////////////////////////////////////////////////
        if(bilet_secim == 0)
        {
            bilet = "Standart";
            tutar[0] += 100;
        }
        else
        {
            bilet = "VIP";
            tutar[0] += 150;
        }
        ////////////////////////////////////////////////////////
        if(yer_secim == 0 )
        {
            yer = "Standart";
        }
        else
        {
            yer = "Cam Kenari";
            tutar[0] += 50;
        }
        //////////////////////////////////////////////////////
        if(yon_secim == 0)
        {
            yon = "Sadece gidis";
        }
        else
        {
            yon = "Gidis - Gelis";
            if(tutar[0] == 100)
            {
                tutar[0] = tutar[0]*2;
            }
            else if(tutar[0] == 150)
            {
                tutar[0] = tutar[0]*2;
            }
            else if(tutar[0] == 200)
            {
                tutar[0] = tutar[0]*2;
            }
        }
        String mesaj = "Rezervasyon Başarılı. Toplam Tutar: "+tutar[0]+" TL";
        int rezervasyon_kontrol = islemler.rezervasyonEkle(no,bilet,yer,yon);
        if(rezervasyon_kontrol == 1)
        {
            JOptionPane.showMessageDialog(this, mesaj);
            tutar[0] = 0;
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Rezervasyon Başarısız");
            tutar[0] = 0;
        }
        rezervasyon_button.setVisible(false);
        UcakAnimasyon ucakAnimasyon = new UcakAnimasyon();
        ucakAnimasyon.setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_rezervasyon_buttonActionPerformed

    private void girise_don_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girise_don_buttonActionPerformed

        Giris giris = new Giris();
        giris.setVisible(true);
        setVisible(false);
        giris.setVisible(true);
    }//GEN-LAST:event_girise_don_buttonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KullaniciPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullaniciPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullaniciPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bilet_comboBox;
    private javax.swing.JLabel bilet_label;
    private javax.swing.JButton girise_don_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> no_comboBox;
    private javax.swing.JLabel no_label;
    private javax.swing.JButton rezervasyon_button;
    private javax.swing.JTable ucus_tablosu;
    private javax.swing.JComboBox<String> yer_comboBox;
    private javax.swing.JLabel yer_label;
    private javax.swing.JComboBox<String> yon_comboBox;
    private javax.swing.JLabel yon_label;
    // End of variables declaration//GEN-END:variables
}
