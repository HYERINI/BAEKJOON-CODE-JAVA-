class HelloWorld {
    String toWhom = "world";
    void setWhom(String whom){
        toWhom = whom;
    }   
    void sayHello() {
        System.out.println("Hello" + toWhom);
    } 

    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        hw.setWhom(" World");
        hw.sayHello();
    }
}
