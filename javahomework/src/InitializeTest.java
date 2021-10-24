//string 변수 s를 미리 초기화시켜주지 않으면 null 값을 출력한다.
public class InitializeTest {
    public void prints() {
        String str = "Hello";
        String str2 = "World";
        str = str2;
        System.out.println(str);
    }

    public static void main(String[] args){
        InitializeTest it = new InitializeTest();
        it.prints();
    }
}
