public class CardDeck {
    int count;
    int cards[];
//    int idx;

    CardDeck(int count) {
        //idx = 0;
        this.count = count;
        cards = new int[count];
        for (int i = 0; i < count; i++) {
            cards[i] = (int) Math.floor(Math.random() * 9) + 2;
        }
    }

    int getCardCount() { return count; }

    void printCardCount() {
        System.out.printf("카드가 %d장 남았습니다\n", count);
    }

    void deal() {
        if (count > 0) {
            int num = cards[count - 1];
//            int num = cards[idx];
//            idx++;
            System.out.printf("모양: 다이아몬드, num = %d\n", num);
            count--;
        }
        else {
            System.out.println("카드가 더 이상 없습니다");
        }
    }

    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck(10);
        cardDeck.printCardCount();
        System.out.printf("카드가 %d장 남았습니다\n",
                cardDeck.getCardCount());
        cardDeck.deal();
        cardDeck.printCardCount();
        cardDeck.deal();
        cardDeck.printCardCount();
        for (int i = 0; i < 10; i++) {
            cardDeck.deal();
            cardDeck.printCardCount();
        }
    }
}
