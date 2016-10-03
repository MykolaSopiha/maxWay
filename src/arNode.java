import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by niksop94 on 27.09.16.
 */
public class arNode {
    arNode next;
    int[] a;

    public arNode(int n) {
        System.out.println("Let's fillin n-th stair!");
        Scanner scanner = new Scanner(System.in);
        this.a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]");
            this.a[i] = scanner.nextInt();
        }
    }

    public arNode(int n, int max) {
        this.a = new int[n];
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            this.a[i] = random.nextInt(max);
        }
    }

    public String getA() {
        return Arrays.toString(this.a);
    }
    public int getA(int n) {
        return this.a[n];
    }
}
