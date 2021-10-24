class CardDeck {

    void deal() {

        int [] array = new int[5];

        int CardNumber = array.length;

        for (int i = 0; i < CardNumber; i++){
            int num = (int) Math.floor(Math.random() * 9) + 2;
            array[i] += num;
        }

        for(int i = 0; i < array.length + 1 ; i++){
            if (CardNumber == 0) {
                System.out.println("카드가 더 이상 없습니다.\n");
            }

            else {
                System.out.println("현재 " + CardNumber + "장의 카드가 있습니다.");
                System.out.println("현재 카드는 " + array[CardNumber - 1] + " Diamond 입니다.\n");
                CardNumber --;
            }
        }
    }

    public static void main(String[] args){
        CardDeck cd = new CardDeck();
        cd.deal();
    }
}