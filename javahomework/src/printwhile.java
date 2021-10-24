//사용자가 quit을 입력할 때까지 사용자가 입력한 내용을 출력한다.

import java.util.Scanner;

public class printwhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        while(!s.equals("quit")){
            System.out.println(s);
            s = sc.next();
        }
    }
}
