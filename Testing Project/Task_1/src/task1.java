
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startPoint = 0;
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        int iterStep = m - 1;
        if (m == 1) {
            iterStep = 1;
        }

        int arrLength = n - 1;

        StringBuilder out = new StringBuilder("1");

        boolean isFinished = false;

        while (!isFinished) {
            startPoint += iterStep;

            if (startPoint > arrLength) {
                int dif = startPoint - arrLength;
                startPoint = 0;

                if (dif > 1) {
                    startPoint += dif - 1;
                }
            }

            if (startPoint == 0) {
                isFinished = true;
            }
            else {
                out.append(startPoint + 1);
            }
        }

        System.out.println(out);
    }
}