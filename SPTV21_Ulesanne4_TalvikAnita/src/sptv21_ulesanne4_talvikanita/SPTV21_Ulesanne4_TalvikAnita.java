/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21_ulesanne4_talvikanita;

import java.util.Arrays;

/**
 *
 * @author Анита
 */
public class SPTV21_Ulesanne4_TalvikAnita {

    public static void main(String[] args) {
        int sum = 0;
            int[] number = new int[100];
            for(int i = 0; i < number.length; i++){
            while(true){
                int random = (int)Math.round(Math.random() * 100);
                if(random%2 != 0){
                    number[i] = random;
                    sum += random;
                    break;
                    }}}
        Arrays.sort(number);
        for (int s = 0; s < 10; s++){
            for (int v =0; v < 10; v++){
                System.out.print(number[s * 10 + v]+" ");
            }System.out.print("\n");
        }System.out.println("Среднее " + sum/100);
      }
    }
    

