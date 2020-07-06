import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many hours should someone sleep?");
        int a = sc.nextInt();
        System.out.println("How many hours is too much?");
        int b = sc.nextInt();
        System.out.println("How many hours does Ann sleep?");
        int h = sc.nextInt();
        if (h<a){
            System.out.println("Deficiency");
        }
        else if (h>b){
            System.out.println("Excess");

        }
        else if (h>a && h<b){
            System.out.println("Normal");
        }
        else {
            System.out.println("Wrong input");
        }
    }
}
