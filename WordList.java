/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathstime;

/**
 *
 * @author alesyakochenko
 */
public class WordList {
    public static void main(String[] args) { 
    java.util.Scanner kb = new java.util.Scanner(System.in);
    String[] words = new String [10];
    
    for ( int i = 0; i < 10; i++) {
        words[i] = kb.nextLine();
    }
    
    
    for ( int j = 0; j < 10; j++) {
        System.out.println(words[j]);
    }
    
    
    
    }
}