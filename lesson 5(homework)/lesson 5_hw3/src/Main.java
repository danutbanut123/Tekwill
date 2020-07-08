import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the length of the chocolate bar?");
        int n = sc.nextInt();
        System.out.println("What is the width of the chocolate bar?");
        int m = sc.nextInt();
        int k = sc.nextInt();

        if (k <= n * m && (k % n == 0 && k >= n || k % m == 0 && k >= m)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}