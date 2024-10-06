/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathstime;

/**
 *
 * @author alesyakochenko
 */
public class LetterGrade {
        public static void main(String[] args) { 
        java.util.Scanner kb = new java.util.Scanner(System.in);
        
        System.out.print("Enter a Numerical Grade --> ");
        int grade = kb.nextInt();
        
        if (grade>=97) {
            System.out.print("Letter Grade = A+");
        }
        
        else if ((grade>=94)&&(grade<=96)){
            System.out.print("Letter Grade = A");
        }
        
        else if ((grade>=90)&&(grade<=93)){
            System.out.print("Letter Grade = A-");
        }
        
        else if ((grade>=87)&&(grade<=89)){
            System.out.print("Letter Grade = B+");
        }
        
        else if ((grade>=84)&&(grade<=86)){
            System.out.print("Letter Grade = B");
        }
        
        else if ((grade>=80)&&(grade<=83)){
            System.out.print("Letter Grade = B-");
        }
        
        else if ((grade>=77)&&(grade<=79)){
            System.out.print("Letter Grade = C+");
        }
        
        else if ((grade>=74)&&(grade<=76)){
            System.out.print("Letter Grade = C");
        }
        
        else if ((grade>=70)&&(grade<=73)){
            System.out.print("Letter Grade = C-");
        }
        
        else {System.out.print("Letter Grade = F");
        }
    
    }
}
