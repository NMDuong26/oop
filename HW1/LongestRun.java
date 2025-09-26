import java.util.Scanner;

public class LongestRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int value = a[0], len = 1, maxlen = 1;

        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1]) {
                len++;
            } else {
                if (len > maxlen) {
                    maxlen = len;
                    value = a[i - 1];
                }
                len = 1;
            }
        }

        if (len > maxlen) {
            maxlen = len;
            value = a[n - 1];
        }

        System.out.println(value + " " + maxlen);
    }
}
