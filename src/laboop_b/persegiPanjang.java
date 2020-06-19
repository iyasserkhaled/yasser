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
public class persegiPanjang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             double r,p,l,luas,keliling;
       System.out.println("Panjang = ");
       p =  new Scanner (System.in).nextDouble();
       System.out.println("lebar = ");
       l = new Scanner (System.in).nextDouble();
       luas = p*l;
       keliling = 2*(p+l);
       DecimalFormat df = new DecimalFormat("#.##");
       System.out.println("hasilnya = -------------");
             System.out.println("luas = " + luas);
             System.out.println("keliling =" + keliling);
    }
    
}
