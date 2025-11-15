/*
Author: Durgesh Mahajan
Date: 2023-10-27
Project: ASCII Art Crafter
*/

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The main class for the ASCII Art Crafter application.
 * Handles user interaction, menu display, font selection, and saving generated art.
 */
public class Main {

    private static String[] lastGeneratedArt = null;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the ASCII Art Crafter!");
        int choice;
        do {
            displayMenu();
            choice = getUserChoice();

            switch (choice) {
                case 1:
                    generateArtAction();
                    break;
                case 2:
                    saveArtAction();
                    break;
                case 3:
                    System.out.println("Exiting ASCII Art Crafter. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
            System.out.println(); // New line for better readability
        } while (choice != 3);

        scanner.close();
    }

    /**
     * Displays the main menu options to the user.
     */
    private static void displayMenu() {
        System.out.println("--- Main Menu ---");
        System.out.println("1. Generate ASCII Art");
        System.out.println("2. Save Last Generated Art to File");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    /**
     * Prompts the user for a menu choice and handles input validation.
     * @return The integer choice made by the user, or -1 if input is invalid.
     */
    private static int getUserChoice() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Consume the invalid input
            return -1; // Indicate invalid choice
        }
    }

    /**
     * Handles the action for generating ASCII art.
     * Prompts for text, allows font selection, generates and displays art.
     */
    private static void generateArtAction() {
        scanner.nextLine(); // Consume newline left-over from nextInt()
        System.out.print("Enter text to convert to ASCII art: ");
        String inputText = scanner.nextLine();

        AsciiFont chosenFont = selectFont();
        if (chosenFont == null) {
            System.out.println("Font selection cancelled or invalid. Please try again.");
            return;
        }

        System.out.println("\nGenerating ASCII Art with '" + chosenFont.getClass().getSimpleName().replace("Font", "") + "' font...");
        lastGeneratedArt = AsciiConverter.generateAsciiArt(inputText, chosenFont);

        if (lastGeneratedArt != null && lastGeneratedArt.length > 0) {
            System.out.println("\n" + "--[ YOUR ASCII ART ]--");
            for (String line : lastGeneratedArt) {
                System.out.println(line);
            }
            System.out.println("--[ END OF ART ]--\n");
        } else {
            System.out.println("Could not generate ASCII art. Ensure valid characters and font selection.");
        }
    }

    /**
     * Prompts the user to select an ASCII font.
     * @return The chosen AsciiFont object, or null if selection is invalid.
     */
    private static AsciiFont selectFont() {
        System.out.println("\n--- Choose a Font ---");
        System.out.println("1. Block Font");
        System.out.println("2. Outline Font");
        System.out.println("3. Bubble Font");
        System.out.print("Enter font choice (1-3): ");

        try {
            int fontChoice = scanner.nextInt();
            switch (fontChoice) {
                case 1:
                    return new BlockFont();
                case 2:
                    return new OutlineFont();
                case 3:
                    return new BubbleFont();
                default:
                    System.out.println("Invalid font choice. Please select 1, 2, or 3.");
                    return null;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number (1-3).");
            scanner.next(); // Consume the invalid input
            return null;
        }
    }

    /**
     * Handles the action for saving the last generated ASCII art to a file.
     */
    private static void saveArtAction() {
        if (lastGeneratedArt == null) {
            System.out.println("No ASCII art has been generated yet. Please generate art first.");
            return;
        }

        scanner.nextLine(); // Consume newline left-over from nextInt()
        System.out.print("Enter filename to save (e.g., my_ascii_art.txt): ");
        String filename = scanner.nextLine();

        AsciiArtSaver.saveToFile(lastGeneratedArt, filename);
    }
}
