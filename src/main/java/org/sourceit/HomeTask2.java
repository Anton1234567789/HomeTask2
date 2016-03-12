package org.sourceit;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HomeTask2 {

    /**
     * Конвертирует десятичное число в бинарную форму
     *
     * @param number может быть только позитивным
     * @return бинарная форма числа
     */
    public static long decimalToBinary(int number) {
        if (number > 0) {
            System.out.println("number " + number + " v binary = " + Integer.toBinaryString(number));
        } else {
            return 0;
        }

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
        } else {
            return 0;
        }
        return number;
    }

    /**
     * Конвертирует бинарную форму в десятичное число
     *
     * @param binary бинарная форма, может быть только позитивным
     * @return десятичное число
     */
    public static int binaryToDecimal(long binary)throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String decimal = reader.readLine();

        System.out.println(Integer.parseInt(decimal, 2));
        return 1;
    }

    /**
     * Конвертирует октальную форму в десятичное число
     *
     * @param octal октальная форма, может быть только позитивным
     * @return десятичное число
     */
    public static int octalToDecimal(long octal)throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String oct = reader.readLine();

        System.out.println(Integer.parseInt(oct, 8));
        return 1;
    }

    /**
     * Конвертирует хексовую форму в десятичное число
     *
     * @param hex хексовая форма, может быть только позитивным
     * @return десятичное число
     */
    public static int hexToDecimal(long hex)throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String HEX = reader.readLine();

        System.out.println(Integer.parseInt(HEX, 16));
        return 1;
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
     * @param input двумерный массив
     * @return индекс строки
     */
    public static int findMaxProduct(int[][] input) {
        int ind = 0, max = 0, temp = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                input[i][j] = (int) (Math.random() * 10);
                max = max + Math.abs(input[i][j]);
                if (input[i][j] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(input[i][j] + " ");
            }
            System.out.println();

            // System.out.println();
            if (max > temp) {
                ind = i + 1;
                temp = max;
            }
            max = 0;

            System.out.println("number string " + ind);

        }
        return ind;
    }

    /**
     * Выводит все простые числа из интервала от 2 до n.
     *
     * @param n
     * @return массив простых чисел.
     */
    public static int[] getSimple(int n) {
        int[] arr = new int[n];
        int qty,i,j;
        qty =0;
        i=2;
        while(qty<arr.length){
            isThatPrime:{
                for (j=0;j<qty;j++){
                    if (i%arr[j]==0){
                        break isThatPrime;
                    }
                    if (arr[j]*arr[j]>i)
                        break;
                }
                System.out.println(arr[qty++]=i);
            }
            i++;
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
        if (first<second){
            return product(second,first);
        }
        int sum=0;
        for (int i=second;i>0;i--){
            sum+=first;
        }
        System.out.println(sum);

        return sum;
    }

}


