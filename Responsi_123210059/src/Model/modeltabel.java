/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Koneksi.Connector;
import View.*;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author PC PRAKTIKUM
 */
public class modeltabel extends AbstractTableModel{

        List<dtperpus> dp;
        
        public modeltabel(List<dtperpus>dp){
            this.dp = dp;
        }
        
        @Override
        public int getRowCount() {
            return dp.size();
        }

        @Override
        public int getColumnCount() {
            return 8;
        }
        
        @Override
        public String getColumnName(int column) {
            switch(column){
                case 0:
                    return "ID";
                case 1:
                    return "JUDUL BUKU";
                case 2:
                    return "GENRE BUKU";
                case 3:
                    return "PENULIS BUKU";
                case 4:
                    return "PENERBIT BUKU";
                case 5:
                    return "LOKASI BUKU";    
                case 6:
                    return "STOCK BUKU";
                default:
                    return null;
            }
        }
        
        @Override
        public Object getValueAt(int row, int column) {
            switch(column){
                case 0:
                    return dp.get(row).getId();
                case 1:
                    return dp.get(row).getJudul();
                case 2:
                    return dp.get(row).getGenre();
                case 3:
                    return dp.get(row).getPenulis();
                case 4:
                    return dp.get(row).getPenerbit();
                case 5:
                    return dp.get(row).getLokasi();    
                case 6:
                    return dp.get(row).getStock();
                default:
                    return null;
            }
        }
    
    }
