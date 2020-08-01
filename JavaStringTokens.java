
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s = s.trim();
        if (s.length() == 0) {
            System.out.println("0");
            return;
        }
        String myString[] = s.split("[^a-zA-Z]+");
        System.out.println(myString.length);
        for (String words : myString) {
            System.out.println(words);
        }
    }
}
