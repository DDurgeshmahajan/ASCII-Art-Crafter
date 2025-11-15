```markdown
# ASCII Art Crafter

Welcome to the ASCII Art Crafter! This little project lets you turn ordinary text into cool ASCII art right from your command line. Want to make your name look blocky, outlined, or even bubbly? This tool has got you covered!

## What It Does

This simple application takes any text you type and converts it into a visually striking ASCII art representation. You can choose from a few different artistic styles (fonts) and then even save your masterpiece to a plain text file. It's a fun way to experiment with text art!

## Awesome Features

*   **Text to Art:** Transform any text message into eye-catching ASCII art.
*   **Multiple Font Styles:** Pick from a selection of distinct fonts:
    *   **Block Font:** Uses `#` characters to create solid, blocky letters.
    *   **Outline Font:** Uses `.` characters to draw the outlines of letters.
    *   **Bubble Font:** Creates rounded, more playful characters using various symbols like `/`, `\`, `_`, and `|`.
*   **Save Your Creations:** Easily save your generated ASCII art to a `.txt` file for sharing or later use.
*   **Easy to Use:** A straightforward menu guides you through the process.

## How to Use It

Ready to create some art? Here’s how you can get started:

### What You'll Need

You'll need the **Java Development Kit (JDK)** installed on your computer to run this program. If you don't have it, you can easily find and download it from Oracle's website.

### Running the Crafter

1.  **Save the Files:** Make sure all the `.java` files (like `Main.java`, `BlockFont.java`, etc.) are in the same folder on your computer.
2.  **Open Terminal/Command Prompt:** Navigate to that folder using your terminal or command prompt.
3.  **Compile the Code:** Type the following command and press Enter:
    ```bash
    javac *.java
    ```
    This command will prepare all the Java files to be run.
4.  **Start the Program:** Once compiled, run the application with this command:
    ```bash
    java Main
    ```
5.  **Follow the Menu:** The program will greet you and show a menu:
    ```
    Welcome to the ASCII Art Crafter!
    --- Main Menu ---
    1. Generate ASCII Art
    2. Save Last Generated Art to File
    3. Exit
    Enter your choice:
    ```
    *   **To Generate Art:** Choose `1`. You'll be asked to enter your text and then select a font (1 for Block, 2 for Outline, 3 for Bubble). Your art will be displayed!
    *   **To Save Art:** Choose `2`. If you've just generated art, you'll be prompted to enter a filename (e.g., `my_art.txt`). The art will be saved to that file in the same folder.
    *   **To Exit:** Choose `3` to close the program.

## Example of Art Styles

Imagine typing "HELLO":

*   **Block Font** might look something like:
    ```
      #   # ##### #     # ####  #####
      #   # #     #     # #   # #
      ##### ##### #     # ####  #####
      #   # #     #     # #   # #
      #   # ##### ##### # ####  #####
    ```
*   **Outline Font** might appear like:
    ```
      .   . . . . . .     .     . . .  . . .
      .   . .         .   .     .   .  .
      . . . . . .     .   .     . . .  . . .
      .   . .         .   .     .   .  .
      .   . . . . . . . . . . . . . .  . . .
    ```
*   **Bubble Font** would have a more rounded, distinct style:
    ```
     _   _  ____  _       _      ____   ____
    | | | ||  _ \ | |     | |    / __ \ / ___|
    | |_| || (_) || |     | |   | |  | | |
    |  _  ||  _ < | |     | |   | |  | | |
    |_| |_||____/ |_______| |__  \____/ \___|
    ```
    (Note: These are illustrative examples and not the exact output, which will depend on the actual font designs.)

## Contact

Got questions or just want to say hi? Feel free to reach out!

*   **Author:** Durgesh Mahajan
*   **Email:** ashamahajan955@gmail.com
*   **GitHub Repository:** [https://github.com/DDurgeshmahajan/](https://github.com/DDurgeshmahajan/)
```