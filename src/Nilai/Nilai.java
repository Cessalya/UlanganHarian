/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nilai;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Nilai {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int bil;
        int a = 0;
        int sum = 0;
        int i = a;
        
        System.out.println("MENGHITUNG TOTAL PENJUMLAHAN DARI ANGKA 1-N");
        System.out.println("===========================================\n ");
        System.out.print("Masukan Bilangan    : ");
        bil = input.nextInt();
        
         while (i <= bil) {
           sum = sum + i;
           i++;
          }
         System.out.println("====================> " + sum);   
    }
}
    
    
