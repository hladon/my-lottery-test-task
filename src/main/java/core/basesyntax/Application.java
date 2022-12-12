package core.basesyntax;

public class Application {
    //TODO Should be created 3 Ball classes from 1 Lottery class.
    public static void main(String[] args) {
        Lottery ball1 = new Lottery();
        System.out.println(ball1.getRandomBall().toString());
        Lottery ball2 = new Lottery();
        System.out.println(ball2.getRandomBall().toString());
        Lottery ball3 = new Lottery();
        System.out.println(ball3.getRandomBall().toString());
    }
}
