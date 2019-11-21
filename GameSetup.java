/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import GameEntities.Pilot;
import GameEntities.Ship;
import java.util.Scanner;

/**
 *
 * @author charlesurban
 */
public class GameSetup extends Game{
    
    private 
    
    public static Game setupGame() {
        System.out.println("Quick! The galaxy needs your help. Luke Skywalker is missing and you must find him! If he is not found soon, the galatic empire will take over the entire galaxy.");        
        System.out.println("Please Select A Difficulty.");
        System.out.println("1. Easy");
        System.out.println("2. Normal");
        System.out.println("3. Hard");
        Scanner d = new Scanner(System.in);
        difficulty = d.nextInt();
        
        return null;        
    }
    
    public static Ship setupShip(int option) {
        System.out.println("What type of ship would you like to use? /n 1. default ship /n 2. A random ship /n 3. A custom ship?");
        Scanner type = new Scanner(System.in);
        int shipType;
        shipType = type.nextInt();
        if (shipType == 1) {
            System.out.println("Please select a name for your ship.");
            Scanner name = new Scanner(System.in);
            String shipName;
            shipName = name.toString();
            Ship ship = new Ship(shipName);
            return ship;
        }
        else if (shipType == 2) {
            
        }
        
    }
    
    public static Pilot setupPilot(int option) {
        
    }
    
    
}
