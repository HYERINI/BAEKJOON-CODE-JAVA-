public class HelloHello {
    String toWhom = "world";
    HelloHello(){}
    void setWhom(String whom) {
        toWhom = whom;
    }
    void sayHello(){
        System.out.println("Hello " + toWhom);
    }

    public static void main(String[] args){
        HelloHello[] arr = new HelloHello[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = new HelloHello();
            arr[i].sayHello();
        }
        //a[i] 대신에 h를 사용한 것이라고 생각하면 됨
        for (HelloHello h : arr) {
            h.sayHello();
        }
    }
}
