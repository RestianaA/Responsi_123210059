/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOdatacust;
import java.sql.*;
import Koneksi.Connector;
import View.*;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import Implemen.DataImplemen;
import Model.*;
import java.util.List;

/**
 *
 * @author PC PRAKTIKUM
 */
public class DatacustDAO implements DataImplemen{

    Connection connection;
    
    final String insert = "INSERT INTO dataperpus (judul, genre, penulis, penerbit, lokasi, stock) VALUES (?,?,?,?,?,?);";
    final String update = "UPDATE dataperpus SET judul=?, genre=?, penulis=?, penerbit=?, lokasi=?, stock=? WHERE id=?;";
    final String delete = "DELET FROM dataperpus WHERE id=?;";
    
    public DatacustDAO (){
        connection = Connector.connection();
    }
    
    
    @Override
    public void insert(dtperpus t) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, t.get);
        }catch(){}finally{}
    }

    @Override
    public void update(dtperpus u) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(dtperpus h) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<dtperpus> getAll() {
        List<dtperpus> dp = null;
        try{
        }catch(){}finally{}
    }
    
}
