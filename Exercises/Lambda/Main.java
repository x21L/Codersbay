public class Main {
    public static void main(String[] args) {
        // die ersten 10 Zahlen, die durch 7 teilbar sind
        print(NumberSelector.findFirst(number -> number % 7 == 0, 10));
        // die Zahlen von 0 bis 20
        print(NumberSelector.findFirst(number -> true, 21));
        // die ersten 10 Primzahlen
        print(NumberSelector.findFirst(number -> {
            if (number < 2) return false;

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }, 10));
    }

    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


