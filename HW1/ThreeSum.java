import java.util.*;

public class ThreeSum {
    public static int bina(int[] a, int x, int l) {
        int r = a.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == x) {
                return mid;
            } else if (a[mid] > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        Arrays.sort(a);

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                int value = -(a[i] + a[j]);
                int pos = bina(a, value, j + 1);
                if (pos != -1) {
                    System.out.println(a[i] + " " + a[j] + " " + a[pos]);
                }
            }
        }
    }
}
