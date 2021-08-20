public class Methods {
    public static String changeChar1(String text) {
        char[] letters = text.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'c') {
                if (i != letters.length) {
                    if (letters[i + 1] == 'i' | letters[i + 1] == 'e') {
                        letters[i] = 's';
                        continue;
                    }
                    if (letters[i + 1] == 'k') {
                        letters[i] = 'k';
                        continue;
                    } else {
                        letters[i] = 'k';
                        continue;
                    }
                }
            }
        }
        return new String(letters);
    }

}
