import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        // two ways how to define an array in Java
        int numbers[]; // array with the name numbers
        int[] numbers2 = new int[5];

        char[] characters;

        String[] someStrings;
        LocalDate[] dates;

        String hello;
        hello = "Hello World";

        numbers = new int[10]; // created an array, and initial values of elements are 0, because int data type
        System.out.println(numbers[7]);
//        System.out.println(numbers2[7]); compiler complains about numbers2 not being initialized
        numbers[7] = 10;
        System.out.println(numbers[7]);

        // array literal
        int[] newNumbers = new int[] {1, 2, 3};
        System.out.println(newNumbers.length);

        String[] cities = new String[] {"Berlin", "Hong Kong", "New York", "Sarajevo"};
        System.out.println(cities[2]);

        double[] doubles = {2.0, 3d, 0, 2.5, 1.2};
//        System.out.println(doubles[2]);

        // add - remove not possible, we can update, if we want to add some element, we need to remove existing one (update)
        doubles[4] = 10;

        for (double num : doubles) {
            System.out.println(num);
        }

        // remove an element, we can just create a new array
        doubles = new double[] {2.0, 3d, 2.5, 10};

        double[] temp = new double[doubles.length];
        int k = 0;
        for (int i = 0; i < doubles.length; i++) {
            if (doubles[i] < 3.0) {
                temp[k] = doubles[i];
                k++;
            }
        }

        double[] doublesLessThan3 = new double[k];
        for (int i = 0; i < k; i++) {
            doublesLessThan3[i] = temp[i];
        }

        System.out.println("Doubles less than 3: ");
        for (double num : doublesLessThan3) {
            System.out.println(num);
        }


//        doubles.length = 10;
        System.out.println("Length of doubles array: " + doubles.length);
//        System.out.println(doubles[5]); will get an exeption

        dates = new LocalDate[3];
        dates[0] = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        dates[1] = LocalDate.parse("2024 02 04", formatter);
        dates[2] = LocalDate.of(2024, Month.FEBRUARY, 6);

        // print out all dates
        for (int i = 0; i < dates.length; i++) {
            System.out.println(dates[i].format(formatter));
        }

        someStrings = new String[5];
        for (int i = 0; i < someStrings.length; i++) {
            someStrings[i] = "hello";
        }
        for (String s : someStrings) {
            System.out.println(s);
        }

        // two-dimensional arrays
        int[][] matrix = new int[5][4];
        /*
          0 1 2 3 - column index
        0 0 0 0 0
        1 0 0 0 0
        2 0 0 0 0
        3 0 5 0 0
        4 0 0 0 0
        */
        matrix[3][1] = 5;
        matrix[0][3] = 6;
        matrix[4][0] = 1;
        System.out.println(matrix[0][2]);
        System.out.println(matrix[3][1]);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        float[][] floatMatrix = { {1, 2 ,3}, {5, 5, 5}, {9, 9, 9} };
        printMatrix(floatMatrix);


    }

    static void printMatrix(float[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}