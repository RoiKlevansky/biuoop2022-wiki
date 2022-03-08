
/**
 * This class does some simple tessting of the Velocity.
 */
public class VelocityTester {

    final static double Comparison_threshold = 0.00001;

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean doubleEquals(double a, double b) {
        return  Math.abs(a - b) < VelocityTester.Comparison_threshold;
    }

    /**
     *
     * @param v
     * @param dx
     * @param dy
     * @return
     */
    public static boolean compareVelocity(Velocity v, double dx, double dy) {
        Point d = v.applyToPoint(new Point(0, 0));
        return (doubleEquals(d.getX(), dx) && doubleEquals(d.getY(), dy));
    }

    /**
     *
     */
    public void testVelocityFromAngle() {
        // test Velocity.fromAngleAndSpeed
        Velocity v1 = Velocity.fromAngleAndSpeed(270, 2);
        if(!compareVelocity(v1, -2, 0))
            System.out.println("fromAngleAndSpeed(270,2) Failed: " + v1);

        v1 = Velocity.fromAngleAndSpeed(90, 5);
        if(!compareVelocity(v1, 5, 0))
            System.out.println("fromAngleAndSpeed(90,5) Failed: " + v1 );

        v1 = Velocity.fromAngleAndSpeed(0, 1);
        if(!compareVelocity(v1, 0, -1))
            System.out.println("fromAngleAndSpeed(0,1) Failed: "+ v1);

        System.out.println("testing Velocity.fromAngleAndSpeed completed.");

    }


    /**
     * Main method, running tests.
     * @param args ignored.
     */
    public static void main(String[] args) {
        VelocityTester tester = new VelocityTester();
        tester.testVelocityFromAngle();
    }
}
