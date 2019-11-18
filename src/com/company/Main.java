package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String[] netflixChoices = {"1", "2", "3"};

        Random rand = new Random();
        int randNumber = rand.nextInt(netflixChoices.length);
        System.out.println(netflixChoices[randNumber]);
    }
}
