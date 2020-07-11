import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int[] numbers = new int[a];
        for (int i=0;i < a;i++) {
            numbers[i]=sc.nextInt();

        }
        int sum=0;
        for(int element :numbers){
            sum+=element;
        }
        System.out.println(sum);
    }
}
