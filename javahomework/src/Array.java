class Array {
    void arrayPrint() {
        double[] arr = {1.1, 2.3, 4.7, 7.5};
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        Array a = new Array();
        a.arrayPrint();
    }        
}