import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Solver solver = new Solver();
        int result = solver.solve(a, b);
        System.out.println(result);
    }
}
