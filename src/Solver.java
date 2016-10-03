public class Solver {
    private int n = 0;
    private int value =0;

    public int MAX;
    public String MAX_PATH;

    public void solver(arNode tail) {
        solver(tail.next, 0, tail.a[0], "down ");
        solver(tail.next, 1, tail.a[0], "right ");
    }

    public void solver(arNode tail, int n, int value, String path) {

        if (tail.next != null) {
            solver(tail.next, n, value + tail.a[n], path + "down ");
            solver(tail.next, n + 1, value + tail.a[n], path + "right ");
            if (n > 0) {
                solver(tail.next, n - 1, value + tail.a[n], path + "left ");
            }
        } else {
            if (MAX < tail.a[n] + value) {
                MAX = tail.a[n] + value;
                MAX_PATH = path + "end!";
            }
        }
    }
}