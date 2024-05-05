import java.util.Random;

public class NumerousAzarosos {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            int num = rand.nextInt(37);
            System.out.println(num);
        }
    }
}