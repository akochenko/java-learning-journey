/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathstime;

/**
 *
 * @author alesyakochenko
 */
public class LottoTicket {
    public static void main(String[] args) { 
    java.util.Scanner kb = new java.util.Scanner(System.in);
    final double price = 1.00;
    int i = 1;
    String [] numbers = {"first", "second", "third", "fourth", "fifth"};
    int [] values = new int [5];
    
    System.out.println("Welcome to Lotto Ticket App");
    System.out.println("============================");
    
    System.out.print("Please enter your age: ");
    int age = kb.nextInt();
    
    if (age < 16) {System.out.println("Sorry you are not old enough to buy a lotto ticket.");
        
    }
    
    else {
        System.out.print("How many tickets would you like to buy? ");
        int tickets = kb.nextInt();
        
        for (int j = tickets; j > 0; j--) {
            System.out.println(" ");
            System.out.println("Ticket number " + i);
            
           /* 
            
            
            System.out.println("Ticket confirmation");
            System.out.println("-------------------");
            System.out.println("Numbers picked: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);
    
             */
            
           for (int k = 0; k < 5; k++) {
               System.out.print("Pick your " + numbers[k] + " number: ");
               int number = kb.nextInt();
               values[k] = number;
        
            }
           
            System.out.println("\n"
                    + "Ticket confirmation");
            System.out.println("-------------------");
            System.out.println("Numbers picked: "); 
           
            for (int num:values) {
               System.out.print(num + " ");
               
               
           }
           i = i + 1;
        }
        
        
        
        double totalPrice = price * tickets;
        System.out.println("Total price: $" + totalPrice);
        System.out.println("Good luck!");
    }
} 
}