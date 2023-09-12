public class Reduce {

    public static void main(String[] args) {

        int n = 100;
        System.out.println(NumberReducer(n));

    }

    public static int NumberReducer(int n) {

        int counter = 0;
        while (n != 0) {

            if (n % 2 == 0) {
                //even
                n = n/2;
            } else {
                n--;
            }
            counter++;
        }

    return counter;
    }
}
