import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the length of the chocolate bar?");
        int N = sc.nextInt();
        System.out.println("What is the width of the chocolate bar?");
        int M = sc.nextInt();
        int K = sc.nextInt();
        if (K<=(N*M) && (N*M) %K ==0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
