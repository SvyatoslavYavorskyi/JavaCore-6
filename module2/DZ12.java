package module2;

/**
 * Created by Свят on 12.02.2017.
 */
public class DZ12 {
    public static void main(String[] args) {
        double[] numbers;
        numbers = new double[]{23, 18, 34, 46, 32, 7, 11, 27, 61, 5,};

        double sum = summOF(numbers);
        System.out.println("summa = " + sum);


        double max = maxValue(numbers);
        double min = minValue(numbers);
        System.out.println("max = " + max);
        System.out.println("min = " + min);


        double maxPositiv = maxPositivValue(numbers);
        System.out.println("max positiv =" + maxPositiv);


        double multiPlication = multiplication(numbers);
        System.out.println("Multiplication = " + multiPlication);

        double Module = moulOf(numbers);
        System.out.println("Modulus= " + Module);

        double SecondLargest = secondHighest(numbers);
        System.out.println("SecondLargest = " + SecondLargest);


    }

    private static double secondHighest(double[] numbers) {
        double highest = numbers[0];
        double secondLargest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (highest < numbers[i]) {
                secondLargest = highest;
                highest = numbers[i];
            }

            if (secondLargest < numbers[i] && highest != numbers[i])
                secondLargest = numbers[i];

        }

        return secondLargest;
    }


    private static double moulOf(double[] numbers) {
        double modul = numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            double firstNumberOfArray = numbers[0];
            double lastNumberOfArray = numbers [i] -1 ;
            modul = (int)firstNumberOfArray % lastNumberOfArray;

        }

        return modul;
    }


    private static double multiplication(double[] numbers) {

        double MulTiplicaTion = 1;
        for (int i = 0; i < numbers.length; i++) {

            MulTiplicaTion *= numbers[i];
        }

        return MulTiplicaTion;
    }


    private static double maxPositivValue(double[] numbers) {
        double maxPositiv = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            while (numbers[0] > 0 && numbers[i] > maxPositiv) {
                maxPositiv = numbers[i];
            }
        }
        return maxPositiv;
    }


    private static double minValue(double[] numbers) {
        double min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
        }
        return min;
    }


    private static double maxValue(double[] numbers) {

        double max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        return max;
    }

    private static double summOF(double[] numbers) {
        double total = 0;
        for (int i = 0; i < numbers.length; total += numbers[i++]) {

        }
        return total;


    }

}
