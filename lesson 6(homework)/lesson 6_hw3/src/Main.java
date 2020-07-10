import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements should the array contain?");
        int a= sc.nextInt();

        int[] numbers = new int[a];
        for (int i=0;i < a;i++) {
            numbers[i]=sc.nextInt();

        }
        System.out.println("From which number should the array start making a sum");
        int n=sc.nextInt();
        int sum=0;
        for(int element :numbers){
            if(element>n)
                sum+=element;
        }
        System.out.println(sum);
    }
}
