package us.jsadi.enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String userInput;
        Team[] teams = Team.values();
        boolean noTeam = true;
        Team userTeam;

        System.out.println("Enter your favorite NFC team: ");
        userInput = k.nextLine().substring(0, 3).toUpperCase();

        for (Team t :  teams) {
            if (userInput.equals(t.mascot.substring(0, 3).toUpperCase()) ||
                    userInput.equals(t.location.substring(0, 3).toUpperCase())) {
                userTeam = t;
                noTeam = false;
                System.out.println("Your team is the " + userTeam.location + " " + userTeam.mascot);
            }
        }

        if (noTeam)
            System.out.println("You did not enter a valid team");
    }
}