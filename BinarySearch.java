/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathstime;

/**
 *
 * @author alesyakochenko
 */
public class BinarySearch {
    public static void main(String[] args) { 
    java.util.Scanner kb = new java.util.Scanner(System.in);
    String [] items = {"ab", "af", "cg", "hi","jz","ma","pe","sa", "sf", "sm"};
    boolean found = false;
    int first = 0;
    int last = items.length - 1;
    int foundIndex = 0;
            
    System.out.print("Enter a value --> ");
    String find = kb.nextLine();
    
    while ((first <= last) && (found == false)) {
        int midpoint = (first + last)/2 ;
        if (items[midpoint].equals(find)) {
        found = true;
        foundIndex = midpoint;
        
        }
        else if (items[midpoint].compareTo(find) < 0) {
            first = midpoint + 1;
        }
        else {
            last = midpoint - 1;
                    }
     
    }
    if (found) {
            System.out.println("Item found at index " + foundIndex);
        } else {
            System.out.println("Item not found in the array.");
    }
    }
    
}

