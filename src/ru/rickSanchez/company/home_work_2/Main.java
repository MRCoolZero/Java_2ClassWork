package ru.rickSanchez.company.home_work_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "10 3 1 2\n2 3 2 2\n5 6 A 1\n300 3 1 0";
        //тут нужно сплитнуть и пробел и начало новой строки
        String[][] strings = new  String[4][4];
            System.out.println("Matrix 4x4:");
        try {
            matrixArray(str,strings);
            for(int i = 0; i < strings.length; i++) {
                for(int j = 0; j < strings.length; j++) {
                    System.out.print(strings[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();

            System.out.println("After calculating the sum of the numbers in this " +
                    "\nmatrix and dividing the number by 2 we get the answer: "
                    + resultArray(strings));
        } catch(MatrixSizeException e) {
            e.printStackTrace();
        } catch(MatrixTypesException e){
            e.printStackTrace();
        }
        System.out.println("программа продолжила работать");




    }
    //Записать полученную чтрочку в двумерный массив
    public static void matrixArray(String str, String[][] array) throws IndexOutOfBoundsException, MatrixSizeException {
       String[] strings = str.split("\n");
       String[] strings1;
       if(array.length > 4 || array.length < 4){
           throw new MatrixSizeException();
       }else {
           for(int i = 0; i < array.length; i++) {
               for(int j = 0; j < array.length; j++) {
                   strings1 = strings[i].split(" ");
                   array[i][j] = strings1[j];
               }
           }
       }
    }

    //
    public static int resultArray(String[][] array) throws MatrixTypesException{
        int result = 0;
        int[][] numbers = new int[array.length][array.length];
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                numbers[i][j] = Integer.parseInt(array[i][j]);
                result += numbers[i][j];
            }
        }
        return result / 2;
    }
}
