/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Implemen.DataImplemen;
import DAOdatacust.*;
import Model.*;
import View.*;
import java.util.List;
/**
 *
 * @author PC PRAKTIKUM
 */
public class Controller {
    DataImplemen impldata;
    Admin utama;
    List<dtperpus> dp;
    
    public Controller(View.Admin utama){
        this.utama = utama;
        impldata = new DatacustDAO();
        dp = impldata.getAll();
    }
}
