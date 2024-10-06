/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathstime;

/**
 *
 * @author alesyakochenko
 */
public class CinemaWorld {
    public static void main(String[] args) { 
        
       
        java.util.Scanner kb = new java.util.Scanner(System.in);
        final int priceTickets = 5;
        final int priceDrinks = 2;
        
        
        System.out.print("Full name: ");
        String name = kb.nextLine();
        
        System.out.print("Film name: ");
        String film = kb.nextLine();
        
        System.out.print("Number of tickets: ");
        int tickets = kb.nextInt();
        
        System.out.print("Number of drinks: ");
        int drinks = kb.nextInt();
        
        int totalCost = (priceTickets * tickets) + (priceDrinks * drinks);
     
        
        System.out.println("CINEMA WORLD");
        System.out.println("============");
        System.out.println("Ticket confirmation");
        
        System.out.println("Full name: " + name);
        
        System.out.println("Flm name: " + film);
        
        System.out.println("Number of tickets " + tickets);
        
        System.out.println("Number of drinks " + drinks);
        
        System.out.println("The total cost is: $" + totalCost);
     
        
        
        
    }
}