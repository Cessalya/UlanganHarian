/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Soal6;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Soal6 {
    public static void main(String[] args) {
         
      int k;
      String hasil = "";
      k = 0;
      int arr[] = {6, -4, 2, 6, 1};
      
      
      for(int i = 0; i<arr.length; i++){
          for(int j = 1; j < arr.length-1; j++){
              if(arr[i] + arr[j] == k){
                  hasil = "BISA";
              }else if(arr[i] + arr[j] != k){
                  if(hasil == "BISA"){
                      hasil = "BISA";
                  }else{
                      hasil = "TIDAK BISA";
                  }
              }
          }
      }
      System.out.println(hasil);
    }
    
}