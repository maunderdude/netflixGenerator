package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Container for movie choices
        String[] netflixChoices = {"movieChoice1", "movieChoice2", "movieChoice3"};

        Random rand = new Random();
        
        // Picking a random number from array indexes
        int randNumber = rand.nextInt(netflixChoices.length);
        System.out.println(netflixChoices[randNumber]);
    }
}
