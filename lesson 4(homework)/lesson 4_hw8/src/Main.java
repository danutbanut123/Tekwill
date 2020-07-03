import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a != b && a !=c && b !=c) {
            boolean t=true;
            System.out.println("The answer is" +t);
        } else {
            boolean f=false;
            System.out.println("Answer is" +f);
        }

    }
}
