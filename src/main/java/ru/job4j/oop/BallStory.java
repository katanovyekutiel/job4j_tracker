package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        ball.outwit(hare, wolf, fox);
        hare.eat(ball);
        wolf.eat(ball);
        fox.eat(ball);
    }

}
