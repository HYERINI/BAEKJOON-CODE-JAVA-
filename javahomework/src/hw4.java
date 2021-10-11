//사용자가 quit 입력할 때까지 사용자가 입력한 내용 출력

import java.util.Scanner;

public class hw4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        while (!word.equals("quit")) {
            System.out.println(word);
            word = sc.next();
        }
        sc.close();
    }
}