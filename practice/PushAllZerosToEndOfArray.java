public class PushAllZerosToEndOfArray {
    public static void main(String[] args) {
        int array[] = {0, 9, 0, 8, 7, 1, 2, 3};
        int n = array.length;
        pushZeroToEnd(array, n);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
        }
    }

    public static void pushZeroToEnd(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];
        while (count < n)
            arr[count++] = 0;
    }
}
