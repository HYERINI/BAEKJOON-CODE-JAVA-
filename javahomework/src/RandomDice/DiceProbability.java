package RandomDice;

public class DiceProbability {
    private int num; //주사위 던진 횟수
    private int[] rolledNumbers;  //n번의 주사위 숫자를 저장할 수 있는 배열(멤버변수)
    private int counts[];  //6개 주사위 숫자가 나오는 횟수 저장할 수 있는 배열(멤버변수)
    private double probabilities[] = new double[6]; //확률을 넣어주는 배열
    private boolean rolled;  //roll()함수가 실행됐으면 true, 아니면 false
    private boolean calced;  //주사위실행횟수를 더했으면 true, 아니면 false

    public void printProbability() {
        if (calced) { //calced = true 라면 아래의 for문을 실행한다.
            for (int i = 0; i < 6; i++){
                System.out.printf("주사위 %d: %d 비율: %f\n", i + 1, counts[i], probabilities[i]);
            }
        }
    }

    //객체를 생성하지 않기 때문에 static을 붙이지 않는다.
    public DiceProbability(int n){
        num = n;
        rolledNumbers = new int[n];
        counts = new int[6];
        for (int i = 0; i < 6; i++){
            counts[i] = 0;   //counts배열의 모든 인덱스를 0으로 초기화한다. 
        }
        rolled = false;
        calced = false;
    }

    public void calcProbability(){
        //roll()함수가 호출된 후에만 사용 가능
        if(rolled) {
            for (int i = 0; i < num; i++) {
                counts[rolledNumbers[i] - 1]++;
            }
            for (int i = 0; i < 6; i++) {
                probabilities[i] = counts[i] / (double)num;  //확률을 double로 만들어주기 위해 num을 강제로 double형 변환
            }
            calced = true;  //counts배열에 넣어주는 작업을 실행했기 때문에 calced 변수를 true로 바꿔준다.
        }
    }

    //주사위를 굴려 나온 수를 rolledNumber 배열에 넣어준다.
    public void roll(){
        for (int i = 0; i < num; i++) {
            rolledNumbers[i] = Dice.roll();  //roll()함수를 실행했을 때 나온 수를 넣어준다.
        }
        rolled = true; //roll()함수가 실행되었으니 rolled 변수를 true로 설정해준다.
    }
}
