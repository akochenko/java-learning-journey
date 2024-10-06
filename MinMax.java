/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathstime;

/**
 *
 * @author alesyakochenko
 */
public class MinMax {
    public static void main(String[] args) { 
        java.util.Scanner kb = new java.util.Scanner(System.in);
        
        System.out.print("Enter first integer --> ");
        int a = kb.nextInt();
        System.out.print("Enter second integer --> ");
        int b = kb.nextInt();
        System.out.print("Enter third integer --> ");
        int c = kb.nextInt();
        
        int maximum = Math.max(a, b);
        maximum = Math.max(maximum, c) ;
        int minimum = Math.min(a, b);
        minimum = Math.min(minimum, c);
        
        System.out.println("Smallest = " + minimum);
        System.out.println("Largest = " + maximum);
        
    }

    
}
