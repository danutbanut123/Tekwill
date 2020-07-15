import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	String word=sc.nextLine();
	    String [] abc = word.toString().split("-");

        System.out.printf("%s/%s/%s", abc[1],abc[2],abc[0]);
    }
}
