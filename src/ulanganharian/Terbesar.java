/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ulanganharian;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Terbesar {
     
     
    public static void main(String[] args) {
    int bil1, bil2, bil3, terbesar;
    Scanner scan = new Scanner(System.in);
    
    System.out.println("MENENTUKAN BILANGAN TERBESAR/ MAKSIMUM");
    System.out.println("====================================== \n");
  
    System.out.print("Masukkan bilangan pertama = ");
    bil1 = scan.nextInt();
  
    System.out.print("Masukkan bilangan kedua   = ");
    bil2 = scan.nextInt();
  
    System.out.print("Masukkan bilangan ketiga  = ");
    bil3 = scan.nextInt();
  
    if(bil1 > bil2 && bil1 > bil3){
        terbesar = bil1;
    } else{
    if(bil2 > bil3){
        terbesar = bil2;
    } else{
        terbesar = bil3;
    }
    }
  
    System.out.println("\nBilangan terbesar adalah "+terbesar);
  
    }
}
