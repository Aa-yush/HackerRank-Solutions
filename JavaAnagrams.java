
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        String x = a.toUpperCase();
        String y = b.toUpperCase();
        char a_ch[] = a.toCharArray();
        char b_ch[] = b.toCharArray();

        java.util.Arrays.sort(a_ch);
        java.util.Arrays.sort(b_ch);

        boolean result = java.util.Arrays.equals(a_ch, b_ch);
        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
