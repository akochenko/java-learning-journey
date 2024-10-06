/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alesyakochenko
 */
public class BusStops {
    public static void main(String[] args) {
        String town = "";
        java.util.Scanner kb = new java.util.Scanner(System.in);
        
        String [][] busStops = {{"GL", "Glouster"}, {"CH", "Cheltenham"}, {"ST", "Stroud"}, {"CI", "Cirencester"}, {"HA", "Hatherley"}};
        
        System.out.println("Enter a bus stop code: ");
        String busStop = kb.nextLine();
        
        
        for (int n = 0; n < busStops.length; n++) {
            if (busStops[n][0].equals(busStop)) {
                town = busStops[n][1];
            }
        }
        
        System.out.println("The town is " + town);
    }
    
}
