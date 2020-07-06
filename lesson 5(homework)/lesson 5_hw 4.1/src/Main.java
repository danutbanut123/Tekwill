import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("up");
                break;
            case 2:
                System.out.println("down");
                break;
            case 3:
                System.out.println("left");
                break;
            case 4:
                System.out.println("right");
                break;
            case 0 :
                System.out.println("dont move");
                break;
            default :
                System.out.println("up");
                break;

        }
           }
}
