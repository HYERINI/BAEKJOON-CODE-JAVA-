import java.util.Scanner;

public class hw5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 한 개씩 입력하세요");
        
        int num = sc.nextInt(); 
        do{
            System.out.println(num);
            num = sc.nextInt();
        } while(num != 0);

        sc.close();
    }
}