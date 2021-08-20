public class DoubleLiters {

    private static final char CHAR_REPLACES_DOUBLE_O = 'u';
    private static final char CHAR_REPLACES_DOUBLE_E = 'i';

    public static String doubleLiters(String string) {
        String text = string;
        StringBuilder result = new StringBuilder();
        for (String word : text.split(" ")) {
            result.append(method(word));
            result.append(" ");
        }
        return result.toString();
    }

    static StringBuilder method(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(word.charAt(0));

        for (int i = 1; i < word.length(); i++) {
            addNonRepeatingChar(stringBuilder, word.charAt(i));
        }

        return stringBuilder;
    }

    private static void addNonRepeatingChar(StringBuilder stringBuilder, char symbol) {
        if (stringBuilder.charAt(stringBuilder.length() - 1) == symbol) {
            checkRepeatChar(stringBuilder, symbol);
        } else {
            stringBuilder.append(symbol);
        }
    }

    private static void checkRepeatChar(StringBuilder stringBuilder, char symbol) {
        if (symbol == 'o') {
            stringBuilder.setCharAt(stringBuilder.length() - 1, CHAR_REPLACES_DOUBLE_O);
        } else if (symbol == 'e') {
            stringBuilder.setCharAt(stringBuilder.length() - 1, CHAR_REPLACES_DOUBLE_E);
        }
    }
}