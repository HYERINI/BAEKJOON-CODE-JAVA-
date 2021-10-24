package RandomDice;

public class Dice {
    public static int roll() {
        return (int)Math.floor(Math.random() * 6 + 1);
    }
}
