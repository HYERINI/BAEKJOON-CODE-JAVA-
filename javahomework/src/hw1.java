import java.util.Scanner;

public class hw1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("현재 습도와 온도를 입력하세요 : ");

        String humid = scanner.next();
        String temp = scanner.next();

        double Humid = Double.parseDouble(humid);
        double Temp = Double.parseDouble(temp);

        double a = (17.62 * Temp) / (243.12 + Temp);
        double b = Math.log(Humid / 100);
        double DewPoint = ((243.12 * (a + b)) / (17.62 - (a + b)));

        DewPoint = (int)(DewPoint * 10)/ 10.0;
        System.out.print("현재 이슬점 : ");
        System.out.println(DewPoint);
    }
}