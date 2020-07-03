import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time =sc.nextInt();
        int distance =sc.nextInt();
        System.out.println(distance/time +"is the speed of the car in km/hour");
    }
}
