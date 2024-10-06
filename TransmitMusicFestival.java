/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathstime;

/**
 *
 * @author alesyakochenko
 */
public class TransmitMusicFestival {
        public static void main(String[] args) { 
        java.util.Scanner kb = new java.util.Scanner(System.in);
        final double price1 = 62.50;
        final double price2 = 119.50;
        final double price3 = 165.00;
        
        System.out.println("Transmit Music Festival");
        System.out.println("=======================");
        
        
        System.out.println("Ticket price options: \n1 day ticket > $62.50 \n2 day ticket > $119.50 \n3 day ticket > $165.00");
        
        System.out.print("Full name: ");
        String name = kb.nextLine();
        
        System.out.print("Age: ");
        int age = kb.nextInt();
        
        if (age < 12) {
            System.out.println("Error: you are too young.");
        }
        
        else {
        
        System.out.print("Number 1 day tickets: ");
        int num1 = kb.nextInt();
        
        System.out.print("Number 2 day tickets: ");
        int num2 = kb.nextInt();
        
        System.out.print("Number 3 day tickets: ");
        int num3 = kb.nextInt();
        
        double totalCost = num1 * price1 + num2 * price2 + num3 * price3;
        
        System.out.println("Ticket confirmation");
         
        System.out.println("Full name: " + name);       
        System.out.println("Number 1 day tickets: " + num1);        
        System.out.println("Number 2 day tickets: " + num2);    
        System.out.println("Number 3 day tickets: " + num3);       
        System.out.println("Total cost: $" + totalCost);
    
    
        }
    }
}