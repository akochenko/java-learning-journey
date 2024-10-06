/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathstime;

/**
 *
 * @author alesyakochenko
 */
public class Triathlon {
    public static void main(String[] args) { 
      
        java.util.Scanner kb = new java.util.Scanner(System.in);
        
        
        System.out.print("Enter swimming points: ");
        
        int swim = kb.nextInt();
        
        System.out.print("Enter cycling points: ");
        int cycle = kb.nextInt();
        System.out.print("Enter running points: ");
        int run = kb.nextInt();
        
        int total = swim + cycle + run;
        System.out.println("Swim, cycle, run total: " + total);
          
           
    
    
    
    }
    
}
