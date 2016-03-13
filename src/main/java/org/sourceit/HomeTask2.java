package org.sourceit;



public class HomeTask2 {

    /**
     * Конвертирует десятичное число в бинарную форму
     *
     * @param number может быть только позитивным
     * @return бинарная форма числа
     */
    public static long decimalToBinary(int number) {

       /* if (number > 0) {
            System.out.println("number " + number + " v binary = " + Integer.toBinaryString(number));
        } else {
            return 0;
        }*/

        System.out.println(Integer.toBinaryString(number));
        return number;
    }

    /**
     * Конвертирует десятичное число в октальную форму
     *
     * @param number может быть только позитивным
     * @return октальная форма числа
     */
    public static long decimalToOctal(int number) {
        if (number > 0) {
            System.out.println("number " + number + " v octal = " + Integer.toOctalString(number));
        } else {
            return 0;
        }
        return number;
    }

    /**
     * Конвертирует десятичное число в хексовою форму
     *
     * @param number может быть только позитивным
     * @return хексовая форма числа
     */
    public static long decimalToHex(int number) {

        if (number > 0) {
            System.out.println("number " + number + " v hex = " + Integer.toHexString(number));

        } else if (number<0){
            return 0;
        }
        return 1;
    }


    /**
     * Конвертирует бинарную форму в десятичное число
     *
     * @param binary бинарная форма, может быть только позитивным
     * @return десятичное число
     */
    public static int binaryToDecimal(long binary) {


        return Integer.parseInt(Long.toString(binary));
    }

    /**
     * Конвертирует октальную форму в десятичное число
     *
     * @param octal октальная форма, может быть только позитивным
     * @return десятичное число
     */
    public static int octalToDecimal(long octal){


        return Integer.parseInt(Long.toString(octal,10));
    }

    /**
     * Конвертирует хексовую форму в десятичное число
     *
     * @param hex хексовая форма, может быть только позитивным
     * @return десятичное число
     */
    public static int hexToDecimal(long hex){


        return Integer.parseInt(Long.toString(hex,10));
    }

    /**
     * Генерируют двумерный массив, со случайными числами.
     *
     * @param rows
     * @param columns
     * @return двумерный массив
     */
    public static int[][] generateTwoDimensionArray(int rows, int columns)
    {
        int[][] arr = new int[rows][columns];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ((int) (Math.random() * rows) - columns);
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }

        return arr;
    }

    /**
     * Определить и вывести на экран индекс строки с
     * наибольшим по модулю произведением элементов.
     * Если таких строк несколько, то вывести индекс
     * первой встретившейся из них.
     *
     * @param  двумерный массив
     * @return индекс строки
     */
    public static int getRowProduct(int[] arr) {
        int prod = 1;
        for (int i : arr) {
            prod *= i;
        }
        return prod;
    }

    public static int findMaxProduct(int[][] input) {
        int[] rowProdArr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            rowProdArr[i] = getRowProduct(input[i]);
        }
        for (int i :rowProdArr) {
            System.out.println("prod: "+i);
        }

        int max = rowProdArr[0], indexOfMaxValue = 0;
        for (int i = 0; i < rowProdArr.length; i++) {
            if (rowProdArr[i] > max) {
                max = rowProdArr[i];
                indexOfMaxValue = i+1;
            }
            System.out.println(indexOfMaxValue);
        }


        return indexOfMaxValue;
    }


    /**
     * Выводит все простые числа из интервала от 2 до n.
     *
     * @param n
     * @return массив простых чисел.
     */
    public static int[] getSimple(int n) {
        int[] arr = new int[n];
        nextPrime:
            for (int i=2;i<arr.length;i++){
                for (int j=2;j<i;j++){
                    if (i%j==0){
                        continue nextPrime;
                    }
                }
                System.out.println(i);

            }

      return arr;
    }

    // Рекурсивные методы. Реализовать их нужно с помощью рекурсии.

    /**
     * Вычисляет сумму чисел от 1 до n включительно.
     *
     * @param n предел
     * @return сумма
     */
    public static long sum(int n) {
        System.out.println(n*(n+1)/2);
        return n*(n+1)/2;
        /*long rec;
        if(n==1)
            return 1;
        rec = sum(n-1)+n;
        System.out.println("summa == " + rec);
        return rec;*/
    }

    /**
     * Метод вычисляет, результат умножения.
     *
     * @param first
     * @param second
     * @return
     */
    public static int product(int first, int second) {
        /*if (first<second){
            return product(second,first);
        }*/
        int sum=0;
        for (int i=second;i>0;i--){
            sum+=first;
        }
        if (second<0){
            sum+=first*second;
        }
        System.out.println(sum);

        return sum;
    }

}


