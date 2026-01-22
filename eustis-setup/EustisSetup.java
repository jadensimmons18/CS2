/* 
    Jaden Simmons
    Eustis Setup
    COP3503 Computer Science 2
    EustisSetup.java
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EustisSetup{

    // Class Variables
    String name;
    int level;
    double offensive_power;

    // No parameters
    public EustisSetup() {
        this.name = "Unknown";
        this.level = 0;
        this.offensive_power = 0.0;
    }

    // With parameters
    public EustisSetup(String name, int level, double offensive_power){
        this.name = name;
        if (level < 1){
            this.level = 1;
        }
        else if (level >= 100){
            this.level = 100;
        }
        else{
            this.level = level;
        }
        
        if (offensive_power < 0){
            this.offensive_power = 0;
        }
        else{
           this.offensive_power = offensive_power; 
        }
        
    }
    
    public void printMessages(){
        System.out.println("The current month is January.");
        System.out.println("The current year is 2026.");
        System.out.println("I am a CS2 student this semester!");
        System.out.println("I am so excited to learn more algorithms and advanced data structures!");
        System.out.println("Stranger Things Season 5 came out recently on Netflix!");
    }

    public int computeScore(int numCoins, double multiplier, int bonus){

        int basePoints = numCoins * 10;

        double multipliedPoints = basePoints * multiplier;

        int totalPoints = (int) Math.round(multipliedPoints);

        totalPoints += bonus;

        return totalPoints;
    }

    public void category(){

        try {

            // Open the file
            File file = new File("movies.in");
            Scanner scanner = new Scanner(file);

            // Reads line by line
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split(" ");

                String title = parts[0];
                double budget = Double.parseDouble(parts[1]);
                double gross = Double.parseDouble(parts[2]);

                double roi = gross / budget;

                System.out.println("-----------------------------------");
                System.out.println("Title: " + title);
                System.out.println("Budget: " + budget);
                System.out.println("Gross: " + gross);
                System.out.printf("ROI: %.2f\n", roi);
                System.out.println("-----------------------------------");
            }

            scanner.close();


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    @Override
    public String toString(){
        return "Pokemon{name = '" + name + "', level = " + level + ", power = " + offensive_power + "}";
    }


}