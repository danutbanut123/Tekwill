import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        String two = sc.nextLine();
        String oneOne =one.replaceAll(" " ,"");
        String twoTwo =two.replaceAll(" " ,"");
        System.out.println(oneOne.equalsIgnoreCase(twoTwo));








    }
}
