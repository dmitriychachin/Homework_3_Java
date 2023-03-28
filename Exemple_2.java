package Homework_3;

import java.util.ArrayList;
import java.util.Scanner;

final class Numbers{

    int max;
    int min;
    double mid;

    public Numbers(int max, int min, double mid){
        this.max = max;
        this.min = min;
        this.mid = mid;
    }

}

public class Exemple_2 {


    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int n = scannerInt("Введите количество элементов в массиве", iScanner);
        int x = scannerInt("Введите Максимальный элемент массива", iScanner);
        ArrayList<Integer> arr = randomArray(n, x);
        printArray(arr);
        Numbers numbers = find(arr);
        System.out.println("Минимальное значение равно " + numbers.min);
        System.out.println("Максимальное значение равно " + numbers.max);
        System.out.println("Среднеарифметическое значение равно " + numbers.mid);
    }



    public static Numbers find(ArrayList<Integer> arr){
        int min = arr.get(0);
        int max = arr.get(0);
        int sum = 0;
        for(int i = 0; i < arr.size() - 1;i++){
            if(arr.get(i) > min){
                min = arr.get(i);
                sum += min;
            }
            if(arr.get(i) < max){
                max = arr.get(i);
                sum += max;
            }
            else{
                sum += arr.get(i);
            }
        }

        double mid = sum / arr.size();

        return new Numbers(min, max, mid);
    }

    public static ArrayList<Integer> randomArray(int n, int x){
        ArrayList<Integer> arr = new ArrayList<>();

        while(n > 0){
            arr.add((int) (Math.random() * x));
            n--;
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
