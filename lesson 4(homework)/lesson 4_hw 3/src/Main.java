import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rest =0;
        int suma=0;
        while(num>0){
            rest = num % 10;
            suma = suma + rest;
            num = num /10;
        }
        System.out.println("The sum of the digits is"+ ""+ suma);
    }
}
