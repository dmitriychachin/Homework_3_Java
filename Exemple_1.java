package Homework_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exemple_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = scannerInt("Введите количество элементов в массиве", iScanner);
        int x = scannerInt("Введите Максимальный элемент массива", iScanner);
        ArrayList<Integer> arr = randomArray(n, x);
        printArray(arr);
        ArrayList<Integer> res = removeEvens(arr);
        printArray(res);
        iScanner.close();
    }

    public static ArrayList<Integer> randomArray(int n, int x){
        ArrayList<Integer> arr = new ArrayList<>();

        while(n > 0){
            arr.add((int) (Math.random() * x));
            n--;
        }
        return arr;
    }

    public static ArrayList<Integer> removeEvens(ArrayList<Integer> arr){
        int n = arr.size();
        for (int i = 0;i < n;i++) {
            if(arr.get(i) % 2 == 0){
                arr.remove(i);
                n--;
                i--;
            }
            else{ 
                continue;
            }
        }
        return arr;
    }

    public static int scannerInt (String message, Scanner iScanner) {
        System.out.println(message);
        int x = iScanner.nextInt();

        return x;
    }

    public static void printArray(ArrayList<Integer> arr){
        StringBuilder print = new StringBuilder();
        for(int i : arr){
            print.append(i);
            print.append(" ");
        }
        System.out.println(print);
    }
}
