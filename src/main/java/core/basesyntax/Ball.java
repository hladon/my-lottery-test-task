package core.basesyntax;

public class Ball {

    //TODO Good practice to make fields private or public(if it is needed by your logic). Currently, they are default.
    String ballColor;
    int ballNumber;

    public Ball() {
    }

    public Ball(String color, int number) {
        this.ballColor = color;
        this.ballNumber = number;
    }

    public String getBallColor() {
        return this.ballColor;
    }

    public void setBallColor(String ballColor) {
        this.ballColor = ballColor;
    }

    public int getBallNumber() {
        return this.ballNumber;
    }

    public void setBallNumber(int ballNumber) {
        this.ballNumber = ballNumber;
    }

    public String toString() {
        String ball = "ball";
        return "Ball with number: " + ballNumber + " and color: " + ballColor;
    }
}
