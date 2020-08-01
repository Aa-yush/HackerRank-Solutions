
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int size = A.length() + B.length();
        int gt = A.compareTo(B);
        String lex = "";
        if (gt > 0) {
            lex = "Yes";
        } else {
            lex = "No";
        }
        String str = A.toLowerCase();
        String str1 = B.toLowerCase();

        char ch[] = str.toCharArray();
        char ch2[] = str1.toCharArray();

        ch[0] = ((A.charAt(0) + "").toUpperCase()).charAt(0);
        ch2[0] = ((B.charAt(0) + "").toUpperCase()).charAt(0);

        System.out.println(size);
        System.out.println(lex);
        System.out.print(ch);
        System.out.print(" ");
        System.out.print(ch2);

    }
}
