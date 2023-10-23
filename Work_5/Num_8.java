package Work_5;

public class Num_8 {
    public static void main(String[] args) {
        String word = "Довод";
        if (isPalindrome(word)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    public static boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }
        // Сравниваем первую и последнюю буквы слова (без учета регистра)
        char firstChar = Character.toLowerCase(word.charAt(0));
        char lastChar = Character.toLowerCase(word.charAt(word.length() - 1));

        // Если первая и последняя буквы совпадают, продолжаем проверку для подстроки между ними
        if (firstChar == lastChar) {
            String substring = word.substring(1, word.length() - 1);
            return isPalindrome(substring);
        }
        else {
            return false;
        }
    }
}
