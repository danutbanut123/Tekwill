import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long from=sc.nextLong();
        long to=sc.nextLong();
       long result= sumInRange(from ,to);// or System.out.println(sumInRange(from ,to);
        System.out.println(result);

    }
    public static long  sumInRange(long from ,long to){
        long sum=0;
        for(long i=from;i<to;i++){
             sum+=i;

        }
        return sum;
    }
}
