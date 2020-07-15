import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String city =sc.nextLine();
        boolean False=false;
        if(city.endsWith("burg")){
            False=true;
            System.out.println(False);
        }
        else{
            System.out.println(False);
        }
    }
}
