import java.util.Scanner;

public class FunctionUse {
    void printNum(int n) {
        System.out.println(n);
    }

    boolean isInRange(int n, int min, int max) {
        // if (n>=min && n<=max){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        return (n >= min && n <= max) ? true : false;
    }

    public static void main(String[] args) {
        FunctionUse fu = new FunctionUse();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(fu.isInRange(n, 1, 100)){
            fu.printNum(n);
        }
        else{
            System.out.println("범위 밖의 정수값이 입력되었습니다.");
        }
    }
}
