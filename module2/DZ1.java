package module2;

/**
 * Created by Свят on 05.02.2017.
 */
public class DZ1 {
    public static void main(String[] args) {
        int[] numbers = {23, 18, 34, 45, 32, 7, 11, 27, 61, 5};

        int sum = summOF(numbers);
        System.out.println("summa = " + sum);


        int max = maxValue(numbers);
        int min = minValue(numbers);
        System.out.println("max = " + max);
        System.out.println("min = " + min);


        int maxPositiv = maxPositivValue(numbers);
        System.out.println("max positiv =" + maxPositiv);


        int multiPlication = multiplication(numbers);
        System.out.println("Multiplication = " + multiPlication);

        int Module = moulOf(numbers);
        System.out.println("Modulus= " + Module);

        int SecondLargest = secondHighest(numbers);
        System.out.println("SecondLargest = " + SecondLargest);


    }

    private static int secondHighest(int[] numbers) {
        int highest = numbers[0];
        int secondLargest = numbers[0];
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


    private static int moulOf(int[] numbers) {
        int modul = numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            int firstNumberOfArray = numbers[0];
            int lastNumberOfArray = numbers [i] -1 ;
            modul = firstNumberOfArray % lastNumberOfArray;

        }

        return modul;
    }


    private static int multiplication(int[] numbers) {

        int MulTiplicaTion = 1;
        for (int i = 0; i < numbers.length; i++) {

            MulTiplicaTion *= numbers[i];
        }

        return MulTiplicaTion;
    }


    private static int maxPositivValue(int[] numbers) {
        int maxPositiv = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            while (numbers[0] > 0 && numbers[i] > maxPositiv) {
                maxPositiv = numbers[i];
            }
        }
        return maxPositiv;
    }


    private static int minValue(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
        }
        return min;
    }


    private static int maxValue(int[] numbers) {

        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        return max;
    }

    private static int summOF(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; total += numbers[i++]) {

        }
        return total;


    }

}





