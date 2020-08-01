
import java.util.Scanner;

public class Solution {

    public static int maxGamePlay(int p, int d, int m, int s) {
        int count = 0;
        while (p >= m && s >= m) {
            s = s - p;
            p = p - d;
            if (p <= m) {
                p = m;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int d = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int result = Solution.maxGamePlay(p, d, m, s);
        System.out.println(result);

    }
}
