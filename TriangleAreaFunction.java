/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathstime;

/**
 *
 * @author alesyakochenko
 */
public class TriangleAreaFunction { 
    public static void main (String [] args) {

        System.out.println(areaRightAngledTriangle(2, 4));
        System.out.println(areaNonRightAngledTriangle(2, 4, 50));
        System.out.println(getValidNumberInput());
        System.out.println(getValidPhoneNumberInput());
        
    }

       
        public static double areaRightAngledTriangle(double base, double height) {
            return ((base * height) / 2);
        }
        
        public static double areaNonRightAngledTriangle(double base, double height, double angle) {
            return (0.5 * base * height * Math.sin(Math.toRadians(angle)));
            
        }
        
        public static double getValidNumberInput() {
            double number = 0.0;
            boolean validInput = false;
            java.util.Scanner kb = new java.util.Scanner(System.in);
            
            while (!validInput) {
                System.out.print("Enter a number:"
                        + ""
                        + "");
                if (kb.hasNextDouble()) {
                    number = kb.nextDouble();
                    validInput = true; // Input is a valid number
        }       
                else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    kb.next(); // Consume the invalid input
        }
    }

                return number;
            }
        
        
        public static boolean isValidPhoneNumber(String phoneNumber) {
         // Use a regular expression to validate the phone number
        return phoneNumber.matches("^[+\\d\\s-]+$");
}
            
        public static String getValidPhoneNumberInput() {
            String phoneNumber = "";
            boolean validInput = false;
            java.util.Scanner kb = new java.util.Scanner(System.in);

            while (!validInput) {
                System.out.print("Enter a phone number: ");
                phoneNumber = kb.nextLine();

                if (isValidPhoneNumber(phoneNumber)) {
                    validInput = true; // Input is a valid phone number
              } 
                else {
                    System.out.println("Invalid input. Please enter a valid phone number.");
        }
    }

            return phoneNumber;
}   
                
        public static String inputDate() {
            String date = "";
            boolean validInput = false;
            java.util.Scanner kb = new java.util.Scanner(System.in);
        return null;
            
            
                
            
            
            
        
        }
}


        
            
        

