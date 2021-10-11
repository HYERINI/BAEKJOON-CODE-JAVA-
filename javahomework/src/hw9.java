//배열에서 Seoul을 찾아서 출력

public class hw9 {
    public static void main(String[] args) {
        String[] arr = {"New York", "Beijing", "Seoul"};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "Seoul"){
                System.out.println(arr[i]);
            }
        }

        for (String s: arr) {
            if (s.equals("Seoul")) {
                System.out.println(s);
            }
        }
    }
}
