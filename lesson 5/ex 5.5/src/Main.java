import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int sum = i;
        while (i != 0) {
            if (sum >=1000) {
                sum =sum-1000;

                break;
            }
            i = sc.nextInt();
            sum +=i;


        }
        System.out.println(sum);

    }
}
