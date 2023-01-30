/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 91730
 */
public class arrayProgram {

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);

        System.out.println ("Enter the no. of elements");
        int Num = input.nextInt();
        int Number[] = new int[Num];

        for (int i = 0; i < Num; i++) {
            System.out.println ("number" + i + ":");
            Number[i] = input.nextInt();
        }

        for (int temp : Number){
            System.out.print (temp + "\t");
        }
        
        for (int i = 0; i < Number.length; i++) {
            if (i % 2 == 0) {
            Number[i] =  Number[i]*2;
            } else {              
                Number[i] = Number[i]*3;
            }
        }

        System.out.println("array after conversion is : " + Arrays.toString(Number));
    }
}
