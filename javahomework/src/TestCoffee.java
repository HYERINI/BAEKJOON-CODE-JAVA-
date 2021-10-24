class Coffee{
    String origin; //원산지(변하지 않는 고유의 값)
    int degreeOfRoast; //볶기 정도
    int grade; //등급
    Coffee(String n) {
        origin = n;
    }
    public void roast() {
        System.out.println("roasting : " + origin);
    }
    public void grind(){
        System.out.println("grinding : " + origin);
    }
    public void brew() {
        System.out.println("brewing : " + origin);
    }
}

public class TestCoffee {
    public static void main(String[] args) {
        Coffee cof = new Coffee("한국");
        cof.roast();
        cof.grind();
        cof.brew();
    }    
}
