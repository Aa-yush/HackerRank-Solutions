
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        char ch[] = A.toCharArray();
        char another_ch[] = new char[ch.length];

        int inc = -1;
        for (int i = (ch.length - 1); i >= 0; i--) {
            inc++;
            another_ch[inc] = ch[i];

        }
        String str = String.valueOf(ch);
        String str2 = String.valueOf(another_ch);

        if (str.equals(str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
