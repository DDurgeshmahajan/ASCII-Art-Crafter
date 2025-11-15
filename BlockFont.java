/**
 * Implements an ASCII art font with a 'Block' style.
 * Each character is rendered using '#' for filled areas and ' ' for empty areas.
 */
public class BlockFont extends AsciiFont {

    public BlockFont() {
        super(5, 6); // Height 5, Width 6 for each character
    }

    @Override
    protected void populateFontMap() {
        // Uppercase Letters (5x6 grid)
        fontMap.put('A', new String[]{
            "  ##  ",
            " #  # ",
            " #####",
            " #  # ",
            " #  # "
        });
        fontMap.put('B', new String[]{
            " #### ",
            " #   #",
            " #### ",
            " #   #",
            " #### "
        });
        fontMap.put('C', new String[]{
            "  ### ",
            " #   #",
            " #    ",
            " #   #",
            "  ### "
        });
        fontMap.put('D', new String[]{
            " #### ",
            " #   #",
            " #   #",
            " #   #",
            " #### "
        });
        fontMap.put('E', new String[]{
            " #####",
            " #    ",
            " #### ",
            " #    ",
            " #####"
        });
        fontMap.put('F', new String[]{
            " #####",
            " #    ",
            " #### ",
            " #    ",
            " #    "
        });
        fontMap.put('G', new String[]{
            "  ### ",
            " #   #",
            " #  ##",
            " #   #",
            "  ####"
        });
        fontMap.put('H', new String[]{
            " #   #",
            " #   #",
            " #####",
            " #   #",
            " #   #"
        });
        fontMap.put('I', new String[]{
            " #####",
            "   #  ",
            "   #  ",
            "   #  ",
            " #####"
        });
        fontMap.put('J', new String[]{
            " #####",
            "   #  ",
            "   #  ",
            " # #  ",
            "  #   "
        });
        fontMap.put('K', new String[]{
            " #  # ",
            " # #  ",
            " ##   ",
            " # #  ",
            " #  # "
        });
        fontMap.put('L', new String[]{
            " #    ",
            " #    ",
            " #    ",
            " #    ",
            " #####"
        });
        fontMap.put('M', new String[]{
            " #   #",
            " ## ##",
            " # # #",
            " #   #",
            " #   #"
        });
        fontMap.put('N', new String[]{
            " #   #",
            " ##  #",
            " # # #",
            " #  ##",
            " #   #"
        });
        fontMap.put('O', new String[]{
            "  ### ",
            " #   #",
            " #   #",
            " #   #",
            "  ### "
        });
        fontMap.put('P', new String[]{
            " #### ",
            " #   #",
            " #### ",
            " #    ",
            " #    "
        });
        fontMap.put('Q', new String[]{
            "  ### ",
            " #   #",
            " # # #",
            " #  ##",
            "  ###X"
        }); // 'X' for a tail
        fontMap.put('R', new String[]{
            " #### ",
            " #   #",
            " #### ",
            " # #  ",
            " #  # "
        });
        fontMap.put('S', new String[]{
            "  ####",
            " #    ",
            "  ### ",
            "    # ",
            " #### "
        });
        fontMap.put('T', new String[]{
            " #####",
            "   #  ",
            "   #  ",
            "   #  ",
            "   #  "
        });
        fontMap.put('U', new String[]{
            " #   #",
            " #   #",
            " #   #",
            " #   #",
            "  ### "
        });
        fontMap.put('V', new String[]{
            " #   #",
            " #   #",
            " #   #",
            "  # # ",
            "   #  "
        });
        fontMap.put('W', new String[]{
            " #   #",
            " #   #",
            " # # #",
            " ## ##",
            " #   #"
        });
        fontMap.put('X', new String[]{
            " #   #",
            "  # # ",
            "   #  ",
            "  # # ",
            " #   #"
        });
        fontMap.put('Y', new String[]{
            " #   #",
            "  # # ",
            "   #  ",
            "   #  ",
            "   #  "
        });
        fontMap.put('Z', new String[]{
            " #####",
            "    # ",
            "   #  ",
            "  #   ",
            " #####"
        });

        // Numbers
        fontMap.put('0', new String[]{
            "  ### ",
            " #   #",
            " #   #",
            " #   #",
            "  ### "
        });
        fontMap.put('1', new String[]{
            "  #   ",
            " ##   ",
            "  #   ",
            "  #   ",
            " #####"
        });
        fontMap.put('2', new String[]{
            "  ####",
            " #   #",
            "   ## ",
            "  #   ",
            " #####"
        });
        fontMap.put('3', new String[]{
            " #####",
            "     #",
            "  ### ",
            "     #",
            " #####"
        });
        fontMap.put('4', new String[]{
            " #   #",
            " #   #",
            " #####",
            "     #",
            "     #"
        });
        fontMap.put('5', new String[]{
            " #####",
            " #    ",
            " #### ",
            "     #",
            " #### "
        });
        fontMap.put('6', new String[]{
            " #####",
            " #    ",
            " #####",
            " #   #",
            " #####"
        });
        fontMap.put('7', new String[]{
            " #####",
            "     #",
            "    # ",
            "   #  ",
            "  #   "
        });
        fontMap.put('8', new String[]{
            "  ### ",
            " #   #",
            "  ### ",
            " #   #",
            "  ### "
        });
        fontMap.put('9', new String[]{
            "  ### ",
            " #   #",
            "  ####",
            "     #",
            "  ####"
        });

        // Symbols
        fontMap.put('!', new String[]{
            "   #  ",
            "   #  ",
            "   #  ",
            "      ",
            "   #  "
        });
        fontMap.put('?', new String[]{
            "  ### ",
            " #   #",
            "    # ",
            "      ",
            "   #  "
        });
        fontMap.put('.', new String[]{
            "      ",
            "      ",
            "      ",
            "      ",
            "   #  "
        });
        fontMap.put(',', new String[]{
            "      ",
            "      ",
            "      ",
            "   #  ",
            "  #   "
        });
        fontMap.put(':', new String[]{
            "      ",
            "   #  ",
            "      ",
            "   #  ",
            "      "
        });
        fontMap.put(';', new String[]{
            "      ",
            "   #  ",
            "      ",
            "   #  ",
            "  #   "
        });
        fontMap.put('(', new String[]{
            "   #  ",
            "  #   ",
            "  #   ",
            "  #   ",
            "   #  "
        });
        fontMap.put(')', new String[]{
            " #    ",
            "  #   ",
            "  #   ",
            "  #   ",
            " #    "
        });
        fontMap.put('-', new String[]{
            "      ",
            "      ",
            " #### ",
            "      ",
            "      "
        });
        fontMap.put('=', new String[]{
            "      ",
            " #####",
            "      ",
            " #####",
            "      "
        });
        fontMap.put('+', new String[]{
            "      ",
            "   #  ",
            " #####",
            "   #  ",
            "      "
        });
        fontMap.put('/', new String[]{
            "     #",
            "    # ",
            "   #  ",
            "  #   ",
            " #    "
        });
        fontMap.put('\\', new String[]{
            " #    ",
            "  #   ",
            "   #  ",
            "    # ",
            "     #"
        });
        fontMap.put('&', new String[]{
            "  ### ",
            " #   #",
            "  ### ",
            " #   #",
            " #  # "
        });
        fontMap.put('%', new String[]{
            "#   # ",
            "#  #  ",
            "   #  ",
            "  #  #",
            " #   #"
        });
        fontMap.put('$', new String[]{
            "  #   ",
            " #####",
            "  #   ",
            " #####",
            "  #   "
        });
    }
}
