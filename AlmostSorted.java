
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the almostSorted function below.
    static void almostSorted(int[] arr) {
        try {
            int size = arr.length;
            Integer sortedArray[] = new Integer[arr.length];
            for (int i = 0; i < arr.length; i++) {
                sortedArray[i] = arr[i];
            }
            Arrays.sort(sortedArray);

            //If Array Already Sorted
            if (Arrays.toString(arr).equals(Arrays.toString(sortedArray))) {
                System.out.println("yes");
                System.exit(0);
            }

            // When work can be done by swapping with only one element
            int unsortedArray[] = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                unsortedArray[i] = arr[i];
            }
            int temp = 0;
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {

                    if (unsortedArray[i] > unsortedArray[j]) {
                        temp = unsortedArray[i];
                        unsortedArray[i] = unsortedArray[j];
                        unsortedArray[j] = temp;
                        if (Arrays.toString(unsortedArray).equals(Arrays.toString(sortedArray))) {
                            System.out.println("yes");
                            System.out.println("swap " + (i + 1) + " " + (j + 1));
                            System.exit(0);
                        } else {

                            for (int t = 0; t < arr.length; t++) {
                                unsortedArray[t] = arr[t];
                            }
                        }
                    }
                }
            }
            // When can reverse the string for sort
            int rev_unsortedArray[] = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                rev_unsortedArray[i] = arr[i];
            }

            int front;
            for (front = 0; front < size; front++) {
                if (rev_unsortedArray[front] != sortedArray[front]) {
                    break;
                }
            }

            int back;
            for (back = (rev_unsortedArray.length - 1); back >= 0; back--) {
                if (rev_unsortedArray[back] != sortedArray[back]) {
                    break;
                }
            }
            back = back + 1;
            for (int i = front; i <= back / 2; i++) {
                int tempswap = rev_unsortedArray[i];
                rev_unsortedArray[i] = rev_unsortedArray[back - i];
                rev_unsortedArray[back - i] = tempswap;
            }
            if (Arrays.toString(rev_unsortedArray).equals(Arrays.toString(sortedArray))) {
                System.out.println("yes");
                System.out.println("reverse " + (front + 1) + " " + (back));
                System.exit(0);
            } else {
                System.out.println("no");
            }

        } catch (Exception e) {
            System.out.println("no");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        almostSorted(arr);

        scanner.close();
    }
}
