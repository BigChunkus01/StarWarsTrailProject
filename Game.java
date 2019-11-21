package Game;


import GameEntities.Pilot;
import GameEntities.Ship;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author charlesurban
 */
public class Game {

    Ship ship = new Ship("Millenium Falcon");
    Pilot pilot = new Pilot("Han Solo");
    double difficulty;
    int distanceTravelled, pursuerDistance, distanceFromPursuerAndRider, currentDay;
    String timeOfDay, weather, location, pursuerDistanceDescription;
    Random random = new Random();
    boolean shipCanTravel;    
    boolean pilotIsDead;
    int shipDamage, shipFuel, shipBatteries;
    int pilotEnergy, pilotHunger, pilotThirst;
    int timeOfDayCounter;
        
    public Game(int difficulty, Ship ship, Pilot pilot) {
        this.difficulty = difficulty;
        this.ship = ship;
        this.pilot = pilot;
    }
    
    public void start() {
        
    }
    
    private boolean checkShipCanTravel() {
        shipCanTravel = !(this.shipDamage == 100 || this.shipFuel == 0 || this.shipBatteries == 0);
        return shipCanTravel;
    }
    
    private boolean checkPilotIsDead() {
        if (this.pilotEnergy == 0 || this.pilotHunger == 0 || this.pilotThirst == 0) {
            pilotIsDead = true;
        }
        else {
            pilotIsDead = false;
        }
        return pilotIsDead;
    }
    
    private String getNewLocation() {
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
        int weatherPicker = random.nextInt(10);
        if (weatherPicker == 0) {
            weather = "Solar Winds";
        }
        if (weatherPicker == 1 || weatherPicker == 8) {
            weather = "Astroids!";
        }
        if (weatherPicker == 2 || weatherPicker == 3 || weatherPicker == 4 || weatherPicker == 5) {
            weather = "Clear Space All Around You";
        }
        if (weatherPicker == 6 || weatherPicker == 7) {
            weather = "";
        }
        return weather;
    }
    
    private String getNewTimeOfDay() {
        for (int i = 0; i < 5; i++) {
            timeOfDayCounter++;
            if (i>=5) {
                i=0;
            }
        }

        
        return timeOfDay;
    }
    
    private String getPursuerDistanceDescription() {
        pursuerDistanceDescription = "The Galactic Empire is " + Integer.toString(pursuerDistance) + " miles behind you.";
        return pursuerDistanceDescription;
    }
    
    public void processTurn() {
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
