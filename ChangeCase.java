/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathstime;
import java.util.*;

/**
 *
 * @author alesyakochenko
 */
public class ChangeCase {

    // instance variables
    private String[] words = new String[50];  // array's physical size
    private int size = 0;                     // array's logical size
    private Scanner keyboard = new Scanner(System.in);
/* Reads strings input from the keyboard and stores them in the array words.
     * Input continues until the user types "stop".
     * The logical size of the array is incremented each time a new string
     *    is added to the array.
     */
    public void readWords()
    {
    String str = keyboard.nextLine();
    while (!str.equals("stop")) {
        words[size] = str;         // size = logical size of the array
        size++;
        str = keyboard.nextLine();
    }
        
}
/* Prints each word in the array three times. Once in its original form,
     * once in all capital letters, and once in all lowercase letters.
     */
    public void printWords()
    {
        for (String word:words){
            if (word != null) {
                System.out.print(word + " ");
                System.out.print(word.toUpperCase() + " ");
                System.out.println(word.toLowerCase() + " ");
        }}
        
}
public static void main(String[] args)
    {
        ChangeCase app = new ChangeCase();
        System.out.print("Enter words (type 'stop' to quit): ");
        app.readWords();
        app.printWords();
    }
}

