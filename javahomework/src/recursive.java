public class recursive {
    //재귀 호출 사용
    long sum(int n){
        if(n == 1) return 1;
        return n + sum(n-1);
    }

    public static void main(String[] args){
        recursive r= new recursive();
        System.out.println(r.sum(100));
    }
}
