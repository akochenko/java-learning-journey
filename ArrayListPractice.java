import java.util.*;      // needed for ArrayList 
 

public class ArrayListPractice 
{ 
    static Scanner keyboard = new Scanner(System.in); 
     
    public static void main(String[] args) 
    { 
       System.out.println("Method 1"); 
       System.out.println("--------"); 
       System.out.println(); 
       Method1(); 
       System.out.println(); 
       System.out.println("Method 2"); 
       System.out.println("--------"); 
       System.out.println(); 
       Method2();        
    } 
     
    public static void Method1() 
    { 
        ArrayList<Integer> list = new ArrayList<>();
        for (int n = 10; n<=100; n = n+10) {
            list.add(n);
        }
        for (int k = 0; k < list.size(); k++) {
            System.out.println(list.get(k));
        }
        for (int i : list) {
            System.out.println(i);
    }
 

} 
     
    public static void Method2() 
    { 
         ArrayList<String> list = new ArrayList<>();
         String input = "";
         while (!input.equals("exit")) {
             System.out.println("Input a string to add to the list: ");
             input = keyboard.nextLine();
             if (!input.equals("exit")) {
             list.add(input); }
         }
         for (int k = 0; k < list.size(); k++) {
            System.out.println(list.get(k));
        }
        for (String i : list) {
            System.out.println(i);
 

        }
    }
}
