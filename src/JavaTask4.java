public class JavaTask4 {
    public static void main(String[] args) {
        String word = "Заказ";
        System.out.println(word);

        System.out.println(isPalindrom(word));
    }

    public static boolean isPalindrom(String word) {
        char[] wordArray = word.toCharArray();
        for (int i = 0; i < wordArray.length / 2; i++) {
            if (!String.valueOf(wordArray[i]).equalsIgnoreCase(String.valueOf(wordArray[wordArray.length - 1 - i]))) {
                return false;
            }
        }
        return true;
    }
}