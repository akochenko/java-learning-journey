/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathstime;


import java.util.*;
import java.util.Scanner;

/**
 *
 * @author alesyakochenko
 */
public class maths {
    
    public static void main(String[] args) {
 
    
    
    Scanner keyboard = new Scanner(System.in);
    
    
    System.out.print("Enter side 1 -->");   // prompt
    int a = keyboard.nextInt();                 // read a's length
    System.out.print("Enter side 2 -->");   // prompt
    int b = keyboard.nextInt();                 // read b's length
    
    int c = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

    System.out.println();
    System.out.println("The hypotenuse of the triangle = " + Math.round(c));
    } 
}
