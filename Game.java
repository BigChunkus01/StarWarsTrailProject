package Game;


import GameEntities.Pilot;
import GameEntities.Ship;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author charlesurban
 */
public class Game{
    
    Random random = new Random();
    
    public void start() {
        GameSetup.setupGame();
        if (isPilotDead = false) {
            Game.processTurn();
        }
        else {
            System.out.println("You moved to slowly, the Galactic Empire caught you.");
        }
    }
    
    public boolean checkShipCanTravel() {

    }
    
    public boolean checkPilotIsDead() {
        pilotIsDead = Pilot.isPilotDead();
        return pilotIsDead;
    }
    
    private String getNewLocation() {
        String location;
        int locationPicker = random.nextInt(15);
        if (locationPicker == 0 || locationPicker == 1) {
            location = "Hutt Space";
        }
        
        if (locationPicker == 2 || locationPicker == 3) {
            location = "Western Reaches";
        }
        
        if (locationPicker == 4 || locationPicker == 5) {
            location = "Outer Rim";
        }
        
        if (locationPicker == 6 || locationPicker == 7 || locationPicker == 8 || locationPicker == 9 || locationPicker == 10 || locationPicker == 11) {
            location = "The Core";
        }
        
        else {
            location = "Mid Rim";
        }
        return location;
    }
    
    private String getNewWeather() {
        String weather;
        int weatherPicker = random.nextInt(10);
        switch (weatherPicker) {
            case 0:
                weather = "Solar Winds";
                break;
            case 1, 8:
                weather = "Astroids!";
                break;
            case 2, 3, 4, 5:
                weather = "Clear Space All Around You";
                break;
            default:
                weather = "A huge cluster of ships are around you";
                break;
        }
        return weather;
    }
    
    private String getNewTimeOfDay() {
        return null;
    }
    
    private String getPursuerDistanceDescription() {
        return null;
    }
    
    private static void processTurn() {
        System.out.println("What would you like to do next?");
        System.out.println("1. Rest");
        System.out.println("2. Stop and Search for Food");
        System.out.println("3. Stop and Search for Water");
        System.out.println("4. Fly Carefully");
        System.out.println("5. Fly Regulary");
        System.out.println("6. Jump to LightSpeed");
        System.out.println("7. Check how far away the Galactic Empire is");
        Scanner turn = new Scanner(System.in);
        int processTurn = turn.nextInt();
        if (processTurn == 1) {
            Game.processRest();
        }
        if (processTurn == 2) {
            Game.processFoodSearch();
        }
        if (processTurn == 3) {
            Game.processWaterSearch();
        }
        if (processTurn == 4) {
            Game.processTravelCarefully();
        }
        if (processTurn == 5) {
            Game.processTravelRegularly();
        }
        if (processTurn == 6) {
            Game.processJumpToLightSpeed();
        }
        if (processTurn == 7) {
            Game.processPursuers();
        }
        else {
            System.out.println("Please select a listed option.");
        }
    }
    
    private static void processRest() {
        
    }
    
    private static void processFoodSearch() {
        System.out.println("You landed on the closest planet, hopefully there is some food here.");
        Random food = new Random();
        int randFood = food.nextInt(30);
        System.out.println("You found " + randFood + " lbs of food.");
        pilotHunger += randFood;
        System.out.println("Your hunger level is now at " + pilotHunger + ".");
    }
    
    private static void processWaterSearch() {
        System.out.println("You landed on the closest planet, hopefully there is some food here.");
        Random food = new Random();
        int randWater = food.nextInt(30);
        System.out.println("You found " + randWater + " cups of water.");
        pilotThirst += randWater;
        System.out.println("Your thirst level is now at " + pilotThirst + ".");
    }
    
    private static void processTravelCarefully() {
        
    }
    
    private static void processTravelRegularly() {
        
    }
    
    private static void processJumpToLightSpeed() {
        
    }
    
    private static void processPursuers() {
        
    }
    
}
