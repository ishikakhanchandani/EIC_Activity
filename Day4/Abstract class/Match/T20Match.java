import java.text.DecimalFormat;

public class T20Match extends Match {
     private static final DecimalFormat df = new DecimalFormat("0.00");
    private final int maxOvers = 20;

    @Override
   public  float calculateRunRate() {
        return (getTargetScore() - getCurrentScore()) / (maxOvers - getCurrentOver());
    }

    @Override
    public int calculateBalls() {
        return (int) ((maxOvers - getCurrentOver()) * 6);
    }

    @Override
   public void display(double reqRunRate, int balls) {
        System.out.println("Need " + (getTargetScore() - getCurrentScore()) + " runs in " + calculateBalls() + " balls");
        System.out.println("Required Runrate: " + df.format(reqRunRate));
    }
}