/**
 * Implements an ASCII art font with a 'Bubble' style.
 * Characters are rendered with rounded shapes using '/','\\','_','|','`' etc.
 */
public class BubbleFont extends AsciiFont {

    public BubbleFont() {
        super(5, 7); // Height 5, Width 7 for each character, slightly wider for bubble effect
    }

    @Override
    protected void populateFontMap() {
        // Uppercase Letters (5x7 grid)
        fontMap.put('A', new String[]{
            "  _ _  ",
            " /   \ ",
            "| (_) |",
            "|  _  |",
            "`-----`"
        });
        fontMap.put('B', new String[]{
            " ____  ",
            "|  _ \ ",
            "| (_) |",
            "|  __/ ",
            "|____/ "
        });
        fontMap.put('C', new String[]{
            "  ___  ",
            " /   \ ",
            "|     |",
            "\     /",
            " `---` "
        });
        fontMap.put('D', new String[]{
            " ____  ",
            "|  _ \ ",
            "| |_) |",
            "|  __/ ",
            "|____/ "
        });
        fontMap.put('E', new String[]{
            " _____ ",
            "| ____|",
            "| |__  ",
            "| |___ ",
            "|_____|"
        });
        fontMap.put('F', new String[]{
            " _____ ",
            "| ____|",
            "| |__  ",
            "| |    ",
            "|_|    "
        });
        fontMap.put('G', new String[]{
            "  ___  ",
            " /   \ ",
            "|  ___|",
            "| | __ ",
            " \___|/"
        });
        fontMap.put('H', new String[]{
            " _   _ ",
            "| | | |",
            "| |_| |",
            "|  _  |",
            "|_| |_|"
        });
        fontMap.put('I', new String[]{
            " _____ ",
            "  |_|  ",
            "  | |  ",
            "  | |  ",
            "|_____|"
        });
        fontMap.put('J', new String[]{
            " _____ ",
            "   |_| ",
            "   | | ",
            "|  | | ",
            " `---` "
        });
        fontMap.put('K', new String[]{
            " _   _ ",
            "| | / /",
            "| |/ / ",
            "| | \ \",
            "|_|  \_\"
        });
        fontMap.put('L', new String[]{
            " _     ",
            "| |    ",
            "| |    ",
            "| |___ ",
            "|_____|"
        });
        fontMap.put('M', new String[]{
            " __  __ ",
            "|  \/  |",
            "| |\/| |",
            "| |  | |",
            "|_|  |_|"
        });
        fontMap.put('N', new String[]{
            " _   _ ",
            "| \ | |",
            "|  \| |",
            "| |\  |",
            "|_| \_|"
        });
        fontMap.put('O', new String[]{
            "  ___  ",
            " /   \ ",
            "|     |",
            "\     /",
            " `---` "
        });
        fontMap.put('P', new String[]{
            " ____  ",
            "|  _ \ ",
            "| (_) |",
            "|  __/ ",
            "|_|    "
        });
        fontMap.put('Q', new String[]{
            "  ___  ",
            " /   \ ",
            "|   _ |",
            "\  /_/`",
            " `---` "
        });
        fontMap.put('R', new String[]{
            " ____  ",
            "|  _ \ ",
            "| (_) |",
            "|  __/ ",
            "|_| \_\"
        });
        fontMap.put('S', new String[]{
            "  ____ ",
            " / __| ",
            " \__ \ ",
            " ____/ ",
            "|_____|"
        });
        fontMap.put('T', new String[]{
            " _____ ",
            "  |_|  ",
            "  | |  ",
            "  | |  ",
            "  |_|  "
        });
        fontMap.put('U', new String[]{
            " _   _ ",
            "| | | |",
            "| | | |",
            "| |_| |",
            " `---` "
        });
        fontMap.put('V', new String[]{
            " _   _ ",
            "| | | |",
            "| | | |",
            " \ \_/ /",
            "  \___/  "
        });
        fontMap.put('W', new String[]{
            " _    _ ",
            "| |  | |",
            "| |  | |",
            "| |__| |",
            " \____/ "
        });
        fontMap.put('X', new String[]{
            " _   _ ",
            " \ \_/ /",
            "  > _ < ",
            " /_/ \_\",
            "|_|   |_|"
        });
        fontMap.put('Y', new String[]{
            " _   _ ",
            "| | | |",
            " \ \_/ /",
            "  \_ _/  ",
            "   |_|   "
        });
        fontMap.put('Z', new String[]{
            " _____ ",
            "|__   |",
            "   / / ",
            "  / /_ ",
            " |____|"
        });

        // Numbers
        fontMap.put('0', new String[]{
            "  ___  ",
            " / _ \ ",
            "| (_) |",
            " \_, / ",
            "  /_/  "
        });
        fontMap.put('1', new String[]{
            "   _   ",
            "  / |  ",
            "  | |  ",
            "  | |  ",
            "  |_|  "
        });
        fontMap.put('2', new String[]{
            "  ___  ",
            " / _ \ ",
            "| (_) |",
            " `--'_| ",
            " /____| "
        });
        fontMap.put('3', new String[]{
            "  ____ ",
            " |___ \ ",
            "   _ \ \",
            "  ___) |",
            " |____/ "
        });
        fontMap.put('4', new String[]{
            " _    _ ",
            "| |  | |",
            "| |__| |",
            "    _  |",
            "   |_| `"
        });
        fontMap.put('5', new String[]{
            " _____ ",
            "| ____|",
            "| ____|",
            "| |___ ",
            "|_____|"
        });
        fontMap.put('6', new String[]{
            "  ____ ",
            " / ___|",
            "| | __ ",
            "| |__| |",
            " \____/ "
        });
        fontMap.put('7', new String[]{
            " ______ ",
            "|____  /",
            "    / / ",
            "   / /  ",
            "  /_/   "
        });
        fontMap.put('8', new String[]{
            "  ____  ",
            " / ___| ",
            "| |__   |",
            " \___ \ /",
            "  ____|/ "
        });
        fontMap.put('9', new String[]{
            "  ____  ",
            " / ___| ",
            "| |  _ \",
            "| |__| |",
            " \____/ "
        });

        // Symbols
        fontMap.put('!', new String[]{
            "   _   ",
            "  | |  ",
            "  | |  ",
            "       ",
            "  |_|  "
        });
        fontMap.put('?', new String[]{
            "  ___  ",
            " / _ \ ",
            "| (_) |",
            "       ",
            "  |_|  "
        });
        fontMap.put('.', new String[]{
            "       ",
            "       ",
            "       ",
            "       ",
            "  ___  "
        });
        fontMap.put(',', new String[]{
            "       ",
            "       ",
            "       ",
            "  ___  ",
            " / __| "
        });
        fontMap.put(':', new String[]{
            "       ",
            "  _ _  ",
            "       ",
            "  _ _  ",
            "       "
        });
        fontMap.put(';', new String[]{
            "       ",
            "  _ _  ",
            "       ",
            "  _ _  ",
            " / __| "
        });
        fontMap.put('(', new String[]{
            "  ___  ",
            " /     ",
            "|      ",
            "\      ",
            " `---- "
        });
        fontMap.put(')', new String[]{
            "  ___  ",
            "     \ ",
            "      |",
            "      /",
            " ----` "
        });
        fontMap.put('-', new String[]{
            "       ",
            "       ",
            "  _____",
            "       ",
            "       "
        });
        fontMap.put('=', new String[]{
            "       ",
            "  _____",
            "       ",
            "  _____",
            "       "
        });
        fontMap.put('+', new String[]{
            "       ",
            "   _   ",
            "  ___  ",
            "   _   ",
            "       "
        });
        fontMap.put('/', new String[]{
            "      _",
            "     / ",
            "    /  ",
            "   /   ",
            "  /_   "
        });
        fontMap.put('\\', new String[]{
            " _     ",
            " \    ",
            "  \   ",
            "   \  ",
            "    \_"
        });
        fontMap.put('&', new String[]{
            "  ___  ",
            " / __| ",
            "| (__  |",
            " \___|/",
            "      \"
        });
        fontMap.put('%', new String[]{
            " _   _ ",
            "| \ /  ",
            " ` V ` ",
            "  / \ |",
            "|_| |_|"
        });
        fontMap.put('$', new String[]{
            "   _   ",
            "  / \  ",
            " | _ | ",
            " \___/ ",
            "   _   "
        });
    }
}
