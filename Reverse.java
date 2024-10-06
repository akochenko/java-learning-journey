/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathstime;

/**
 *
 * @author alesyakochenko
 */
public class Reverse {
    public static void main(String[] args) { 
    java.util.Scanner kb = new java.util.Scanner(System.in);
    int [] nums = new int [20];
    for (int i = 0; i < 20; i++) {
        System.out.print("Num " + (i + 1) + " --> ");
        nums[i] = kb.nextInt();
        
    }
    
    for (int num:nums) {
        System.out.print(num + " ");
    }
        
    System.out.println("\n");
    
    for (int j = 19; j > -1; j--) {
        System.out.print(nums[j] + " ");
    }
    }
}
