import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many soldiers do you have?");
        int soldiers = sc.nextInt();
        if (soldiers<1){
            System.out.println("No army");
        }
        else if (soldiers >=1 && soldiers <=19){
            System.out.println("Pack");

        }
        else if(soldiers >=20 && soldiers <=249){
            System.out.println("Throng");

        }
        else if(soldiers >=250 && soldiers <=999){
            System.out.println("Zounds");

        }
        else if(soldiers >=1000){
            System.out.println("Legion");

        }


    }
}
