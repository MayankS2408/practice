package Dropdown;
public class StringsWithTwoVowels {
    public static void main(String[] args) {
        String[] a = { "hello", "cat", "wood" };

        System.out.println("Strings with exactly 2 vowels:");
        findStringsWithTwoVowels(a);
    }

    public static void findStringsWithTwoVowels(String[] strings) {
        for (String str : strings) {
            if (countVowels(str) == 2) {
                System.out.println(str);
            }
        }
    }

    public static int countVowels(String str) {
        int vowelCount = 0;
        // Convert the string to lowercase for case-insensitive counting
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        return vowelCount;
    }
}
