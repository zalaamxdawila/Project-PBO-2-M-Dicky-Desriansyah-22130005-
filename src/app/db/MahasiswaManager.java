package app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MahasiswaManager {

    Connection conn = null;
    Statement st = null;
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/dbloka";

    public MahasiswaManager() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, "root", "");
            st = conn.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public List getMahasiswa() {
        ResultSet rs = null;
        List Mahasiswa = new ArrayList();
        try {
            rs = st.executeQuery("Select * From pembayaran");
            while (rs.next()) {
                Mahasiswa m = new Mahasiswa();
                m.setnama(rs.getString("Nama"));
                m.settanggal(rs.getString("Tanggal"));
                m.setjam(rs.getString("Jam"));
                m.setjumlahpulsa(rs.getString("Jumlah_Pulsa"));
                m.setharga(rs.getString("Harga"));
                m.setpembayaran(rs.getString("Pembayaran"));
                Mahasiswa.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Mahasiswa;
    }

    public int Insert(Mahasiswa m) {
        int result = 0;
        try {
            result = st.executeUpdate("insert into pembayaran value('"+ m.getnama() +"'  ,'"+ m.gettanggal() + "','" + m.getjam() + "','" + m.getjumlahpulsa() + "','" + m.getharga() + "','" + m.getpembayaran() + "')"); 
 } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void closeConnection() {
        try {
            conn.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
