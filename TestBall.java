public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball(2,5);
        System.out.println(ball1.getXY());

        ball1.setXYStep(3,5);
        System.out.println(ball1.move());
        System.out.println(ball1.getXYStep());
        System.out.println(ball1.getXY());

    }
}
