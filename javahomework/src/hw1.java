import java.util.Scanner;

public class hw1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자 다섯 개를 한 줄에 한 개씩 입력하세요!!!");
        
        char [] s = new char[5];
        double hash = 0;
        for (int i = 0; i < 5; i++) {
        	s[i] = sc.next().charAt(0);
        	hash += s[i] * Math.pow(31,4-i);
        }
        
        System.out.print("문자열 ");
        for(int i = 0; i < 5; i++) {
        	System.out.print(s[i]);
        }
        System.out.printf("의 해시 값은 %.2f입니다.!!!!\n", hash);
    }
}