import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        long product = 1;

        for(int i = a;i < b; i++) {
            product *= i;
        }



        System.out.println(product);
    }
}