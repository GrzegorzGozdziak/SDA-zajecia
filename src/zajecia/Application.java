package zajecia;

/**
 * Created by RENT on 2017-01-31.
 */
public class Application {
    public static void main(String[] args) {
        //checkAge();
        //graterThen0();
//        isEven();
//        array();
        //displayArray();
        //listEven();
        //sumOfArray();
        sumOfEvenArray();
    }

    public static void sumOfEvenArray(){
        int[] array = {2,4,1,22,4,63,2,1};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                sum += array[i];
            }
        }
        System.out.println("Suma elementow tablicy rowna " +sum);
    }

    public static void sumOfArray() {
        int[] array = {2,4,1,22,4,63,2,1};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            //sum = sum + array[i];
        }
        System.out.println("Suma elementow tablicy rowna " +sum);
    }

    public static void listEven() {
        int[] array = {2,4,1,22,4,63,2,1};
        for( int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    public static void displayArray() {
        //wyswietlic elementy tablicy
        int[] array = {1, 3, 5, 7, 5, 2, 6};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void array() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int index = 2;
        if (index >= 0 && index < array.length) {
            System.out.println("el. z tablicy");

            if (array[index] % 2 == 0) {
                System.out.println("l. parzysta");
            } else {
                System.out.println("l. nie parzysta");
            }


        } else {
            System.out.println("element poza tablica");
        }

/*        */
    }


    public static void isEven() {
        int liczba = 5;
        if (liczba % 2 == 0) {
            System.out.println("liczba parzysta"); //number is even
        } else {
            System.out.println("liczba nie parzysta"); //number is odd
        }
        System.out.println("koniec");
    }

    public static void graterThen0() {
        int digit = -12;
        if (digit > 0) {
            System.out.println("liczba wieksza od zera");
        } else {
            System.out.println("liczba nie jest wieksza od zera");
        }
        System.out.println("the end");
    }

    public static void checkAge() {
        int age = 21;
        String okMessage = "Under 18. Your age is " + age;
        if (age < 18) {
            System.out.println(okMessage);
        } else {
            System.out.println("jeste pelnoletni");
        }
        System.out.println("THE END");
    }
}
