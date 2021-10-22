import java.util.Scanner;

public class Add {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + " " + b;
    }
    
    public static void main(String[] args) {
        Add a = new Add(); //객체 생성
        System.out.println(a.add(3,5));  
        short s = 3;
        byte b = 5;
        System.out.println(a.add(s, b));  
        System.out.println(a.add(3.5, 4.7));
        System.out.println(a.add("hye","rin"));
    }
}
