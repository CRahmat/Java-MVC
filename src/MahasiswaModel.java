
import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Catur Rahmat
 */
public class MahasiswaModel {
    private Connection connection;
    private String nama;
    private String alamat;
    private String nim;
    public MahasiswaModel(){
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
        public void create(String nim, String nama, String alamat){
      try{
          String query = "INSERT INTO mahasiswa VALUES"
                  + " ('"+nim+"','"+nama+"','"+alamat+"')";
          //String '"+string+"', kalau int "+int+"
          Statement statement = DatabaseConnection.getConnection().createStatement();
          statement.executeUpdate(query); //excecute query nya
          System.out.println("Berhasil Ditambahkan");
          
      }catch(Exception sql){
          System.out.println(sql.getMessage());
          JOptionPane.showMessageDialog(null, sql.getMessage());
      }
  }
    public int getCount(){
     int count = 0;
      try{
          String query = "SELECT count(*) as count FROM mahasiswa";
          Statement statement = DatabaseConnection.getConnection().createStatement();
          ResultSet result = statement.executeQuery(query);
          if(result.next()){
              count = result.getInt("Count");
          }
          
      }catch(Exception sql){
          System.out.println(sql.getMessage());
      }
        return count;
  }
        public String[][] findAll(){
            String[][] data = new String[this.getCount()][3];
            try{
          String query = "SELECT * FROM mahasiswa";
          //String '"+string+"', kalau int "+int+"
          Statement statement = DatabaseConnection.getConnection().createStatement();
          ResultSet result = statement.executeQuery(query); //excecute query nya
          int i = 0;
          while(result.next()){
              data[i][0] = result.getString("Nim");
              data[i][1] = result.getString("Nama");
              data[i][2] = result.getString("Alamat");
              System.out.println(data[i][0]);
              i++;
          }
          
      }catch(Exception sql){
          System.out.println(sql.getMessage());
          JOptionPane.showMessageDialog(null, sql.getMessage());
      }
            return data;
        }
        
}
