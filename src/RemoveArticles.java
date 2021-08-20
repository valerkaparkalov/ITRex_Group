public class RemoveArticles {

    private static final String ARTICLES_THE = "the";
    private static final String ARTICLES_A = "a";
    private static final String ARTICLES_AN = "an";


    public static String removeArticles(String string) {
        String text = string;
        StringBuilder result = new StringBuilder();
        for (String word : text.split(" ")) {
            if (chekArtikles(word) == false) {
                result.append(word);
                result.append(" ");
            } else {
                continue;
            }

        }
        return result.toString();
    }

    static boolean chekArtikles(String word) {
        if (word.equals(ARTICLES_AN) == true) {
            return true;
        }
        if (word.equals(ARTICLES_A) == true) {
            return true;
        }
        if (word.equals(ARTICLES_THE) == true) {
            return true;
        } else {
            return false;
        }
    }
}