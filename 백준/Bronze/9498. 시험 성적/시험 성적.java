import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();

        System.out.println((score>=90) ? "A" : (score>=80) ? "B" : (score>=70) ? "C" : (score>=60) ? "D" : "F");
    }
}