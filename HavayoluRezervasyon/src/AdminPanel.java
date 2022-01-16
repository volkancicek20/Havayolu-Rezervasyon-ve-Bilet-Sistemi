import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


public class AdminPanel extends javax.swing.JFrame {
    ArrayList<String> arrayList = new ArrayList<String>();
    ArrayList<String> arrayList2 = new ArrayList<String>();
    İslemler islemler = new İslemler();
    DefaultTableModel model;
    DefaultTableModel model2;

    public AdminPanel() {
        initComponents();
        model = (DefaultTableModel) musteri_tablosu_table.getModel();
        model2 = (DefaultTableModel) rezervasyon_tablosu_table.getModel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        musteri_tablosu_table = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        rezervasyon_tablosu_table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        id_boyut_comboBox = new javax.swing.JComboBox<>();
        kullaniciyi_guncelle_textField = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username_guncelle_textField = new javax.swing.JTextField();
        password_guncelle_textField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        tabloyu_bosalt_button = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        bilgi_textarea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 200, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                WindowsOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("ADMİN PANEL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 7, -1, 37));

        musteri_tablosu_table.setBackground(java.awt.Color.darkGray);
        musteri_tablosu_table.setForeground(java.awt.Color.white);
        musteri_tablosu_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "username", "password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(musteri_tablosu_table);
        if (musteri_tablosu_table.getColumnModel().getColumnCount() > 0) {
            musteri_tablosu_table.getColumnModel().getColumn(0).setResizable(false);
            musteri_tablosu_table.getColumnModel().getColumn(1).setResizable(false);
            musteri_tablosu_table.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 87, 234, 231));

        rezervasyon_tablosu_table.setBackground(java.awt.Color.darkGray);
        rezervasyon_tablosu_table.setForeground(java.awt.Color.white);
        rezervasyon_tablosu_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Ucus", "Bilet", "Yer", "Yön"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(rezervasyon_tablosu_table);
        if (rezervasyon_tablosu_table.getColumnModel().getColumnCount() > 0) {
            rezervasyon_tablosu_table.getColumnModel().getColumn(0).setResizable(false);
            rezervasyon_tablosu_table.getColumnModel().getColumn(1).setResizable(false);
            rezervasyon_tablosu_table.getColumnModel().getColumn(2).setResizable(false);
            rezervasyon_tablosu_table.getColumnModel().getColumn(3).setResizable(false);
            rezervasyon_tablosu_table.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 87, 548, 231));

