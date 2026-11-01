import java.util.Scanner;

public class TransformArrayValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] values = new int[n];

        for (int index = 0; index < n; index++) {
            values[index] = scanner.nextInt();
        }

        int bonus = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            values[i] += bonus;
        }

        System.out.print("Updated values: ");
        for (int i = 0; i < n; i++) {
            System.out.print(values[i] + (i < n - 1 ? " " : ""));
        }

        scanner.close();
    }
}