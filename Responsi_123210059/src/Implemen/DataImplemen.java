/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Implemen;

import java.util.List;
import Model.*;
/**
 *
 * @author PC PRAKTIKUM
 */
public interface DataImplemen {
    public void insert(dtperpus t);
    public void update(dtperpus u);
    public void delete(dtperpus h);
    public List<dtperpus> getAll();
}
