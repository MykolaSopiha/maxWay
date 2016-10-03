import java.util.Scanner;
public class wayFinder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of stairs ( > 0 ): ");
        int n = scanner.nextInt();

        arNode stairAr = new arNode(n + 1, 10);
        stairAr.next = null;
        arNode tail = stairAr;

        for (int i = n - 1; i >= 0; i--) {
            stairAr = new arNode(i + 1, 10);
            stairAr.next = tail;
            tail = stairAr;
        }

        viewerAr(stairAr);
        Solver obj = new Solver();
        obj.solver(stairAr);
        System.out.println(obj.MAX);
        System.out.println(obj.MAX_PATH);

    }

    public static void viewerAr(arNode tail) {
        for(; tail != null; tail = tail.next) {
            System.out.println(tail.getA());
        }
    }
}