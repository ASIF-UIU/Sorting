import java.util.Scanner;

public class CountSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, k = 0;
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();

        int Arr[] = new int[n];
        // Input
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            Arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (k < Arr[i]) {
                k = Arr[i];
            }
        }

        int Count[] = new int[k + 1];
        // Count
        for (int i = 0; i < n; i++) {
            Count[Arr[i]]++;
        }

        for (int i = 1; i <= k; i++) {
            Count[i] += Count[i - 1];
        }
        // Output
        int Out[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            Out[--Count[Arr[i]]] = Arr[i];
        }
        System.out.println("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Out[i]+" ");
        }
        sc.close();

    }
}
