/**
 * A utility class responsible for converting a text string into multi-line ASCII art.
 * It uses an `AsciiFont` to get character patterns and combines them horizontally.
 */
public class AsciiConverter {

    /**
     * Generates ASCII art from a given text string using a specified AsciiFont.
     * Combines individual character patterns horizontally to form the complete ASCII art.
     * If the input text is null or empty, an empty array is returned.
     * @param text The input string to convert.
     * @param font The AsciiFont to use for retrieving character patterns.
     * @return A String array where each element is a line of the generated ASCII art.
     */
    public static String[] generateAsciiArt(String text, AsciiFont font) {
        if (text == null || text.isEmpty()) {
            return new String[0];
        }

        int characterHeight = font.getCharacterHeight();
        int characterWidth = font.getCharacterWidth();
        String[] result = new String[characterHeight];

        // Initialize result array with empty strings to avoid NullPointerException when appending.
        // This ensures that even if no characters are processed, the array is valid.
        for (int i = 0; i < characterHeight; i++) {
            result[i] = "";
        }

        // Iterate through each character of the input text
        for (char c : text.toCharArray()) {
            String[] charPattern = font.getCharPattern(c);

            // Append each line of the current character's pattern to the corresponding line in the result.
            // This effectively places characters side-by-side horizontally.
            for (int i = 0; i < characterHeight; i++) {
                if (i < charPattern.length) { // Ensure the character pattern has enough lines
                    result[i] += charPattern[i];
                } else {
                    // Fallback: If a character pattern is shorter than the font's expected height,
                    // pad with spaces to maintain alignment. This should ideally not happen if fonts are consistent.
                    StringBuilder padding = new StringBuilder();
                    for(int j = 0; j < characterWidth; j++) padding.append(' ');
                    result[i] += padding.toString();
                }
            }
        }
        return result;
    }
}
