import java.util.HashMap;
import java.util.Map;

/**
 * Abstract base class for defining different ASCII art fonts.
 * Manages character patterns, height, and width, and provides a default pattern
 * for unsupported characters.
 */
public abstract class AsciiFont {
    protected Map<Character, String[]> fontMap; // Stores character to String[] patterns
    protected final int characterHeight;       // Height of each character's ASCII art
    protected final int characterWidth;        // Consistent width of each character's ASCII art

    // Default pattern for characters not found in the font map (e.g., a question mark block)
    protected String[] unknownCharPattern;
    protected String[] spaceCharPattern;       // Pattern for a space character

    /**
     * Constructor for AsciiFont.
     * @param height The height (number of lines) for each character in this font.
     * @param width The width (number of columns) for each character in this font.
     */
    protected AsciiFont(int height, int width) {
        this.characterHeight = height;
        this.characterWidth = width;
        this.fontMap = new HashMap<>();
        initializeDefaultPatterns();
        populateFontMap(); // Populates the fontMap with specific character patterns
    }

    /**
     * Initializes the default patterns for unknown characters and spaces.
     * The unknown character pattern attempts to display a '?' for visual feedback.
     */
    private void initializeDefaultPatterns() {
        unknownCharPattern = new String[characterHeight];
        spaceCharPattern = new String[characterHeight];
        
        // Create a blank line for spaces
        String blankLine = getFilledOrEmptyLine(' ', characterWidth);
        for (int i = 0; i < characterHeight; i++) {
            spaceCharPattern[i] = blankLine;
        }

        // Create an '?' pattern for unknown characters
        for (int i = 0; i < characterHeight; i++) {
            unknownCharPattern[i] = blankLine;
        }

        // Attempt to place a '?' and a '.' at the bottom for an unknown character pattern
        if (characterHeight >= 3 && characterWidth >= 3) {
            int centerX = characterWidth / 2;
            // Line 1: Top of '?'
            if (characterHeight >= 1) unknownCharPattern[0] = replaceCharInString(unknownCharPattern[0], centerX, '.');
            if (characterHeight >= 1 && centerX > 0) unknownCharPattern[0] = replaceCharInString(unknownCharPattern[0], centerX-1, '_');
            if (characterHeight >= 1 && centerX < characterWidth-1) unknownCharPattern[0] = replaceCharInString(unknownCharPattern[0], centerX+1, '_');
            // Line 2: Middle of '?'
            if (characterHeight >= 2) unknownCharPattern[1] = replaceCharInString(unknownCharPattern[1], centerX - 1, '/');
            if (characterHeight >= 2 && centerX < characterWidth-1) unknownCharPattern[1] = replaceCharInString(unknownCharPattern[1], centerX + 1, '\\');
            // Line 3: '?' stem
            if (characterHeight >= 3) unknownCharPattern[2] = replaceCharInString(unknownCharPattern[2], centerX, '|');
            // Line 4: Space
            // Line 5: Dot at bottom
            if (characterHeight >= 5) {
                unknownCharPattern[4] = replaceCharInString(unknownCharPattern[4], centerX, '.');
            }
        }
    }

    /**
     * Helper method to generate a string of a given width, filled with a specific character.
     * @param fillChar The character to fill the string with.
     * @param width The desired width of the string.
     * @return A string of specified width filled with fillChar.
     */
    protected String getFilledOrEmptyLine(char fillChar, int width) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < width; i++) sb.append(fillChar);
        return sb.toString();
    }

    /**
     * Helper method to replace a character at a specific index in a string.
     * @param str The original string.
     * @param index The index at which to replace the character.
     * @param replaceChar The character to place at the index.
     * @return The modified string.
     */
    protected String replaceCharInString(String str, int index, char replaceChar) {
        if (index < 0 || index >= str.length()) {
            return str;
        }
        char[] chars = str.toCharArray();
        chars[index] = replaceChar;
        return new String(chars);
    }

    /**
     * Abstract method to be implemented by concrete font classes to populate their specific character patterns.
     */
    protected abstract void populateFontMap();

    /**
     * Retrieves the ASCII art pattern for a given character.
     * Prioritizes exact matches, then uppercase equivalents, then default to unknown pattern.
     * @param c The character to get the pattern for.
     * @return A String array representing the ASCII art for the character, or a default unknown pattern.
     */
    public String[] getCharPattern(char c) {
        if (c == ' ') {
            return spaceCharPattern;
        }

        // Try to find the pattern for the character as is (for symbols, punctuation, etc.)
        String[] pattern = fontMap.get(c);
        if (pattern != null) {
            return pattern;
        }
        
        // If not found, try the uppercase version (for letters)
        char upperC = Character.toUpperCase(c);
        pattern = fontMap.get(upperC);
        if (pattern != null) {
            return pattern;
        }

        // If still not found, return the default unknown character pattern
        return unknownCharPattern;
    }

    /**
     * @return The height of characters in this font.
     */
    public int getCharacterHeight() {
        return characterHeight;
    }
    
    /**
     * @return The width of characters in this font.
     */
    public int getCharacterWidth() {
        return characterWidth;
    }
}
