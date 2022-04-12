/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Soal8;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Soal8 {
    public static void main(String[] args) {
         
      onst buah = [ "Durian", "Apel", "Mangga", "Jeruk", "Pepaya"];
        const penjualan = [ 10, 10, 20, 20, 10];
        let max = penjualan[0];
        let temp = 0;
        for (let i = 0; i < penjualan.length; i++) {
            if (penjualan[i] > max) {
                max = penjualan[i];
                temp = i;
            }

        }
        console.log(buah[temp]);
}
}