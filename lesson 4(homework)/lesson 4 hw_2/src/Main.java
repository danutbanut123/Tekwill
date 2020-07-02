import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int squirrel ,nuts;

        System.out.println("How many squirrels do we have?");
         squirrel = sc.nextInt();

        System.out.println("How many nuts do we have?");
         nuts = sc.nextInt();
        System.out.println(nuts/squirrel + "nuts every squirrel gets.");



    }
}
