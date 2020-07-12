import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letters =sc.nextLine();
        String ab =letters.replaceAll("a","b");
        System.out.println(ab);
    }
}
