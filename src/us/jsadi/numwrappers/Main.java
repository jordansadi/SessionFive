package us.jsadi.numwrappers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String userInput;

        System.out.println("Enter a number: ");
        userInput = k.nextLine();

        try {
            byte userNum = Byte.parseByte(userInput);
            System.out.println(userNum + " is a byte");
        } catch (Exception b) {
            try {
                int userNum = Integer.parseInt(userInput);
                System.out.println(userNum + " is an integer");
            } catch (Exception i) {
                try {
                    short userNum = Short.parseShort(userInput);
                    System.out.println(userNum + " is a short");
                } catch (Exception s) {
                    try {
                        long userNum = Long.parseLong(userInput);
                        System.out.println(userNum + " is a long");
                    } catch (Exception l) {
                        try {
                            double userNum = Double.parseDouble(userInput);
                            System.out.println(userNum + " is a double");
                        } catch (Exception d) {
                            System.out.println("Input is too large or is not a number");
                        }
                    }
                }
            }
        }
    }
}
