import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chaos =sc.nextLine();
        String word=sc.nextLine();
      int n=(chaos.split(word , -1).length)-1;
        System.out.println(n);

    }
}
