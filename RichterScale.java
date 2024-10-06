/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathstime;

/**
 *
 * @author alesyakochenko
 */
public class RichterScale {
    public static void main(String[] args) { 
    java.util.Scanner kb = new java.util.Scanner(System.in);
    System.out.print("Enter a magnitude on the Richter scale ==>> ");
    double magnitude = kb.nextDouble();
    
    if (magnitude > 0.0) {
    
        if (magnitude > 8.0) {
            System.out.println("Damage = Most structures fall");
        }
    
        else if ((magnitude > 7.0) && (magnitude < 8.0)) {
            System.out.println("Damage = Many buildings destroyed");
        }
        
        else if ((magnitude > 6.0) && (magnitude < 7.0))  {
            System.out.println("Damage = Many buildings considerably damaged; some collapse");
        }
        
        else if ((magnitude > 4.5) && (magnitude < 6.0))  {
            System.out.println("Damage = Damage to poorly constructed buildings");
        }
        
        else if ((magnitude > 3.5) && (magnitude < 4.5))  {
            System.out.println("Damage = Felt by many people, no destruction");
        }
        
        else {System.out.println("Damage = Generally not felt by people");
        }
        
    
    }
    
    else {
        System.out.println("This number is not valid");
        }
    }
}  

