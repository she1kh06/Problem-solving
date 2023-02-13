package robo_contest;

import java.util.Scanner;

public class Massive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        long[] inputs = new long[length];
        for (int i = 0; i < length; i++) {
            inputs[i] = scanner.nextInt();
        }

        System.out.println(MassiveSolution.solution(inputs));
    }
}

/*
Разделите произведение элементов с нечетными номерами на сумму элементов с четными номерами одномерного числового массива.
 */

class MassiveSolution {
    static double solution(long[] args) {
        int pairs = 0;
        int odds = 1;

        for (int i = 1; i <= args.length; i++) {
            if (i % 2 == 0) {
                pairs += args[i - 1];
            } else {
                odds *= args[i - 1];
            }
        }
        double result = (double) (odds / pairs);
        return result;
    }
}
