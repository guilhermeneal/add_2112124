public class CharacterDrawingUtilities {
    public static void drawElement(char character) {
        System.out.print(character);
    }

    public static void drawNewLine() {
        System.out.println();
    }

    public static void drawHorizontalSegmentWith(int length, char character) {
        for (int i = 0; i < length; i++) {
            drawElement(character);
        }
    }

    public static void drawFilledRectangleWith(int height, int width, char character) {
        for (int i = 0; i < height; i++) {
            drawHorizontalSegmentWith(width, character);
            drawNewLine();
        }
    }

    public static void drawEmptyRectangleWith(int height, int width, char character) {
        drawHorizontalSegmentWith(width, character);
        drawNewLine();

        for (int i = 0; i < height - 2; i++) {
            drawElement(character);
            drawHorizontalSegmentWith(width - 2, ' ');
            drawElement(character);
            drawNewLine();
        }

        if (height > 1) {
            drawHorizontalSegmentWith(width, character);
            drawNewLine();
        }
    }
}
