class Hello {
    String toWhom = "world";
    Hello() {  } //기본 생성자 사용
    Hello(String whom) {
        setWhom(whom);
    }
    void setWhom(String whom) {
        toWhom = whom;
    }
    void sayHello() {
        System.out.println("hello " + toWhom);
    }
}

class TestHelloArray {
    public static void main(String[] args) {
        Hello[] helloArray = new Hello[3];
        helloArray[0] = new Hello();
        helloArray[1] = new Hello("홍길동");
        helloArray[2] = new Hello("허균");

        helloArray[0].sayHello();
        helloArray[1].sayHello();
        helloArray[2].sayHello();
    }
}