package org.sourceit;


import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class HomeTask2 {

    /**
     * Конвертирует десятичное число в бинарную форму
     *
     * @param number может быть только позитивным
     * @return бинарная форма числа
     */
    public static long decimalToBinary(int number) {

        return Integer.parseInt(Long.toString(number,2));
    }

    /**
     * Конвертирует десятичное число в октальную форму
     *
     * @param number может быть только позитивным
     * @return октальная форма числа
     */
    public static long decimalToOctal(int number) {

        return Integer.parseInt(Long.toString(number,8));
    }

    /**
     * Конвертирует десятичное число в хексовою форму
     *
     * @param number может быть только позитивным
     * @return хексовая форма числа
     */
    public static long decimalToHex(int number) {


        return Integer.parseInt(Long.toString(number,16));
    }


    /**
     * Конвертирует бинарную форму в десятичное число
     *
     * @param binary бинарная форма, может быть только позитивным
     * @return десятичное число
     */
    public static int binaryToDecimal(long binary) {
        if(binary<0){
            return 0;
        }

       // int res=0;
        String s = Long.toString(binary);
        /*String b=new StringBuffer(s).reverse().toString();
        for (int i=0;i<b.length(); i++){
            res += Math.pow(2,i)*(b.charAt(i)=='1'? 1: 0);
            System.out.print(b.charAt(i));
        }*/

        return Integer.parseInt(s,2);
    }

    /**
     * Конвертирует октальную форму в десятичное число
     *
     * @param octal октальная форма, может быть только позитивным
     * @return десятичное число
     */
    public static int octalToDecimal(long octal){
        if(octal<0)
        return 0;

        String s = Long.toString(octal);

        return Integer.parseInt(s,8);
    }

    /**
     * Конвертирует хексовую форму в десятичное число
     *
     * @param hex хексовая форма, может быть только позитивным
     * @return десятичное число
     */
    public static int hexToDecimal(long hex){
        if(hex<0)
            return 0;
        String s = Long.toString(hex);
        return Integer.parseInt(s,16);
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
     /*  int[] arr = new int[n];
           nextPrime:
            for (int i=2;i<=arr.length;i++){
                for (int j=2;j<i;j++){
                    if (i%j==0){
                         // вот тут вот он ругаеться на инициализацию
                        continue nextPrime;
                    }
                }
                System.out.print(i+" ");
            }
        return arr;*/

        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for(int i = 2;i*i < n;i++){
            if(primes[i]){
                for(int j=i*i;j < n;j+=i){
                    primes[j] = false;
                }
            }
        }
        List<Integer> array = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(primes[i]){
                array.add(i);
            }
        }
        int[] arr = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            arr[i] = array.get(i);
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

    }

    /**
     * Метод вычисляет, результат умножения.
     *
     * @param first
     * @param second
     * @return
     */
    public static int product(int first, int second) {

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


