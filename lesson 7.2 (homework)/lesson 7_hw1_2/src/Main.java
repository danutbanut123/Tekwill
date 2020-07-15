import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String notJword = sc.nextLine();
        System.out.println(notJword.startsWith("J"));
    }
}
