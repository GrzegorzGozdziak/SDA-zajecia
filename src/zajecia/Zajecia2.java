package zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-02-01.
 */
public class Zajecia2 {
    public static void main(String[] args) {
        //sumOfPositive();
        //graterThen0(-5);
        int[] array = {1,2,4,4,5};
        //boolean b = isEven(5);
        //System.out.println(b);
        int sum = sumOfEven(array);
        //System.out.println(sum);
        double avg = avgOfEven(array);
        //System.out.println(avg);
        int numberOfOdd = numberOfOdd(array);
        //System.out.println(numberOfOdd);
        int sumOf = sumOf(array);
        //System.out.println(sumOf);
        int sumOfOdd = sumOfOdd(array);
        //System.out.println(sumOfOdd);
 /*       Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int number = scanner.nextInt();
        if(isEven(number)){
            System.out.println("L. parzysta");
        } else {
            System.out.println("L. nieparzysta");
        }*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number");
        int a = scanner.nextInt();
        System.out.println("Insert secend number");
        int b = scanner.nextInt();
        System.out.println("Insert third number");
        int c = scanner.nextInt();
        System.out.println("sum of all numbers:");
        System.out.println(a+b+c);*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your first name");
        String firstname = scanner.nextLine();
        System.out.println("Enter Your last name");
        String lastname = scanner.nextLine();

        System.out.println("Enter Your age");
        int age = scanner.nextInt();

        System.out.print("You are ");
        System.out.println(firstname + " " + lastname);
        System.out.print("Your age is: ");
        System.out.println(age);




    }


    public static int sumOfOdd(int[] array){
        return sumOf(array) - sumOfEven(array);
    }

    public static int sumOf(int[] array) {
        //suma wszystkich elementow
        int sum = 0;
        for(int i = 0; i < array.length ; i++){
            sum += array[i];
        }
        return sum;
    }

    public static int numberOfOdd(int[] array){
        //zwroc ilosc elementow nieparzystych
        int count = 0;
        for(int i = 0 ; i < array.length ; i++){
            if(!isEven(array[i])){
                count++;
            }
        }
        return count;
        //return array.length - numberOfEven(array);
    }

    public static double avgOfEven(int[] array){
        double sum = sumOfEven(array);
        int count = numberOfEven(array);
        if(count == 0){
            return 0;
        } return sum/count;
    }

    private static int numberOfEven(int[] array){
        int count = 0;
        for(int i = 0 ; i < array.length ; i++){
            if(isEven(array[i])){
                count++;
            }
        }
        return count;
    }

    public static int sumOfEven(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(isEven(array[i])){
                sum += array[i];
            }
        }
        return sum;
    }

    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void sumOfPositive(int[] array) {
        //int[] array = {2, 4, -2, 4, -3};    //int
        int sum = 0;
        //System.out.println(array.length);
        for (int i = 0 ; i < array.length ; i++){
            if(array[i]>0){
                sum += array[i];
            }
        }
        System.out.println("Suma el. dodatnich: " + sum);
    }

    public static void graterThen0(int digit) {
        //int digit = -12;
        if (digit > 0) {
            System.out.println("liczba wieksza od zera");
        } else {
            System.out.println("liczba nie jest wieksza od zera");
        }
    }
}
