import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int val = scanner.nextInt();

        print(str);
        print(str, val);
    }

    private static void print(String str, int val) {
        System.out.println("print(" + str + ", " + val + ")");
    }

    public static void print(String strArg) {
        System.out.println("print(" + strArg + ")");
    }
}