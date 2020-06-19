/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboop_b;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author YASSER
 */
public class persegi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double s,luas,keliling;
       System.out.println("------- Jari-Jari ---------");
       s =  new Scanner (System.in).nextDouble();
       luas = s*s;
       keliling = 4*s;
       DecimalFormat df = new DecimalFormat("#.##");
       System.out.println("hasilnya = -------------");
             System.out.println("luas = " + luas);
             System.out.println("keliling =" + keliling);
             
    }
    
}
