public class Change{
    void changeVar(Integer a){
        System.out.println(System.identityHashCode(a));
        a = 1;
        System.out.println(System.identityHashCode(a));
    }

    public static void main(String[] args){
        Integer i = 1;
        Change ch = new Change();
        ch.changeVar(i);
    }
}