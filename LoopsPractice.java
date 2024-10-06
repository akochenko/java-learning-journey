/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathstime;

/**
 *
 * @author alesyakochenko
 */
public class LoopsPractice {
    public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);
        //FOR LOOPS
        //A1
        for (int i = 0; i < 26; i++) {
            System.out.print(i + " ");
        }
        
        System.out.println(" ");
        
        //A2
        for (int i = 10; i > -1; i--) {
            System.out.print(i + " ");
        }
        
        System.out.println(" ");
        
        //A3
        for (int i = 1; i < 41; i = i + 2) {
            System.out.print(i + " ");
        }
        
        System.out.println(" ");
        
        //A4
        for (int i = 2; i < 41; i = i +2) {
            System.out.print(i + " ");
        }
        
        System.out.println(" ");
        
        //A5
        for (int i = 0; i < 201; i = i + 10) {
            System.out.print(i + " ");
        }
        
        System.out.println(" ");
        
        //A6
        for (int i = -10; i > -21; i--) {
            System.out.print(i + " ");
        }
        
        System.out.println(" ");
        
        //A7
        for (int i = 0; i < 7; i++) {
            System.out.println("computer");
        }
        
        System.out.println(" ");
        
        //B1
        System.out.print("Enter a string --> ");
        String input = kb.nextLine();
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));   
        }
        
        System.out.println(" ");
        
        //WHILE LOOPS
        //A
        int j = 0;
        while (j < 26) {
            System.out.print(j + " ");
            j++;
        }
        
        System.out.println(" ");
        
        j = 50;
        while (j < 71) {
            System.out.print(j + " ");
            j++;
        }
        
        System.out.println(" ");
        
        j = 0;
        while (j < 101) {
            System.out.print(j + " ");
            j += 5;
        }
        
        System.out.println(" ");
        
        j = 20;
        while (j > 0) {
            System.out.print(j + " ");
            j--;
        }
        
        System.out.println(" ");
        
        j = 0;
        while (j < 15) {
            System.out.println("computer");
            j++;
        }
        
        //B
      
        String string = "";
        int count = -1;
        
        System.out.println("Enter words, type (stop or exit) to stop: ");
        while (!string.equals("stop") && !string.equals("exit")) {
            string = kb.nextLine();
            count++;
            
        }
        System.out.println("You entered " + count + " words.");
        
        
       //C
       
       
    }
}