        jButton1.setBackground(java.awt.Color.darkGray);
        jButton1.setForeground(java.awt.Color.white);
        jButton1.setText("Kullaniciyi Sil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 368, 234, -1));

        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 340, 30, -1));

        id_boyut_comboBox.setBackground(java.awt.Color.darkGray);
        id_boyut_comboBox.setForeground(java.awt.Color.white);
        id_boyut_comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_boyut_comboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(id_boyut_comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 337, 53, -1));

        kullaniciyi_guncelle_textField.setBackground(java.awt.Color.darkGray);
        kullaniciyi_guncelle_textField.setForeground(java.awt.Color.white);
        kullaniciyi_guncelle_textField.setText("Kullaniciyi Güncelle");
        kullaniciyi_guncelle_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciyi_guncelle_textFieldActionPerformed(evt);
            }
        });
        getContentPane().add(kullaniciyi_guncelle_textField, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 509, 234, -1));

        jLabel3.setText("Username");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 425, -1, -1));

        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 454, -1, -1));

        username_guncelle_textField.setBackground(java.awt.Color.lightGray);
        getContentPane().add(username_guncelle_textField, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 422, 170, -1));

        password_guncelle_textField.setBackground(java.awt.Color.lightGray);
        getContentPane().add(password_guncelle_textField, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 451, 170, -1));

        jButton2.setBackground(java.awt.Color.black);
        jButton2.setForeground(java.awt.Color.white);
        jButton2.setText("Giris Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 509, -1, -1));

        tabloyu_bosalt_button.setBackground(java.awt.Color.darkGray);
        tabloyu_bosalt_button.setForeground(java.awt.Color.white);
        tabloyu_bosalt_button.setText("Tabloyu Boşalt");
        tabloyu_bosalt_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabloyu_bosalt_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(tabloyu_bosalt_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 336, -1, -1));

        bilgi_textarea.setEditable(false);
        bilgi_textarea.setBackground(java.awt.Color.gray);
        bilgi_textarea.setColumns(20);
        bilgi_textarea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bilgi_textarea.setRows(5);
        bilgi_textarea.setText("Kullanici tablosundaki ID lerden birini seçerek kullaniciyi silebilir ayrıca textlere gireceginiz\nusername ve password ile kullaniciyi güncelleyebilirsiniz.");
        jScrollPane3.setViewportView(bilgi_textarea);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 368, 548, 128));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Kullanici Tablosu");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 57, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Uçuş Tablosu");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 57, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/adminPanel2.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -3, 830, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_boyut_comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_boyut_comboBoxActionPerformed
        
        
    }//GEN-LAST:event_id_boyut_comboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       String idx = (String) id_boyut_comboBox.getSelectedItem();
       islemler.kullaniciSil(idx);
       // Kullanıcı Tablosu*****************************************************
       model.setRowCount(0);
       int idSayac = 0;
       int sayac = 0;
       int stopsayac = 0;
       arrayList = islemler.kullanicilariGetir();
       int boyut = arrayList.size();
       int stop = boyut / 3;
       while (true)
        {
            if(arrayList.isEmpty()) break;
            String id = null;
            String username;
            String password;
            if (idSayac % 2 == 0)
            {
                id = arrayList.get(sayac);
                sayac++;
                username = arrayList.get(sayac);
                sayac++;
                password = arrayList.get(sayac);
                sayac++;
                
            }
            else
            {
                id = arrayList.get(sayac);
                sayac++;
                username = arrayList.get(sayac);
                sayac++;
                password = arrayList.get(sayac);
                sayac++;
            }
            Object[] ekle = {id,username,password};
            model.addRow(ekle);
            stopsayac++;
            if(stopsayac == stop)
            {
                id_boyut_comboBox.removeAllItems();
                ArrayList<Integer> arrayListBoyut = new ArrayList<Integer>();
                arrayListBoyut = islemler.idBoyutAlma();
                int idboyut = arrayListBoyut.size();
                for(int i = 0; i<idboyut; i++)
                {
                    id_boyut_comboBox.addItem(String.valueOf(arrayListBoyut.get(i)));
                }
                break;
            }
            idSayac++;
        }
       // Ucus Tablosu*****************************************************
        model2.setRowCount(0);
        int sayac2 = 0;
        int stopsayac2 = 0;
        arrayList2 = islemler.rezervasyonlariGetir();
        int boyut2 = arrayList2.size();
        int stop2 = boyut2 / 5;
        while(true)
        {
            if(arrayList2.isEmpty()) break;
            String no = arrayList2.get(sayac2);
            sayac2++;
            String ucus = arrayList2.get(sayac2);
            sayac2++;
            String bilet = arrayList2.get(sayac2);
            sayac2++;
            String yer = arrayList2.get(sayac2);
            sayac2++;
            String yon = arrayList2.get(sayac2);
            sayac2++;
            Object[] ekle = {no,ucus,bilet,yer,yon};
         
            model2.addRow(ekle);
            stopsayac2++;
            if(stopsayac2 == stop2)
            {
                break;
            }
        }
        if(arrayList.isEmpty())
        {
            id_boyut_comboBox.removeAllItems();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void kullaniciyi_guncelle_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciyi_guncelle_textFieldActionPerformed
        
        
        String idx = (String) id_boyut_comboBox.getSelectedItem();
        if(id_boyut_comboBox.getItemCount() > 0)
        {
            String usernames = username_guncelle_textField.getText();
            String passwords = password_guncelle_textField.getText();
            if(usernames.equals("") || passwords.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "username ya da password boş bırakılamaz!!");
                return;
            }
            islemler.kullaniciGuncelle(idx,usernames,passwords);
            // Kullanıcı Tablosu*****************************************************
            model.setRowCount(0);
            int idSayac = 0;
            int sayac = 0;
            int stopsayac = 0;
            arrayList = islemler.kullanicilariGetir();
            int boyut = arrayList.size();
            int stop = boyut / 3;
            while (true)
             {

                 String id = null;
                 String username;
                 String password;
                 if (idSayac % 2 == 0)
                 {
                     id = arrayList.get(sayac);
                     sayac++;
                     username = arrayList.get(sayac);
                     sayac++;
                     password = arrayList.get(sayac);
                     sayac++;

                 }
                 else
                 {
                     id = arrayList.get(sayac);
                     sayac++;
                     username = arrayList.get(sayac);
                     sayac++;
                     password = arrayList.get(sayac);
                     sayac++;
                 }
                 Object[] ekle = {id,username,password};
                 model.addRow(ekle);
                 stopsayac++;
                 if(stopsayac == stop)
                 {
                     id_boyut_comboBox.removeAllItems();
                     ArrayList<Integer> arrayListBoyut = new ArrayList<Integer>();
                     arrayListBoyut = islemler.idBoyutAlma();
                     int idboyut = arrayListBoyut.size();
                     for(int i = 0; i<idboyut; i++)
                     {
                         id_boyut_comboBox.addItem(String.valueOf(arrayListBoyut.get(i)));
                     }
                     break;
                 }
                 idSayac++;
             }
        }
        
        username_guncelle_textField.setText("");
        password_guncelle_textField.setText("");
    }//GEN-LAST:event_kullaniciyi_guncelle_textFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Giris giris = new Giris();
        giris.setVisible(true);
        setVisible(false);
        giris.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void WindowsOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_WindowsOpened
       model.setRowCount(0);
       int idSayac = 0;
       int sayac = 0;
       int stopsayac = 0;
       arrayList = islemler.kullanicilariGetir();
       int boyut = arrayList.size();
       int stop = boyut / 3;
       while (true)
        {
            if(arrayList.isEmpty()) break;
            String id = null;
            String username;
            String password;
            if (idSayac % 2 == 0)
            {
                id = arrayList.get(sayac);
                sayac++;
                username = arrayList.get(sayac);
                sayac++;
                password = arrayList.get(sayac);
                sayac++;
                
            }
            else
            {
                id = arrayList.get(sayac);
                sayac++;
                username = arrayList.get(sayac);
                sayac++;
                password = arrayList.get(sayac);
                sayac++;
            }
            Object[] ekle = {id,username,password};
            model.addRow(ekle);
            stopsayac++;
            if(stopsayac == stop)
            {
                id_boyut_comboBox.removeAllItems();
                ArrayList<Integer> arrayListBoyut = new ArrayList<Integer>();
                arrayListBoyut = islemler.idBoyutAlma();
                int idboyut = arrayListBoyut.size();
                for(int i = 0; i<idboyut; i++)
                {
                    id_boyut_comboBox.addItem(String.valueOf(arrayListBoyut.get(i)));
                }
                break;
            }
            idSayac++;
        }
       // Ucus Tablosu*****************************************************
        model2.setRowCount(0);
        int sayac2 = 0;
        int stopsayac2 = 0;
        arrayList2 = islemler.rezervasyonlariGetir();
        int boyut2 = arrayList2.size();
        int stop2 = boyut2 / 5;
        while(true)
        {
            if(arrayList2.isEmpty()) break;
            String no = arrayList2.get(sayac2);
            sayac2++;
            String ucus = arrayList2.get(sayac2);
            sayac2++;
            String bilet = arrayList2.get(sayac2);
            sayac2++;
            String yer = arrayList2.get(sayac2);
            sayac2++;
            String yon = arrayList2.get(sayac2);
            sayac2++;
            Object[] ekle = {no,ucus,bilet,yer,yon};
         
            model2.addRow(ekle);
            stopsayac2++;
            if(stopsayac2 == stop2)
            {
                break;
            }
            
        }
        
    }//GEN-LAST:event_WindowsOpened

    private void tabloyu_bosalt_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabloyu_bosalt_buttonActionPerformed
        islemler.tabloBosalt();
        model2.setRowCount(0);
        int sayac2 = 0;
        int stopsayac2 = 0;
        arrayList2 = islemler.rezervasyonlariGetir();
        int boyut2 = arrayList2.size();
        int stop2 = boyut2 / 5;
        while(true)
        {
            if(arrayList2.isEmpty()) break;
            String no = arrayList2.get(sayac2);
            sayac2++;
            String ucus = arrayList2.get(sayac2);
            sayac2++;
            String bilet = arrayList2.get(sayac2);
            sayac2++;
            String yer = arrayList2.get(sayac2);
            sayac2++;
            String yon = arrayList2.get(sayac2);
            sayac2++;
            Object[] ekle = {no,ucus,bilet,yer,yon};
         
            model2.addRow(ekle);
            stopsayac2++;
            if(stopsayac2 == stop2)
            {
                break;
            }
            
        }
    }//GEN-LAST:event_tabloyu_bosalt_buttonActionPerformed
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea bilgi_textarea;
    private javax.swing.JComboBox<String> id_boyut_comboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton kullaniciyi_guncelle_textField;
    private javax.swing.JTable musteri_tablosu_table;
    private javax.swing.JTextField password_guncelle_textField;
    private javax.swing.JTable rezervasyon_tablosu_table;
    private javax.swing.JButton tabloyu_bosalt_button;
    private javax.swing.JTextField username_guncelle_textField;
    // End of variables declaration//GEN-END:variables
}
