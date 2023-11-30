import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if(x>0) {
            System.out.print(y>0 ? 1 : 4);
        } else {
            System.out.print(y>0 ? 2 : 3);
        }
    }
}