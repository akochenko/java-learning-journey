
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alesyakochenko
 */
public class ElvesCalibration {
    public static void main (String args[]) throws FileNotFoundException, IOException {
        
        BufferedReader reader = new BufferedReader(new FileReader ("/Users/alesyakochenko/NetBeansProjects/JavaApplication5/src/javaapplication5/data.txt"));
        List<Integer> f = new ArrayList<>();
        int sum = 0;
        while (reader.ready()) {
            String line = reader.readLine();
            char[] chars = line.toCharArray();
            List<Integer> digits = new ArrayList<>();
            
            
            for (int n = 0; n < chars.length; n++) {
                if (Character.isDigit(chars[n])) {
                    digits.add(Integer.parseInt((chars[n] + "")));
                }   
            }
            if (!digits.isEmpty()) {
                
                String x = digits.get(0) + "" + digits.get(digits.size() - 1);
                int y = Integer.parseInt(x);
                f.add(y);
               
                
                 System.out.println(digits.get(0) + "" + digits.get(digits.size() - 1) + " ");
            
                    
          
        }
            
        
        
        
        
    }
        for (int m = 0; m < f.size() - 1; m ++){
            sum = sum + f.get(m);
        }
        System.out.println("The sum is: " + sum);
                    
       reader.close();                 
            
            
    }
}
        
        
        
    
