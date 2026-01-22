/* 
    Jaden Simmons
    Eustis Setup
    COP3503 Computer Science 2
    EustisSetup.java
*/

public class EustisSetup{

    // Class Variables
    String name;
    int level;
    double offensive_power;

    public EustisSetup(String name, int level, double offensive_power){
        this.name = name;
        this.level = level;
        this.offensive_power = offensive_power;
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


}