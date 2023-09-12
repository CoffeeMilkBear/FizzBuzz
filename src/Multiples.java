public class Multiples {

    public static void main(String[] args) {

        int i = 1000;
        System.out.println(HowManyMultiples(i));

    }

    public static int HowManyMultiples(int i) {
        int counter = 0;
        int j = 1;

        while (j <= i) {
            if (j % 3 == 0 || j % 5 == 0) {
                counter++;
            }
            j++;
        }

    return counter;
    }
}
