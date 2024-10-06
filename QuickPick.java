/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathstime;

import java.util.Random;

/**
 *
 * @author alesyakochenko
 */
public class QuickPick {
    public static void main(String[] args) { 
        
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Texas Lottery - Quick Pick");
        System.out.println("==========================");
        
        Random random = new Random();
        for (int i = 0; i<6; i++) {
            int a = random.nextInt(50) + 1;
        System.out.print(a + " ");
            
        }
        
        
    }
}
