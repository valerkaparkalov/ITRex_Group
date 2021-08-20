public class RemoveLastE {
    private final static char CHAR_E='e';
    public static String  removeLastE(String text) {

        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 1 && words[i].charAt(words[i].length()-1)==CHAR_E) {
                words[i]=words[i].substring(0, words[i].length()-1);
            }
        }
        String newText= String.join(" ",words);
        return newText;
    }
}