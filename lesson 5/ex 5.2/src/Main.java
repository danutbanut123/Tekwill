import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        switch (a){
            case 1:
                System.out.println("circle");
                break;
            case 2:
                System.out.println("triangle");
                break;
            case 3:
                System.out.println("rhombus");
                break;
            case 4:
                System.out.println("square");
                break;
            default:
                System.out.println("no shape");
                break;
        }
    }
}
