
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class İslemler {
;
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    public ArrayList rezervasyonlariGetir()
    {
        ArrayList<String> arrayList2 = new ArrayList<String>();
        String sorgu = "Select * From musteri_rezervasyonlari";
        try {
            preparedStatement =  (PreparedStatement) con.prepareStatement(sorgu);
            
            ResultSet rs = preparedStatement.executeQuery(sorgu);
            
            while(rs.next())
            {
                int no = rs.getInt("no");
                String ucus = rs.getString("ucus");
                String bilet = rs.getString("bilet");
                String yer = rs.getString("yer");
                String yon = rs.getString("yon");
                
                arrayList2.add(String.valueOf(no));
                arrayList2.add(ucus);
                arrayList2.add(bilet);
                arrayList2.add(yer);
                arrayList2.add(yon);
            }
            return arrayList2;
            
        } catch (SQLException ex) {
            Logger.getLogger(İslemler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList<Integer> idBoyutAlma()
    {
        ArrayList<Integer> arrayListBoyut = new ArrayList<Integer>();
        String sorgu = "Select * From musteri_tablosu";
        try {
            preparedStatement =  (PreparedStatement) con.prepareStatement(sorgu);
            ResultSet rs = preparedStatement.executeQuery(sorgu);
            
            while(rs.next())
            {
                int id = rs.getInt("id");
                arrayListBoyut.add(id);
            }
            return arrayListBoyut;
            
        } catch (SQLException ex) {
            Logger.getLogger(İslemler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    public int rezervasyonEkle(String no, String bilet, String yer, String yon)
    {
        String sorgu = "INSERT INTO musteri_rezervasyonlari (ucus, bilet, yer, yon) VALUES (?, ?, ?, ?)";
        try {
            preparedStatement = (PreparedStatement) con.prepareStatement(sorgu);
            preparedStatement.setString(1, no);
            preparedStatement.setString(2, bilet);
            preparedStatement.setString(3, yer);
            preparedStatement.setString(4, yon);
  
            preparedStatement.executeUpdate();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(İslemler.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    public void kullaniciGuncelle(String id, String username, String password)
    {
        String sorgu = "UPDATE musteri_tablosu set username = ?, password = ? where id = ?";
        try { 
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sorgu);
            statement.setString(1, username);
            statement.setString(2, password);
            statement.setString(3, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(İslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void tabloBosalt(){
        String sorgu = "Delete from musteri_rezervasyonlari";
        try {
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sorgu);
            statement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(İslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void kullaniciSil(String id)
    {
        
        String sorgu = "Delete from musteri_tablosu where id = ?";
        String sorgu2 = "Delete from musteri_rezervasyonlari where no = ?";
        
        try {
            PreparedStatement statement = (PreparedStatement) con.prepareStatement(sorgu);
            PreparedStatement statement2 = (PreparedStatement) con.prepareStatement(sorgu2);
            statement.setString(1, id);
            statement2.setString(1, id);
            statement.executeUpdate();
            statement2.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(İslemler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean admin_girisYap(String kullanici_adi, String sifre)
    {
        
            String sorgu = "Select * From admin_tablosu where username = ? and password = ?";
            try {
            preparedStatement =  (PreparedStatement) con.prepareStatement(sorgu);
            preparedStatement.setString(1, kullanici_adi);
            preparedStatement.setString(2, sifre);
            
            ResultSet rs = preparedStatement.executeQuery();
            return rs.next();
            } catch (SQLException ex) {
                Logger.getLogger(İslemler.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }

    }
    
    public boolean girisYap(String kullanici_adi, String sifre)
    {
        
            String sorgu = "Select * From musteri_tablosu where username = ? and password = ?";
            try {
            preparedStatement =  (PreparedStatement) con.prepareStatement(sorgu);
            preparedStatement.setString(1, kullanici_adi);
            preparedStatement.setString(2, sifre);
            
            ResultSet rs = preparedStatement.executeQuery();
            return rs.next();
            } catch (SQLException ex) {
                Logger.getLogger(İslemler.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }

    }
    public ArrayList kullanicilariGetir()
    {
        
        ArrayList<String> arrayList = new ArrayList<String>();
        String sorgu = "Select * From musteri_tablosu";
        try {
            preparedStatement =  (PreparedStatement) con.prepareStatement(sorgu);
            
            ResultSet rs = preparedStatement.executeQuery(sorgu);
            
            while(rs.next())
            {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                
                arrayList.add(String.valueOf(id));
                arrayList.add(username);
                arrayList.add(password);
                
            }
            return arrayList;
            
        } catch (SQLException ex) {
            Logger.getLogger(İslemler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    public int kayitOl(String kullanici_adi)
    {
        String sorguu = "Select * From musteri_tablosu";
        try {
            preparedStatement =  (PreparedStatement) con.prepareStatement(sorguu);
            ResultSet rs = preparedStatement.executeQuery(sorguu);
            
            while(rs.next())
            {
                String username = rs.getString("username");
                if(username.equals(kullanici_adi))
                {
                    return -2;
                }
            }
            
        } catch (Exception e) {
            
        }
        return 1;
        
    }
    public int kayitOl(String kullanici_adi, String sifre)
    {
        
        String sorguu = "Select * From musteri_tablosu";
        try {
            preparedStatement =  (PreparedStatement) con.prepareStatement(sorguu);
            ResultSet rs = preparedStatement.executeQuery(sorguu);
            
            while(rs.next())
            {
                String username = rs.getString("username");
                if(username.equals(kullanici_adi))
                {
                    return -2;
                }
            }
            
        } catch (Exception e) {
            
        }
        
        if("".equals(kullanici_adi))
        {
            return -1;
        }
        else if("".equals(sifre))
        {
            return -1;
        }
        Musteri musteri = new Musteri(kullanici_adi,sifre);
        musteri.musteriler.add(kullanici_adi);
        String sorgu = "INSERT INTO musteri_tablosu (username, password) VALUES (?, ?)";
        try {
            preparedStatement = (PreparedStatement) con.prepareStatement(sorgu);
            preparedStatement.setString(1, kullanici_adi);
            preparedStatement.setString(2, sifre);
  
            preparedStatement.executeUpdate();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(İslemler.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    public İslemler()
    {
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" +Database.db_isim + "?useUnicode=true&characterEncoding=utf8"; 
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
        } 
        catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadi");
        }
        
        try{
            con = (Connection) DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
            
        }
        catch(SQLException ex){
            System.out.println("baglanti basarisiz");
        }
    }

    private Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
