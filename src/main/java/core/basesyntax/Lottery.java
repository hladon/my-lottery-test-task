package core.basesyntax;

import java.util.Random;

//TODO No need to extend ColorSupplier. It`s redundant.
public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {

        Ball ball = new Ball();

        ball.setBallColor(ColorSupplier.getRandomColor());
        //TODO The maximum possible number would be 99 but the task requires 100
        //TODO Better to create Random with class in and reuse it .
        ball.setBallNumber(new Random().nextInt(100));

        return ball;
    }
}
