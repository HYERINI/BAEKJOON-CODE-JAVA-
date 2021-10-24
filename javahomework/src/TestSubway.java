class Subway {
    int line;
    void run() {
        System.out.println(line + " line runs");
    }
    void setLine(int l) {
        line = l;
    }
}

class TestSubway {
    public static void main(String[] args) {
        Subway mysub = new Subway();
        mysub.setLine(3);
        mysub.run();
    }
}
