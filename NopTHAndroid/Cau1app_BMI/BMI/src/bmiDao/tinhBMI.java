/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmiDao;

/**
 *
 * @author
 */
public class tinhBMI {
    
     public Double tinhBMIs(Double chieuCao, Double canNang) {
          return chieuCao <= 0 ? -9999999 :canNang/(chieuCao*chieuCao);
     }
    
}
