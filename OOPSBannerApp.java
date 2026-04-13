/**
 * OOPSBannerApp - UC7
 * Demonstrates OOPS using CharacterPattern class
 */
public class OOPSBannerApp {

    /**
     * Static Inner Class to store character and its pattern
     */
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for pattern
         */
        public String[] getPattern() {
            return pattern;
        }

        /**
         * Getter for character
         */
        public char getCharacter() {
            return character;
        }
    }

    /**
     * Utility method to create O pattern
     */
    public static CharacterPattern getOPattern() {
        return new CharacterPattern('O', new String[]{
                "*******",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*******"
        });
    }

    /**
     * Utility method to create P pattern
     */
    public static CharacterPattern getPPattern() {
        return new CharacterPattern('P', new String[]{
                "*******",
                "*     *",
                "*     *",
                "*******",
                "*",
                "*",
                "*"
        });
    }

    /**
     * Utility method to create S pattern
     */
    public static CharacterPattern getSPattern() {
        return new CharacterPattern('S', new String[]{
                "*******",
                "*",
                "*",
                "*******",
                "      *",
                "      *",
                "*******"
        });
    }

    public static void main(String[] args) {

        CharacterPattern o = getOPattern();
        CharacterPattern p = getPPattern();
        CharacterPattern s = getSPattern();

        CharacterPattern[] word = {o, o, p, s};

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : word) {
                line.append(cp.getPattern()[i]).append(" ");
            }

            banner[i] = line.toString();
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}