import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if ( (a>0 && b<=0 && c<=0) || (a<=0 && b>0 && c<=0) || (a<=0 && b<=0 && c>0)) {
            boolean t=true;
            System.out.println(t);
        } else {
            boolean f=false;
            System.out.println(f);
        }
    }
}
