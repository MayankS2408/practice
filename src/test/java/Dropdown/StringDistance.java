package Dropdown;

public class StringDistance {

    public static void main(String[] args) {

        String s = "My Name is Mayank";
        String w1 = "My";
        String w2 = "is";

        String[] a = s.split(" ");
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i].equals(w1) && a[i + 1].equals(w2)) {
                int distance = i + 1 - i;
                System.out.println(distance);
            }
        }

    }
}
