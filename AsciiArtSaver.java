import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * A utility class for saving arrays of strings (representing ASCII art) to a text file.
 * Handles file creation and basic error reporting.
 */
public class AsciiArtSaver {

    /**
     * Saves the provided ASCII art lines to a plain text file.
     * Ensures that the output file is closed properly using try-with-resources.
     * @param artLines An array of strings, where each string is a line of ASCII art.
     * @param filename The name of the file to save the art to (e.g., "output.txt").
     *                 Will create or overwrite the file in the current working directory.
     */
    public static void saveToFile(String[] artLines, String filename) {
        if (artLines == null || artLines.length == 0) {
            System.out.println("Error: No ASCII art has been generated or art is empty. Nothing to save.");
            return;
        }
        if (filename == null || filename.trim().isEmpty()) {
            System.out.println("Error: Filename cannot be empty. Please provide a valid filename.");
            return;
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (String line : artLines) {
                writer.println(line);
            }
            System.out.println("ASCII art successfully saved to: " + filename);
        } catch (IOException e) {
            System.err.println("Error saving ASCII art to file '" + filename + "': " + e.getMessage());
            System.err.println("Please check file permissions or if the path is valid.");
        } catch (SecurityException e) {
            System.err.println("Security error: Permission denied to write to file '" + filename + "': " + e.getMessage());
        }
    }
}
