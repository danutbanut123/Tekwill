import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArray = str.split(" ");

        String biggestWord = strArray[0];
        for(String word: strArray) {
            if(biggestWord.length() < word.length()) {
                biggestWord = word;
            }
        }

        System.out.println(biggestWord);
    }
}