
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String[] cavityMap(String[] grid) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i < (grid.length - 1); i++) {
            char Mychar[] = grid[i].toCharArray();
            for (int j = 1; j < (Mychar.length - 1); j++) {
                list.add(Integer.parseInt(String.valueOf(Mychar[j])));
            }
        }

        int greatNumber = 0;
        for (int myInt : list) {
            if (greatNumber < myInt) {
                greatNumber = myInt;
            }
        }

        for (int i = 1; i < (grid.length - 1); i++) {
            char Mychar[] = grid[i].toCharArray();
            for (int j = 1; j < (Mychar.length - 1); j++) {
                if (String.valueOf(Mychar[j]).equals(greatNumber + "")) {
                    Mychar[j] = 'X';
                }
                grid[i] = String.valueOf(Mychar);
            }
        }

        return grid;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = cavityMap(grid);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
