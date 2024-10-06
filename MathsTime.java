/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathstime;




/**
 *
 * @author alesyakochenko
 */
public class MathsTime {
    
    public static void main(String[] args) { 
        java.util.Scanner kb = new java.util.Scanner(System.in);
        
        System.out.print("Enter side 1 -->");   // prompt
        int a = kb.nextInt();                 // read a's length
        System.out.print("Enter side 2 -->");   // prompt
        int b = kb.nextInt();                 // read b's length

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        
        System.out.println();
        System.out.println("The hypotenuse of the triangle = " + Math.round(c));

                
                
                
                
    }  
}
