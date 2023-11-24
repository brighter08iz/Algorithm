import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";

        char[] chArr = str.toCharArray();
        for(char ch : chArr) {
            if(Character.isUpperCase(ch)) {
                answer += Character.toLowerCase(ch);
            } else {
                answer += Character.toUpperCase(ch);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        System.out.print(T.solution(str));
    }
}
