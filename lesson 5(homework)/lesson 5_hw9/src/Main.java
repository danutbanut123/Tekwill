import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = 0;
        int count = 0;
        do {
            in = sc.nextInt();
            if (in != 0) {
                count++;
            }
        } while (in != 0);
        System.out.println(count);
    }
}