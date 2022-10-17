/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomb;
import java.util.Scanner;
/**
 *
 * @author user10
 */
public class Gomb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a gömbsugár");
        double sugar = Double.parseDouble(sc.nextLine());
        gomboszt g = new gomboszt(sugar);
        System.out.println("Ennyi a göb felszíne: " + g.felszin());
    }
    
}
