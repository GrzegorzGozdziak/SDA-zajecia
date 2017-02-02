package zajecia;

/**
 * Created by RENT on 2017-02-02.
 */
public class Zajecia3 {

    public static void main(String[] args) {
        int[] array = {1, -2, 3, -4, 5};
        int sum = sumOf(array);
        //System.out.println("Suma wszystkich el. tablicy: " + sum);
        int product = productOfPositive(array);
        System.out.println("Iloczyn dodatnich el. tablicy: " + product);
    }

    public static int productOfPositive(int[] array) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            if (isPositive(array[i])) {
                product *= array[i];
            }
        }
        return product;
    }

    public static int sumOf(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPositive(array[i])) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static boolean isPositive(int data) {
        if (data > 0) {
            return true;
        } else {
            return false;
        }
    }
}
