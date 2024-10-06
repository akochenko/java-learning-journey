/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathstime;

import static java.lang.Math.random;

/**
 *
 * @author alesyakochenko
 */
public class RandomRanges {
        public static void main(String[] args) { 
            java.util.Scanner kb = new java.util.Scanner(System.in);
            
          // Random random = new Random();
           
          /*  int a = random.nextInt(26);
            System.out.print("1. Range: 0 to 25 = " + a);
            
            int b = random.nextInt(4) + 1;
            System.out.print("2. Range: 1 to 3 = " + b);
            
            int c = random.nextInt(501) + 100;
            System.out.print("3. Range: 100 to 500 = " + c);
            
            int d = random.nextInt(0) - 10;
            System.out.print("4. Range: -10 to -1 = " + d);
            
            int e = random.nextInt(101) - 100;
            System.out.print("5. Range: -100 to 100 = " + e);
            
            int f = random.nextInt(91) + 65;
            System.out.print("6. Range: A to Z = " + (char)f);
          */  
          
                
            random(1,0,25);
            random(2, 1, 3);
            random(3, 100,500);
            random(4, -10, -1);
            random(5, -100, 100);
            
            
            
            
        }
        
    public static void random(int i, int min, int max) {
                
                int a = (int)(Math.random() * (max - min + 1)) + min;
             
                System.out.println(i + ". Range: " + min + " to " + max + " = " + a);
    }
}